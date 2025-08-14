public class Animal {

    public String nome;

    private int numeroPatas;

    public String cor;

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        if (numeroPatas < 0) {
            System.out.println("Não pode ser menor que zero");
        } else {
            this.numeroPatas = numeroPatas;
        }
    }

    public String fazerBarulho() {
        return "oinc oinc";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", numeroPatas=" + numeroPatas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
