import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (InvalidParameterException e) {
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }

        scanner.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws InvalidParameterException {
        if (primeiroParametro > segundoParametro) {
            throw new InvalidParameterException();
        }

        int diferenca = segundoParametro - primeiroParametro;
        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}