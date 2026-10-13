import java.util.Scanner;

public class E10produccion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Piezas producidas: ");
            int piezas = sc.nextInt();

            double pago = piezas * 5;
            double incentivo;
            if (piezas > 1000) {
                incentivo = pago * 0.15;
            } else {
                incentivo = pago * 0.08;
            }
            System.out.println("Pago base: S/" + pago);
            System.out.println("Incentivo: S/" + incentivo);
            System.out.println("Total: S/" + (pago + incentivo));
        }
    }
}