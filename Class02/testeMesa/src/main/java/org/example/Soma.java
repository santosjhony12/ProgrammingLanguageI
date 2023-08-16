package org.example;
/*
Criado por Jhony - Aula 02 - 15/08/2023
 */
public class Soma {
    public double somarReal(double a, double b){
        return (a+b);
    }
    public void somarComplexo(int a, int b, int c, int d){
        int r = a+c;
        int i = b+c;
        System.out.println("A soma dos números complexos são: "+r+i+"i");
    }
    public static void main(String[] args) {
        /*INSTANCIA DO OBJETO*/
        Soma resultado = new Soma();
        Soma result2 = new Soma();

        /*DECLARAÇÃO DE VARIAVEIS*/
        int a;
        int b;
        a = 5;
        b = 10;
        int soma = a+b;
        System.out.println("A soma de A e B INTEIROS é: "+soma);
        System.out.println("A soma dos números reais é: "+resultado.somarReal(2.5,3.5));
        result2.somarComplexo(5,2,7,-3);
    }

}