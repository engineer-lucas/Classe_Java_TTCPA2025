package Senai_CentroWeg;

public class main {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("OBJETO 1");
        Caneta c1 = new Caneta();
        c1.modelo = "Compactor 07";
        c1.cor = "Azul";
     //   c1.ponta = 0.5f;
     //   c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        System.out.println("------------------");
        System.out.println("OBJETO 2");
        Caneta c2 = new Caneta();
        c2.modelo = "Bic Cristal";
        c2.cor = "Preta";
     //   c2.ponta = 0.9f;
     //   c2.tampada = true;
        c2.destampar();
        c2.status();
        c2.rabiscar();

        System.out.println("------------------");
        System.out.println("OBJETO 3");
        Caneta c3 = new Caneta();
        c3.modelo = "Faber Castel";
        c3.cor = "Vermelha";
    //    c3.ponta = 0.7f;
        c3.destampar();
        c3.status();
        c3.rabiscar();

        System.out.println("-------------------");
        System.out.println("OBJETO 4");
        Caneta c4 = new Caneta();
        c4.modelo = "Leo Leo";
        c4.cor = "Verde";
    //    c4.ponta = 1.0f;
        c4.status();
        c4.tampar();
        c4.rabiscar();
    }
}
