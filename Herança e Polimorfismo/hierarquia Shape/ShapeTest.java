public class ShapeTest {
    public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        formas[0] = new Circulo(5.0);
        formas[1] = new Quadrado(4.0);
        formas[2] = new Esfera(3.0);
        formas[3] = new Cubo(2.0);

        for (Forma forma : formas) {
            System.out.println(forma.getDescricao());

            if (forma instanceof FormaBidimensional) {
                FormaBidimensional forma2D = (FormaBidimensional) forma;
                System.out.println("Área: " + forma2D.obterArea());
            } else if (forma instanceof FormaTridimensional) {
                FormaTridimensional forma3D = (FormaTridimensional) forma;
                System.out.println("Área de superfície: " + forma3D.obterArea());
                System.out.println("Volume: " + forma3D.obterVolume());
            }
            System.out.println();
        }
    }
}
