package BubbleSort;

import java.util.Random;

public class BubbleSort {
    static int contadorTrocas = 0;
    static int contadorComparacoes = 0;
    
    static void troca(Integer[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    
    static void bSort(Integer[] v, int n){
        boolean flag = true;
        
        for (int fase = 1; fase < n && flag; fase++){
            System.out.println("Fase:"+fase);
            mostrarVetor(v);
            
               flag = false;
               for (int j = 0; j < n-fase; j++) {
                    contadorComparacoes++;
                
                    if (v[j]>v[j+1]){
                        contadorTrocas++;
                        troca(v,j,j+1);
                        flag = true;
                    }
                }   
        }
    }
    
    static Integer[] gerarVetor(int n, int max){
        Random rand = new Random();
        Integer[] vetor = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            vetor[i] = rand.nextInt(max);
        }
        
        return vetor;
        
    }
    
    static void mostrarVetor (Integer[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.printf(""+v[i]+"-");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        //Integer[]  meuVetor = gerarVetor(10,100);
        Integer[]  meuVetor = {1,2,3,4,5,6,7,8,9,10};
        //Integer[]  meuVetor = {2,1,5,9,10,11,12,15,14,13};
        
        System.out.println("Vetor Gerado:");
        mostrarVetor(meuVetor);
        bSort(meuVetor, meuVetor.length);
        System.out.println("Vetor Ordenado:");
        mostrarVetor(meuVetor);
        
        System.out.println("Quantidade de comparações"+contadorComparacoes);
        System.out.println("Quantidade de trocas"+contadorTrocas);
        
        
    }
}
