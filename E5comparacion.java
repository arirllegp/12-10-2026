import java.util.Scanner;

public class E5comparacion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Número 1: ");
            double a = sc.nextDouble();
            System.out.print("Número 2: ");
            double b = sc.nextDouble();
            System.out.print("Número 3: ");
            double c = sc.nextDouble();

            double mayor = a;
            if (b > mayor) {
                mayor = b;
            }
            if (c > mayor) {
                mayor = c;
            }

            double menor = a;
            if (b < menor) {
                menor = b;
            }
            if (c < menor) {
                menor = c;
            }

            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.println("Diferencia: " + (mayor - menor));
        }
    }
}