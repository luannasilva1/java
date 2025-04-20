import java.util.Scanner;

public class Condi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite números ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não multiplos");
        }


    }
    
}
