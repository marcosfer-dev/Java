package pratica.colecoes.equals;

import pratica.colecoes.dominio.Livro;

public class EqualsPratica02 {
    public static void main() {
        Livro l1 = new Livro("9788535902777", "Olhai o Lirio do Campo", "Erico Verissimo");
        Livro l2 = new Livro("9788535902777", "Olhai o Lirio do Campo", "Erico Verissimo");
        Livro l3 = new Livro("9786555601954", "A Hora da Estrela", "Clarice Lispector");
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
        System.out.println(l1.equals(l1));
        System.out.println(l1.equals(null));
        System.out.println(l1.equals("Livro"));

    }
}
