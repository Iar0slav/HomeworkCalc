package homework.calc;

/**
 * Created by Iaroslav on 23.11.2015.
 */
public class Operations {

    public void sum(int x, int y){
        int z = x + y;
        System.out.println("Result of operation " + x + " + " + y + " is: " + z);
    }

    public void sub(int x, int y){
        int z = x - y;
        System.out.println("Result of operation " + x + " - " + y + " is: " + z);
    }

    public void mul(int x, int y){
        int z = x * y;
        System.out.println("Result of operation " + x + " * " + y + " is: " + z);
    }

    public void div(int x, int y){
        int z = x / y;
        System.out.println("Result of operation " + x + " / " + y + " is: " + z);
    }

}
