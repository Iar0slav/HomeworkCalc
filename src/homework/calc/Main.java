package homework.calc;

import java.util.Scanner;

/**
 * Created by Iaroslav on 23.11.2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        final String GREETENGS  = "Welcome to my small calculator :) ";
        final String MANUAL     = "You can make next operations: + , - , / , * . If you want to exit, type \"exit\"";
        final String FIRSTINT   = "Please, enter first int, or \"exit\" to finish.";
        final String SECONDINT  = "Please, enter second int, or \"exit\" to finish.";
        final String OPERATOR   = "Please, enter operation symbol. You can choise from + , - , / , * , or \"exit\" to finish.";
        final String REPEAT     = "Enter int please, or \"exit\" to finish.";
        final String EXIT       = "exit";
        final String INCORRECT  = "Incorrect operation symbol.";

        int firstInteger    = 0;
        int secondInteger   = 0;
        String operator     = "";

        boolean firstCircle     = true;
        boolean operatorCircle  = true;
        boolean secondCircle    = true;

        System.out.println(GREETENGS);
        System.out.println(MANUAL);
        System.out.println("");

        Scanner firstCircleScanner = new Scanner(System.in);
        System.out.println(FIRSTINT);

        if (firstCircleScanner.hasNext(EXIT)){
            System.exit(0);
        }

        if(firstCircleScanner.hasNextInt()){
            firstInteger = firstCircleScanner.nextInt();
        } else {
            while(firstCircle){
                System.out.println(REPEAT);
                Scanner scannerTemp = new Scanner(System.in);

                if(scannerTemp.hasNextInt()){
                    firstInteger = scannerTemp.nextInt();
                    firstCircle = false;
                } else if(scannerTemp.hasNext(EXIT)){
                    System.exit(0);
                }

            }
        }

        Scanner operatorScanner = new Scanner(System.in);
        System.out.println(OPERATOR);

        if (operatorScanner.hasNext(EXIT)){
            System.exit(0);
        }

        if(operatorScanner.hasNext("\\+")){
            operator = operatorScanner.next();
        } else if (operatorScanner.hasNext("-")){
            operator = operatorScanner.next();
        } else if (operatorScanner.hasNext("\\*")){
            operator = operatorScanner.next();
        } else if (operatorScanner.hasNext("/")){
            operator = operatorScanner.next();
        } else {
            while(operatorCircle){
                System.out.println(OPERATOR);
                Scanner scannerTemp = new Scanner(System.in);

                if(scannerTemp.hasNext("\\+")){
                    operator = operatorScanner.next();
                    operatorCircle = false;
                } else if (scannerTemp.hasNext("-")){
                    operator = operatorScanner.next();
                    operatorCircle = false;
                } else if (scannerTemp.hasNext("\\*")){
                    operator = operatorScanner.next();
                    operatorCircle = false;
                } else if (scannerTemp.hasNext("/")){
                    operator = operatorScanner.next();
                    operatorCircle = false;
                } else if(scannerTemp.hasNext(EXIT)){
                    System.exit(0);
                }

            }
        }

        Scanner secondCircleScanner = new Scanner(System.in);
        System.out.println(SECONDINT);

        if (secondCircleScanner.hasNext(EXIT)){
            System.exit(0);
        }

        if(secondCircleScanner.hasNextInt()){
            secondInteger = secondCircleScanner.nextInt();
        } else {
            while(secondCircle){
                System.out.println(REPEAT);
                Scanner scannerTemp = new Scanner(System.in);

                if(scannerTemp.hasNextInt()){
                    secondInteger = scannerTemp.nextInt();
                    secondCircle = false;
                } else if(scannerTemp.hasNext(EXIT)){
                    System.exit(0);
                }

            }
        }

        Operations operation = new Operations();

        if (operator.equals("+")) {
            operation.sum(firstInteger, secondInteger);
        } else if (operator.equals("-")){
            operation.sub(firstInteger, secondInteger);
        } else if (operator.equals("*")){
            operation.mul(firstInteger, secondInteger);
        } else if (operator.equals("/")){
            operation.div(firstInteger, secondInteger);
        } else {
            System.out.println(INCORRECT);
        }

    }

}
