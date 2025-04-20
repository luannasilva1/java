import java.util.Scanner;
    public class Condicional {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            double n = sc.nextDouble();

            if (n < 0 ) {
                System.out.println("Número negativo");
            }
            else {
                System.out.println("Número positivo");
            } 
        
            sc.close();
        }

    }
