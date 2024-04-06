import java.util.Scanner;
public class SredniaOcen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość przedmiotów:");
        int iloscPrzedmiotow = scanner.nextInt();
        double[] oceny = new double[iloscPrzedmiotow];
        for (int i = 0; i < iloscPrzedmiotow; i++) {
            double ocena;
            do {
                System.out.println("Podaj ocenę z przedmiotu " + (i + 1) + " (ocena musi być dodatnia i mniejsza od 6):");
                ocena = scanner.nextDouble();
            } while (ocena <= 0 || ocena >= 6); // Sprawdzanie, czy ocena jest dodatnia i mniejsza od 6
            oceny[i] = ocena;
        }
        System.out.println("Oceny:");
        double sumaOcen = 0;
        for (int i = 0; i < iloscPrzedmiotow; i++) {
            System.out.println("Ocena z przedmiotu " + (i + 1) + ": " + oceny[i]);
            sumaOcen += oceny[i];
        }
        System.out.println("Suma ocen: " + sumaOcen);
        double srednia = sumaOcen / iloscPrzedmiotow;
        System.out.println("Średnia ocen z " + iloscPrzedmiotow + " przedmiotów wynosi: " + srednia);
        scanner.close();
    }
}