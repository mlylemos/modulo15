package snippet;

public class FabricaCarroPopular implements FabricaDeCarro {
    public Carro criarCarro() {
        return new CarroPopular();
    }
}
