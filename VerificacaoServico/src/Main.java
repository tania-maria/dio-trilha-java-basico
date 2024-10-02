
/*Descrição
Implemente um sistema que verifique se um cliente de uma empresa de telecomunicações contratou um combo completo de serviços.
Um combo completo inclui os três serviços principais oferecidos pela empresa: telefonia móvel, banda larga e TV por 
assinatura. O sistema deve ler uma lista de serviços contratados pelo cliente e determinar se todos os serviços necessários
estão incluídos. Caso todos os três serviços estejam presentes, o sistema deve retornar "Combo Completo". Se faltar 
qualquer um dos serviços, o sistema deve retornar "Combo Incompleto".

Entrada
A entrada consiste em uma string contendo uma lista de serviços contratados pelo cliente, separados por vírgula.
Os serviços possíveis são "movel" para telefonia móvel, "banda larga" para serviços de internet e "tv" para TV 
por assinatura.

Saída
A saída do programa deve ser uma única linha contendo:

"Combo Completo" se o cliente contratou todos os três serviços.
"Combo Incompleto" caso contrário.
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
movel,banda larga,tv	Combo Completo
movel,tv	Combo Incompleto
banda larga,tv,movel	Combo Completo
*/
import java.util.Scanner; // Importa a classe Scanner para leitura de entradas do usuário.

public class Main { // Declara a classe principal do programa.

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false; // Indica se telefonia móvel foi contratada.
        boolean bandaLargaContratada = false; // Indica se banda larga foi contratada.
        boolean tvContratada = false; // Indica se TV por assinatura foi contratada.

        // Iterando sobre os serviços contratados
        for (String servico : servicosContratados) { // Para cada serviço na lista de serviços contratados
            // Removendo espaços em branco e verificando cada serviço
            switch (servico.trim()) { // Usa trim() para remover espaços em branco
                case "movel": // Se o serviço for "movel"
                    movelContratado = true; // Marca como contratado
                    break; // Sai do switch
                case "banda larga": // Se o serviço for "banda larga"
                    bandaLargaContratada = true; // Marca como contratado
                    break; // Sai do switch
                case "tv": // Se o serviço for "tv"
                    tvContratada = true; // Marca como contratado
                    break; // Sai do switch
                default: // Caso o serviço não seja reconhecido
                    // Você pode optar por tratar serviços desconhecidos, se necessário
                    break; // Sai do switch
            }
        }

        // Verificando se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) { // Se todos os serviços foram contratados
            return "Combo Completo"; // Retorna que o combo está completo
        } else {
            return "Combo Incompleto"; // Retorna que o combo está incompleto
        }
    }

    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine(); // Lê a linha de entrada do usuário

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(","); // Divide a entrada em partes usando vírgulas como
                                                         // delimitadores

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados); // Chama a função para verificar o combo

        // Exibindo o resultado
        System.out.println(resultado); // Imprime o resultado no console

        // Fechando o scanner
        scanner.close(); // Fecha o objeto Scanner para liberar recursos
    }
}
/*
 * 
 * Explicação Detalhada
 * import java.util.Scanner;: Importa a classe Scanner do pacote java.util, que
 * permite ler entradas do usuário pelo console.
 * 
 * public class Main {: Declara a classe pública chamada Main. O nome da classe
 * deve corresponder ao nome do arquivo.
 * 
 * public static String verificarComboCompleto(String[] servicosContratados) {:
 * Declara um método estático que aceita um array de strings (os serviços
 * contratados) e retorna uma string indicando se o combo está completo ou não.
 * 
 * boolean movelContratado = false;: Inicializa uma variável booleana para
 * verificar se o serviço de telefonia móvel foi contratado.
 * 
 * boolean bandaLargaContratada = false;: Inicializa uma variável booleana para
 * verificar se o serviço de banda larga foi contratado.
 * 
 * boolean tvContratada = false;: Inicializa uma variável booleana para
 * verificar se o serviço de TV por assinatura foi contratado.
 * 
 * for (String servico : servicosContratados) {: Inicia um loop que itera sobre
 * cada serviço no array servicosContratados.
 * 
 * switch (servico.trim()) {: Usa um switch para comparar o serviço atual,
 * aplicando trim() para remover espaços em branco.
 * 
 * case "movel":: Verifica se o serviço é "movel".
 * 
 * movelContratado = true;: Se for "movel", marca que o serviço foi contratado.
 * 
 * break;: Interrompe o switch para não executar as próximas comparações.
 * 
 * case "banda larga":: Verifica se o serviço é "banda larga".
 * 
 * bandaLargaContratada = true;: Marca que o serviço de banda larga foi
 * contratado.
 * 
 * break;: Interrompe o switch.
 * 
 * case "tv":: Verifica se o serviço é "tv".
 * 
 * tvContratada = true;: Marca que o serviço de TV foi contratado.
 * 
 * break;: Interrompe o switch.
 * 
 * default:: Caso o serviço não corresponda a nenhum dos serviços conhecidos,
 * você pode adicionar lógica para tratá-lo, mas aqui está vazio.
 * 
 * if (movelContratado && bandaLargaContratada && tvContratada) {: Verifica se
 * todos os serviços foram contratados.
 * 
 * return "Combo Completo";: Se todos os serviços foram contratados, retorna
 * "Combo Completo".
 * 
 * return "Combo Incompleto";: Se algum serviço estiver faltando, retorna
 * "Combo Incompleto".
 * 
 * public static void main(String[] args) {: Declara o método principal, que é o
 * ponto de entrada do programa.
 * 
 * Scanner scanner = new Scanner(System.in);: Cria um novo objeto Scanner para
 * ler a entrada do usuário.
 * 
 * String input = scanner.nextLine();: Lê a entrada do usuário como uma linha de
 * texto.
 * 
 * String[] servicosContratados = input.split(",");: Divide a entrada em um
 * array de strings usando vírgulas como delimitadores.
 * 
 * String resultado = verificarComboCompleto(servicosContratados);: Chama o
 * método verificarComboCompleto e armazena o resultado na variável resultado.
 * 
 * System.out.println(resultado);: Imprime o resultado no console.
 * 
 * scanner.close();: Fecha o objeto Scanner para liberar recursos do sistema.
 * 
 * Resumo
 * Esse código permite que o usuário insira uma lista de serviços contratados e
 * verifica se ele possui um "combo completo" (telefonia móvel, banda larga e
 * TV). Ele é eficiente, limpo e utiliza boas práticas como a remoção de espaços
 * em branco e a divisão de strings.
 */

