public class Motocicleta {
    String modelo;
    String marca;
    int nroChassi;
    String nroPlaca;
    String cor;
    int nroCilindradas;

    Motocicleta (int nroChassi, String nroPlaca) {
        this.nroChassi = nroChassi;
        this.nroPlaca = nroPlaca;
    }

    Motocicleta (String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    Motocicleta () {
    }

    public void mostraDados(){
        System.out.println("Modelo : " + modelo);
        System.out.println("Marca : " + marca);
        System.out.println("Número do chassi : " + nroChassi);
        System.out.println("Número da placa : " + nroPlaca);
        System.out.println("Cor : " + cor);
        System.out.println("Número de Cilindradas : " + nroCilindradas);
    }
}
