
package exercicio3;


public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;

    // Construtor
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Método trabalhar
    public void trabalhar() {
        System.out.println("O funcionário está trabalhando");
    }

    // Método calcular bônus
    public double calcularBonus() {
        return salario * 0.10; // padrão
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // 👔 Gerente
    public static class Gerente extends Funcionario {
        public Gerente(String nome, double salario) {
            super(nome, salario, "Gerente");
        }

        @Override
        public void trabalhar() {
            System.out.println("O gerente está gerenciando a equipe ");
        }

        @Override
        public double calcularBonus() {
            return getSalario() * 0.20;
        }
    }

    // 💰 Vendedor
    public static class Vendedor extends Funcionario {
        public Vendedor(String nome, double salario) {
            super(nome, salario, "Vendedor");
        }

        @Override
        public void trabalhar() {
            System.out.println("O vendedor está vendendo produtos ");
        }

        @Override
        public double calcularBonus() {
            return getSalario() * 0.15;
        }
    }

    // 💻 Programador
    public static class Programador extends Funcionario {
        public Programador(String nome, double salario) {
            super(nome, salario, "Programador");
        }

        @Override
        public void trabalhar() {
            System.out.println("O programador está escrevendo código ");
        }

        @Override
        public double calcularBonus() {
            return getSalario() * 0.18;
        }
    }

    // 🎨 Designer
    public static class Designer extends Funcionario {
        public Designer(String nome, double salario) {
            super(nome, salario, "Designer");
        }

        @Override
        public void trabalhar() {
            System.out.println("O designer está criando interfaces ");
        }

        @Override
        public double calcularBonus() {
            return getSalario() * 0.12;
        }
    }
}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
