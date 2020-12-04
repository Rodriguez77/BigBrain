package com.example.bigbrain

object Mathqs {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question1>? {
        val questionsList = ArrayList<Question1>()

        // 1
        val que1 = Question1(
            1, "What is 7% equal to?",

            "0.007", "0.7",
            "0.07", "7", 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question1(
            2, "How many years are there in a decade?",

            "5", "15",
            "10", "20", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question1(
            3, "What is the square of 15?",

            "225", "252",
            "30h", "15", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question1(
            4, "What is the remainder of 21 divided by 7?",

            "21", "none of the choices",
            "1", "3", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question1(
            5, "What is the three fifth of 100?",

            "100", "20",
            "3", "60", 4
        )

        questionsList.add(que5)

        // 6
        val que6 = Question1(
            6, "Simplify: 3 + 6 x (5 + 4) / 3 - 7",

            "11", "16",
            "14", "12", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question1(
            7, "Solve: 200 - (96 / 4)",

            "105", "16",
            "26 ", "176", 4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question1(
            8, "What is the value of a^0?",

            "a", "0",
            "-1", "1", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question1(
            9, "How much is 190 - 87 + 16",

            "119", "221?",
            "103?", "89", 1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question1(
            10, "1 + 1",

            "1", "2",
            "11", "0", 2
        )

        questionsList.add(que10)


        return questionsList
    }
}