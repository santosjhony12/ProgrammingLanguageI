public class TesteCarro {
    public static void main(String[] args){
        /*INSTANCIA DO OBJETO COM CONSTRUTOR DEFINIDO*/
        Carro carro1 = new Carro(12, "ABC123", "Azul","FIAT", "UNO" );

        /*impressões dos atributos do objeto carro1 utilizando a classe Carro*/
        System.out.println("Velocidade Atual: "+carro1.getVelocidadeAtual());
        System.out.println("Placa: "+carro1.getPlaca());
        System.out.println("Cor: "+carro1.getCor());
        System.out.println("Marca: "+carro1.getMarca());
        System.out.println("Modelo: "+carro1.getModelo());
        carro1.andar(144);
        carro1.freiar();
    }
}
