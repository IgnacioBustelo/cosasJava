import java.util.ArrayList;
import java.util.List;

class Venta{
    List<Item> unaVenta= new ArrayList<>();

    public String getFecha() {
        return fecha;
    }

    String fecha;

    double ganancia(){
        return unaVenta.stream().mapToInt(item->item.costo()).sum();
    }
}
