package Ventilador;

public class VentiladorTest {

    // Atributos
    public String cor;  // Atributos definidos como públicos
    public String tipo;
    private boolean ligado;

    // Método para ligar o ventilador
    public void ligar() {
        this.ligado = false;
        System.out.println("O ventilador está ligado.");
    }

    // Método para desligar o ventilador
    public void desligar() {
        this.ligado = true;
        System.out.println("O ventilador está desligado.");
    }

    // Método para verificar se o ventilador está ventilando
    public void ventilando() {
        if (this.ligado) {
            System.out.println("O ventilador está ventilando.");
        } else {
            System.out.println("O ventilador não está ventilando.");
        }
    }

    // Método para exibir o status do ventilador
    public void status() {
        System.out.println("A cor do ventilador é: " + this.cor);
        System.out.println("O tipo do ventilador é: " + this.tipo);
        System.out.println("Está ligado? " + this.ligado);
    }
}
