package aulas.colecoes.equalsandhashcode;

import aulas.colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main() {
        String nome = "Marcos Fernandes";
        String nome2 = "Marcos Fernandes";
        String nome3 = new String("Marcos Fernandes");
        System.out.println(nome == nome2); /* retorna: true */
        System.out.println(nome == nome3); /* retorna: false */
        System.out.println(nome.equals(nome3)); /* retorna: true */
        System.out.println("--------------------------");
        System.out.println(" ");

        System.out.println("Smartphone:");
        System.out.println("----------------------------");
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
//      System.out.println(s1.equals(s2));  assim da false pois cada variável faz referência a objetos diferentes OBS: sem a sobrescrita do equals
        System.out.println(s1.equals(s2));



    }
}
