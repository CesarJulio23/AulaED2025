import java.util.Objects;

public class Aluno {

    public String numeroRa;

    public String nome;

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numeroRa='" + numeroRa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numeroRa, aluno.numeroRa);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroRa);
    }
}
