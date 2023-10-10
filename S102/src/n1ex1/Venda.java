package n1ex1;

import java.util.ArrayList;

public class Venda {
    
    private ArrayList<Producte> llista;
    
    public Venda(ArrayList<Producte> llista) {
        this.llista = llista;
    }

    public double calcularTotal() throws VendaBuidaException {

        if(llista.size()==0) {
            throw new VendaBuidaException("per fer una venda has d'afegir productes");
        }
        else {
            double preuTotal = 0;
            for (Producte producte : llista) {
                preuTotal += producte.getPreu();
            }
            return preuTotal;
        }
    }
}
