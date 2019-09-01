import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuestionBase {

    List<QuizQuestion> listOfQuestions= new ArrayList<>();

    public List<QuizQuestion> createListOfQuestionsForChoosenCategory(String fileName) throws FileNotFoundException {
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
    static List<File> getCategories(){
        String path = "src\\main\\resources.\\";
        File resources = new File(path);
        return Arrays.asList( resources.listFiles() );
    }
    public File randomCategory (){
        Random random = new Random(  );
        List<File> categories = getCategories();
        return categories.get(random.nextInt(categories.size()));
    }
    public File chooseCategory (int choice){
        List<File> categories = getCategories();
        return categories.get(choice);
    }
    public void printQuestionsFromChosenCategory (){
        for (QuizQuestion element: listOfQuestions
             ) {
            System.out.println("Pytanie: " + element.question + "\n" );
        }
    }

    public static void printCategories (){
        int i=1;
        for (File element: getCategories()
             ) {
            System.out.println(i + ". " + element.getName().substring( 0,element.getName().length()-4 ).replace( "_", " " ));
            i++;
        }
    }
    public File getCategory (int index){

        return getCategories().get(index ) ;
    }
}
