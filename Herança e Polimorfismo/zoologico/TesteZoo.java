public class TesteZoo {
    public static void main(String[] args) {
        Elefante elefante = new Elefante("Dumbo", 10, "Cinza");
        Tigre tigre = new Tigre("Shere Khan", 5, "Laranja com listras pretas");
        Pinguim pinguim = new Pinguim("Pingu", 3, 0.5);
        Aguia aguia = new Aguia("Majestosa", 7, 2.0);

        elefante.emitirSom();
        tigre.emitirSom();
        pinguim.emitirSom();
        aguia.emitirSom();

        pinguim.nadando();
        aguia.voando();
    }
}
