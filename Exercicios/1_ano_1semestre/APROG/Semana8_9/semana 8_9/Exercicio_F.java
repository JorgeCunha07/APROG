
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

        double taxas0 = sc.nextDouble();
        double taxas1 = sc.nextDouble();
        double taxas2 = sc.nextDouble();
        double taxas3 = sc.nextDouble();
        double taxas4 = sc.nextDouble();
        double taxas5 = sc.nextDouble();

        double salario = sc.nextDouble();

        double juro0 = salario * taxas0;
        double salario0 = salario + juro0;

//         1500 =10000*0.15
//        11500 =10000+1500
        double juro1 = (salario0 * taxas1);
        double salario1 = salario0 + juro1;

//         2300 =11500*0.20
//        13800 =11500+2300
        double juro2 = (salario1 * taxas2);
        double salario2 = salario1 + juro2;

//         1518 =13800*0.11
//        15318 =13800+1518
        double juro3 = (salario2 * taxas3);
        double salario3 = salario2 + juro3;

//         153.18 =15318*0.01
//       15471.18 =15318+153.18
        double juro4 = (salario3 * taxas4);
        double salario4 = salario3 + juro4;

//       309.4236 =15471.18*0.02
//      15780.6036=15471.18+309.4236
        double juro5 = (salario4 * taxas5);
        double salario5 = salario0 + juro5;

//      789.03018 =15780.6036*0.05
//  16569.63(378) =15780.6036+789.03018
        double salarioFinal = salario4 + juro5;

//        RESPOSTA: 16569.63
        System.out.printf("valor final=%.2f\n", salarioFinal);
    }

}
