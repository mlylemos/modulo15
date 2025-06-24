package snippet;

public class FabricaCarroLuxo implements FabricaDeCarro {
    public Carro criarCarro() {
        return new CarroLuxo();
    }
}

