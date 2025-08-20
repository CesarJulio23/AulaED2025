import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // declaração do scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();
        int tamanhoDaLista = 5;

        for (int i = 0; i < tamanhoDaLista; i++) {
            System.out.println("Digite um nome:");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.println("Os nomes são: " + nomes);
    }

}
