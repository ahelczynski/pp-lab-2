import java.util.Scanner;

public class SredniaOcen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę ocen: ");
        int iloscOcen = scanner.nextInt();
        double[] ocenyUczniow = new double[iloscOcen];
        double sumaOcen = 0.0;
        for (int i = 0; i < iloscOcen; i++) {
            System.out.print("Podaj ocenę " + (i + 1) + ": ");
            ocenyUczniow[i] = scanner.nextDouble();
            sumaOcen += ocenyUczniow[i];
        }
        double sredniaOcen = sumaOcen / iloscOcen;
        System.out.println("Oceny:");
        for (int i = 0; i < iloscOcen; i++) {
            System.out.println("Ocena " + (i + 1) + ": " + ocenyUczniow[i]);
        }
        System.out.println("Suma ocen: " + sumaOcen);
        System.out.println("Średnia ocen: " + sredniaOcen);
    }
}