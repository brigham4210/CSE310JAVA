import java.util.List;
import java.util.ArrayList;

public class list {
    public List<String> correctQuestions = new ArrayList<>();
    public List<String> incorrectQuestions = new ArrayList<>();   
    
    public List<String> addCorrectQuestions(String text){
        this.correctQuestions.add(text);
        return this.correctQuestions;
    
    }

    public List<String> addIncorrectQuestions(String text){
        incorrectQuestions.add(text);
        return this.incorrectQuestions;
    }

    public void results(){
        System.out.println("Correct answers are:");
        System.out.println(correctQuestions);
        System.out.println("Incorrect answers are:");
        System.out.println(incorrectQuestions);
    }
}



