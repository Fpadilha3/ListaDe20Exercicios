
package exercicio10;


public class Exercicio10 {

   
    public static void main(String[] args) {
        
  
        Transporte t1 = new Transporte.Taxi(4, "Taxi Sul", 10);
        Transporte t2 = new Transporte.Uber(4, "Uber", 10);
        Transporte t3 = new Transporte.Onibus(40, "Carris", 5);
        Transporte t4 = new Transporte.Metro(200, "MetroRS", 6);

        System.out.println("Taxi: " + t1.calcularTarifa());
        System.out.println("Uber: " + t2.calcularTarifa());
        System.out.println("Ônibus: " + t3.calcularTarifa());
        System.out.println("Metrô: " + t4.calcularTarifa());
    }
}    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
