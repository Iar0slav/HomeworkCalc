package homework.calc;

import java.util.Scanner;

/**
 * Created by Iaroslav on 23.11.2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        final String GREETINGS  = "Welcome to my small calculator :) It is works only with int values.";
        final String EXIT       = "exit";
        final String MANUAL     = "You can make next operations: + , - , / , * . If you want to exit, type " + EXIT;
        final String FIRSTINT   = "Please, enter first int, or " + EXIT + " to finish.";
        final String SECONDINT  = "Please, enter second int, or " + EXIT + " to finish.";
        final String OPERATOR   = "Please, enter operation symbol. You can choise from + , - , / , * , or " + EXIT + " to finish.";
        final String REPEAT     = "Enter int please, or " + EXIT + " to finish.";
        final String ZERO       = "In this calculator division by 0 is impossible :)";
        final String NONINTEGER = "You've entered non-integer number";

        int firstInteger    = 0;
        int secondInteger   = 0;
        String operator     = "";

        boolean firstCircle     = true;
        boolean operatorCircle  = true;
        boolean secondCircle    = true;

        System.out.println(GREETINGS);
        System.out.println(MANUAL);
        System.out.println("");

        //приглашение на ввод первого числа
        System.out.println(FIRSTINT);

        // цикл обработки первого числа
        do{

            Scanner firstCircleScanner = new Scanner(System.in);

            String temp = firstCircleScanner.nextLine();

            boolean isInt = CheckForInt.isInteger(temp);

            /*
            проверка на переменную ВЫХОД
            проверка на число
            иначе повторное приглашение на ввод и повтор цикла
            */
            if (temp.equals(EXIT)){
                System.exit(0);
            } else if(isInt){
                try {
                    firstInteger = Integer.parseInt(temp);
                    firstCircle = false;
                } catch (NumberFormatException e) {
                    System.out.println(NONINTEGER);
                    System.out.println(REPEAT);
                }
            } else {
                System.out.println(NONINTEGER);
                System.out.println(REPEAT);
            }
        } while(firstCircle);

        //приглашение на ввод оператора
        System.out.println(OPERATOR);

        // цикл обработки ввода оператора
        do{

            Scanner operatorScanner = new Scanner(System.in);

            /*
            проверка на переменную ВЫХОД
            проверки на один из 4х операторов
            иначе повторное приглашение на ввод и повтор цикла
             */
            if (operatorScanner.hasNext(EXIT)){
                System.exit(0);
            } else if(operatorScanner.hasNext("\\+")){
                operator = operatorScanner.next();
                operatorCircle = false;
            } else if (operatorScanner.hasNext("-")){
                operator = operatorScanner.next();
                operatorCircle = false;
            } else if (operatorScanner.hasNext("\\*")){
                operator = operatorScanner.next();
                operatorCircle = false;
            } else if (operatorScanner.hasNext("/")){
                operator = operatorScanner.next();
                operatorCircle = false;
            } else {
                System.out.println(OPERATOR);
            }
        } while(operatorCircle);

        //приглашение на ввод второго числа
        System.out.println(SECONDINT);

        // цикл обработки второго числа
        do{

            Scanner secondCircleScanner = new Scanner(System.in);

            String temp = secondCircleScanner.nextLine();

            boolean isInt = CheckForInt.isInteger(temp);

            /*
            проверка на переменную ВЫХОД
            проверка на число и деление на 0
            иначе повторное приглашение на ввод и повтор цикла
            */
            if (temp.equals(EXIT)){
                System.exit(0);
            } else if(isInt){
                try {
                    secondInteger = Integer.parseInt(temp);

                    if(secondInteger == 0 && operator.equals("/")){
                        System.out.println(ZERO);
                        System.out.println(REPEAT);
                    } else {
                        secondCircle = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(NONINTEGER);
                    System.out.println(REPEAT);
                }
            } else {
                System.out.println(NONINTEGER);
                System.out.println(REPEAT);
            }
        } while(secondCircle);

        Operations operation = new Operations();

        //передача даных для расчета
        operation.simpleOperations(firstInteger, secondInteger, operator);

    }

}
