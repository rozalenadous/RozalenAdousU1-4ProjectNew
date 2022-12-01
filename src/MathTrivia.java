public class MathTrivia {
    private double num1;
    private double num2;
    private String operation;

    public MathTrivia(){
      // make a get random operation here
        operation = getRandOperation();
    }
    public MathTrivia(String operation){
        this.operation = operation;

    }
    // how the user gets num1 and num2
    public double getRandom(){
        double myNum = (int) (Math.random()*10) +1;
        return myNum;
    }
    public double mathSolve(double num1, double num2){
       if (operation.equals("division")){
           return num1/num2;
       } else {
           return (int) num1 - (int) num2;
       }
    }
   // public String toString(){
    //    return "The answer to this problem is " + mathSolve(num1, num2); // stand in int
    //}
    public String toString(double num1, double num2){
        if (operation.equals("division")){
            return "What is " + num1 + " divided by " + num2 + "? \n Please round to the nearest hundreth";
        } else {
            return "What is " + (int) num2 + " subtracted from " + (int) num1 + "?";
        }
    }
    // only ever returns division??
    public String getRandOperation(){
        int num1 = (int) (Math.random() * 2) + 1;
        if (num1 == 1) {
            return "subtraction";
        } else {
            return "division";
        }
    }
// add a void method called getscore
    public void getScore(int score){
        System.out.println("Your score is now " + score);
    }
}
