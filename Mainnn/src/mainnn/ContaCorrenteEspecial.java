package mainnn;

import java.util.ArrayList;

public class ContaCorrenteEspecial extends Conta{
    private double limite;

    public ContaCorrenteEspecial(double limite, int idAgencia,double saldo,ArrayList<Titular> titular) {
        super(idAgencia,saldo, titular);
        setLimite(limite);
    }
   
    @Override
    public boolean saca(double saque){
        if(saque > getSaldo() + getLimite()){
            return false;
        } else {
          setSaldo(getSaldo()- saque);
          this.adicionarExtrato("Saque de R$" + saque);
          return true;  
        }
    }
    
    public void setLimite(double limite){
        if(limite < 1000){
            this.limite = limite;
        } else {
            throw new RuntimeException("Excedeu limite: " + getLimite());
        }
    }
    
    public double getLimite(){
        return limite;
    }
    
    public boolean transfere(Conta c,double dinheiro){ // colocar lançamento de exceção pra verificar se a conta existe.
      if(c.verificar(c.getAgencia(), c.getConta())){ // -- MUDANÇA OUTRAS CLASS TBM
            if(this.getSaldo() + this.getLimite() >= dinheiro && dinheiro < 20000 && dinheiro > 0){
                this.setSaldo(getSaldo() - dinheiro);
                c.setSaldo(c.getSaldo() + dinheiro);
            
                this.adicionarExtrato("Transferência de R$" + dinheiro +" para Conta: " + c.getAgencia() + " " + c.getConta() +" Titulares: " + c.titulares);
                c.adicionarExtrato("Recebeu R$" + dinheiro + " da Conta: " + this.getAgencia() + " " + this.getConta() + " Titulares: " + this.titulares);
                return true;
            } 
        }
      return false;
    }

    @Override
    public String toString() {
         return super.toString() + "Limite = " + limite;
    }
    
    
}
