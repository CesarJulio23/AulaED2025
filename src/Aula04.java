import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Aula04 {

    public static void main(String[] args) {

//        List<String> frutas = new ArrayList<>();
//        frutas.add("Laranja");
//        frutas.add("Maçã");
//        frutas.add("Banana");
//        frutas.add("Banana");
//        frutas.add("Maçã");
//
//        for (int i = 0; i < frutas.size(); i++) {
//            System.out.println(frutas.get(i));
//        }

//        Set<String> frutas = new HashSet<>();
//        frutas.add("Laranja");
//        frutas.add("Maçã");
//        frutas.add("Banana");
//        frutas.add("Banana");
//        frutas.add("Maçã");
//
//        for (String fruta : frutas) {
//            System.out.println(fruta);
//        }

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ivan";
        aluno1.numeroRa = "98806000";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ivan";
        aluno2.numeroRa = "98806000";

        Set<Aluno> turma = new HashSet<>();
        turma.add(aluno1);
        turma.add(aluno2);

        for (Aluno aluno : turma) {
            System.out.println(aluno);
        }


    }

}
