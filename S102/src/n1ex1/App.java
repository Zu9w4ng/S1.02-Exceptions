package n1ex1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        //venda amb productes
        Producte galetes = new Producte("galetes", 1.5);
        Producte xocolata = new Producte("xocolata", 2);
        ArrayList<Producte> llistaCompra2 = new ArrayList<Producte>();
        llistaCompra2.add(galetes);
        llistaCompra2.add(xocolata);
        Venda venda2 = new Venda(llistaCompra2);
        System.out.println(venda2.calcularTotal());

        //venda sense productes
        ArrayList<Producte> llistaCompra = new ArrayList<Producte>();
        Venda venda = new Venda(llistaCompra);
        System.out.println(venda.calcularTotal());
        
    }
}
