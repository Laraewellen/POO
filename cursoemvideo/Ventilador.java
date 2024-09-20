package Ventilador;

public class Ventilador {

    public static void main(String[] args) {
        VentiladorTest v1 = new VentiladorTest();  // Criando uma instância de VentiladorTest
        v1.cor = "Preto";                          // Definindo a cor
        v1.tipo = "Pequeno";                       // Definindo o tipo

        v1.ligar();                                // Ligando o ventilador
        v1.ventilando();                           // Verificando se está ventilando
        v1.status();                               // Exibindo o status do ventilador
    }
}
