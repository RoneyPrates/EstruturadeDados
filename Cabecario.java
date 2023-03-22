
package com.mycompany.cabecario;
import java.util.Scanner;

public class Cabecario {

    public static void main(String[] args) {
        Scanner pessoa = new Scanner (System.in);
        String nome;
        
        System.out.println("Digite o seu nome:");
               nome = pessoa.nextLine();
        System.out.println("""
                           ================================================= 
                           UNIPAR - UNIVERSIDADE PARANAENSE 
                           Analise e Desenvolvimento de Sistemas - ADS 
                           Estrutura e Classificação de Dados
                           Nome:""" +nome+
"\n ================================================= ");
    }
}
