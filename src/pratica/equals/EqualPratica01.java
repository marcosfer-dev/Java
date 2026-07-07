package pratica.equals;

import pratica.dominio.Pessoa;

public class EqualPratica01 {
    public static void main() {
        Pessoa p1 = new Pessoa("55555555544", "Fulano", 32);
        Pessoa p2 = new Pessoa("55555555544", "Fulano", 32);
        Pessoa p3 = new Pessoa("44444444455", "Fulana", 45);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(null));
        System.out.println(p1.equals("Olá"));
    }
}
