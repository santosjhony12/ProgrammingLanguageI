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

        /*DECLARAÇÃO DE VARIAVEIS*/
        int a;
        int b;
        a = 5;
        b = 6;
        int soma = a+b;
        System.out.println("A soma de A e B INTEIROS é: "+soma);
        resultado.somarComplexo(1,4,8,6);
        System.out.println("A soma dos números reais é: "+resultado.somarReal(11.1,88.9));

    }

}