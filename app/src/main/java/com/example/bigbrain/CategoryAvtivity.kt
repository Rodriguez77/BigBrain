package com.example.bigbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_category_avtivity.*
import kotlinx.android.synthetic.main.activity_main.*

class CategoryAvtivity : AppCompatActivity() {
    private var mUserName: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_avtivity)
        mUserName = intent.getStringExtra(Flags.USER_NAME)
        mUserName = intent.getStringExtra(Logos.USER_NAME)
        mUserName = intent.getStringExtra(Trivia.USER_NAME)
        mUserName = intent.getStringExtra(Grammar.USER_NAME)
        mUserName = intent.getStringExtra(Mathqs.USER_NAME)
        mUserName = intent.getStringExtra(History.USER_NAME)

        btn_flags.setOnClickListener{
            val intent = Intent(this, FlagsQuestionActivity::class.java)
            intent.putExtra(Flags.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

        btn_logos.setOnClickListener{
            val intent = Intent(this, LogosQuestionActivity::class.java)
            intent.putExtra(Logos.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

        btn_trivia.setOnClickListener{
            val intent = Intent(this, TriviaQuestion::class.java)
            intent.putExtra(Trivia.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

        btn_grammar.setOnClickListener{
            val intent = Intent(this, GrammarQuestionActivity::class.java)
            intent.putExtra(Grammar.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

        btn_mathqs.setOnClickListener{
            val intent = Intent(this, MathQuestionActivity::class.java)
            intent.putExtra(Mathqs.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }
        btn_history.setOnClickListener{
            val intent = Intent(this, HistoryQuestionActivity::class.java)
            intent.putExtra(Mathqs.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }
        btn_history.setOnClickListener{
            val intent = Intent(this, HistoryQuestionActivity::class.java)
            intent.putExtra(Mathqs.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

    }
}