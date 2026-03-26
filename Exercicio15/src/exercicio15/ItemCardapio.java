
package exercicio15;

public class ItemCardapio {
    
    

    private String nome;
    private double preco;
    private String descricao;

    // Construtor
    public ItemCardapio(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos gerais
    public void preparar() {
        System.out.println("Preparando item do cardápio");
    }

    public double calcularPreco() {
        return preco;
    }

    // 🔹 Subclasse Pizza
    static class Pizza extends ItemCardapio {

        public Pizza(String nome, double preco, String descricao) {
            super(nome, preco, descricao);
        }

        @Override
        public void preparar() {
            System.out.println("Assando a pizza: " + getNome());
        }

        @Override
        public double calcularPreco() {
            return getPreco() + 5.0; // taxa de preparo
        }
    }

    // 🔹 Subclasse Hamburguer
    static class Hamburguer extends ItemCardapio {

        public Hamburguer(String nome, double preco, String descricao) {
            super(nome, preco, descricao);
        }

        @Override
        public void preparar() {
            System.out.println("Grelhando o hambúrguer: " + getNome());
        }

        @Override
        public double calcularPreco() {
            return getPreco() + 3.0;
        }
    }

    // 🔹 Subclasse Bebida
    static class Bebida extends ItemCardapio {

        public Bebida(String nome, double preco, String descricao) {
            super(nome, preco, descricao);
        }

        @Override
        public void preparar() {
            System.out.println("Servindo a bebida: " + getNome());
        }

        @Override
        public double calcularPreco() {
            return getPreco(); // sem adicional
        }
    }

    // 🔹 Subclasse Sobremesa
    static class Sobremesa extends ItemCardapio {

        public Sobremesa(String nome, double preco, String descricao) {
            super(nome, preco, descricao);
        }

        @Override
        public void preparar() {
            System.out.println("Preparando a sobremesa: " + getNome());
        }

        @Override
        public double calcularPreco() {
            return getPreco() + 2.0;
        }
    }
}
    
    
    
    
    
    