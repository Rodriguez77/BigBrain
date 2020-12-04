package com.example.bigbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.bigbrain.handlers.scoresHandler
import kotlinx.android.synthetic.main.activity_result.*
import com.example.bigbrain.scores
/*import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener*/

class ResultActivity : AppCompatActivity() {
    var mUserName: String? = null
    var mCorrectAnswers: Int = 0
    lateinit var scoresHandler: scoresHandler
    lateinit var scoresListView: ListView
   //lateinit var scores: Scores
    lateinit var show: ArrayList<scores>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        scoresListView = findViewById(R.id.lv_result)
        scoresHandler = scoresHandler()
        mUserName = intent.getStringExtra(Flags.USER_NAME)
        mUserName = intent.getStringExtra(Logos.USER_NAME)
        mUserName = intent.getStringExtra(Trivia.USER_NAME)
        mUserName = intent.getStringExtra(Grammar.USER_NAME)
        mUserName = intent.getStringExtra(Mathqs.USER_NAME)


        tv_name.text = mUserName


        val totalQuestions = intent.getIntExtra(Flags.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Flags.CORRECT_ANSWERS, 0)

        val pastResult = scores(mUserName = mUserName, correctAnswers = correctAnswers)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."

        btn_finish.setOnClickListener {
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }
    }
       /* override fun onStart() {
            super.onStart()

           scoresHandler.scoresRef.orderByChild("username").addValueEventListener(object:
                ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                   show.clear()
                    snapshot.children.forEach{
                            it -> val Scores = it.getValue(scores::class.java)
                       show.add(Scores!!)
                    }

                    val adapter = ArrayAdapter<scores>(applicationContext, android.R.layout.simple_list_item_1, show)
                    scoresListView.adapter = adapter
                }
                override fun onCancelled(p0: DatabaseError) {

                }

            })
        }*/




}