package com.example.bigbrain

object History {    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question1> {
        val questionsList = ArrayList<Question1>()

        // 1
        val que1 = Question1(
                1, "Who wrote the novel To Kill a Mockingbird, published in 1960?",

                "Harper Lee", "James Lee",
                "Jennifer Lee", "Diana Lee", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question1(
                2, "What Russian author begins, \"All happy families are alike\"?",

                "Vladimir Rovenski", "Dimitri Romanov",
                "Leo Tolstoy", "Mikhail Lubov", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question1(
                3, "What year was the two dollar bill last printed in the United States?",

                "2000", "2001",
                "2002", "2003", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question1(
                4, "Who was the 33rd president of the U.S.A?",

                "Harry Truman", "Richard Nixon",
                "George Bush    ", "Edward Nixon", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question1(
                5, "A 1985 North Atlantic expedition led by Robert Ballard discovered the wreck of what famous ship 73 years after it sank?",

                "Yamato", "Titanic",
                "Queen Anne's Revenge", "Estonia", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question1(
                6, "From 1964 to 1980, what country was known as Rhodesia?",

                "Nigeria", "Angola",
                "Zimbabwe", "Zambia", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question1(
                7, "Which F-word is used for the delay of a Senate matter by debate or proceudral motions?",

                "Filibuster", "Forsworn",
                "Familiarize", "Fortify", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question1(
                8, "On September 24, 1906 President Theodore Roosevelt established the first US national monument. What was it?",

                "Navajo National Monument", "Fort Matanzas",
                "Grand Canyon", "Devil's Tower", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question1(
                9, "How many Catherine's did King Henry VIII marry?",

                "2", "3",
                "4", "5", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question1(
                10, "How many U.S. states are needed to ratify an amendment for it to become part of the constitution?",

                "36", "37",
                "38", "39", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}
