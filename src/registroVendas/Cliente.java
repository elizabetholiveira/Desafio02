package registroVendas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    //Clientes identificados pelo nome
    private List<String> clientes = new ArrayList<>();

    //Cadastrar cliente
    public void cadastrarCliente(String nomeCliente){
        clientes.add(nomeCliente);
    }

    //Ver clientes cadastrados
    public void verClientes(){
        for (int i = 0; i < clientes.size(); i++){
            System.out.println(clientes.get(i));
        }
    }
    public boolean identificarCliente(String nomeClienteVenda){
        boolean clienteEncontrado = false;
        for (String nome : clientes) {
            if (nome.equalsIgnoreCase(nomeClienteVenda)) {
                return true;
            }
        }
        return false;
    }
}
