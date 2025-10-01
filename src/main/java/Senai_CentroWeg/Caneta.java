package Senai_CentroWeg;

public class Caneta {
   String modelo;
   String cor;
   float ponta;
   int carga;
   boolean tampada;

   void status(){
       System.out.println("Modelo " + this.modelo);
       System.out.println("Uma caneta de cor " + this.cor);
       System.out.println("Com a ponta " + this.ponta);
       System.out.println("Com a carga " + this.carga);
       System.out.println("Está tampada ? " + this.tampada);
   }
   void rabiscar(){
       if (this.tampada == true) {
           System.out.println("Não posso rabiscar, pois estou tampada!");
       } else {
           System.out.println("Estou rabiscando, pois estou destampada!");
       }
   }
   void tampar(){
       this.tampada = true;
   }
   void destampar(){
       this.tampada = false;
   }

}
