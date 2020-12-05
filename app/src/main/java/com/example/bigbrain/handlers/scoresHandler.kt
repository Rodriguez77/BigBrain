package com.example.bigbrain.handlers

import com.example.bigbrain.scores
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class scoresHandler {


    var databases: FirebaseDatabase
    var scoresRef: DatabaseReference

    init {
        databases = FirebaseDatabase.getInstance()
        scoresRef = databases.getReference("scores")
    }
    fun create(pastResult: scores) :
        Boolean{
            val id = scoresRef.push().key

        pastResult.id = id

        scoresRef.child(id!!).setValue(pastResult)


            return true
    }



}