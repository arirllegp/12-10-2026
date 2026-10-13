import java.util.Scanner;

public class E3compra {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Cantidad de computadoras: ");
            int cantidad = sc.nextInt();

            double importe = cantidad * 2500;
            double descuento;
            if (cantidad >= 5) {
                descuento = importe * 0.12;
            } else {
                descuento = importe * 0.05;
            }
            System.out.println("Importe: S/" + importe);
            System.out.println("Descuento: S/" + descuento);
            System.out.println("Total: S/" + (importe - descuento));
        }
    }
}