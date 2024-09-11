import java.util.Scanner;

public class ContadorTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // TODO Auto-generated catch block
            System.out.println("O parâmetro dese ser maior que o primiero");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            System.out.println("Contando os numeros: " + (i + 1));

        }
    }

}
