public class OperadorTernario {
    public static void main(String[] args) {
        int a, b, c, d;

        a = 5;
        b = 6;
        c = 4;
        d = 4;
        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE no segundo exemplo
         * ele mostra a mesma consulta
         * de forma diferente.
         * 
         * String resultado = "";
         * if (a == b)
         * resultado = "verdadeiro";
         * else
         * resultado = "false";
         * 
         * System.out.println(resultado);
         */
        String resultado = a == b ? "VERDADEIRO" : "FALSO";
        System.out.println(resultado);

        int resultado1 = c == d ? 1 : 0;
        System.out.println(resultado1);

    }
}
