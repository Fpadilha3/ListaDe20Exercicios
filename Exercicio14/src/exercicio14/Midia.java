
package exercicio14;


public class Midia {
    
    


    private String titulo;
    private double duracao;
    private String autor;

    // Construtor
    public Midia(String titulo, double duracao, String autor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.autor = autor;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método geral
    public void reproduzir() {
        System.out.println("Reproduzindo mídia genérica");
    }

    // 🔹 Subclasse Musica
    static class Musica extends Midia {

        public Musica(String titulo, double duracao, String autor) {
            super(titulo, duracao, autor);
        }

        @Override
        public void reproduzir() {
            System.out.println("Tocando música: " + getTitulo() + " - " + getAutor());
        }
    }

    // 🔹 Subclasse Filme
    static class Filme extends Midia {

        public Filme(String titulo, double duracao, String autor) {
            super(titulo, duracao, autor);
        }

        @Override
        public void reproduzir() {
            System.out.println("Exibindo filme: " + getTitulo());
        }
    }

    // 🔹 Subclasse Podcast
    static class Podcast extends Midia {

        public Podcast(String titulo, double duracao, String autor) {
            super(titulo, duracao, autor);
        }

        @Override
        public void reproduzir() {
            System.out.println("Reproduzindo podcast: " + getTitulo());
        }
    }

    // 🔹 Subclasse Audiolivro
    static class Audiolivro extends Midia {

        public Audiolivro(String titulo, double duracao, String autor) {
            super(titulo, duracao, autor);
        }

        @Override
        public void reproduzir() {
            System.out.println("Narrando audiolivro: " + getTitulo());
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
   