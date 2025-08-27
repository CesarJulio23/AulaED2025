import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

    // declaração do scanner para entrada de dados
    public static Scanner scanner = new Scanner(System.in);

    private static List<Double> notasP1 = new ArrayList<>();
    private static List<Double> notasP2 = new ArrayList<>();
    private static List<Double> notasTrabalho = new ArrayList<>();

    public static Double lancarNotas(List<String> nomes, int index, String avaliacao) {
        System.out.println("Digite a nota da [" + avaliacao + "] do aluno " + nomes.get(index));
        double nota = scanner.nextDouble();
        return nota;
    }

    public static void main(String[] args) {
        System.out.println("Quantos alunos você deseja cadastrar?");
        int tamanhoDaLista = scanner.nextInt();
        scanner.nextLine(); // bug do java

        List<String> nomes = new ArrayList<>();
        List<Double> notas = new ArrayList<>();
        List<Double> medias = new ArrayList<>();

        for (int i = 0; i < tamanhoDaLista; i++) {
            System.out.println("Digite um nome:");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }
        System.out.println("Os nomes são: " + nomes);

        // lançar as notas da prova 1
        for (int i = 0; i < tamanhoDaLista; i++) {
//            Double nota = lancarNotas(nomes, i, "Prova 1");
//            notasP1.add(nota); // meio não otimizado
            notasP1.add(lancarNotas(nomes, i, "Prova 1"));
            notasP2.add(lancarNotas(nomes, i, "Prova 2"));
            notasTrabalho.add(lancarNotas(nomes, i, "Trabalho"));
        }

        System.out.println("Notas da Prova 1:" + notasP1);
        System.out.println("Notas da Prova 2:" + notasP2);
        System.out.println("Notas do Trabalho:" + notasTrabalho);

    }

}
