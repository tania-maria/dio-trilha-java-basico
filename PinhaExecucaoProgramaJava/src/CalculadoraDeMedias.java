//package br.com.dio.debbuging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media); // %.1f é para ler double
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno); // o %s ele pega o nome dentro do arrey
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }

}