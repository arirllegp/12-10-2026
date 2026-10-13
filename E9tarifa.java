import java.util.Scanner;

public class E9tarifa {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Distancia (km): ");
            double km = sc.nextDouble();

            double tarifa;
            if (km <= 3) {
                tarifa = 8;
            } else {
                tarifa = 8 + (km - 3) * 2.50;
            }
            System.out.println("Tarifa: S/" + tarifa);
        }
    }
}