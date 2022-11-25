/*
4*. К калькулятору из предыдущего дз добавить логирование.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Calculator {
    public static void calculatorDouble() throws IOException {
        boolean flag = true;
        while (flag){
            System.out.println("Калькулятор умеет делать простые операции над числами");
            System.out.println("Введите операцию:\n 1. Сложение.\n 2. Вычитание.\n 3. Умножение.\n 4. Деление.\n 5. Выход.");
            Scanner scan = new Scanner(System.in);
            String operation = scan.next();
            switch (operation) {
                case "1" -> {
                    String[] data = inp_numbers();
                    String num1 = data[0];
                    String num2 = data[1];
                    double a = Double.parseDouble(num1);
                    double b = Double.parseDouble(num2);
                    System.out.println(a + " + " + b + " = " + (a + b));

                }
                case "2" -> {
                    String[] data = inp_numbers();
                    String num1 = data[0];
                    String num2 = data[1];
                    double a = Double.parseDouble(num1);
                    double b = Double.parseDouble(num2);
                    System.out.println(a + " - " + b + " = " + (a - b));

                }
                case "3" -> {
                    String[] data = inp_numbers();
                    String num1 = data[0];
                    String num2 = data[1];
                    double a = Double.parseDouble(num1);
                    double b = Double.parseDouble(num2);
                    System.out.println(a + " * " + b + " = " + (a * b));

                }
                case "4" -> {
                    String[] data = inp_numbers();
                    String num1 = data[0];
                    String num2 = data[1];
                    double a = Double.parseDouble(num1);
                    double b = Double.parseDouble(num2);
                    if (b != 0) {
                        System.out.println(a + " / " + b + " = " + (a / b));
                    } else {
                        System.out.println("Деление на ноль");
                    }

                }
                case "5" -> flag = false;
                default -> System.out.println("Некорректный ввод");
            }

        }


    }

    public static String[] inp_numbers() throws IOException {
        System.out.println("Введите числа через пробел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine().split(" ");
    }
}

