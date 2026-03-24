
package exercicio6;


public class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método que será sobrescrito
    public double calcularPrecoFinal() {
        return preco * quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // 📚 Livro
    public static class Livro extends Produto {
        public Livro(String nome, double preco, int quantidade) {
            super(nome, preco, quantidade);
        }

        @Override
        public double calcularPrecoFinal() {
            double total = getPreco() * getQuantidade();
            double desconto = total * 0.10; // 10% desconto
            return total - desconto;
        }
    }

    // 💻 Eletrônico
    public static class Eletronico extends Produto {
        public Eletronico(String nome, double preco, int quantidade) {
            super(nome, preco, quantidade);
        }

        @Override
        public double calcularPrecoFinal() {
            double total = getPreco() * getQuantidade();
            double taxa = total * 0.15; // 15% imposto
            return total + taxa;
        }
    }

    // 👕 Roupa
    public static class Roupa extends Produto {
        public Roupa(String nome, double preco, int quantidade) {
            super(nome, preco, quantidade);
        }

        @Override
        public double calcularPrecoFinal() {
            double total = getPreco() * getQuantidade();

            if (getQuantidade() > 3) {
                return total * 0.80; // 20% desconto
            }
            return total;
        }
    }

    // 🍎 Alimento
    public static class Alimento extends Produto {
        public Alimento(String nome, double preco, int quantidade) {
            super(nome, preco, quantidade);
        }

        @Override
        public double calcularPrecoFinal() {
            double total = getPreco() * getQuantidade();
            return total + 5; // taxa fixa (ex: entrega)
        }
    }
}
    
    
    
    
    
    
    
    
    
    
