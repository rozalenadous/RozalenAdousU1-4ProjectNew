import java.util.Scanner;
public class MathTriviaRunner {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        // introduces the game and allows a user to input their operation
        System.out.print("This is a math trivia game\n" +
                "You may choose to practice division or subtraction, or you can choose a random operation" +
                "\nPlease state which you'd like to practice: \n");
        String myOperation = scan.nextLine();

        // asks the user to enter an operation till it is valid (random, division, or subtraction)
        while(!(myOperation.equals("division") || myOperation.equals("random") || myOperation.equals("subtraction"))){
            System.out.println("This is not a valid answer.");
            myOperation = scan.nextLine();
        }

        // initializes score to 0 and continues the game until the score is 5
        int score = 0;
        while (score != 5){
            if (myOperation.equals("division")){ //
                MathTrivia divPractice = new MathTrivia("division");
                double num1 = divPractice.getRandomNum();
                double num2 = divPractice.getRandomNum();
                System.out.print(divPractice.toString(num1, num2));
                double divAnswer = scan.nextDouble();
                if (divAnswer == divPractice.mathSolve(num1,num2)){
                    System.out.println("That's correct!");
                    score ++;
                    divPractice.getScore(score);
                } else {
                    System.out.println("That's wrong. The correct answer is "  + divPractice.mathSolve(num1,num2) ) ;
                }
            }
            if (myOperation.equals("subtraction")){
                MathTrivia subPractice = new MathTrivia("subtraction");
                double num1 = subPractice.getRandomNum();
                double num2 = subPractice.getRandomNum();
                System.out.print(subPractice.toString(num1, num2));
                double subAnswer = scan.nextDouble();
                if (subAnswer == subPractice.mathSolve(num1,num2)){
                    System.out.println("That's correct!");
                    score ++;
                    subPractice.getScore(score);
                } else {
                    System.out.println("That's wrong. The correct answer is "  + subPractice.mathSolve(num1,num2) ) ;
                }
            }
            if (myOperation.equals("random")){
                MathTrivia randPractice = new MathTrivia();
                double num1 = randPractice.getRandomNum();
                double num2 = randPractice.getRandomNum();
                System.out.print(randPractice.toString(num1, num2));
                double randAnswer = scan.nextDouble();
                if (randAnswer == randPractice.mathSolve(num1,num2)){
                    System.out.println("That's correct!");
                    score ++;
                    randPractice.getScore(score);
                } else {
                    System.out.println("That's wrong. The correct answer is "  + randPractice.mathSolve(num1,num2) ) ;
                }
            }
        }
        System.out.println("Congrats! You passed the trivia! Come back if you want more math practice!");
    }
}
