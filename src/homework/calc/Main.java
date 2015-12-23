package homework.calc;

import java.util.Scanner;

/**
 * Created by Iaroslav on 23.11.2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        // public void print (String text){System.out.println(text);}

        int firstInteger    = 0;
        int secondInteger   = 0;
        String operator     = "";

        boolean firstCircle     = true;
        boolean operatorCircle  = true;
        boolean secondCircle    = true;

        System.out.println(LocalizationRu.GREETINGS);
        System.out.println(LocalizationRu.MANUAL);
        System.out.println("");

        //приглашение на ввод первого числа
        System.out.println(LocalizationRu.FIRSTINT);


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
            if (temp.equals(LocalizationRu.EXIT)){
                System.exit(0);
            } else if(isInt){
                try {
                    firstInteger = Integer.parseInt(temp);
                    firstCircle = false;
                } catch (NumberFormatException e) {
                    System.out.println(LocalizationRu.NONINTEGER);
                    System.out.println(LocalizationRu.REPEAT);
                }
            } else {
                System.out.println(LocalizationRu.NONINTEGER);
                System.out.println(LocalizationRu.REPEAT);
            }
        } while(firstCircle);

        //приглашение на ввод оператора
        System.out.println(LocalizationRu.OPERATOR);

        // цикл обработки ввода оператора
        do{

            Scanner operatorScanner = new Scanner(System.in);

            /*
            проверка на переменную ВЫХОД
            проверки на один из 4х операторов
            иначе повторное приглашение на ввод и повтор цикла
             */
            if (operatorScanner.hasNext(LocalizationRu.EXIT)){
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
                System.out.println(LocalizationRu.OPERATOR);
            }
        } while(operatorCircle);

        //приглашение на ввод второго числа
        System.out.println(LocalizationRu.SECONDINT);

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
            if (temp.equals(LocalizationRu.EXIT)){
                System.exit(0);
            } else if(isInt){
                try {
                    secondInteger = Integer.parseInt(temp);

                    if(secondInteger == 0 && operator.equals("/")){
                        System.out.println(LocalizationRu.ZERO);
                        System.out.println(LocalizationRu.REPEAT);
                    } else {
                        secondCircle = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(LocalizationRu.NONINTEGER);
                    System.out.println(LocalizationRu.REPEAT);
                }
            } else {
                System.out.println(LocalizationRu.NONINTEGER);
                System.out.println(LocalizationRu.REPEAT);
            }
        } while(secondCircle);

        Operations operation = new Operations();

        //передача даных для расчета
        operation.simpleOperations(firstInteger, secondInteger, operator);

    }

}
