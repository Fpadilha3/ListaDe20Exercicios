
package exercicio9;


public class Personagem {
    
   
    private String nome;
    private int vida;
    private int nivel;

    // Construtor
    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }

    // Métodos que serão sobrescritos
    public void atacar() {
        System.out.println(nome + " ataca de forma básica.");
    }

    public void defender() {
        System.out.println(nome + " se defende de forma básica.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // ⚔️ Guerreiro
    public static class Guerreiro extends Personagem {
        public Guerreiro(String nome, int vida, int nivel) {
            super(nome, vida, nivel);
        }

        @Override
        public void atacar() {
            System.out.println(getNome() + " ataca com espada!");
        }

        @Override
        public void defender() {
            System.out.println(getNome() + " usa escudo para se defender!");
        }
    }

    // 🔮 Mago
    public static class Mago extends Personagem {
        public Mago(String nome, int vida, int nivel) {
            super(nome, vida, nivel);
        }

        @Override
        public void atacar() {
            System.out.println(getNome() + " lança uma magia poderosa!");
        }

        @Override
        public void defender() {
            System.out.println(getNome() + " usa barreira mágica!");
        }
    }

    // 🏹 Arqueiro
    public static class Arqueiro extends Personagem {
        public Arqueiro(String nome, int vida, int nivel) {
            super(nome, vida, nivel);
        }

        @Override
        public void atacar() {
            System.out.println(getNome() + " dispara flechas precisas!");
        }

        @Override
        public void defender() {
            System.out.println(getNome() + " se esquiva agilmente!");
        }
    }

    // 🛡️ Paladino
    public static class Paladino extends Personagem {
        public Paladino(String nome, int vida, int nivel) {
            super(nome, vida, nivel);
        }

        @Override
        public void atacar() {
            System.out.println(getNome() + " ataca com martelo sagrado!");
        }

        @Override
        public void defender() {
            System.out.println(getNome() + " invoca proteção divina!");
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    