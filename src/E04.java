import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("******* REAJUSTE SALARIAL *******");

        System.out.print("Informe o salário do colaborador: ");
        double salarioAntigo = entradaDoUsuario.nextDouble();
        double salarioReajustado = 0;
        double percentual = 0;
        double valorAumento = 0;

        if (salarioAntigo <= 280) {
            percentual = 20;
            valorAumento = salarioAntigo * 0.02;
            salarioReajustado = (salarioAntigo * 0.02) + salarioAntigo;

        } else if (salarioAntigo > 280 && salarioAntigo <= 700) {
            percentual = 15;
            valorAumento = salarioAntigo * 0.15;
            salarioReajustado = (salarioAntigo * 0.15) + salarioAntigo;
        } else if (salarioAntigo > 700 && salarioAntigo <= 1500) {
            percentual = 10;
            valorAumento = salarioAntigo * 0.1;
            salarioReajustado = (salarioAntigo * 0.1) + salarioAntigo;
        } else if (salarioAntigo > 1500) {
            percentual = 5;
            valorAumento = salarioAntigo * 0.05;
            salarioReajustado = (salarioAntigo * 0.05) + salarioAntigo;
        }
        System.out.println("O salário antigo era R$" + salarioAntigo);
        System.out.println("O percentual de aumento foi " + percentual + "%");
        System.out.println("O valor do aumento foi R$" + valorAumento);
        System.out.println("O novo salário é R$" + salarioReajustado);
    }
}
