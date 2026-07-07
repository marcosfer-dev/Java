package pratica.dominio;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;

    public Livro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Livro livro = (Livro) obj;
        return isbn != null && isbn.equals(livro.isbn);
    }
}
