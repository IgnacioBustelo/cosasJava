class Item{

    Prenda unaPrenda;
    int cantidad;

        int costo(){
        return this.unaPrenda.precio()*this.cantidad;
    }
}
