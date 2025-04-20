import java.util.Scanner;

public class Condi04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int duracao;
        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();
        System.out.print("Digite a hora final do jogo ");
        int horaFinal = sc.nextInt();
        

        if(horaFinal > horaInicial) {
           duracao = horaFinal - horaInicial; 
           System.out.print("a duração é " + duracao);
        } 
        else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.print("a duração do jogo foi " + duracao);
        } 

    }
}
