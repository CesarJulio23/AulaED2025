public class RevisaoPOO {

    public static void main(String[] args) {
        System.out.println("Revisão de POO");

        // imagine que veio do frontend
        int quantidadePatas = -4;

        Animal porco = new Animal();
        porco.nome = "Porco";
        porco.cor = "Rosa";
        // agora com encapsulamento isso não funciona
//        if (quantidadePatas < 0) {
//            System.out.println("Não pode ser menor que zero");
//        } else {
//            porco.numeroPatas = quantidadePatas;
//        }
        porco.setNumeroPatas(quantidadePatas);
        System.out.println(porco.fazerBarulho());

        Animal cachorro = new Cachorro();
        cachorro.nome = "Bidu";
        cachorro.cor = "Azul";
//        cachorro.numeroPatas = quantidadePatas;
        cachorro.setNumeroPatas(quantidadePatas);
        System.out.println(cachorro.fazerBarulho());

        Animal cachorrinho = new Chihuahua();
        cachorrinho.nome = "Thor";
        cachorrinho.cor = "Branco";
//        cachorrinho.numeroPatas = quantidadePatas;
        cachorrinho.setNumeroPatas(quantidadePatas);
        System.out.println(cachorrinho.fazerBarulho());

    }

}
