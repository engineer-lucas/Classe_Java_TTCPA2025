package Senai_CentroWeg;

public class main {
    public static void main(String[] args) {
        System.out.println("OBJETO 1");
        Caneta c1 = new Caneta();
        c1.modelo = "Compactor 07";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println("OBJETO 2");
        Caneta c2 = new Caneta();
        c2.modelo = "Bic Cristal";
        c2.cor = "Preta";
        c2.ponta = 0.9f;
        c2.tampada = true;
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
