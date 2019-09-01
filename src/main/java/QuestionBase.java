import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuestionBase {

static List<QuizQuestion> listOfQuestions= new ArrayList<>();

    public static List<QuizQuestion> createListOfQuestionsForChoosenCategory(String fileName) throws FileNotFoundException {
        String path = "src\\main\\resources.\\" + fileName;
        File file = new File(path);
        try(Scanner scanner = new Scanner( file )) {
            while (scanner.hasNextLine()) {
                QuizQuestion quizQuestion = new QuizQuestion();
                quizQuestion.setQuestion( scanner.nextLine() );
                int countAnswers = Integer.parseInt( scanner.nextLine() );
                for (int j = 0; j < countAnswers; j++) {
                    quizQuestion.setAnswers( scanner.nextLine() );
                }

                listOfQuestions.add(quizQuestion);
            }
        }
        return listOfQuestions;
    }
    public static String randomCategory (){
        Random random = new Random(  );
        String path = "src\\main\\resources.\\";
        File resources = new File(path);
        return resources.list(  )[random.nextInt( resources.list().length )];
    }
    public static String chooseCategory (int choice){
        String path = "src\\main\\resources.\\";
        File resources = new File(path);
        return resources.list(  )[choice];
    }
}
