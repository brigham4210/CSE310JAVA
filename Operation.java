import java.util.Random;


public class Operation{
    
    Random rand = new Random();
    int firstNumber = 0;
    int secondNumber = 0;
    String correct_sentence = "Correct";
    String incorrect_sentence = "Incorrect";
    
    String question = "";
    int score = 0;
    int sum = 0;
    int product = 0;

    int produceFirstNumber(){
        return this.firstNumber = rand.nextInt(40)+10; 
    }
    int produceSecondNumber(){
        return this.secondNumber = rand.nextInt(40)+10;
    }
    int produceSum(){
        return this.sum = this.firstNumber + this.secondNumber;
    }
    int produceProduct(){
        return this.product = this.firstNumber * this.secondNumber;
    }
    public void produceNumbers(){
        produceFirstNumber();
        produceSecondNumber();
        this.sum = produceSum();
        this.product = produceProduct();
        }


}

