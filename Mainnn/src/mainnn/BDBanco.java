package mainnn;

import java.util.ArrayList;

public class BDBanco {
    
    public BDBanco(){
        BDBanco.carregarBD();
    }
    
    static ArrayList<Conta> BD = new ArrayList<Conta>(); // array list que é o "BD"
    static String ativo;
   
    public static void carregarBD(){
        ArrayList <Titular> t1 = new ArrayList<Titular>();
        ArrayList <Titular> t = new ArrayList<Titular>();
        ArrayList <Titular> t3 = new ArrayList<Titular>();
        
        Titular n = new Titular("Eliza Marques" ,"Chrigor","123456");
        Titular n2 = new Titular("nada" ,"Mineirin","250313");
        Titular n3 = new Titular("Algum Lugar","Japa","654321");
        Titular n1 = new Titular("Joao Benedito" ,"Thiagueiro","333333");
        Titular n4 = new Titular("Jundiai","Amanda","256595");
        
        t.add(n2);
        t.add(n4);
        
        t3.add(n);
        
        t1.add(n1);
        t1.add(n3);
        
        ContaCorrenteEspecial CCE = new ContaCorrenteEspecial(100,2000,1000,t);  //construtor (double limite, int idAgencia,double saldo,ArrayList<Titular> titular)       
        ContaCorrenteSimples CCS = new ContaCorrenteSimples(6666,20000,t1); //construtor (int idAgencia, double saldo,ArrayList<Titular> titulares)
        Poupanca POUP = new Poupanca(1500,t3,100,300); //construtor (int idAgencia, ArrayList<Titular> titulares, double credito, double saldo)
        
        BD.add(CCE);
        BD.add(CCS);
        BD.add(POUP);
        
        CCS.saca(100);
        CCS.saca(200);
        CCS.deposita(1000);
        CCS.saca(300);
        CCS.deposita(1000);
        CCS.saca(100);
        CCS.saca(200);
        CCS.deposita(1000);
        CCS.saca(300);
        CCS.deposita(1000);
        
    }
    
    public static void verContas(){
        for(Conta p: BD){
            System.out.println(p);
        }
    }
    
    public static boolean logar(int ag, int conta, String senha){
        for(Conta p: BD){
            if(p.getAgencia() == ag){ // se a agente for igual
                if(p.getConta() == conta){ // se a conta for igual
                    for(int i = 0; i < p.titulares.size(); ++i){ // verifica a senha entre o array list de titulares
                        if(senha.equals(p.titulares.get(i).getSenha())){ // se a senha for igual a alguma senha dele
                            ativo = p.titulares.get(i).getNome();
                            if(p.titulares.get(i).getBloqueio()==false){
                                p.titulares.get(i).setChances(3);
                                return true; // retorna verdadeiro
                            }
                        }
                        else{
                            p.titulares.get(i).setChances();
                            if(p.titulares.get(i).getBloqueio()==true)
                                System.out.println("Conta bloqueada");
                        }
                    }  
                }
            }
        } // for each
        return false; // se nao achar a conta com os dados batendo, retorna falso
    }
    
}

