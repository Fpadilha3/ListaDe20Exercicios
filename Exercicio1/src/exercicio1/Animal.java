
package exercicio1;


public class Animal {
   
    private String nome;
    private int idade;
    private String cor;

    // Construtor
    public Animal(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    // Método que será sobrescrito
    public void emitirSom() {
        System.out.println("O animal faz um som");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // 🐶 Subclasse Cachorro
    public static class Cachorro extends Animal {
        public Cachorro(String nome, int idade, String cor) {
            super(nome, idade, cor);
        }

        @Override
        public void emitirSom() {
            System.out.println("O cachorro late: Au Au!");
        }
    }

    // 🐱 Subclasse Gato
    public static class Gato extends Animal {
        public Gato(String nome, int idade, String cor) {
            super(nome, idade, cor);
        }

        @Override
        public void emitirSom() {
            System.out.println("O gato mia: Miau!");
        }
    }

    // 🐄 Subclasse Vaca
    public static class Vaca extends Animal {
        public Vaca(String nome, int idade, String cor) {
            super(nome, idade, cor);
        }

        @Override
        public void emitirSom() {
            System.out.println("A vaca faz: Muu!");
        }
    }

    // 🐎 Subclasse Cavalo
    public static class Cavalo extends Animal {
        public Cavalo(String nome, int idade, String cor) {
            super(nome, idade, cor);
        }

        @Override
        public void emitirSom() {
            System.out.println("O cavalo relincha: Iirrrrí!");
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
