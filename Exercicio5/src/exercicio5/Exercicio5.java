
package exercicio5;


public class Exercicio5 {

  
    public static void main(String[] args) {
        
   

        Pessoa p1 = new Pessoa.Aluno("João", 16, 8.0, 7.0);
        Pessoa p2 = new Pessoa.Professor("Maria", 40, "Matemática");
        Pessoa p3 = new Pessoa.Coordenador("Carlos", 45, "Ensino Médio");

        Pessoa.Turma turma = new Pessoa.Turma("1º Ano", 30);

        // Polimorfismo
        p1.apresentar();
        p2.apresentar();
        p3.apresentar();

        p2.trabalhar();
        p3.trabalhar();

        // Método específico do aluno
        Pessoa.Aluno aluno = (Pessoa.Aluno) p1;
        System.out.println("Média: " + aluno.calcularMedia());

        turma.apresentarTurma();
    }
}   
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    