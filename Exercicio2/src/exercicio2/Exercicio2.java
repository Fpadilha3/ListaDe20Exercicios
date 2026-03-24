
package exercicio2;

public class Exercicio2 {

   
    public static void main(String[] args) {
        
        
        
        
      

        Veiculo v1 = new Veiculo.Carro("Toyota", "Corolla", 2022);
        Veiculo v2 = new Veiculo.Moto("Honda", "CB500", 2021);
        Veiculo v3 = new Veiculo.Bicicleta("Caloi", "Elite", 2020);
        Veiculo v4 = new Veiculo.Onibus("Mercedes", "Sprinter", 2019);

        // Testando polimorfismo
        v1.mover();
        v2.mover();
        v3.mover();
        v4.mover();
    }
}
        
        
        
        
        
        
    