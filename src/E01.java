import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("****** Qual o maior número? *********");
        System.out.println("Escreva o primeiro número");
        double primeiroNum = entradaDoUsuario.nextDouble();

        System.out.println("Escreva o segundo número");
        double segundoNum = entradaDoUsuario.nextDouble();

        if (primeiroNum > segundoNum) {
            System.out.println("O número " + primeiroNum + " é maior.");
        } else if (segundoNum > primeiroNum) {
            System.out.println("O numero" + segundoNum + " é maior");
        } else if (primeiroNum == segundoNum) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Algo deu errado. Tente novamente!");
        }
    }
}
