import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) { // enquanto
            Double valorDoce = valorAleatorio();
            // para deirar o valor positivo, caso vc deseja que ele aceite negativo é só
            // tirar este if
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "Adicionar no carrinho ");
            mesada = mesada - valorDoce;

        }

        System.out.println("Mesada: " + mesada);
        System.out.println(" João gastou toda a sua mesada em doces");

        /*
         * Não se preocupe quanto a formatação de valores
         * Iremos explocar os recursos de formatação em breve !!
         */

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8); // retorna o valor entre 2 e 8,foi criada so para mostrar (
                                                             // este é o valor do doce)
                                                             // um valor aleatorio.

    }

}
