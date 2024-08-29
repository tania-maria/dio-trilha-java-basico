import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o usários
        System.out.println("Por favor, digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();

        System.out.println(" Por favor, digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println(" Por favor, digite saldo");
        double saldo = scanner.nextDouble();

        // Obter pela scanner os valores digitados no ternimal
        System.out.println(
                "Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está diponível para saque. ");

        // Exibir a mendagem conta criada
    }
}
/*
 * Numero - inteiro - 1021 -ok
 * agencia - texto - 067-8 - ok
 * Nome Cliente - Texto - Mario Andrade ok
 * Saldo - decimal - 237.48
 * 
 * Por favor, digite o numero da agencia
 * Olá[ nome do cliente], obrigado por criar uma conta em nosso banco, sua
 * agência é [ agencia], conta [numero] e seu saldo[saldo] já está diponível
 * para saque
 */