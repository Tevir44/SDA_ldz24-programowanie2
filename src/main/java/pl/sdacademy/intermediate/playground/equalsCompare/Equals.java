package pl.sdacademy.intermediate.playground.equalsCompare;

public class Equals {
    public static void main(String[] args) {
        String string1 = new String("String");
        String string2 = "String";

        //Z samym = zrobiłoby referencje do tego samego objektu ze stosu Stringów. New String zmusza do stworzenia nowego obiektu. Equals ten sam, bo ta sama wartość 2 różnych obiektów.

        boolean check1 = string1==string2;
        boolean check2 = string1.equals(string2);

        System.out.print("Check1: " + check1 + " Check2: " + check2);
    }
}
