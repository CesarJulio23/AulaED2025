import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

    // declaração do scanner para entrada de dados
    public static Scanner scanner = new Scanner(System.in);

    public static void lancarNotas(List<String> nomes, int index, String avaliacao) {
        System.out.println("Digite a nota da [" + avaliacao + "] do aluno " + nomes.get(index));
        double nota = scanner.nextDouble();
//        notas.add(nota);
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
            lancarNotas(nomes, i, "Prova 1");
//            lancarNotas(nomes, "Prova 2");
//            lancarNotas(nomes, "Trabalho");
        }

    }

}
