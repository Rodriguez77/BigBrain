package com.example.bigbrain.handlers

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class scoresHandler {
    var databases: FirebaseDatabase
    var scoresRef: DatabaseReference

    init {
        databases = FirebaseDatabase.getInstance()
        scoresRef = databases.getReference("username_scores")
    }


}