package registroVendas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vendas {

    private List<String> vendedorResponsávelVenda = new ArrayList<>();
    private List<String> clienteVenda = new ArrayList<>();
    private List<BigDecimal> valorVenda = new ArrayList<>();
    private List<LocalDate> dataVenda = new ArrayList<>();

    public void registrarVenda (String vendedor, String cliente, BigDecimal valor, LocalDate data){
        this.vendedorResponsávelVenda.add(vendedor);
        this.clienteVenda.add(cliente);
        this.valorVenda.add(valor);
        this.dataVenda.add(data);

        System.out.println();
        System.out.println("----------");
        System.out.println("Dados da venda:");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Cliente: " + cliente);
        System.out.printf("Valor: R$ %,.2f%n", valor);
        System.out.println("Data da venda: " + data);
        System.out.println("----------");
        System.out.println();
    }

    public void listarVendas(){
        for (int i = 0; i < vendedorResponsávelVenda.size(); i++) {
            System.out.println();
            System.out.println("----------");
            System.out.println("Dados da venda:");
            System.out.println("Vendedor: " + vendedorResponsávelVenda.get(i));
            System.out.println("Cliente: " + clienteVenda.get(i));
            System.out.printf("Valor: R$ %,.2f%n", valorVenda.get(i));
            System.out.println("Data da venda: " + dataVenda.get(i));
            System.out.println("----------");
            System.out.println();
        }
    }
}
