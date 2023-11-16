import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Maicon", "Branco", 35, 5.5, 5,"carinho");
        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Lilly", "Preto", 25, 6.7, 4,"petisco");
        System.out.println(cachorro2.getNumeroDeCachorros());

        Cachorro cachorro3= new Cachorro("Akamaru", "Cinza", 30, 5.2, 8,"beliscar");
        System.out.println(cachorro1.getNumeroDeCachorros());


        System.out.println("O " + cachorro1.getNome()+ " está " + cachorro1.interagir(cachorro1.getEstadoEspirito()));
        System.out.println("O/A " + cachorro2.getNome()+ " está " + cachorro2.interagir(cachorro2.getEstadoEspirito()));
        System.out.println("O " + cachorro3.getNome()+ " está " + cachorro3.interagir(cachorro3.getEstadoEspirito()));


    }
}