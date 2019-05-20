import java.util.Scanner;

//2. Napisz program, który wczytuje ze standardowego wejścia liczbę całkowitą n i wypisuje na standardowe wyjście wartość bezwzględną z n.

public class Exercise2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int a = in.nextInt();
        int result = 0;

        if (a < 0){

            result = a * -1;
        }else {
            result = a;
        }

        System.out.println("Liczba bezwzględna to: "+ result);
    }
}
