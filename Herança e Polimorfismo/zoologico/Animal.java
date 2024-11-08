abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();
}

abstract class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }
}

abstract class Ave extends Animal {
    protected double tamanhoAsa;

    public Ave(String nome, int idade, double tamanhoAsa) {
        super(nome, idade);
        this.tamanhoAsa = tamanhoAsa;
    }
}

interface Nadador {
    void nadando();
}

interface Voador {
    void voando();
}

class Elefante extends Mamifero {
    public Elefante(String nome, int idade, String corPelo) {
        super(nome, idade, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz som de trombeta!");
    }
}

class Tigre extends Mamifero {
    public Tigre(String nome, int idade, String corPelo) {
        super(nome, idade, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz som de rugido!");
    }
}

class Pinguim extends Ave implements Nadador {
    public Pinguim(String nome, int idade, double tamanhoAsa) {
        super(nome, idade, tamanhoAsa);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz som de grasnido!");
    }

    @Override
    public void nadando() {
        System.out.println(nome + " está nadando!");
    }
}

class Aguia extends Ave implements Voador {
    public Aguia(String nome, int idade, double tamanhoAsa) {
        super(nome, idade, tamanhoAsa);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz som de grito agudo!");
    }

    @Override
    public void voando() {
        System.out.println(nome + " está voando!");
    }
}
