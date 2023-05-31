
package com.mycompany.exempomenu;

import javax.swing.JOptionPane;


/**
 *
 * @author aluno
 */
public class ExempoMenu {

    public static void main(String[] args) {
        
        int opcao = -1 ;
        
        while(opcao != 0){ 
        opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Ordenação por inserção\n"
                + "2 - Ordenação por seleção \n"
                + "3 - Ordenação Bolha \n"
                + "0 - Sair"));
        
            switch (opcao) {
                case 1:
                    primeirafuncao();
            // executa a primeira função

                    break;
                case 2:
                    segundaFuncao();
            // executa a segunda função
                   
                    break;
                case 3:
                    terceiraFuncao();
            //executa a terceira opção       
                    
                    break;
                default:
                    break;
            }
        }
    }
    public static void primeirafuncao(){
    JOptionPane.showMessageDialog(null, "Entrou na primeira opção");
    }
    public static void segundaFuncao(){
    JOptionPane.showMessageDialog(null, "Entrou na segunda opção");
    }
    public static void terceiraFuncao(){
    JOptionPane.showMessageDialog(null, "Entrou na terceira opção");
    }
}
