package Ca;

public class Catest {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A caneta é: " + this.cor);
        System.out.println("A ponta é: " + this.ponta);
        System.out.println("A carga é: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro: Não posso rabiscar, estou tampada!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
