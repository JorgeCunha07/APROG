
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
public class Exercicio_C {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    public static double calcularAngulo(double a, double b, double c) {
        double ang = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
        return Math.toDegrees(ang);
    }

    public static boolean verificarTriangulo(double a, double b, double c) {
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (verificarTriangulo(a, b, c)) {
            System.out.printf("a=" + "%.0f\n", a);
            System.out.printf("b=" + "%.0f\n", b);
            System.out.printf("c=" + "%.0f\n", c);
            System.out.println("ang(a,b)=" + (int)calcularAngulo(a, b, c));
            System.out.println("ang(a,c)=" + (int)calcularAngulo(a, c, b));
            System.out.println("ang(b,c)=" + (int)calcularAngulo(b, c, a));
        } else {
            System.out.println("impossivel");
        }
    }

}
