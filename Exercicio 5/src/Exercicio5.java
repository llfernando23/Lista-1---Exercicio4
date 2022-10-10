import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        //1) Peça uma medidas em metros
        //2) Converter em centímentros e imprimir
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma medida em metros: ");
        double metros = sc.nextDouble();
        sc.close();

        double centimetros = metros * 100;
        System.out.println(metros + "metros, corresponde à " + centimetros + " centimetros.");

    }
}
