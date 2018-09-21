package mainnn;

import java.util.ArrayList;

public class Poupanca extends Conta{
    private double credito; // implementar depois
    
    public Poupanca(int idAgencia, ArrayList<Titular> titulares, double credito, double saldo) {
        super(idAgencia,saldo,titulares);
        this.credito = credito; // retirar
    }

    @Override
    public boolean saca(double saque) {
        throw new UnsupportedOperationException("Not supported yet."); // implantar
    }

   
    
    
    
}
