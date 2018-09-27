package mainnn;

import java.util.ArrayList;

public class ContaCorrenteSimples extends Conta {

    public ContaCorrenteSimples(int idAgencia, double saldo,ArrayList<Titular> titulares) {
        super(idAgencia,saldo, titulares);
    }

    
    public boolean saca(double saque) {
        if(saque > getSaldo()){
            return false;
        } else {
          setSaldo(getSaldo()- saque);
            if(CaixaT.sacaNotas(saque).equals("Falha no saque")){ // se der isso é pq nao tem notas
                return false;
             }
          System.out.println(CaixaT.sacaNotas(saque));
          this.adicionarExtrato("Saque de R$" + saque);
          return true;  
        }
       }
} 

