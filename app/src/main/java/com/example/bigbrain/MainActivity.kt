package com.example.bigbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {

            if (et_name.text.toString().isEmpty()){

                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
                    .show()
            } else {

                val intent = Intent(this@MainActivity,CategoryAvtivity::class.java)
                intent.putExtra(Flags.USER_NAME, et_name.text.toString())
                intent.putExtra(Logos.USER_NAME, et_name.text.toString())
                intent.putExtra(Trivia.USER_NAME, et_name.text.toString())
                intent.putExtra(Grammar.USER_NAME, et_name.text.toString())
                intent.putExtra(Mathqs.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }
            // END
        }
    }
}
