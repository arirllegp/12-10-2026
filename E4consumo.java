import java.util.Scanner;

public class E4consumo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Consumo (kWh): ");
            double kwh = sc.nextDouble();

            double monto;
            if (kwh <= 100) {
                monto = kwh * 0.80;
            } else {
                monto = kwh * 1.20;
            }
            System.out.println("Monto a pagar: S/" + monto);
        }
    }
}