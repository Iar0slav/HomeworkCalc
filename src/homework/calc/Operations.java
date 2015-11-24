package homework.calc;

/**
 * Created by Iaroslav on 23.11.2015.
 */
public class Operations {

    final String INCORRECT  = "Incorrect operation symbol.";

    public void operationSelect (int x, int y, String operator){
        switch (operator){
            case "+": sum(x, y); break;
            case "-": sub(x, y); break;
            case "*": mul(x, y); break;
            case "/": div(x, y); break;
            default: System.out.println(INCORRECT);
        }
    }

    public void sum(int x, int y){
        long a = x;
        long b = y;
        long z = a + b;
        System.out.println("Result of operation " + x + " + " + y + " is: " + z);
    }

    public void sub(int x, int y){
        long a = x;
        long b = y;
        long z = a - b;
        System.out.println("Result of operation " + x + " - " + y + " is: " + z);
    }

    public void mul(int x, int y){
        long a = x;
        long b = y;
        long z = a * b;
        System.out.println("Result of operation " + x + " * " + y + " is: " + z);
    }

    public void div(int x, int y){
        float a = x;
        float b = y;
        float z = a / b;
        System.out.println("Result of operation " + x + " / " + y + " is: " + z);
    }

}
