import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EstruturasExcepcionaisTruCatch {
    public static void main(String[] args) {
        // colocando o parametro para mostrar o erro na tela em vez de mostra no pront
        // de comando
        try {
            // craiando o objetivo scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua iddade ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura ");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo  " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + "anos");
            System.out.println("Minha altura é  " + altura + "cm");
            System.out.println("Digite sua altura ");
            scanner.close();
            // captura a exeção que eu quero captura
        } catch (InputMismatchException e) {
            System.out.println("O campos idade e altura precisam ser numéricos");
            // ou
            // System.err.println("O campos idade e altura precisam ser numéricos");

        }

    }
}
