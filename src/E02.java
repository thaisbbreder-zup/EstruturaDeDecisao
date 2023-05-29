import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("****** QUAL O MAIS BARATO? *********");

        System.out.println("Informe o preço do primeiro produto");
        double primeiroProd = entradaDoUsuario.nextDouble();

        System.out.println("Informe o preço do segundo produto");
        double segundoProd = entradaDoUsuario.nextDouble();

        System.out.println("Informe o preço do terceiro produto");
        double terceiroProd = entradaDoUsuario.nextDouble();

        if (primeiroProd < segundoProd && primeiroProd < terceiroProd) {
            System.out.println("O primeiro produto é mais barato. Você deve comprar ele!");
        } else if (segundoProd < primeiroProd && segundoProd < terceiroProd) {
            System.out.println("O segundo produto é mais barato. Você deve comprar ele!");
        } else if (terceiroProd < primeiroProd && terceiroProd < segundoProd) {
            System.out.println("O terceiro produto é mais barato. Você deve comprar ele!");
        } else if (primeiroProd == segundoProd || segundoProd == terceiroProd || terceiroProd == primeiroProd){
            System.out.println("Dois produtos estão com o preço igual. Tente novamente!");
        }
    }
}
