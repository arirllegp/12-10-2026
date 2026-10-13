import java.util.Scanner;

public class E6bonificacion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ventas: S/");
            double ventas = sc.nextDouble();

            double bonificacion;
            if (ventas > 5000) {
                bonificacion = ventas * 0.10;
            } else {
                bonificacion = ventas * 0.05;
            }
            System.out.println("Bonificación: S/" + bonificacion);
            System.out.println("Total: S/" + (ventas + bonificacion));
        }
    }
}