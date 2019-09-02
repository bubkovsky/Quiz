import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizQuestion {


    private final String question;
    private final List<String> answers;

    public QuizQuestion(String question, List<String> answers) {
        this.question = question;
        this.answers = Collections.unmodifiableList( answers );
    }


    static List<String> rotateAnswers(List<String> answers) {
        List<String> tempLista;
        tempLista = answers;
        Collections.shuffle( tempLista );
        return tempLista;
    }
    public String getQuestion() {
        return question;
    }
    public List<String> getAnswers() {
        return answers;
    }
    public String getCorrectAnswer(){
        return answers.get( 0 );
    }
}