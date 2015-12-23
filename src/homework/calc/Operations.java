package homework.calc;

/**
 * Created by Iaroslav on 23.11.2015.
 */
public class Operations {

    public void simpleOperations (int x, int y, String operator){
        long answer;
        float answerFloat;
        switch (operator){
            case "+":
                answer = (long) x + (long) y;
                System.out.println(LocalizationRu.RESULT + x + " " + operator + " " + y + " is: " + answer);
                break;
            case "-":
                answer = (long) x - (long) y;
                System.out.println(LocalizationRu.RESULT + x + " " + operator + " " + y + " is: " + answer);
                break;
            case "*":
                answer = (long) x * (long) y;
                System.out.println(LocalizationRu.RESULT + x + " " + operator + " " + y + " is: " + answer);
                break;
            case "/":
                answerFloat = (float) x / (float) y;
                System.out.println(LocalizationRu.RESULT + x + " " + operator + " " + y + " is: " + answerFloat);
                break;
            default: System.out.println(LocalizationRu.INCORRECT);
        }
    }
}
