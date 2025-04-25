import java.util.Scanner;

public class Vetor06 {
    public static Scanner sc = new Scanner(System.in);

    public static void preencherVetor(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();

        }
    }

    public static void imprimirVetor(int[] v, int n) {
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
            if (i < n - 1) {
                System.out.print(",");
            }

        }
        System.out.println(" }");
    }

    public static void ordernar(int[] v, int n) {
        int aux;
        boolean trocou;
        for (int i = 0; i < n; i++) {
            trocou = false;
            for (int j = 0; j < n - 1; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    trocou = true;

                }
            }
            if (!trocou) {
                break;
            }
        }

    }

    public static void imprimirMaiorImpar(int[] v, int n) {
        int maiorImpar = -1;
        boolean encontrouImpar = false;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 != 0) {
                if (!encontrouImpar || v[i] > maiorImpar) {
                    maiorImpar = v[i];
                    encontrouImpar = true;
                }
            }
        }
        if (encontrouImpar) {
            System.out.println("encontrou maior impar é " + maiorImpar);
        } else {
            System.out.println("não encontrou número impar");
        }

    }
    
    public static void criarParesImpares(int[] v, int n, int[] pares, int[] impares) {
        int p = 0, im = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) {
             pares[p] = v[i]; // coloca o valor na posição atual do vetor de pares
             p = p + 1;        // aumenta p para a próxima posição
            }
            else {
                impares[im] = v[i]; // coloca no vetor de ímpares
                im = im + 1;        // aumenta o índice dos ímpares
                }
        }
        while (p < n) pares[p++] = -1;
        while (im < n) impares[im++] = -1;
    }


    public static double calcularMedia(int[] v, int n) {
        int soma = 0;

        if (n == 0) {
            return 0.0;
        }

        for (int i = 0; i < n; i++) {
            soma += v[i];
        }
        return (double) soma / (double) n;
    }
    
    public static void insercaoDireta(int[] v, int n) {
        int j;
        int chave;
        for (int i = 1; i <= n - 1; i++) {
            chave = v[i];
            j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }
    

    public static void contarParesImpares(int[] v, int n) {
        int pares = 0, impares = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0){
                pares++;
            }
            else{
                impares++;
            }    

        }
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }


    public static boolean verificarNumero(int[]v, int n, int numero){
        numero = sc.nextInt();
        for(int i=0; i<n; i++){
            if(v[i] == numero){
                return true;
            }
        }
        return false;
    }

    public static void verificarPresenca(int[] v, int n, int numero) {
        for (int i = 0; i < n; i++) {
            if (v[i] == numero) {
                System.out.println("O número está presente no vetor");
                return;
            }
        }
        System.out.println("O número não está presente no vetor");

    }


    

    
    public static void inverterVetor(int[] v, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = v[i];
            v[i] = v[n - 1 - i];
            v[n - 1 - i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] vetor = new int[5];
        preencherVetor(vetor, 5);
        imprimirVetor(vetor, 5);
        calcularMedia(vetor, 5);
       }

}
