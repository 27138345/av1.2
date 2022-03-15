public class Pedido {
    private String descricao;
    private String data;
    private double total;
    private ItensDoPedido itensDoPedido;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public ItensDoPedido getItensDoPedido() {
        return itensDoPedido;
    }
    public void setItensDoPedido(ItensDoPedido itensDoPedido) {
        this.itensDoPedido = itensDoPedido;
    }

    @Override
    public String toString() {
        return "Pedido: " +
                "\nDescricao: " + descricao +
                "\nData: " + data +
                "\nTotal: " + total +
                "\nItens Do Pedido: " + itensDoPedido;
    }
}
