
package exercicio13;


public class Notificacao {
    
    
    
    

    private String destinatario;
    private String mensagem;
    private String data;

    // Construtor
    public Notificacao(String destinatario, String mensagem, String data) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.data = data;
    }

    // Getters e Setters
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    // Método geral
    public void enviar() {
        System.out.println("Enviando notificação genérica");
    }

    // 🔹 Subclasse Email
    static class Email extends Notificacao {

        public Email(String destinatario, String mensagem, String data) {
            super(destinatario, mensagem, data);
        }

        @Override
        public void enviar() {
            System.out.println("Enviando EMAIL para " + getDestinatario() +
                               ": " + getMensagem());
        }
    }

    // 🔹 Subclasse SMS
    static class SMS extends Notificacao {

        public SMS(String destinatario, String mensagem, String data) {
            super(destinatario, mensagem, data);
        }

        @Override
        public void enviar() {
            System.out.println("Enviando SMS para " + getDestinatario() +
                               ": " + getMensagem());
        }
    }

    // 🔹 Subclasse WhatsApp
    static class WhatsApp extends Notificacao {

        public WhatsApp(String destinatario, String mensagem, String data) {
            super(destinatario, mensagem, data);
        }

        @Override
        public void enviar() {
            System.out.println("Enviando WhatsApp para " + getDestinatario() +
                               ": " + getMensagem());
        }
    }

    // 🔹 Subclasse Push
    static class Push extends Notificacao {

        public Push(String destinatario, String mensagem, String data) {
            super(destinatario, mensagem, data);
        }

        @Override
        public void enviar() {
            System.out.println("Enviando notificação PUSH para " + getDestinatario() +
                               ": " + getMensagem());
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    