package obiecte_clase;

public class Dog {
    // Proprietati
    String rasa;
    int age;
    String name;

    // Constructori
    public Dog () {
        // constructor default
        // acest constructor se genereaza automat si nu este vizibil in cod
        // atunci cand generam un contructor, constructorul default DISPARE
        // daca avem un constructor definit, putem defini in mod explicit constructorul default
    }

    public Dog (String rasa, int age, String name) {
        // constructor cu parametrii

        this.rasa = rasa;
        this.age = age;
        this.name = name;

    }
    // metode
    public String toString() {
        // metoda toString () transforma obiectul nostru intr-un text
        // atunci cand dorim sa afisam un obiect folosind System.out.println, metoda toString se apeleaza automat
        return "Rasa: " + this.rasa + ", Varsta: " + this.age + ", Nume: " + this.name;
    }

    public boolean equals(Object o) {
        Dog obj = (Dog) o; // am facut cast de la object la Dog
        //metoda equals ne spune cand 2 obiecte sunt egale si in ce conditii ( stabilim cand obiectele sunt egale)
        //in cazul in care punem doar equals ne reda daca valoarea din memorie este egala ex ( daca 2 obiecte au
        //valori identice si nu avem aceasta metoda, ne va arata ca ambele sunt egale desi sunt obiecte diferite,
        //in acest caz daca implementam aceasta metoda ne va aparea ca nu sunt aceleasi obiecte desi valorile sunt egale

        if (this.name.equals(obj.name) && this.rasa.equals(obj.rasa) && this.age == obj.age) {
            return true;
        } else {
            return false;
        }
    }
    public void apport(){
        System.out.println("Apport");
    }
    public void displayInfo(){
        System.out.println("Rasa: " + this.rasa + ", Varsta: " + this.age + ", Nume: " + this.name);
    }
public static void bark () {
    System.out.println("Ham Ham");
}
}