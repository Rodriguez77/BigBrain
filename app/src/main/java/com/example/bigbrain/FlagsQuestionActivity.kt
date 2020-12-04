package com.example.bigbrain

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_flags_question.*
import java.util.*
import kotlin.collections.ArrayList


class FlagsQuestionActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null

    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null

    private var COUNTDOWN_IN_MILLIS: Long = 30000
    private var textViewCountDown: TextView? = null

    private var countDownTimer: CountDownTimer? = null
    private var timeLeftInMillis: Long = 0


    override fun onCreate(savedInstanceState: Bundle?) {

        textViewCountDown  = findViewById(R.id.countdownText)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flags_question)
        mUserName = intent.getStringExtra(Flags.USER_NAME)
        mQuestionsList = Flags.getQuestions()

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tv_option_one -> {

                selectedOptionView(tv_option_one, 1)
            }

            R.id.tv_option_two -> {

                selectedOptionView(tv_option_two, 2)
            }

            R.id.tv_option_three -> {

                selectedOptionView(tv_option_three, 3)
            }

            R.id.tv_option_four -> {

                selectedOptionView(tv_option_four, 4)
            }

            R.id.btn_submit -> {

                if (mSelectedOptionPosition == 0) {

                    mCurrentPosition++

                    when {

                        mCurrentPosition <= mQuestionsList!!.size -> {

                            setQuestion()
                        }
                        else -> {


                            val intent =
                                    Intent(this@FlagsQuestionActivity, ResultActivity::class.java)
                            intent.putExtra(Flags.USER_NAME, mUserName)
                            intent.putExtra(Flags.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Flags.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()

                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)

                    // This is to check if the answer is wrong
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        mCorrectAnswers++
                        countDownTimer?.cancel()
                    }


                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        btn_submit.text = "FINISH"
                    } else {
                        btn_submit.text = "GO TO NEXT QUESTION"
                    }

                    mSelectedOptionPosition = 0
                }
            }
        }
    }


    private fun setQuestion() {


        val question = mQuestionsList!!.get(mCurrentPosition - 1) // Getting the question from the list with the help of current position.

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            btn_submit.text = "FINISH"
        } else {
            btn_submit.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.getMax()

        tv_question.text = question.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour

        timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        startCountDown()
    }

    private fun startCountDown()
    {
       countDownTimer = object : CountDownTimer(timeLeftInMillis, 1000) {
           override fun onTick(millisUntilFinished: Long) {
              timeLeftInMillis = millisUntilFinished
               updateCountDownText()

           }

           override fun onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText()

           }

       }.start()
    }

    private fun updateCountDownText()
    {
        val minutes = (timeLeftInMillis / 1000).toInt() / 60
        val seconds = (timeLeftInMillis / 1000).toInt() % 60

        val timeFormatted: String = java.lang.String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds)
        textViewCountDown?.setText(timeFormatted)
    }


    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
                Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
                this@FlagsQuestionActivity,
                R.drawable.selected_option_border_bg
        )
    }


    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this@FlagsQuestionActivity,
                    R.drawable.default_option_border_bg
            )
        }
    }


    private fun answerView(answer: Int, drawableView: Int) {

        when (answer) {

            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(
                        this@FlagsQuestionActivity,
                        drawableView


                )
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(
                        this@FlagsQuestionActivity,
                        drawableView
                )
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(
                        this@FlagsQuestionActivity,
                        drawableView
                )
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(
                        this@FlagsQuestionActivity,
                        drawableView
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        countDownTimer?.cancel()
    }
}