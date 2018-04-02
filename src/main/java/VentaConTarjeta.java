class VentaConTarjeta extends Venta{
    int cantidadDeCuotas;
    int coeficienteDeTarjeta;
    double ganancia() {
        return super.ganancia()+
                cantidadDeCuotas*coeficienteDeTarjeta*
                        unaVenta.stream().mapToDouble(item->item.costo()*0.01).sum();
    }
}
