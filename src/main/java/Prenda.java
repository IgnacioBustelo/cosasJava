import java.util.ArrayList;
import java.util.List;


public class Prenda {
    int precioBase;
    String tipoDePrenda;
    Estado estadoDePrenda;

    int precio(){

        return this.estadoDePrenda.calcularPrecio(this.precioBase);
    }

    }


