import java.util.Scanner;

public class Att2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int cont1 , cont2, cont3, cont4,cont5,cont0;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o produto que você quer");
                matriz[i][j] = ler.nextInt();
                
            }
        }
    }
}
