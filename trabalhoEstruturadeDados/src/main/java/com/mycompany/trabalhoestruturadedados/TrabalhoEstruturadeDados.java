package com.mycompany.trabalhoEstruturadeDados;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TrabalhoEstruturadeDados {

    public static void main(String[] args) {
        
        int opcao = -1 ;
        
        
        while(opcao != 0){ 
        opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Selecione a ordenação que você deseja:\n "
                + "1 - Ordenação por inserção\n"
                + "2 - Ordenação por seleção \n"
                + "3 - Ordenação Bolha \n"
                + "0 - Sair"));
        
        
            switch (opcao) {
                case 1:
                    ordenacaoInsercao();
                //executa a funcão ordenacaoInsersao
                    break;
                case 2:
                    ordenacaoSelecao();
                //executa a função ordenaçãoSelecao  
                    break;
                case 3:
                    ordenacaoBolha();   
                //executa a função ordenaçãoBolha   
                    break;
                default:
                    break;
            }
        }
    }
    public static void ordenacaoInsercao(){
        
    Scanner scanner = new Scanner(System.in);
    
        long tempoInicial, tempoFinal;


        JOptionPane.showMessageDialog(null, "Opção Escolhida: Ordenação por insersão.");
        System.out.println("Informe o tamanho do Vetor: ");
        int tamanhoVetor = scanner.nextInt();
        //variável para armazenar o tamanho do vetor
        
        int[] ordenacaoInsercao = new int[tamanhoVetor];
        //criação do vetor com o tamanho escolhido e armazenado os numeros adicionados
        
        System.out.println("Informe os numeros inteiros que deseja ordenar: ");
        
        for (int i=0; i <tamanhoVetor; i++){
        System.out.println("Elemento "+ (i+1)+ ": ");
        ordenacaoInsercao [i] = scanner.nextInt();
        }
        tempoInicial = System.currentTimeMillis();
        //inicio da contagem de segundos do processamento
        
        System.out.println("Vetores Informados: ");   
        for (int i =0; i < tamanhoVetor; i++) {
        System.out.println(ordenacaoInsercao[i] + " ");
        }
        
        for(int i=1; i<tamanhoVetor; i++){
        int valorOriginal = ordenacaoInsercao[i];
        int j = i -1;
        
        while(j >= 0 && ordenacaoInsercao[j] > valorOriginal){
        ordenacaoInsercao[j+1] = ordenacaoInsercao[j];
        j--;
        }
        
        ordenacaoInsercao[j+1] = valorOriginal;
        }
        System.out.println("Vetor Ordenado: ");
        for (int i =0; i < tamanhoVetor; i++){
        System.out.println(ordenacaoInsercao[i] + " ");
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de Execução: "+ (tempoFinal - tempoInicial/1000) + " s");
        
        int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de pesquisa que deseja: \n"
    + "1 - Pesquisa Linear \n"
    + "2 - Pesquisa Binária \n"
    + "0 - Sair"));
    
        switch(pesquisa){
            case 1:
                pesquisaL(ordenacaoInsercao);
            case 2:
                pesquisaB(ordenacaoInsercao);
            default:
        }
        }
    public static void ordenacaoSelecao(){
        
    Scanner scanner = new Scanner(System.in);
    long tempoInicial, tempoFinal;
        
        JOptionPane.showMessageDialog(null, "Opção Escolhida: Ordenação por seleção.");
        System.out.println("Informe o tamanho do Vetor: ");
        int tamanhoVetor = scanner.nextInt();
        
        int [] ordenacaoSelecao = new int[tamanhoVetor];
        
        System.out.println("Informe os numeros inteiros que deseja ordenar: ");
        
        for(int i=0; i <tamanhoVetor; i++){
        ordenacaoSelecao[i] = scanner.nextInt();
        }
        System.out.println("Vetores Informados: ");   
        for (int i =0; i < tamanhoVetor; i++) {
        System.out.println(ordenacaoSelecao[i] + " ");
        }
        
        tempoInicial = System.currentTimeMillis();
        
        for(int i = 0; i < tamanhoVetor - 1; i++){
        int posicaoMenor = i; 
        
        for(int j = i + 1; j <tamanhoVetor; j++ ){
        if (ordenacaoSelecao[j] < ordenacaoSelecao [posicaoMenor]){
        posicaoMenor = j;
        }
        }
        if(posicaoMenor != i){
            int auxiliar = ordenacaoSelecao [i];
            ordenacaoSelecao[i] = ordenacaoSelecao [posicaoMenor];
            ordenacaoSelecao [posicaoMenor] = auxiliar;
        }
        }
        System.out.println("Numeros ordenados: \n");
        for (int i = 0; i < ordenacaoSelecao.length; i++){
        System.out.println("Posição ["+i+"] = " +ordenacaoSelecao[i]);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de Execução: "+ (tempoFinal - tempoInicial/1000)+" s");
        
        int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de pesquisa que deseja: \n"
    + "1 - Pesquisa Linear \n"
    + "2 - Pesquisa Binária \n"
    + "0 - Sair"));
    
        switch(pesquisa){
            case 1:
                pesquisaL(ordenacaoSelecao);
            case 2:
                pesquisaB(ordenacaoSelecao);
            default:
        }
    }
    public static void ordenacaoBolha(){
        
    Scanner scanner = new Scanner(System.in);
    long tempoInicial, tempoFinal;
        
    JOptionPane.showMessageDialog(null, "Opção Escolhida: Ordenação Bolha.");
    System.out.println("Informe o tamanho do Vetor: ");
        int tamanhoVetor = scanner.nextInt();
        
        int [] ordenacaoBolha = new int[tamanhoVetor];
        System.out.println("Informe os numeros inteiros que deseja ordenar: ");
        boolean houveTroca = true;
        
    for(int i=0; i < tamanhoVetor; i++){
    ordenacaoBolha[i] = scanner.nextInt();
    }
    
    System.out.println("Vetores Informados: ");   
        for (int i =0; i < tamanhoVetor; i++) {
        System.out.println(ordenacaoBolha[i] + " ");
        }
    
    tempoInicial = System.currentTimeMillis();
    
    while(houveTroca){
    houveTroca = false;
    
    for(int i = 0; i < ordenacaoBolha.length - 1; i++){
    if(ordenacaoBolha[i] > ordenacaoBolha[i+1]){
    int aux = ordenacaoBolha[i];
    ordenacaoBolha[i] = ordenacaoBolha[i+1];
    ordenacaoBolha[i+1] = aux;
    houveTroca = true;
    }
    }
    }
    System.out.println("Numeros Ordenados: \n");
    for (int i = 0; i < ordenacaoBolha.length; i++){
    System.out.println("Posição ["+i+"] = " +ordenacaoBolha[i]);
        }
    tempoFinal = System.currentTimeMillis();
    System.out.println("Tempo de Execução: "+ (tempoFinal - tempoInicial /1000)+" s");
    
    int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de pesquisa que deseja: \n"
    + "1 - Pesquisa Linear \n"
    + "2 - Pesquisa Binária \n"
    + "0 - Sair"));
    
        switch(pesquisa){
            case 1:
                pesquisaL(ordenacaoBolha);
            case 2:
                pesquisaB(ordenacaoBolha);
            default:
        }
}
    
