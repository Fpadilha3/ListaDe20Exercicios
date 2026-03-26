
package exercicio11;


public class Exercicio11 {

  
    public static void main(String[] args) {
      
        Dispositivo d1 = new Dispositivo.Computador("Dell", "Inspiron");
        Dispositivo d2 = new Dispositivo.Smartphone("Samsung", "Galaxy S");
        Dispositivo d3 = new Dispositivo.Tablet("Apple", "iPad");
        Dispositivo d4 = new Dispositivo.Televisao("LG", "SmartTV");

        d1.ligar();
        d1.executarFuncao();

        d2.ligar();
        d2.executarFuncao();

        d3.ligar();
        d3.executarFuncao();

        d4.ligar();
        d4.executarFuncao();
    }
}
        
        
        
        
        
        
        
        
        
        