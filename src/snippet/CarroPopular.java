package snippet; 

public class CarroPopular implements Carro {

    public CarroPopular() {
        System.out.println("Carro Popular criado: Fiat Uno");
    }

    @Override 
    public void exibirInfo() {
        System.out.println("Carro Popular: Fiat Uno");
    }
}