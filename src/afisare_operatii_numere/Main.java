package afisare_operatii_numere;

/**
 * 1.sa se afiseze toate numerele impare de la 0 la 50
 * 2.sa se calculeze suma primelor 5 numere divizibile cu 3 si 5
 * 3.sa se calculeze produsul primelor 5 de numere divizibile cu 9
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("ex1");
        afisareNumereImpare();
        System.out.println("ex2");
        numereDivizibileCu3si5();
        System.out.println("ex3");
        produsulNumerelor();
    }

    public static void afisareNumereImpare(){
        for(int i =0; i<=50;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    public static void numereDivizibileCu3si5(){
        int i =1; // i ne ajuta sa luam toate numerele de la 1 la infinit
        int contor = 0; // contor ne ajuta sa tinem evidenta numerelor gasite ce indeplinesc conditia
        int suma=0; // suma ne ajuta sa calculam suma numerelor gasite

        while (contor<5) { //se executa cat timp variabila contor este mai mica decat 5
            if (i % 3 == 0 && i % 5 == 0) {
                suma = suma + i; //daca este indeplinita conditia, adunam numarul gasit la suma existenta
                contor++; //contorul se incrementeaza atunci cand gasim un nr ce indeplineste conditia
            }
            i++; // i -ul se incrementeaza indiferent daca conditia este indeplinita
        }
        System.out.println(suma); // afisam suma numerelor gasite
    }
    public static void produsulNumerelor(){
        long i = 1;
        int contor = 0;
        long prod = 1;
        while (contor < 5){
            if(i%9==0){
                prod = prod * i;
                contor++;
            }
            i++;
        }
        System.out.println(prod);

    }
}
