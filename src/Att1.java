import com.sun.tools.javac.Main;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class Att1 {
    public static void main(String[] args)throws IOException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo ao programa!");
        Path arquivo = Paths.get("C:/Users/12115838/Downloads/Lista_URL.txt");
        List<String> listaLink = Files.readAllLines(arquivo);
        for (String linha : listaLink){
            System.out.println(linha);
        }
        try{
            System.out.println("Digite o link que você quer excluir");
            String saida = ler.nextLine();
            for (String linha : listaLink){
                if (linha.equals(saida)){
                    listaLink.remove(linha);

                }
            }
        }catch (Exception e){
        }

        System.out.println(listaLink.size());

        for (String linha : listaLink){
            System.out.println(linha);
        }
        System.out.println("Dgite algum link para ser procurado");
        String busca = ler.nextLine();
        boolean verificado = false;
        for (String linha : listaLink){
            if (linha.equals(busca)){
                verificado = true;
            }
        }
        if (verificado == true){
            System.out.println("Link encontrado");
        }else {
            System.out.println("Link não encontrado");
        }
    }

}
