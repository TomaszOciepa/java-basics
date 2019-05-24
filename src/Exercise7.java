
// 7. Dana jest wejściowa tablica integerów. Należy znaleźć czy istnieją pary liczb sumujące się do podanej sumy (t). Jeśli tak, należy
// usunąć drugą liczbę z pary z tablicy i zwrócić tablicę wynikową. Przykład:
//
// x = [1, 2, 3, 4, 5] t = 3
//
// 1+2 = t, więc wyrzucamy 2. Żadna inna para nie sumuje się do t, więc wynikiem jest: [1, 3, 4, 5]

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        int[] randomTable = new int[5];
        Random random = new Random();

        for (int i = 0; i < randomTable.length; i++) {
            randomTable[i] = random.nextInt(10);
        }

        System.out.println("Dana jest tablica: ");

        for (int i = 0; i < randomTable.length; i++) {

            if (i == 0) {
                System.out.print("[" + randomTable[i] + ", ");
            } else if (i == 4) {
                System.out.println(randomTable[i] + "]");
            } else {
                System.out.print(randomTable[i] + ", ");
            }
        }


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj sumę (t): ");
        int t = in.nextInt();
        int suma = 0;
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < 5; i++) {
            if(i != 4){

                suma = randomTable[i] + randomTable[i + 1];

                if (suma == t){
                    index1 = i;
                    index2 = i + 1;
                }

            } else if (i == 4){
                suma = randomTable[i] + randomTable[i - 1];

                if (suma == t){
                    index1 = i - 1;
                    index2 = i;
                }
            }
        }

        System.out.println("index to: " + index1 + " oraz "+ index2);


        if (index1 != -1 && index2 != -1){
            System.out.println("znaleziono pare sumującą");
            System.out.println("Nowa tablica to:");

            int[] newTable = new int[3];
            int counter = 0;
            for (int i = 0; i < randomTable.length; i++) {
                if (i == index1 ){

                } else if (i == index2){

                } else{
                    if (counter< 3){
                        newTable[counter] = randomTable[i];
                    }

                    counter++;
                }
            }

            for (int i = 0; i < newTable.length; i++) {
                if ( i == 0){
                    System.out.print("["+newTable[i]+", ");
                }else if (i == 2){
                    System.out.println(newTable[i]+"]");
                }else {
                    System.out.print(newTable[i]+" ,");
                }

            }

        }else {
            System.out.println("Nie znaleziono pary sumujacej");
        }


    }
}
