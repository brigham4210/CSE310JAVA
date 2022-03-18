public class Main {
    
    public static void main(String[] args) {
        Addition addition = new Addition();
        Substraction substraction = new Substraction();
        Multiplication multiplication = new Multiplication();
        list list = new list();

        for (int i = 0; i <= 6; i++) {
        addition.ask(list);
        System.out.println();
        substraction.ask(list);
        System.out.println();
        multiplication.ask(list);
        System.out.println();
        }

        // addition.ask(list);
        // System.out.println();
        // substraction.ask(list);
        // System.out.println();
        // multiplication.ask(list);
        // System.out.println();

        System.out.println();
        int score = addition.score + substraction.score + multiplication.score;
        System.out.println("Your Score is " + score);
        list.results();
    }
}
