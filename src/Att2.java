import java.util.Scanner;

public class Att2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont0 = 0;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o produto que você quer");
                ler = new Scanner(System.in);
                matriz[i][j] = ler.nextInt();
                try{
                switch (matriz[i][j]) {
                    case 1:
                        cont1 += 1;
                        break;
                    case 2:
                        cont2 += 1;
                        break;
                    case 3:
                        cont3 += 1;
                        break;
                    case 4:
                        cont4 += 1;
                        break;
                    case 5:
                        cont5 += 1;
                        break;
                    case 0:
                        cont0 += 1;
                        break;
                }
                    }catch (Exception e){}

                }
            }
        System.out.println("O programa acabou");
        System.out.println("Os xampus são " + cont1);
        System.out.println("Os condicionador são " + cont2);
        System.out.println("Os hidratante são " + cont3);
        System.out.println("Os tintura são " + cont4);
        System.out.println("Os demaquilante são " + cont5);
        System.out.println("Os vazios são " + cont0);
        System.out.println("fim");
        }
    }

