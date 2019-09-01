import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QuizQuestion {
    String question;
    List<String> answers = new ArrayList<>(  );

    public void setQuestion(String question) {
        this.question = question;
    }
    public void setAnswers(String answer) {
        answers.add( answer );
    }

    static List<String> rotateAnswers(List<String> answers) {
        List<String> tempLista = answers;
        Collections.shuffle( tempLista );
        return tempLista;
    }
    static String getCorrectAnswer(List<String> anwers){
        return anwers.get( 0 );
    }
}