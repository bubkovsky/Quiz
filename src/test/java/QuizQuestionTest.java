import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class QuizQuestionTest {


    @Test
    public void testingRotation() {
        List<String> answers = new ArrayList<>(  );
        answers.add( "odpowiedz1" );
        answers.add( "odpowiedz2" );
        answers.add( "odpowiedz3" );
        answers.add( "odpowiedz4" );
        for (String element: QuizQuestion.rotateAnswers( answers )
             ) {
            System.out.println(element);

        }
        assertTrue( answers.size() == QuizQuestion.rotateAnswers( answers ).size() );
    }

    @Test
    public void getCorrectAnswer() {
    }
}