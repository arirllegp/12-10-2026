import java.util.Scanner;

public class E7control {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Peso del paquete (kg): ");
            double peso = sc.nextDouble();

            if (peso <= 50) {
                System.out.println("Paquete aceptado");
            } else {
                System.out.println("Paquete rechazado. Sobrepasa por " + (peso - 50) + " kg");
            }
        }
    }
}