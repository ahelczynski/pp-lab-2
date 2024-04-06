import java.util.Scanner;

public class ObliczSrednia {
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
        System.out.println("Średnia ocen: " + sredniaOcen);
    }
}