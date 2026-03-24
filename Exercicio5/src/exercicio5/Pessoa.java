
package exercicio5;


public class Pessoa {
    

    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método comum
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }

    public void trabalhar() {
        System.out.println("A pessoa está trabalhando");
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

    // 🎓 Aluno
    public static class Aluno extends Pessoa {
        private double nota1;
        private double nota2;

        public Aluno(String nome, int idade, double nota1, double nota2) {
            super(nome, idade);
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        public double calcularMedia() {
            return (nota1 + nota2) / 2;
        }

        @Override
        public void apresentar() {
            System.out.println("Sou aluno: " + getNome());
        }

        // Getters e Setters
        public double getNota1() {
            return nota1;
        }

        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public double getNota2() {
            return nota2;
        }

        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }
    }

    // 👨‍🏫 Professor
    public static class Professor extends Pessoa {
        private String disciplina;

        public Professor(String nome, int idade, String disciplina) {
            super(nome, idade);
            this.disciplina = disciplina;
        }

        @Override
        public void trabalhar() {
            System.out.println("O professor está ensinando " + disciplina);
        }

        @Override
        public void apresentar() {
            System.out.println("Sou professor: " + getNome());
        }

        // Getter e Setter
        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }
    }

    // 🧑‍💼 Coordenador
    public static class Coordenador extends Pessoa {
        private String setor;

        public Coordenador(String nome, int idade, String setor) {
            super(nome, idade);
            this.setor = setor;
        }

        @Override
        public void trabalhar() {
            System.out.println("O coordenador está organizando o setor " + setor);
        }

        @Override
        public void apresentar() {
            System.out.println("Sou coordenador: " + getNome());
        }

        // Getter e Setter
        public String getSetor() {
            return setor;
        }

        public void setSetor(String setor) {
            this.setor = setor;
        }
    }

    // 📚 Turma
    public static class Turma {
        private String nomeTurma;
        private int quantidadeAlunos;

        public Turma(String nomeTurma, int quantidadeAlunos) {
            this.nomeTurma = nomeTurma;
            this.quantidadeAlunos = quantidadeAlunos;
        }

        public void apresentarTurma() {
            System.out.println("Turma: " + nomeTurma + 
                               " | Alunos: " + quantidadeAlunos);
        }

        // Getters e Setters
        public String getNomeTurma() {
            return nomeTurma;
        }

        public void setNomeTurma(String nomeTurma) {
            this.nomeTurma = nomeTurma;
        }

        public int getQuantidadeAlunos() {
            return quantidadeAlunos;
        }

        public void setQuantidadeAlunos(int quantidadeAlunos) {
            this.quantidadeAlunos = quantidadeAlunos;
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    

