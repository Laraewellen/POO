public class DataTest {
    public static void main(String[] args) {
        Data data = new Data(9, 15, 2024);

        System.out.print("Data inicial: ");
        data.displayDate();

        data.setMes(12);
        data.setDia(25);
        data.setAno(2023);

        System.out.print("Data alterada: ");
        data.displayDate();
    }
}
