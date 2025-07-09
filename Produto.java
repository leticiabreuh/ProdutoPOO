public class  Produto{
    // //Atributos (caracteristicas e campos/variaveis)
    //public outras classes podem ter acesso a essa classe
    public String nome;
    public double preco;
    public int quantidade;

    //Metodos( ação e compotamento)
      
            //Metodos
            public double mensagem();
            String mensagem = "Peoduto: "+nome+", R$ "+preco+", "+quantidade+" unidade, Total: "+(preco*quantidade);

            //retorna valor em estoque
            public double TotalEmEstoque(){
                return preco * quantidade;
            }

            //void pois não tem retorno para função principal
            //envio a quantidade de numero q quero encrementar e ele adiciona ao anterior
            public void AdicionarProduto(int qtde){
            quantidade += qtde;
            }

            //ira remover um quatidade do estoque
            public void RemoveProduto(int qtde){
                quantidade -= qtde;
            }

    


}
