package homework.calc;

/**
 * Created by Iaroslav on 23.11.2015.
 */
public class Operations {

    final String INCORRECT  = "Incorrect operation symbol.";

    public void simpleOperations (int x, int y, String operator){
        long answer;
        float answerFloat;
        switch (operator){
            case "+":
                answer = (long) x + (long) y;
                System.out.println("Result of operation " + x + " + " + y + " is: " + answer);
                break;
            case "-":
                answer = (long) x - (long) y;
                System.out.println("Result of operation " + x + " - " + y + " is: " + answer);
                break;
            case "*":
                answer = (long) x * (long) y;
                System.out.println("Result of operation " + x + " * " + y + " is: " + answer);
                break;
            case "/":
                answerFloat = (float) x / (float) y;
                System.out.println("Result of operation " + x + " / " + y + " is: " + answerFloat);
                break;
            default: System.out.println(INCORRECT);
        }
    }
/*
    public void sum(int x, int y){
        long z = (long) x + (long) y;
        System.out.println("Result of operation " + x + " + " + y + " is: " + z);
    }

    public void sub(int x, int y){
        long z = (long) x - (long) y;
        System.out.println("Result of operation " + x + " - " + y + " is: " + z);
    }

    public void mul(int x, int y){
        long z = (long) x * (long) y;
        System.out.println("Result of operation " + x + " * " + y + " is: " + z);
    }

    public void div(int x, int y){
        long z = (long) x / (long) y;
        System.out.println("Result of operation " + x + " / " + y + " is: " + z);
    }
*/
}
