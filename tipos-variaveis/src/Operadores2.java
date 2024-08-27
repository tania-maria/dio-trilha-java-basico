public class Operadores2 {
    public static void main(String[] args) {
        int numero = 5; // `e a mesma coisa que falar +5

        numero = -numero;

        System.out.println(-numero); // -5
        System.out.println(numero); // -5

        numero = +numero; // -5
        System.out.println(numero); // - 5

        // para tornar positivo precisa de uma conversao

        numero = numero * -1;
        System.out.println(numero);

        // incremetando ou repeticao
        // numero ++ ou numero = numero+1
        System.out.println(numero++);
        System.out.println(++numero);
        System.out.println(numero);

        // decrementar
        System.out.println(numero--);
        System.out.println(numero--);
        System.out.println(numero);

        boolean variavel = true; // verdade
        variavel = !variavel; // falso

        System.out.println(variavel);

    }

}
