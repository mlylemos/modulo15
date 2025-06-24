package snippet;

public class Teste {
    public static void main(String[] args) {
        FabricaDeCarro fabricaPopular = new FabricaCarroPopular();
        Carro carro1 = fabricaPopular.criarCarro();
        carro1.exibirInfo();

        FabricaDeCarro fabricaLuxo = new FabricaCarroLuxo();
        Carro carro2 = fabricaLuxo.criarCarro();
        carro2.exibirInfo();
    }
}

