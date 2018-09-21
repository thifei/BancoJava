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

    @Override // se for usar esse tranfere é igual ao da conta simples, ai colocamos na CLASSE PAI e mandamos um overrride na conta especial pq tem limite la
    public boolean transfere(Conta c,double dinheiro){
        if(this.getSaldo() >= dinheiro && dinheiro < 20000 && dinheiro > 0){
            this.setSaldo(getSaldo() - dinheiro);
            c.setSaldo(c.getSaldo() + dinheiro);
            
            this.adicionarExtrato("Transferência de R$" + dinheiro +" para Conta: " + c.getAgencia() + " " + c.getConta() + " Titulares: " + c.titulares);
            c.adicionarExtrato("Recebeu R$" + dinheiro + " da Conta: " + this.getAgencia() + " " + this.getConta() + " Titulares" + this.titulares);
            return true;
        } else {
            return false;
        }
    }
    
    
    
}
