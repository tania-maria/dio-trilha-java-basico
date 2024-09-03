import java.util.Random; // metodo auxiliar

public class ExmploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando ...");
        do {
            // executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando());
        // qdo se tornar falsa ele vem para esta etapa de alô
        System.out.println("Alô !!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1; // valor entre um e 3 se for um atendeu
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu; // continuar tocando sim ou não

    }
}
