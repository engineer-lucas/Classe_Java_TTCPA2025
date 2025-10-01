package Senai_CentroWeg;

public class Caneta {
    //Atributos da caneta, ou seja, suas caracteristicas.
    //O que eu tenho ?
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;

//O que eu faço ? Métodos
   public void status(){
       System.out.println("Modelo " + this.modelo);
       System.out.println("Uma caneta de cor " + this.cor);
       System.out.println("Com a ponta " + this.ponta);
       System.out.println("Com a carga " + this.carga);
       System.out.println("Está tampada ? " + this.tampada);
   }
   public void rabiscar(){
       if (this.tampada == true) {
           System.out.println("Não posso rabiscar, pois estou tampada!");
       } else {
           System.out.println("Estou rabiscando, pois estou destampada!");
       }
   }
   protected void tampar(){
       this.tampada = true;
   }
   public void destampar(){
       this.tampada = false;
   }

}
