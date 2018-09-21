package mainnn;

import static com.sun.org.apache.bcel.internal.Repository.instanceOf;
import java.util.ArrayList;
import java.util.Calendar;
import static mainnn.BDBanco.BD;

public abstract class Conta implements IConta {
    private static int contador = 1;
    private int idConta;
    private int idAgencia;
    private double saldo;
    
    ArrayList<Titular> titulares = new ArrayList<Titular>();
    ArrayList<String> extrato = new ArrayList<String>();
   
    public Conta(int idAgencia,double saldo,ArrayList<Titular> titulares) {
        setAgencia(idAgencia);
        setTitular(titulares); // alterar criar um setTitulares pq precisa passar por condições
        setSaldo(saldo);
        setConta();
        contador++;
    }
    
    private void setConta(){
        this.idConta = contador;
    }
    
    public int getConta(){
        return idConta;
    }
    
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    private void setAgencia(int ag){
        if(ag <=0 || ag>100000){
            throw new RuntimeException("Erro! Agência não pode ser maior ou igual a zero ou maior que mil");
        }
        idAgencia= ag;
    }
    
    public int getAgencia(){
        return idAgencia;
    }
    
    @Override
    public boolean deposita(double deposito) {
        setSaldo(getSaldo() + deposito);
        this.adicionarExtrato("Depósito de R$" + deposito);
        return true;
    }
      
    void adicionarExtrato(String ex){ // recebe uma String
        Calendar horario = Calendar.getInstance(); // pega uma instancia do horario agora
        ex += "ás " + horario.getTime() +"\n"; // faz uma alteração na String recebida por parametro
        
        if(this.extrato.size() >= 10){ // se o extrato for maior ou igual a 10
            this.extrato.remove(0); // removo o mais velho
        } 
        this.extrato.add(ex);
    }
    
    public ArrayList<String> ExtratoConta(){
        return this.extrato;
    }
    
    @Override
    public String toString() {
        return "Conta{" + "idConta=" + idConta + ", idAgencia=" + idAgencia + ", saldo=" + saldo + ", titulares=" + titulares + '}';
    }
    
    public void setTitular(ArrayList<Titular> titulares){
        if(titulares.size() <= 0 || titulares == null){
            throw new RuntimeException("Titular não pode ser nulo.");
        } else {
            this.titulares = titulares;
        }
    }
    
    public static boolean verificar(int ag, int conta){
         for(Conta p: BD){
            if(p.getAgencia() == ag){ // se a agente for igual
                if(p.getConta() == conta){ // se a conta for igual
                    return true;
                }
    
            }
        } // for
         return false;
    }
}
