import java.util.Scanner;

public class Substraction extends Addition {
    

    private String operate () {
        this.question = this.firstNumber + " - " + this.secondNumber + " = ";
        return this.question ;
    };

    int produceSum(){
        return this.sum = this.firstNumber - this.secondNumber;
    }

    public void ask (list list) {
        Scanner input = new Scanner(System.in);
        

        this.produceNumbers();
        
        System.out.println(operate());
        int answer = input.nextInt();
        String text = question+answer;
        
        if (answer != this.sum){
            System.out.println(this.incorrect_sentence);
            list.addIncorrectQuestions(text);
        } else{
            list.addCorrectQuestions(text);
            System.out.println(this.correct_sentence);
            this.score +=5;
        }

    }
}
