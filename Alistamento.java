
package com.mycompany.alistamento;

import java.util.Scanner;

public class Alistamento {

    public static void main(String[] args) {
        
        Scanner idad = new Scanner(System.in);
        Scanner genero = new Scanner (System.in);
        
        int idade;
        String sexo;
        
        System.out.println("Sistema para alistamento Militar");
        System.out.println("Digite a sua idade: ");
        idade = idad.nextInt();
        System.out.println("Qual seu sexo? Digite F para sexo feminino e M para sexo masculino");
        sexo = genero.nextLine();
        if(idade >= 18){
        System.out.println("Seu sexo é "+sexo+" e sua idade é "+idade);
        System.out.println("Parabéns, você foi alistada (o)");
        }else{
        System.out.println("Sua idade é de "+idade+", infelizmente você não tem idade para se alistar");
        }
    }
}
