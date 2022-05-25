package Examen;

import java.util.ArrayList;

public final class Restaurante <T>{

    private String nombre;
    private int num_comensales;
    private  double caja;
    private ArrayList<T> listaPedidos;
    private PedidoComida pedidoComida;
    private ConsumicionBarra consumicionBarra;
    LanzarEx lanzarEx = new LanzarEx();


    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.listaPedidos = new ArrayList<>();
    }

    public void colocarComensales(int comensales_introducidos){
        num_comensales += comensales_introducidos;

        try {
            if (num_comensales < 50){
                System.out.println("Comensales añadidos");
            }else {
                lanzarEx.lanzarMiExcepcion();
            }
        } catch (MiExcepcion miExcepcion) {
            System.out.println(miExcepcion.getMessage());
        }

    }

    public void verPedidos (){
    caja = 0;
        for (T item: listaPedidos) {
            if (((PedidoComida) item instanceof PedidoComida)){
              ((PedidoComida) item).verFactura();
              caja += ((PedidoComida) item).getPrecio();

            }else if (((ConsumicionBarra) item instanceof ConsumicionBarra)){
                ((ConsumicionBarra) item).verFactura();
                caja += ((ConsumicionBarra) item).getPrecio();
            }
        }
        System.out.printf("El precio total de la caja es: %.2f \n", caja);
    }

    public void registrarPedido(T pedido){

        listaPedidos.add(pedido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_comensales() {
        return num_comensales;
    }

    public void setNum_comensales(int num_comensales) {
        this.num_comensales = num_comensales;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public ArrayList<T> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<T> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public LanzarEx getLanzarEx() {
        return lanzarEx;
    }

    public void setLanzarEx(LanzarEx lanzarEx) {
        this.lanzarEx = lanzarEx;
    }

    public PedidoComida getPedidoComida() {
        return pedidoComida;
    }

    public void setPedidoComida(PedidoComida pedidoComida) {
        this.pedidoComida = pedidoComida;
    }

    public ConsumicionBarra getConsumicionBarra() {
        return consumicionBarra;
    }

    public void setConsumicionBarra(ConsumicionBarra consumicionBarra) {
        this.consumicionBarra = consumicionBarra;
    }


/*Clase PedidoComida*/
public final class PedidoComida extends Consumibles implements Constantes {

    private double precio;
    private int num_consumiciones;
    private TipoComida tipoComida;

    public PedidoComida(){}

    public PedidoComida(double precio, int num_consumiciones, TipoComida tipoComida) {
        this.precio = precio;
        this.num_consumiciones = num_consumiciones;
        this.tipoComida = tipoComida;
    }


    @Override
    public void calcularPrecio() {

        setPrecio(this.precio+(this.precio*Constantes.IVA_COMIDAS));
        System.out.println("El precio con IVA es de "+precio);
    }

    @Override
    public void verFactura() {
        System.out.println("Restaurante: "+ nombre);
        System.out.println("Consumiciones: "+num_consumiciones);
        System.out.println("Comida: "+tipoComida);
        System.out.println("Precio: "+precio);
        System.out.println("CIF: "+Constantes.CIF);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNum_consumiciones() {
        return num_consumiciones;
    }

    public void setNum_consumicioness(int num_consumicioness) {
        this.num_consumiciones= num_consumicioness;
    }

    public TipoComida getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
    }
}

    /*Clase ConsumicionBarra*/

    public final class ConsumicionBarra extends Consumibles implements Constantes {

        private double precio;
        private int num_consumiciones;
        private TipoBebidas tipoBebidas;

        public ConsumicionBarra(){}

        public ConsumicionBarra(double precio, int num_consumiciones, TipoBebidas tipoBebidas) {
            this.precio = precio;
            this.num_consumiciones = num_consumiciones;
            this.tipoBebidas = tipoBebidas;
        }

        @Override
        public void calcularPrecio() {
            setPrecio(this.precio+(this.precio*Constantes.IVA_BEBIDAS));
            System.out.println("El precio con IVA es de "+precio);
        }

        @Override
        public void verFactura() {
            System.out.println("Restaurante: "+ nombre);
            System.out.println("Consumiciones: "+num_consumiciones);
            System.out.println("Bebida: "+tipoBebidas);
            System.out.println("Precio: "+precio);
            System.out.println("CIF: "+Constantes.CIF);
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getNum_consumiciones() {
            return num_consumiciones;
        }

        public void setNum_consumiciones(int num_consumiciones) {
            this.num_consumiciones = num_consumiciones;
        }

        public TipoBebidas getTipoBebidas() {
            return tipoBebidas;
        }

        public void setTipoBebidas(TipoBebidas tipoBebidas) {
            this.tipoBebidas = tipoBebidas;
        }
    }


}



















