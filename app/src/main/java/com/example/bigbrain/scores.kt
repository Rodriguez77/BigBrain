package com.example.bigbrain

import java.io.Serializable

class scores (var mUserName: String? = "", var correctAnswers: Int? = 0): Serializable {

    override fun toString(): String {
        return  "username: $mUserName \n\n" +
                "score: $correctAnswers\n\n"
    }
}
