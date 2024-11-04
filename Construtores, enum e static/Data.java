public class Data {
    private int dia;
    private int mes;
    private int ano;
    private static final String[] NOMES_MESES = {
    "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
    "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };
    private static final int[] DIAS_POR_MES = {
    31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public Data(int mes, int dia, int ano) {
    this.mes = mes;
    this.dia = dia;
    this.ano = ano;
    }
    public Data(String nomeMes, int dia, int ano) {
    this.mes = encontrarMes(nomeMes);
    this.dia = dia;
    this.ano = ano;
    }
    public Data(int diasDoAno, int ano) {
    this.ano = ano;
    int diasAcumulados = 0;
    this.mes = 1;
    for (int i = 0; i < DIAS_POR_MES.length; i++) {
    int diasMes = DIAS_POR_MES[i];
    if (isAnoBissexto(ano) && i == 1) {
    diasMes = 29;
    }
    if (diasDoAno <= diasAcumulados + diasMes) {
    this.mes = i + 1;
    5
    this.dia = diasDoAno - diasAcumulados;
    break;
    }
    diasAcumulados += diasMes;
    }
    }
    private int encontrarMes(String nomeMes) {
    for (int i = 0; i < NOMES_MESES.length; i++) {
    if (NOMES_MESES[i].equalsIgnoreCase(nomeMes)) {
    return i + 1;
    }
    }
    return 1;
    }
    private boolean isAnoBissexto(int ano) {
    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    public String formatarPadrao() {
    return String.format("%02d/%02d/%d", mes, dia, ano);
    }
    public String formatarCompleto() {
    return String.format("%s %d, %d", NOMES_MESES[mes - 1], dia, ano);
    }
    public String formatarDiaDoAno() {
    int diaDoAno = dia;
    for (int i = 0; i < mes - 1; i++) {
    diaDoAno += DIAS_POR_MES[i];
    if (i == 1 && isAnoBissexto(ano)) {
    diaDoAno += 1;
    }
    }
    return String.format("%03d %d", diaDoAno, ano);
    }
    public static void main(String[] args) {
    Data data1 = new Data(6, 12, 1992);
    Data data2 = new Data("Junho", 12, 1992);
    Data data3 = new Data(164, 1992);
    System.out.println("Formato mm/dd/yyyy:");
    System.out.println(data1.formatarPadrao());
    System.out.println("Formato 'nome do mês dia, ano':");
    System.out.println(data2.formatarCompleto());
    6
    System.out.println("Formato DDD YYYY:");
    System.out.println(data3.formatarDiaDoAno());
    }
    }
    