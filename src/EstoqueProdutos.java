import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoque.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoque);
    }

    public double caculaValorTotalEstoque(){
        double total = 0;
        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                total += p.getQuantidade() * p.getPreco();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro(){
        Produto prodMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        
        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if (p.getPreco() > maiorPreco) {
                    prodMaisCaro = p;
                }
            }
        }

        return prodMaisCaro;
    }
    
}
