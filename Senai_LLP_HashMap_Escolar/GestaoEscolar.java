import java.util.Scanner;

public class GestaoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();
        System.out.print("Informe a quantidade de notas por aluno: ");
        int qtdNotas = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        String[] nomes = new String[qtdAlunos];
        double[][] notas = new double[qtdAlunos][qtdNotas];
        double[] medias = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Informe o nome do aluno #" + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            double soma = 0;
            for (int j = 0; j < qtdNotas; j++) {
                System.out.print("Informe a nota " + (j + 1) + " de " + nomes[i] + ": ");
                notas[i][j] = sc.nextDouble();
                soma += notas[i][j];
            }
            medias[i] = soma / qtdNotas;
            sc.nextLine(); // Limpa o buffer
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < qtdAlunos; i++) {
            String resultado = medias[i] >= 6.0 ? "Aprovado" : "Reprovado";
            System.out.printf("%s [%.2f] [%s]%n", nomes[i], medias[i], resultado);
        }

        sc.close();
    }
}