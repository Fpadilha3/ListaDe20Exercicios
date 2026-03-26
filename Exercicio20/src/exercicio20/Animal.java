
package exercicio20;

public class Animal {
    
    
    
    
 
    private String nome;
    private int idade;
    private double peso;

    // Construtor
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    // Métodos a serem sobrescritos
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }

    public void alimentar() {
        System.out.println(nome + " está se alimentando.");
    }

    public void movimentar() {
        System.out.println(nome + " está se movendo.");
    }
}

// Subclasses dentro do mesmo arquivo

class Leao extends Animal {
    public Leao(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo: Rooooar!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " come carne.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " corre majestoso pela savana.");
    }
}

class Macaco extends Animal {
    public Macaco(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está gritando: Ooh ooh aah aah!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " come bananas.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " pula de galho em galho.");
    }
}

class Elefante extends Animal {
    public Elefante(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está trombeteando: Prrrrr!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " come folhas e frutas.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " caminha pesadamente.");
    }
}

class Papagaio extends Animal {
    public Papagaio(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está falando: Olá!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " come sementes e frutas.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " voa de árvore em árvore.");
    }
}
    

