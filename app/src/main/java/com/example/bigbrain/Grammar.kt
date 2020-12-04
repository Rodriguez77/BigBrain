package com.example.bigbrain

object Grammar {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question1>? {
        val questionsList = ArrayList<Question1>()

        // 1
        val que1 = Question1(
            1, "Do we ______ pay for our drinks now",

            "must", "have got to",
            "have to", "have", 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question1(
            2, "Do you mind ____ I open the door",

            "that", "when",
            "if", "how", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question1(
            3, "I'd like to change 100 dollars ___ peso, please",

            "into", "by",
            "with", "from", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question1(
            4, "Would you like _____ jam on your bread",

            "a", "some",
            "few", "little", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question1(
            5, "The men ____ very busy",

            "is", "am",
            "are", "be", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question1(
            6, "Henry is only three years old but he ______ already read very well",

            "can", "may",
            "should", "must", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question1(
            7, "_____ was the weather like when you were on holiday?",

            "How", "When",
            "Where ", "What", 4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question1(
            8, "You can keep my iPad if you like. I ___ it any more",

            "don't use", "am not using",
            "doesn't use", "didn't use", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question1(
            9, "What time _____",

            "the train leaves?", "leaves the train?",
            "is the train leaving?", "does the train leave", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question1(
            10, "Babies___ when they are hungry",

            "cry", "cried",
            "cries", "are crying", 1
        )

        questionsList.add(que10)


        return questionsList
    }
}