import java.util.Scanner;

public class Condi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        if( n %2 !=0){
             System.out.println("Número impar");
        }
        else {
            System.out.println("Número par");
        }
        sc.close();

    }
    
}
