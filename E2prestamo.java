import java.util.Scanner;

public class E2prestamo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Sueldo: S/");
            double sueldo = sc.nextDouble();

            double maximo;
            if (sueldo >= 3000) {
                maximo = sueldo * 5;
            } else {
                maximo = sueldo * 2;
            }
            System.out.println("Préstamo máximo: S/" + maximo);
        }
    }
}