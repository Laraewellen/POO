package Caneta;

public class Canetatest {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // Método para exibir o status da caneta
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A caneta é: " + this.cor);
        System.out.println("A ponta é: " + this.ponta);
        System.out.println("A carga é: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    // Método para rabiscar
    void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro: Não posso rabiscar, estou tampada!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    // Método para tampar a caneta
    void tampar() {
        this.tampada = true;
    }

    // Método para destampar a caneta
    void destampar() {
        this.tampada = false;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto da classe Canetatest
        Canetatest caneta = new Canetatest();

        // Atribuindo valores aos atributos
        caneta.modelo = "BIC";
        caneta.cor = "Azul";
        caneta.ponta = 0.7f;
        caneta.carga = 100;

        // Exibindo status e testando o comportamento
        caneta.status();
        caneta.rabiscar(); // A caneta está tampada, não poderá rabiscar

        // Destampando a caneta e tentando rabiscar novamente
        caneta.destampar();
        caneta.rabiscar(); // Agora a caneta poderá rabiscar
    }
}
