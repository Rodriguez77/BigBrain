package com.example.bigbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.bigbrain.handlers.scoresHandler
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_result.*

class HighScore : AppCompatActivity() {
    var mUserName: String? = null
    lateinit var scoresHandler: scoresHandler
    lateinit var scoresListView: ListView
    lateinit var show: ArrayList<scores>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_score)

        btn_finish.setOnClickListener {
            startActivity(Intent(this@HighScore, MainActivity::class.java))
            scoresListView = findViewById(R.id.lv_result)
            scoresHandler = scoresHandler()
            show = ArrayList()

        }
    }
        override fun onStart() {
            super.onStart()

            scoresHandler.scoresRef.orderByChild("username").addValueEventListener(object:
                ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    show.clear()
                    snapshot.children.forEach{
                            it -> val lscores = it.getValue(scores::class.java)
                        show.add(lscores!!)
                    }

                    val adapter = ArrayAdapter<scores>(applicationContext, android.R.layout.simple_list_item_1, show)
                    scoresListView.adapter = adapter
                }
                override fun onCancelled(p0: DatabaseError) {

                }

            })
        }
    }
