public class MathTrivia {
    private double num1;
    private double num2;
    private String operation;

    public MathTrivia(){
      // make a get random operation here
    }
    public MathTrivia(String operation){
        this.operation = "exponential";

    }
    public MathTrivia(String division, double num1, double num2){
        operation = division;
        this.num1= num1;
        this.num2 = num2;
    }
    // how the user gets num1 and num2
    public double getRandom(){
        double myNum = (int) (Math.random()*100) +1;
        return myNum;
    }
    public double mathSolve(double num1, double num2){
       if (operation.equals("division")){
           return num1/num2;
       } else if (operation.equals("exponents")){
           return Math.pow(num1,num2);
       } else {
           return num1 - num2;
       }
    }
    public String toString(){
        return "The answer to this problem is " + mathSolve(num1, num2); // stand in int

    }
    public String getRandOperation(){
        int num1 = (int) (Math.random()*2) + 1;
        if (num1 == 1) {
            return "division";
        } else if (num1 ==2){
            return "exponents";
        } else {
            return "subtraction";
        }
    }
// add a void method called getscore
    public void getScore(int score){
        System.out.println("Your score is now " + score);
    }
}
