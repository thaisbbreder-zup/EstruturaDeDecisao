import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("****** SISTEMA DE NOTAS *********");

        System.out.print("Informe a primeira nota: ");
        double nota1 = entradaDoUsuario.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = entradaDoUsuario.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10) {
            System.out.println("Parabéns! Você foi aprovado =)");
        } else if (media < 7) {
            System.out.println("Que pena, você foi reprovado. Procure o professor para te ajudar!");
        } else if (media == 10) {
            System.out.println("Parabéns!!! Você foi aprovado com a nota máxima :D");
        } else {
            System.out.println("Atenção! Algo deu errado. Tente novamente!");
        }
    }
}
