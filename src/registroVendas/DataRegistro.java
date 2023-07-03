package registroVendas;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class DataRegistro {

    private LocalDate dataRegistroVenda;

    public LocalDate getDataRegistroVenda() {
        return dataRegistroVenda;
    }

    public void setDataRegistroVenda(LocalDate dataRegistroVenda) {
        this.dataRegistroVenda = dataRegistroVenda;
    }
}
