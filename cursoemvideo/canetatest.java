package caneta;
public class canetatest {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
  void status() {
      System.out.println("Modelo: " + this.modelo);
      System.out.println("caneta é: " + this.cor);
      System.out.println("A ponta é: " + this.ponta);
      System.out.println("A carga é" + this.carga);
      System.out.println("esta tampada? " + this.tampada);
    }

    void rabiscar(){
      if (tampada == true) {
        System.out.printf("erro");
      } else {
        System.out.printf("rasbicar");
      }

      }

    void tampar(){

      this.tampada = true;

    }

    void destampar(){

      this.tampada = false;

    }

  }

