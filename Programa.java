import java.util.Locale;
import java.util.Scanner;

public class Programa{
    public static void main(String[] args){
         Locale.setDefault(new Locale("pt", "BR"));
         Scanner scanner = new Scanner(System.in);

            

            Produto produto1 = new Produto();

            produto1.nome='Tv';
            produto1.preco= 100;
            produto1.quantidade=30;

            System.out.println("Nome do produto: ");
            System.out.prinln("Preço do produto: ");
            System.out.println("Quantidade do produto em estoque: ");

    }
}