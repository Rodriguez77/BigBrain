package com.example.bigbrain
import com.example.bigbrain.Question

object Logos {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
                1, "Guess what logo is this?",
                R.drawable.ic_logo_tesla,
                "Tesla", "Tanduay",
                "T-Mobile", "TempoSoft", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
                2, "Guess what logo is this?",
                R.drawable.ic_logo_brave,
                "Reddit", "Red Lion",
                "Linux", "Brave", 4
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
                3, "Guess what logo is this?",
                R.drawable.ic_logo_cadillac,
                "Royal", "Cadillac",
                "Buick", "Crest", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
                4, "Guess what logo is this?",
                R.drawable.ic_logo_cisco,
                "Csiro", "Wave",
                "Audi", "Cisco", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
                5, "Guess what logo is this?",
                R.drawable.ic_logo_dominos,
                "Dice One", "DD",
                "Dominos Pizza", "Dairy Queen", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
                6, "Guess what logo is this?",
                R.drawable.ic_logo_github,
                "Black Cat", "Github",
                "SourceForge", "GitLab", 2
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
                7, "Guess what logo is this?",
                R.drawable.ic_logo_nintendoswitch,
                "Nintendo Switch", "Yinyang",
                "PSP", "Nintendo DS", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
                8, "Guess what logo is this?",
                R.drawable.ic_logo_googledrive,
                "Autodesk", "Argonne",
                "One Drive", "Google Drive", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
                9, "Guess what logo is this?",
                R.drawable.ic_logo_gradle,
                "Android Studio", "Graddle",
                "Evernote", "Banana Republic", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
                10, "Guess what logo is this?",
                R.drawable.ic_logo_toyota,
                "Toyota", "Mercedes Benz",
                "Ford", "Isuzu", 1
        )

        questionsList.add(que10)


        return questionsList
    }
}