public class Chamada {
 private String nomeCurso;
 private String nomeProf;
 public Chamada(String nome) {
 this.nomeCurso = nome;
 }
 public void setNomeCurso(String nome) {
 this.nomeCurso = nome;
 }
 public String getNomeCurso() {
 return nomeCurso;
 }
 public String boasVindas() {
 return "Bem vindo a Chamada do curso de " + getNomeCurso();
 }
 public void setNomeProf(String nome){
 this.nomeProf = nome;
 }
 public String getNomeProf(){
 return this.nomeProf;
 }
public String profCurso() {
 return getNomeProf() + " ministra " + getNomeCurso();
 }
 }