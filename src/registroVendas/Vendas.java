package registroVendas;

import java.math.BigDecimal;

public class Vendas {

    private String[] vendedorResponsávelVenda;
    private String[] clienteVenda;
    private BigDecimal[] valorVenda;
    private String[] dataVenda;

    public String[] getVendedorResponsávelVenda() {
        return vendedorResponsávelVenda;
    }

    public void setVendedorResponsávelVenda(String[] vendedorResponsávelVenda) {
        this.vendedorResponsávelVenda = vendedorResponsávelVenda;
    }

    public String[] getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(String[] clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public BigDecimal[] getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal[] valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String[] getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String[] dataVenda) {
        this.dataVenda = dataVenda;
    }
}
