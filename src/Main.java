import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Volume vol = new Volume();
        Scanner inp = new Scanner(System.in);


        System.out.println("Informe um lado: ");
        vol.setA(inp.nextFloat());

        System.out.println("Informe um lado: ");
        vol.setB( inp.nextFloat());

        System.out.println("Informe um lado: ");
        vol.setC( inp.nextFloat());

        System.out.println("Informe um lado: ");
        vol.setR(inp.nextFloat());

        System.out.println("Informe um lado: ");
        vol.setH(inp.nextFloat());

        System.out.println("Valor do cubo: " + vol.getCubo());

        System.out.println("Valor do prisma: " + vol.getPrisma());

        System.out.println("Valor do Cilindro: " + vol.getCilindro());

        System.out.println("Valor da Esfera: " + vol.getEsfera());

        System.out.println("Valor do Cone: " + vol.getCone());
        
        System.out.println("Valor da Piramide: " + vol.getPiramide());
    }
}