import java.util.Random;
import java.util.Scanner;

public class Vect07 {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    
    public static void preencherVetorAleatorio(int[] v, int n){
        for(int i=0; i<n; i++){
            v[i] = rand.nextInt(100);

        }
    }

    public static void contarNegativo(int[]v, int n){
        boolean negativo = false;
        int contando = 0;
        for(int i=0; i<n; i++){
            if(v[i]<0){
                contando ++;
                negativo = true;
            }  
        }
        if(!negativo){
            System.out.print("não existem valores negativos");   
        }
        else{
            System.out.println(" a quantidade de núemros negativos é " + contando);
        }
        
    }















    public static void main(String[]args){
        int[] vetor = new int[100];
        preencherVetorAleatorio(vetor, 100);
        imprimirVetor(vetor, 100);
        contarNegativo(vetor, 100);
    }
}