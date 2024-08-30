public class ResultadoEscolaEncadeado {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) // true
            System.out.println(" Aprovado");

        else if (nota >= 5 && nota < 7) // true e false
            System.out.println(" Prova de Recuperação");

        else // false
            System.out.println(" Reprovado");

    }

}
