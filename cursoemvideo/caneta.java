public class Caneta {
    // Atributos da classe Caneta
    String cor;
    float ponta;
    boolean tampada;

    // Método para destampar a caneta
    void destampar() {
        this.tampada = false;
    }

    // Método para mostrar o status da caneta
    void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
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

    // Método principal
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // Criando objeto instanciado
        c1.cor = "vermelha";
        c1.ponta = 0.5f; // Atributo
        c1.destampar();
        c1.status(); // Método
        c1.rabiscar();
    }
}
