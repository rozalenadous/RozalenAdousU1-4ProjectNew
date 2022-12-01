import java.util.Scanner;
public class MathTriviaRunner {
    public static void main(String [] args){
 Scanner scan = new Scanner(System.in);
 System.out.println("This is a math trivia game \n " +
         "You may choose to practice exponents, division, or subtraction, or you can choose a random operation " +
         "\n Please state which you'd like to practice: ");
  String myOp = scan.nextLine();
 while(!(myOp.equals("division") || myOp.equals("exponents") || myOp.equals("substraction"))){
    System.out.println("This is not a valid answer.");
    myOp = scan.nextLine();
 }

 int score = 0;
 // do when score = 4 return "your score is at 4! that's so close
while (score != 5){
    // repeat 3 more times for subtraction, exponents, and random
    if (myOp.equals("division")){
        MathTrivia divPractice = new MathTrivia("division");
        double num1 = divPractice.getRandom();
        double num2 = divPractice.getRandom();
        System.out.print("What is " + num1 + " divided by " + num2 + "? \n Please round to the nearest hundreth");
        double divAnswer = scan.nextDouble();
        if (divAnswer == divPractice.mathSolve(num1,num2)){
            System.out.println("That's correct!");
            score ++;
            divPractice.getScore(score);
        } else {
           System.out.println(divPractice.toString()) ;
        }


    }
}


    }
}
