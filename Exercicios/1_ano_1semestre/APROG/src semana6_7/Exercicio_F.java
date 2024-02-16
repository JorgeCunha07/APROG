
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tiago Alves
 */
public class Exercicio_F {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String solido;
        solido = sc.nextLine();
        String f = "fim";
        while (!solido.equals("fim")) {
            switch (solido) {
                case "cone":
                    double raio = sc.nextDouble();
                    double altura = sc.nextDouble();
                    System.out.printf("%.2f\n", volumeCone(raio, altura));

                    break;
                case "cilindro":
                    double raio2 = sc.nextDouble();
                    double altura1 = sc.nextDouble();
                    System.out.printf("%.2f\n", volumeCilindro(raio2, altura1));

                    break;
                case "esfera":
                    double raio1 = sc.nextDouble();
                    System.out.printf("%.2f\n", volumeEsfera(raio1));

                    break;
                case "fim":
                    break;

            }
            solido = sc.nextLine();
        }

    }

    public static double volumeEsfera(double raio) {

        double volEsfera = (4 * Math.PI * Math.pow(raio, 3)) / 3;

        return volEsfera;

    }

    public static double volumeCone(double raio, double altura) {

        double volCone;

        volCone = ((Math.PI * raio * raio * altura) / 3);

        return volCone;

    }

    public static double volumeCilindro(double raio, double altura) {

        double volCilindro;

        volCilindro = (Math.PI * Math.pow(raio, 2) * altura);

        return volCilindro;

    }
}
