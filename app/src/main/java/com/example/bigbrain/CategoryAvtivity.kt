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

        btn_flags.setOnClickListener{
            val intent = Intent(this, FlagsQuestionActivity::class.java)
            // TODO (STEP 2: Pass the name through intent using the constant variable which we have created.)
            // START
            intent.putExtra(Flags.USER_NAME, mUserName)
            // END
            startActivity(intent)
            finish()
        }
    }
}