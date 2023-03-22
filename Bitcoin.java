
package com.mycompany.bitcoin;

import java.util.Scanner;

public class Bitcoin {

    public static void main(String[] args) {
        Scanner real = new Scanner(System.in);
        int valor;
        
        System.out.println("Digite o valor em reais que você deseja converter: ");
        valor = real.nextInt();
        System.out.println("Valores convertidos irão ser listados abaixo: \n");
        System.out.println("O valor de R$ "+valor+" em Euro é: "+(valor/5.16));
        System.out.println("O valor de R$ "+valor+" em Libra é: "+(valor/6.02));
        System.out.println("O valor de R$ "+valor+" em Dólar é: "+(valor/4.81));
        System.out.println("O valor de R$ "+valor+" em Bitcoin é: "+(valor/141.257));
    }
}
