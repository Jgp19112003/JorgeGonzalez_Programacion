import Examen.*;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {


        Restaurante<Restaurante.PedidoComida> restaurantecomida = new Restaurante("R1");
        Restaurante.PedidoComida p1 = restaurantecomida.new PedidoComida(2,2,TipoComida.Bocadillo);
        Restaurante.PedidoComida p11 = restaurantecomida.new PedidoComida(4,2,TipoComida.Menú);
        restaurantecomida.registrarPedido(p1);
        p1.verFactura();
        p1.calcularPrecio();
        restaurantecomida.registrarPedido(p11);
        p11.verFactura();
        p11.calcularPrecio();
        restaurantecomida.verPedidos();

        Restaurante<Restaurante.ConsumicionBarra> restaurantebarra = new Restaurante("R2");
        Restaurante.ConsumicionBarra c1 = restaurantebarra.new ConsumicionBarra(4,2,TipoBebidas.Referescos);
        Restaurante.ConsumicionBarra c11 = restaurantebarra.new ConsumicionBarra(2,5,TipoBebidas.Cervezas);
        restaurantebarra.registrarPedido(c1);
        c1.verFactura();
        c1.calcularPrecio();
        restaurantebarra.registrarPedido(c11);
        c11.verFactura();
        c11.calcularPrecio();

        Restaurante<Consumibles> restaurantegenerico = new Restaurante("R3");
        Restaurante.PedidoComida p2 = restaurantegenerico.new PedidoComida(1,1,TipoComida.Raciones);
        restaurantecomida.registrarPedido(p2);
        Restaurante.ConsumicionBarra c2 = restaurantegenerico.new ConsumicionBarra(1,1,TipoBebidas.Cervezas);
        restaurantegenerico.registrarPedido(c2);
        p2.verFactura();
        c2.verFactura();
        p2.calcularPrecio();
        c2.calcularPrecio();


        /**/





    }
}
