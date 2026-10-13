import java.util.Scanner;

public class E8rendimiento {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Promedio (0-20): ");
            double promedio = sc.nextDouble();

            if (promedio < 0 || promedio > 20) {
                System.out.println("Promedio no válido");
            } else if (promedio < 11) {
                System.out.println("Desaprobado");
            } else if (promedio < 15) {
                System.out.println("Regular");
            } else if (promedio < 18) {
                System.out.println("Bueno");
            } else {
                System.out.println("Excelente");
            }
        }
    }
}