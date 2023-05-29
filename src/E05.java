import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("****** QUAL O DIA DA SEMANA? *********");
        System.out.print("Informe um número de 1 a 7: ");
        int numeroDia = entradaDoUsuario.nextInt();
        String diaDaSemana;

        switch (numeroDia) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            default:
                diaDaSemana = "inválido";
                break;
        }
        System.out.println("O dia correspondente é ao número informado é " + diaDaSemana);
    }
}
