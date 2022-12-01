import java.util.Scanner;
public class MathTriviaRunner {
    public static void main(String [] args){
 Scanner scan = new Scanner(System.in);
 System.out.print("This is a math trivia game \n " +
         "You may choose to practice division or subtraction, or you can choose a random operation " +
         "\n Please state which you'd like to practice: ");
  String myOp = scan.nextLine();
 while(!(myOp.equals("division") || myOp.equals("random") || myOp.equals("subtraction"))){
    System.out.println("This is not a valid answer.");
    myOp = scan.nextLine();
 }

 int score = 0;
 // do when score = 4 return "your score is at 4! that's so close
while (score != 5){
    // repeat 3 more times for subtraction, exponents, and random

    // Maybe instead of all this logic in the main method make it a method
    if (myOp.equals("division")){
        MathTrivia divPractice = new MathTrivia("division");
        double num1 = divPractice.getRandom();
        double num2 = divPractice.getRandom();
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
    if (myOp.equals("subtraction")){
        MathTrivia subPractice = new MathTrivia("subtraction");
        double num1 = subPractice.getRandom();
        double num2 = subPractice.getRandom();
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
    if (myOp.equals("random")){
        MathTrivia randPractice = new MathTrivia();
        double num1 = randPractice.getRandom();
        double num2 = randPractice.getRandom();
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
