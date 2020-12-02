package com.example.bigbrain
import com.example.bigbrain.Question

object Trivia {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question1>? {
        val questionsList = ArrayList<Question1>()

        // 1
        val que1 = Question1(
            1, "According to Greek mythology who was the first woman on earth?",
         
            "Nemesis", "Aphrodite",
            "Pandora", "Artemis", 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question1(
            2, "Which African country was formerly known as Abyssinia??",

            "Ethiopia", "Angola",
            "Ghana", "Zimbabwe", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question1(
            3, "Fissures, vents and plugs are all associated with which geological feature?",

            "Canyons", "Volcanos",
            "Valleys", "Tectonics", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question1(
            4, "What is the loudest animal on Earth?",

            "Lion", " Sperm whale",
            "Eagle", "Elephant", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question1(
            5, "What is the tallest breed of dog in the world?",

            "German Shepherd", "Golden Retriever",
            "Great Dane", "Labrador Retriever", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question1(
            6, "What is the softest mineral in the world?",

            "Sand", "Jadeite",
            "Painite", "Talc", 4
        )

        questionsList.add(que6)

        // 7
        val que7 = Question1(
            7, "What is the world’s biggest island?",

            "Greenland", "Palawan",
            "Madagascar ", "New Guinea", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question1(
            8, "Guess what logo is this?",

            "Autodesk", "Argonne",
            "One Drive", "Google Drive", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question1(
            9, "Which country is known as the Land of White Elephant?",

            "Singapore", "Thailand",
            "Lebanon", "New Zealand", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question1(
            10, "Which planet is the hottest in the solar system?",

            "Mars", "Mercury",
            "Venus", "Earth", 3
        )

        questionsList.add(que10)


        return questionsList
    }
}