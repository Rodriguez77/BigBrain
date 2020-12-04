package com.example.bigbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    private var mUserName: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        mUserName = intent.getStringExtra(Flags.USER_NAME)
        mUserName = intent.getStringExtra(Logos.USER_NAME)
        mUserName = intent.getStringExtra(Trivia.USER_NAME)
        mUserName = intent.getStringExtra(Grammar.USER_NAME)
        mUserName = intent.getStringExtra(Mathqs.USER_NAME)

    val userNameF = intent.getStringExtra(Flags.USER_NAME)
        tv_name.text = mUserName



        val totalQuestions = intent.getIntExtra(Flags.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Flags.CORRECT_ANSWERS, 0)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."

        btn_finish.setOnClickListener {
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }

    }
}