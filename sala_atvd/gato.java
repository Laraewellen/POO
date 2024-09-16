import javax.swing.JOptionPane;
public class gato
{

   private String nome;
   private String nasc;
   private double peso;

   public gato(String nome, String nasc, double peso) //construtor
{
   this.nome = nome;
   this.nasc = nasc;
   this.peso = peso; //this é usado pra variavel global    
}

  public void miar()
  {
    //System.out.println(this.nome + " miou!");
    JOptionPane.showMessageDialog(null, this.nome + " miou!");
  }

  public void lamber()
{
    System.out.println(this.nome + " lambeu!"); 
}
   public void setNome(String nome) //atribuir
{
    this.nome = nome;
}
   public String getNome() //receber
{
   return this.nome;
}

}