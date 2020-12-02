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

        btn_flags.setOnClickListener{
            val intent = Intent(this, FlagsQuestionActivity::class.java)
            intent.putExtra(Flags.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

        btn_logos.setOnClickListener{
            val intent = Intent(this, LogosQuestionActivity::class.java)
            intent.putExtra(Flags.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }

        btn_trivia.setOnClickListener{
            val intent = Intent(this, TriviaQuestion::class.java)
            intent.putExtra(Flags.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }
    }
}