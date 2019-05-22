import java.util.Scanner;
// 3. Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite i wypisuje na standardowym wyjściu największą z ich
// wartości (pamiętaj o przypadku gdy wszystkie podane liczby lub dwie z nich są równe).
public class Exercise3 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe a: ");
        int a = in.nextInt();
        System.out.println("Podaj liczbe b: ");
        int b = in.nextInt();
        System.out.println("Podaj liczbe c: ");
        int c = in.nextInt();



//        if (a == b && a == c && b == c){
//            System.out.println("Wszystkie liczby sa równe =)");
//
//        }else if (a > b && a > c){
//            System.out.println("Najwieksza liczba to: "+a);
//        }else if (b > a && b > c){
//            System.out.println("Najwieksza liczba to: "+b);
//        }else if (c > a && c > b){
//            System.out.println("Najwieksza liczba to: "+c);
//        }else if (a == b && a!=c){
//            System.out.println("WoW 2 liczby są równe: a = "+a+" b = "+b);
//        }else if (a == c && a!=b){
//            System.out.println("WoW 2 liczby są równe: a = "+a+" c = "+c);
//        }else if (b == c && b!=a){
//            System.out.println("WoW 2 liczby są równe: b = "+b+" c = "+c);
//        }



        int[] table = new int[3];

        table[0] = a;
        table[1] = b;
        table[2] = c;

        int result = 0;

        for (int i = 0; i < table.length; i++) {

            if (table[i] > result){
                result = table[i];
            }
        }

        System.out.println("Najwieksza libczba to: "+ result);

    }
}
