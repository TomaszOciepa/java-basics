//6. Napisz program kalkulator, który wykonuje wybraną przez użytkownika operacją arytmetyczną na dwóch wczytanych liczbach. Program powinien wczytywać
// dane ze standardowego wejścia i wypisywać wynik na standardowym wyjściu. Program powinien zakończyć się, gdy
// zamiast znaku operacji użytkownik wpisze znak 'q'.


import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        System.out.println("Prosty kaluklator. Wczytaj dwie licznby i wykonaj oparacje + - * /. Aby zakoczyć wciśnij q");

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        int a = in.nextInt();
        System.out.println("Podaj liczbe b: ");
        int b = in.nextInt();
        System.out.println("Wybierz operację: + - * / lub q jeśli chcesz zakończyć program");
        String checkAction = in.next();


        switch (checkAction) {
            case "q":
                System.out.println("koniec!! Bye bye...");
                break;
            case "+":
                System.out.println(a + "+" + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + "-" + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + "*" + b + " = " + (a * b));
                break;
            case "/":
                System.out.println(a + "/" + b + " = " + (a / b));
                break;
        }


    }
}
