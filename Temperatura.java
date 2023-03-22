
package com.mycompany.temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner graus = new Scanner(System.in);
        
        float pedido;
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        pedido = graus.nextFloat();
        System.out.println("A temperatura adicionada de "+pedido+" em Celsius é a seguinte temperatura nas demais medidas: \n");
        System.out.println("Fahreinheit: " +(pedido*1.8+ 32));
        System.out.println("Kelvin: "+(pedido+273));
    }
}
