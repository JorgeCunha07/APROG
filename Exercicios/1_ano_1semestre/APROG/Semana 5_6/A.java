import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int numero,a, soma =0 ;
        Scanner ler = new Scanner(System.in);
        numero = ler.nextInt();

        while(numero > 0){
            a = numero % 10;
        numero= numero /10;
        if(a % 2 == 0){
            soma= soma + a;
            }
        }                             
            System.out.println(soma);
}
 }
/*
shift alt 8A - Somar algarismos pares
Construa um programa que calcule a soma dos algarismos pares de um número inteiro positivo introduzido pelo utilizador.
Por exemplo, se a entrada for o número 36781 a saída será 14 (8+6) */