package pl.sdacademy.intermediate.basic.calculator;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    private BigDecimal firstNumber;
    private BigDecimal secondNumber;
    private String equation;


    public void appStart() {
        String input = readDataFromConsole();
        prepareElementsForEquation(input);
        BigDecimal result = calculate(firstNumber,secondNumber,equation);
        if (result != null)
        System.out.println("Result of equation is " + result);
    }

    private String readDataFromConsole(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Provide an equation for 2 integer numbers");
        return scr.nextLine();
    }

    private void prepareElementsForEquation(String s) {
        s = s.replaceAll(" ", "");
        s = s.replaceAll(",", ".");
        String regex = "(-)?(\\d+\\.?\\d*)([/+\\-*])(-)?(\\d+\\.?\\d*)";

        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(s);
        double first;
        double second;
        if (m.find()) {
            System.out.println(m.group(2));
            if (m.group(1) != null) {
                first = Double.parseDouble(m.group(2)) * (-1);
            } else {
                first = Double.parseDouble(m.group(2));
            }
            if (m.group(4) != null) {
                second = Double.parseDouble(m.group(5)) * (-1);
            } else {
                second = Double.parseDouble(m.group(5));
            }
            String equation = m.group(3);

            System.out.println(first + " " + second + " " + equation);

            firstNumber=BigDecimal.valueOf(first);
            secondNumber=BigDecimal.valueOf(second);
            this.equation=equation;
        }
    }

    private BigDecimal calculate (BigDecimal firstNumber, BigDecimal secondNumber, String equation){
        BigDecimal result = null;
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        switch (equation) {
            case "+":
                result = firstNumber.add(secondNumber);
                break;
            case "-":
                result = firstNumber.subtract(secondNumber);
                break;
            case "*":
                result = firstNumber.multiply(secondNumber);
                break;
            case "/":
                if (secondNumber.compareTo(BigDecimal.ZERO)==0)
                    System.out.println("Do not divide by 0!");
                else {
                    result = firstNumber.divide(secondNumber);
                }
                break;
        }
        return result;
    }

//    public static void main(String[] args) {
//          String s = "-23 - -4";
//          appStart(s);

//
//        s = s.replaceAll(" ", "");
//        String regex = "(\\-)?(\\d+)([\\/+\\-*])(\\-)?(\\d+)";
//
//        Pattern r = Pattern.compile(regex);
//        Matcher m = r.matcher(s);
//        int first;
//        int second;
//        if (m.find()) {
//            System.out.println("Group1: " + m.group(5));
//            if (m.group(1) != null) {
//                first = Integer.parseInt(m.group(2)) * (-1);
//            } else {
//                first = Integer.parseInt(m.group(2));
//            }
//            if (m.group(4) != null) {
//                second = Integer.parseInt(m.group(5)) * (-1);
//            } else {
//                second = Integer.parseInt(m.group(5));
//            }
//            String equation = m.group(3);
//
//
//            System.out.println("First: " + first + " " + second);
//            int result = 0;
//            switch (equation) {
//                case "+":
//                    result = first + second;
//                    break;
//                case "-":
//                    result = first - second;
//                    break;
//                case "*":
//                    result = first * second;
//                    break;
//                case "/":
//                    if (second == 0)
//                        System.out.println("Do not divide by 0");
//                    else {
//                        result = first / second;
//                    }
//                    break;
//
//            }
//            System.out.println("Result of equation is " + result);
//        }




   // }
}
