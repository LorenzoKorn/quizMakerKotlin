package lorenzokorn.quiz_maker_kotlin

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class QuizViewModel(application: Application):AndroidViewModel(application) {

    var question: String = ""
    var answer: String = ""

    fun isAnswerCorrect(answer: String): Boolean {
        return answer.toLowerCase() == this.answer.toLowerCase()
    }

    fun createQuestion(question: String, answer: String) {
        this.question = question
        this.answer = answer
    }

    fun isQuestionCreated(): Boolean {
        return question.isNotBlank() && answer.isNotBlank()
    }
}