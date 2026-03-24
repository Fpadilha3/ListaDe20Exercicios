
package exercicio4;


public class Exercicio4 {

    public static void main(String[] args) {
        
        
        

    
        
        
        
  

        ContaBancaria.Cliente cliente = 
            new ContaBancaria.Cliente("João", "123.456.789-00");

        ContaBancaria c1 = new ContaBancaria.ContaCorrente(1, 1000, cliente.getNome());
        ContaBancaria c2 = new ContaBancaria.ContaPoupanca(2, 1000, cliente.getNome());
        ContaBancaria c3 = new ContaBancaria.ContaSalario(3, 1000, cliente.getNome());

        // Polimorfismo
        c1.sacar(100);
        System.out.println("Saldo: " + c1.consultarSaldo());

        c2.depositar(200);
        System.out.println("Saldo com rendimento: " + c2.consultarSaldo());

        c3.sacar(1500);
        c3.sacar(500);
        System.out.println("Saldo: " + c3.consultarSaldo());
    }
}
        
        
        