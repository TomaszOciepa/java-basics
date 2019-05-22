
//Pętle: 4. Napisz program, który wczytuje ze standardowego wejścia nieujemną liczbę całkowitą n i wypisuje na standardowym
// wyjściu element ciągu Fibonacciego o indeksie n.

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = in.nextInt();

        int firstNumber = 0;

        if (number < 0) {
            System.out.println("Podałeś ujemną liczbę!! bye");
        } else{
            firstNumber = number;
        }

        int prev1 =1;
        int prev2 = 1;

        if(firstNumber <= 2){
            System.out.println("Fibonaci o indeksie " + firstNumber +" wynosi 1");
        }

        int currentElement = 0;
        int index = 2;
        for (int i = 3; i <= firstNumber; i++) {

            currentElement = prev1 + prev2;

            prev2 = prev1;
            prev1 = currentElement;
            index++;

        }

        System.out.println("Fibonnaci " + index + " wynosi: "+currentElement);
    }
}
