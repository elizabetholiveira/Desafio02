package registroVendas;

import java.util.ArrayList;
import java.util.List;

public class VendedorResponsavel {

    //Vendedores identificados pelo nome
    private List<String> vendedores = new ArrayList<>();

    //Cadastrar cliente
    public void cadastrarVendedor(String nomeVendedor){
        vendedores.add(nomeVendedor);
    }

    //Ver clientes cadastrados
    public void verVendedores(){
        for (int i = 0; i < vendedores.size(); i++){
            System.out.println(vendedores.get(i));
        }
    }

    public boolean identificarVendedor(String nomeVendedorVenda){
        boolean vendedorEncontrado = false;
        for (String nome : vendedores) {
            if (nome.equalsIgnoreCase(nomeVendedorVenda)) {
                return true;
            }
        }
        return false;
    }
}