/*
 * Passo a Passo do Teste de Mesa
 * Linha Código Variáveis Descrição
 * 1 Scanner scanner = new Scanner(System.in); Cria um objeto Scanner para
 * leitura de entrada.
 * 2 String input = scanner.nextLine(); input = "movel,banda larga,tv" Lê a
 * linha de entrada do usuário.
 * 3 String[] servicosContratados = input.split(","); servicosContratados =
 * ["movel", "banda larga", "tv"] Divide a string de entrada em um array.
 * 4 String resultado = verificarComboCompleto(servicosContratados); Chama o
 * método verificarComboCompleto com o array de serviços.
 * 5 boolean movelContratado = false; movelContratado = false Inicializa
 * movelContratado.
 * 6 boolean bandaLargaContratada = false; bandaLargaContratada = false
 * Inicializa bandaLargaContratada.
 * 7 boolean tvContratada = false; tvContratada = false Inicializa tvContratada.
 * 8 for (String servico : servicosContratados) { Inicia o loop para iterar
 * sobre os serviços.
 * 9 servico = "movel" Primeiro serviço do array.
 * 10 switch (servico.trim()) { Inicia o switch com servico = "movel".
 * 11 case "movel": Entra no case para "movel".
 * 12 movelContratado = true; movelContratado = true Marca movelContratado como
 * verdadeiro.
 * 13 break; Sai do switch.
 * 14 servico = "banda larga" Segundo serviço do array.
 * 15 switch (servico.trim()) { Inicia o switch com servico = "banda larga".
 * 16 case "banda larga": Entra no case para "banda larga".
 * 17 bandaLargaContratada = true; bandaLargaContratada = true Marca
 * bandaLargaContratada como verdadeiro.
 * 18 break; Sai do switch.
 * 19 servico = "tv" Terceiro serviço do array.
 * 20 switch (servico.trim()) { Inicia o switch com servico = "tv".
 * 21 case "tv": Entra no case para "tv".
 * 22 tvContratada = true; tvContratada = true Marca tvContratada como
 * verdadeiro.
 * 23 break; Sai do switch.
 * 24 if (movelContratado && bandaLargaContratada && tvContratada) { Verifica se
 * todos os serviços foram contratados.
 * 25 return "Combo Completo"; Todos os serviços foram contratados, então
 * retorna "Combo Completo".
 * 26 System.out.println(resultado); resultado = "Combo Completo" Imprime
 * "Combo Completo".
 * 27 scanner.close(); Fecha o scanner.
 */