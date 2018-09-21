package mainnn;

import java.util.ArrayList;

public class ContaCorrenteSimples extends Conta {

    public ContaCorrenteSimples(int idAgencia, double saldo,ArrayList<Titular> titulares) {
        super(idAgencia,saldo, titulares);
    }

    @Override
    public boolean saca(double saque) {
        if(saque > getSaldo()){
            return false;
        } else {
            setSaldo(getSaldo() - saque);
            this.adicionarExtrato("Saque de R$" + saque);
            return true;
        }
    }
    
    @Override
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
