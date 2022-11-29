public class MathTrivia {
    private double num1;
    private double num2;
    private String operation;

    public MathTrivia(String difference, int num1, int num2){
        operation = difference;
        this.num1= num1;
        this.num2 = num2;
    }
    public MathTrivia(String exponential, double num1, int num2){
        operation = exponential;
        this.num1= num1;
        this.num2 = num2;
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
    public double MathDivision(){
    }
    public String toString(){
        return "The answer to this problem is " + 5; // stand in int

    }
    public void getOperation(String str){
        if (str.contains("difference") ){
            System.out.print("difference");
        }
        if (str.contains("power") ){
            System.out.print("exponential");
        }
        if (str.contains("divided") ){
            System.out.print("division");
        }
        else {
            System.out.print("This is not a valid operation");
        }
    }

}
