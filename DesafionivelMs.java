import java.util.Scanner;

public class DesafionivelMs {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Pago por hora: S/");
            double tarifa = sc.nextDouble();
            System.out.print("Horas trabajadas: ");
            double horas = sc.nextDouble();

            double bruto = tarifa * horas;

            double impuesto;
            if (bruto > 2500) {
                impuesto = bruto * 0.12;
            } else {
                impuesto = bruto * 0.07;
            }

            double bono = 0;
            if (horas > 48) {
                bono = 300;
            }

            double neto = bruto - impuesto + bono;

            System.out.println("Salario bruto: S/" + bruto);
            System.out.println("Impuesto: S/" + impuesto);
            System.out.println("Bono: S/" + bono);
            System.out.println("Salario neto: S/" + neto);
        }
    }
}