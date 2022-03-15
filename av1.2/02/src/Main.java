public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        pedido1.setDescricao("Descrição 1");
        pedido1.setData("12/03");

        Produto produto1 = new Produto();
        produto1.setNome("Produto 1");
        produto1.setPreco(15);

        ItensDoPedido itensDoPedido1 = new ItensDoPedido();
        itensDoPedido1.setProduto(produto1);
        itensDoPedido1.setQuantidade(2);

        pedido1.setItensDoPedido(itensDoPedido1);

        double total = produto1.getPreco() * itensDoPedido1.getQuantidade();

        pedido1.setTotal(total);

        System.out.println(pedido1);
    }
}