public static void pesquisaL(int[] vetor){
Scanner n = new Scanner(System.in);

System.out.println("Informe o numero que deseja pesquisar: ");
int numPesquisa = n.nextInt();

boolean numEncontrado = false;
int posicao = -1;

for(int i= 0; i< vetor.length;i++){
if(vetor[i] == numPesquisa){
numEncontrado = true;
posicao = i;
}
}
if(numEncontrado){
System.out.println("O numero "+numPesquisa+" foi encontrado na posição "+posicao);
}else{
System.out.println("O numero "+numPesquisa+" não foi encontrado no vetor");
}
}
public static void pesquisaB(int[] vetor){
Scanner n = new Scanner(System.in);

int inicio = 0;
int fim = vetor.length - 1;
int posicao = -1;

System.out.println("Informe o numero que deseja pesquisar: ");
int numPesquisa = n.nextInt();

while(inicio <= fim){
int meio = (inicio + fim) / 2;

if (vetor[meio] == numPesquisa){
posicao = meio;
break;
}else if(vetor[meio] < numPesquisa){
inicio = meio + 1;
}else{
fim = meio - 1;
}
}
if(posicao != -1){
System.out.println("O numero "+numPesquisa+" foi encontrado na posição "+posicao);
}else{
System.out.println("O numero "+numPesquisa+" não foi encontrado no vetor");
}
}
}
