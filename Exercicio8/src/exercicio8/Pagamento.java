
package exercicio8;


public class Pagamento {
    
 
    private double valor;
    private String data;
    private String descricao;

    // Construtor
    public Pagamento(double valor, String data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    // Método que será sobrescrito
    public void processarPagamento() {
        System.out.println("Pagamento processado: " + valor);
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // 💳 Cartão de Crédito
    public static class CartaoCredito extends Pagamento {
        private String numeroCartao;

        public CartaoCredito(double valor, String data, String descricao, String numeroCartao) {
            super(valor, data, descricao);
            this.numeroCartao = numeroCartao;
        }

        @Override
        public void processarPagamento() {
            System.out.println("Pagamento de R$" + getValor() +
                    " realizado com cartão de crédito: " + numeroCartao);
        }

        public String getNumeroCartao() {
            return numeroCartao;
        }

        public void setNumeroCartao(String numeroCartao) {
            this.numeroCartao = numeroCartao;
        }
    }

    // ⚡ Pix
    public static class Pix extends Pagamento {
        private String chavePix;

        public Pix(double valor, String data, String descricao, String chavePix) {
            super(valor, data, descricao);
            this.chavePix = chavePix;
        }

        @Override
        public void processarPagamento() {
            System.out.println("Pagamento de R$" + getValor() +
                    " realizado via Pix na chave: " + chavePix);
        }

        public String getChavePix() {
            return chavePix;
        }

        public void setChavePix(String chavePix) {
            this.chavePix = chavePix;
        }
    }

    // 🧾 Boleto
    public static class Boleto extends Pagamento {
        private String codigoBoleto;

        public Boleto(double valor, String data, String descricao, String codigoBoleto) {
            super(valor, data, descricao);
            this.codigoBoleto = codigoBoleto;
        }

        @Override
        public void processarPagamento() {
            System.out.println("Pagamento de R$" + getValor() +
                    " realizado via Boleto: " + codigoBoleto);
        }

        public String getCodigoBoleto() {
            return codigoBoleto;
        }

        public void setCodigoBoleto(String codigoBoleto) {
            this.codigoBoleto = codigoBoleto;
        }
    }

    // 💵 Dinheiro
    public static class Dinheiro extends Pagamento {
        public Dinheiro(double valor, String data, String descricao) {
            super(valor, data, descricao);
        }

        @Override
        public void processarPagamento() {
            System.out.println("Pagamento de R$" + getValor() + " realizado em dinheiro.");
        }
    }
}
    
    
    
    
    
    
    
    
    