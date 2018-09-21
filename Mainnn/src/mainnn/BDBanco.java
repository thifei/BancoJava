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
        
        ContaCorrenteEspecial CCE = new ContaCorrenteEspecial(100,200,1000,t);         
        ContaCorrenteSimples CCS = new ContaCorrenteSimples(6666,200,t1);
        Poupanca POUP = new Poupanca(150,t3,100,300);
        
        BD.add(CCE);
        BD.add(CCS);
        BD.add(POUP);
        
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
                                p.titulares.get(i).setChances(3);
                                return true; // retorna verdadeiro
                        }
                        else{
                            p.titulares.get(i).setChances();
                            return false;
                        }
                    }  
                }
            }
        } // for each
        return false; // se nao achar a conta com os dados batendo, retorna falso
    }
    
}

