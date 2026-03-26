
package exercicio16;


public class Exercicio16 {

    
    public static void main(String[] args) {
        
        
        
        


        Pessoa.Paciente paciente = new Pessoa.Paciente("Ana", 30, "Gripe");
        Pessoa medico = new Pessoa.Medico("Dr. Carlos", 50, "Clínico Geral");
        Pessoa enfermeiro = new Pessoa.Enfermeiro("João", 35, "Emergência");

        paciente.exibirDados();

        medico.realizarAtendimento();
        enfermeiro.realizarAtendimento();

        Pessoa.Consulta consulta = new Pessoa.Consulta(paciente, medico, "30/03/2026");
        consulta.agendarConsulta();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
    