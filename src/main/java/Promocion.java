class Promocion implements Estado{
    int descuento;

    public int calcularPrecio(int precioBase){
        return precioBase-descuento;
    }
}
