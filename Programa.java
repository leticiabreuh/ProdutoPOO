import java.util.Locale;
import java.util.Scanner;

public class Programa{
    public static void main(String[] args){
         Locale.setDefault(new Locale("pt", "BR"));
         Scanner scanner = new Scanner(System.in);
        
        //Criando o produto
         Produto produto1 = new Produto();

        //Cadastro o produto 1
         System.out.println("Entre com os dados do Produto:");
         System.out.println("Nome: ");
         produto1.nome = scanner.nextLine();
         System.out.println("Preco");
         produto1.preco= scanner.nextDouble();
         System.out.println("Quantidade: ");
         produto1.quantidade=scanner.nextInt();

        //Mostrar mensagem
        System.out.println(produto1.mensagem());

        //Adicionar estoque
        System.out.println("Entre com o numero de produtos para adicionar no estoque: ");
        int estoque = scanner.nextInt();
        produto1.AdicionarProduto(estoque);

        //Mostrar mensagem
        System.out.printf("Eentre com numero de produtos para remover do estoque: ");
        estoque = scanner.nextInt();
        produto1.RemoveProduto(estoque);

        //Mostrar mensagem
        System.out.println(produto1.mensagem()); 


    }
}