package Motos;

public class Motocicleta {
    String modelo;
    String marca;
    int nroChassi;
    String nroPlaca;
    String cor;
    int nroCilindradas;

    public String licenciar() {
        int tamanho = nroPlaca.length();
        String valor = nroPlaca.substring(tamanho - 1);
        
        switch (valor) {
            case "1":
                return "abril";
            case "2":
                return "maio";
            case "3":
                return "junho";
            case "4":
                return "julho";
            case "5":
            case "6":
                return "agosto";
            case "7":
                return "setembro";
            case "8":
                return "outubro";
            case "9":
                return "novembro";
            default:
                return "dezembro";
        }

    }

    public boolean checaChassi (int nro) {
        if (nro == nroChassi) {
            return true;
        }
        else {
            return false;
        }
    }
}

