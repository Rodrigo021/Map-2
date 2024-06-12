public class App {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos ep = new EstoqueProdutos();

        ep.exibirProdutos();

        ep.adicionarProduto(1, "p1", 10, 5);
        ep.adicionarProduto(2, "p2", 5, 10);
        ep.adicionarProduto(3, "p3", 2, 15);

        ep.exibirProdutos();

        System.out.println("valor total R$"+ep.caculaValorTotalEstoque());
        System.out.println(ep.obterProdutoMaisCaro());
    }
}
