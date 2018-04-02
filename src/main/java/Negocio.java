import java.util.ArrayList;
import java.util.List;

class Negocio{
    List<Venta> registroDeVentas = new ArrayList<>();

    Double gananciasDeUnaFecha(String fecha){
        return registroDeVentas.stream().filter(venta -> venta.getFecha()==fecha)
                .mapToDouble(venta->venta.ganancia()).sum();

    }

}
