
package exercicio13;

public class Exercicio13 {

    public static void main(String[] args) {


        Notificacao n1 = new Notificacao.Email("souzafeliepadilha@gmail.com", "Olá!", "26/03/2026");
        Notificacao n2 = new Notificacao.SMS("99999-9999", "Promoção!", "26/03/2026");
        Notificacao n3 = new Notificacao.WhatsApp("88888-8888", "Oi tudo bem?", "26/03/2026");
        Notificacao n4 = new Notificacao.Push("UsuárioApp", "Você tem uma nova mensagem", "26/03/2026");

        n1.enviar();
        n2.enviar();
        n3.enviar();
        n4.enviar();
    }
} 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       