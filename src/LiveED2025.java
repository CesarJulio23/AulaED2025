import java.util.*;

public class LiveED2025 {

    public static void main(String[] args) {

//        int numero = 1; // tipo primitivo
//        Integer numeroInteiro = 1;

//        int[] numeros = {23, 45, 234, 12};
//        numeros[4] = 24;
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

//        List<Integer> numeros = new ArrayList<>();
//        numeros.add(23);
//        numeros.add(45);
//        numeros.add(24);
//        numeros.add(12);
//        numeros.add(13);
//
//        numeros.remove(2);
//        for (int i = 0; i < numeros.size(); i++) {
//            System.out.println(numeros.get(i));
//        }

//        Set<String> listagem = new HashSet<>();
//        listagem.add("Maçã");
//        listagem.add("Banana");
//        listagem.add("Laranja");
//
//        listagem.forEach(System.out::println);

//        List<String> bolos = new ArrayList<>();
//        bolos.add("Laranja");
//        bolos.add("Cenoura");
//        bolos.add("Chocolate");
//
//        List<String> sorvetes = new ArrayList<>();
//        sorvetes.add("Napolitano");
//        sorvetes.add("Açaí");
//        sorvetes.add("Chocolate");
//
//        Set<String> sabores = new HashSet<>();
//        sabores.addAll(bolos);
//        sabores.addAll(sorvetes);
//
//        sabores.forEach(System.out::println);

//        Map<String, String> estados = new HashMap<>();
//        estados.put("PR", "Paraná");
//        estados.put("SC", "Santa Catarina");
//        estados.put("SP", "São Paulo");
//        estados.put("MS", "Mato Grosso do Sul");
//
//        estados.keySet().forEach(chave ->
//                System.out.println(estados.get(chave)));

//        Queue<String> fila = new LinkedList<>();
//        fila.offer("primeiro");
//        fila.offer("segundo");
//        fila.offer("terceiro");
//        fila.offer("quarto");
//        System.out.println("Tamanho da fila: " + fila.size());
//        int tamanho = fila.size();
//
//        for (int i = 0; i < tamanho; i++) {
//            System.out.println(fila.poll());
//        }
//
//        System.out.println("Tamanho da fila: " + fila.size());

        // isso aqui não vai funcionar
//        for (int i = 0; i < fila.size(); i++) {
//            System.out.println(fila.poll()); // olha o primeiro da fila
//        }

        Stack<String> pilha = new Stack<>();
        pilha.push("primeiro");
        pilha.push("segundo");
        pilha.push("terceiro");
        pilha.push("quarto");
        System.out.println("Tamanho da pilha: " + pilha.size());
        int tamanho = pilha.size();

        for (int i = 0; i < tamanho; i++) {
            System.out.println(pilha.pop());
        }

        System.out.println("Tamanho da fila: " + pilha.size());

    }

}
