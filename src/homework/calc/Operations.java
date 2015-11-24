package homework.calc;

/**
 * Created by Iaroslav on 23.11.2015.
 */
public class Operations {

    final String INCORRECT  = "Incorrect operation symbol.";
    final String RESULT     = "Result of operation ";

    public void simpleOperations (int x, int y, String operator){
        long answer;
        float answerFloat;
        switch (operator){
            case "+":
                answer = (long) x + (long) y;
                System.out.println(RESULT + x + " " + operator + " " + y + " is: " + answer);
                break;
            case "-":
                answer = (long) x - (long) y;
                System.out.println(RESULT + x + " " + operator + " " + y + " is: " + answer);
                break;
            case "*":
                answer = (long) x * (long) y;
                System.out.println(RESULT + x + " " + operator + " " + y + " is: " + answer);
                break;
            case "/":
                answerFloat = (float) x / (float) y;
                System.out.println(RESULT + x + " " + operator + " " + y + " is: " + answerFloat);
                break;
            default: System.out.println(INCORRECT);
        }
    }
}
