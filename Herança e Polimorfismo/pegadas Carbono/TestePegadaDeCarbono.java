import java.util.ArrayList;

public class TestePegadaDeCarbono {
    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> objetosComPegadaCarbono = new ArrayList<>();

        Edificio edificio = new Edificio(5000, 300);
        Carro carro = new Carro(800, 2.3);
        Bicicleta bicicleta = new Bicicleta(100);

        objetosComPegadaCarbono.add(edificio);
        objetosComPegadaCarbono.add(carro);
        objetosComPegadaCarbono.add(bicicleta);

        for (PegadaDeCarbono objeto : objetosComPegadaCarbono) {
            System.out.println(objeto.toString());
            System.out.println("Pegada de Carbono: " + objeto.obterPegadaDeCarbono() + " kg CO2");
            System.out.println();
        }
    }
}
