package com.example.bigbrain

import java.io.Serializable

class scores (var id: String? = "", var mUserName: String? = "", var correctAnswers: Int? = 0): Serializable {

    override fun toString(): String {
        return  "Name: $mUserName \n\n" + "Score: $correctAnswers\n\n"
    }
}
