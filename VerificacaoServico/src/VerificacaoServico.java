
/*Uma concessionária de telecomunicações oferece quatro tipos de serviços: telefonia móvel,
 telefonia fixa, banda larga e TV por assinatura. Para facilitar o atendimento ao cliente, 
 é necessário implementar um programa que verifique se um cliente específico contratou um determinado serviço.
  Por exemplo, quando um cliente liga para a central de atendimento
 e menciona um serviço, o atendente deve ser capaz de rapidamente verificar se esse serviço está contratado pelo cliente.

 Entrada
A entrada deve receber duas linhas. A primeira linha contém o nome do serviço a ser verificado 
(por exemplo, "movel", "fixa", "banda larga", "tv"). A segunda linha contém o nome do cliente
 seguido pelos serviços que ele contratou, todos separados por vírgulas (por exemplo, "Alice,movel,fixa").

Saída
Deverá retornar "Sim" se o cliente contratou o serviço e "Nao" caso contrário.
  */
import java.util.Scanner; // Importa a classe Scanner para entrada de dados.

public class VerificacaoServico { // Declara a classe VerificacaoServico.
    public static void main(String[] args) { // Método principal.
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura.

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim(); // Lê o serviço e remove espaços em branco.
        // O usuário digita internet (sem espaços) e este valor é atribuído à variável
        // servico.

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim(); // Lê a entrada do cliente.
        // O usuário digita João, internet, TV a cabo, telefone e é armazenado em
        // entradaCliente.

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(","); // Divide a entrada em partes.
        // entradaCliente.split(",") cria o array partes
        /*
         * partes[0] = "João"
         * partes[1] = " internet" (com um espaço antes)
         * partes[2] = " TV a cabo"
         * partes[3] = " telefone"
         */

        String nomeCliente = partes[0]; // Armazena o nome do cliente.
        // nomeCliente é definido como partes[0], que é "João"

        boolean contratado = false; // Inicializa a variável contratado como falsa.
        // contratado é inicializado como false

        // Verifique se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) { // Inicia o loop a partir da segunda parte.
            if (partes[i].trim().equalsIgnoreCase(servico)) { // Compara serviços ignorando maiúsculas/minúsculas. / o
                                                              // trim() tira espaço em branco.
                contratado = true; // Marca como contratado se encontrar.
                break; // Interrompe o loop.
            } // teste de mesa do loop
            /*
             * i = 1:
             * partes[1] = " internet"
             * equalsIgnoreCase(servico):
             * " internet".equalsIgnoreCase("internet") → false
             * i = 2:
             * partes[2] = " TV a cabo"
             * equalsIgnoreCase(servico):
             * " TV a cabo".equalsIgnoreCase("internet") → false
             * i = 3:
             * partes[3] = " telefone"
             * equalsIgnoreCase(servico):
             * " telefone".equalsIgnoreCase("internet") → false
             * Loop termina: Nenhuma correspondência encontrada, contratado permanece false.
             */
        }

        // Saída
        if (contratado == true) { // Verifica se o serviço foi encontrado.
            System.out.println("Sim"); // Imprime "Sim" se encontrado.
        } else {
            System.out.println("Nao"); // Imprime "Nao" se não encontrado.
        } // if (contratado) é false, então: O programa imprime "Nao".

        scanner.close(); // Fecha o scanner.
    }
}

// Neste exemplo, o serviço "internet" não foi encontrado devido ao espaço em
// branco na string do array.
// Para resolver isso, seria útil aplicar trim() em cada parte dentro do loop
// antes da comparação.