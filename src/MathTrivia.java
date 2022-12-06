/** this is a class that represents a math operation
 *
 */
public class MathTrivia {
    /** this is the math operation */
    private String operation;

    /** this zero-parameter constructor initializes operation to a random operation using the getRandOperation method*/
    public MathTrivia(){
        operation = getRandOperation();
    }

    /** single parameter constructor that sets operation to the user operation */
    public MathTrivia(String operation){
        this.operation = operation;
    }

    /** get random double */
    public double getRandomNum(){
        double myNum = (int) (Math.random()*20) +1;
        return myNum;
    }

    /** solve equation based on operation
     * @param num1 - the first random number
     * @param num2 - the second random number
     * @return the solution to the equation as a double
     */
    public double mathSolve(double num1, double num2){
        if (operation.equals("division")){
            double dividedNums = num1/num2;
            return roundedToHundredth(dividedNums);
        } else {
            return num1 - num2;
        }
    }

    /** finds and returns user's math operation
     * @return operation as a string
     */
    public String toString(){
        if (operation.equals("division")){
            return "division";
        } else{
            return "subtraction";
        }
    }

    /** converts the equation to a verbal problem using toString method
     * @param num1 - user's first random number
     * @param num2 - user's second random number
     * @return the equation as a word problem
     */
    public String toString(double num1, double num2){
        if (toString().equals("division")){
            return "What is " + num1 + " divided by " + num2 + "? \nPlease round to the nearest hundreth";
        } else {
            return "What is " + (int) num2 + " subtracted from " + (int) num1 + "? \nPlease provide a double.";
        }
    }

    /** choose a random operation using the Math.random() operator
     * @return a random math operation
     */
    public String getRandOperation(){
        int randNum = (int) (Math.random() * 2) + 1;
        if (randNum == 1) {
            return "subtraction";
        } else {
            return "division";
        }
    }

    /** prints out the user's score
     * @param score - the user's current score
     */
    public void getScore(int score){
        System.out.println("Your score is now " + score);
    }

    /** rounds the number to the nearest hundredth
     * @param toRound - number to be rounded
     * @return a double rounded to the nearest hundredth
     */
    public double roundedToHundredth(double toRound) {
        return (double) Math.round(toRound * 100) / 100;
    }
}
