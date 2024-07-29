package operatii_cu_liste;

import java.sql.Array;
import java.util.Scanner;

/**
 * 1.sa se defineasca un array de 10 elemente, sa se afiseze acel array in consola
 * 2.sa se afiseze array-ul invers de la coada la cap
 * 3.sa se afiseze nr pare din array
 * 4.sa se calculeze suma numerelor divizibile cu 3 din array-ul dat
 * 5.sa se verifice daca numarul 9 este prezent in array, daca este prezent sa se afiseze un mesaj
 * 6.se citeste de la tastatura un numar intreg n,sa se verifice daca acest nr este prezent in array
 * 7. se citeste de la tastatura un numar intreg n, care va fi dimensiunea unui array, elementele array-ului
 * se vor citi de la tastatura. Sa se afiseze elementele array-ului intr-o singura linie
 */
public class Main {
    public static void main(String[] args) {


        int[] numbers = {8, 1, 2, 33, 4, 20, 6, 7, 8, 9};
        //               0, 1, 2, 3,  4, 5 , 6, 7, 8, 9
        afisareArray(numbers);
        System.out.println();
        System.out.println("---------------------------");

        afisareArrayInvers(numbers);

        System.out.println("-------------------------");

        afisareNumerePare(numbers);

        System.out.println();
        System.out.println("-------------------------");

        afisareSumaNrDivCu3(numbers);


        System.out.println();
        System.out.println("-------------------------");

        cautareNumarInArray(numbers);

        System.out.println("-------------------------");
//        citireNumarSiCautareInArray(numbers);

        System.out.println("-------------------------");
        citireArrayDeLaTastatura();

    }

    public static void afisareArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
//          pentru a afisa elementele invers, folosim linia de mai jos
//          int element = numbers[numbers.length-1-i];
            int element = numbers[i];
            if (i < (numbers.length - 1)) {
                System.out.print(element + ", ");
            } else {
                System.out.println(element);
            }
        }
    }

    public static void afisareArrayInvers(int[] numbers) {
        for (int i = numbers.length - 1;
             i >= 0; i--) {
            int element = numbers[i];
            if (i > 0) {

                System.out.print(element + ", ");
            } else {
                System.out.println(element);
            }
        }
    }

    public static void afisareNumerePare(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element % 2 == 0) {
                System.out.print(element + "  ");
            }
        }
    }

    public static void afisareSumaNrDivCu3(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element % 3 == 0) {
                System.out.println(element);
                sum = sum + element;
            }
        }
        System.out.println(sum);
    }

    public static void cautareNumarInArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element == 9) {
                System.out.println("Numarul 9 este prezent");
            }
        }
    }

    public static void citireNumarSiCautareInArray(int[] numbers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu numarul:");
        int number = scanner.nextInt();
//        boolean isPresent = false;
        int contor = 0;

        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (number == element) {
                contor++;
//                isPresent = true;
//                System.out.println("Numarul " + number + " este prezent in array");
//            }
//        }
//        if (isPresent == false) {
//            System.out.println(number + " Numarul nu este prezent");
            }
        }
        if (contor > 0) {
            System.out.println("Numarul " + number + " este prezent in array");
        } else {
            System.out.println(number + " Numarul nu este prezent in array");
        }
        scanner.close();
    }

    public static void citireArrayDeLaTastatura() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu lungimea array-ului");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            //pentru a adauga un element pe pozitia i in array
            System.out.println("Introdu un numar");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        afisareArray(numbers);

    }
}




