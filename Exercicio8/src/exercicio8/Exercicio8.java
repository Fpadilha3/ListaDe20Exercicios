
package exercicio8;

import java.util.ArrayList;


public class Exercicio8 {

   
    public static void main(String[] args) {
        

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new Pagamento.CartaoCredito(500, "24/03/2026", "Compra online", "1234-5678-9876-5432"));
        pagamentos.add(new Pagamento.Pix(200, "24/03/2026", "Transferência", "joao@pix.com"));
        pagamentos.add(new Pagamento.Boleto(300, "24/03/2026", "Mensalidade", "00123456789"));
        pagamentos.add(new Pagamento.Dinheiro(150, "24/03/2026", "Pagamento à vista"));

        // Testando polimorfismo
        for (Pagamento p : pagamentos) {
            p.processarPagamento();
        }
    }
} 
        
        
        
        
        
        
        
        
        
        
        
        
      
    
