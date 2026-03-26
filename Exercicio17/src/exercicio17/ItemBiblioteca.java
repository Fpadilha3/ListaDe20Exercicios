
package exercicio17;


public class ItemBiblioteca {
    
    
  

    private String titulo;
    private String codigo;
    private boolean disponivel;

    // Construtor
    public ItemBiblioteca(String titulo, String codigo, boolean disponivel) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponivel = disponivel;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Métodos gerais
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Item emprestado: " + titulo);
        } else {
            System.out.println("Item não disponível: " + titulo);
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Item devolvido: " + titulo);
    }

    // 🔹 Subclasse Livro
    static class Livro extends ItemBiblioteca {

        public Livro(String titulo, String codigo, boolean disponivel) {
            super(titulo, codigo, disponivel);
        }

        @Override
        public void emprestar() {
            if (isDisponivel()) {
                setDisponivel(false);
                System.out.println("Livro '" + getTitulo() + "' emprestado por 7 dias");
            } else {
                System.out.println("Livro '" + getTitulo() + "' não está disponível");
            }
        }

        @Override
        public void devolver() {
            setDisponivel(true);
            System.out.println("Livro '" + getTitulo() + "' devolvido. Obrigado!");
        }
    }

    // 🔹 Subclasse Revista
    static class Revista extends ItemBiblioteca {

        public Revista(String titulo, String codigo, boolean disponivel) {
            super(titulo, codigo, disponivel);
        }

        @Override
        public void emprestar() {
            if (isDisponivel()) {
                setDisponivel(false);
                System.out.println("Revista '" + getTitulo() + "' emprestada por 3 dias");
            } else {
                System.out.println("Revista '" + getTitulo() + "' não está disponível");
            }
        }

        @Override
        public void devolver() {
            setDisponivel(true);
            System.out.println("Revista '" + getTitulo() + "' devolvida");
        }
    }

    // 🔹 Subclasse Jornal
    static class Jornal extends ItemBiblioteca {

        public Jornal(String titulo, String codigo, boolean disponivel) {
            super(titulo, codigo, disponivel);
        }

        @Override
        public void emprestar() {
            System.out.println("Jornal '" + getTitulo() + "' não pode ser emprestado");
        }

        @Override
        public void devolver() {
            System.out.println("Jornal '" + getTitulo() + "' permanece na biblioteca");
        }
    }

    // 🔹 Subclasse DVD
    static class DVD extends ItemBiblioteca {

        public DVD(String titulo, String codigo, boolean disponivel) {
            super(titulo, codigo, disponivel);
        }

        @Override
        public void emprestar() {
            if (isDisponivel()) {
                setDisponivel(false);
                System.out.println("DVD '" + getTitulo() + "' emprestado por 5 dias");
            } else {
                System.out.println("DVD '" + getTitulo() + "' não está disponível");
            }
        }

        @Override
        public void devolver() {
            setDisponivel(true);
            System.out.println("DVD '" + getTitulo() + "' devolvido com sucesso");
        }
    }
}
    
    
    
    
    
    
    
    
    
   