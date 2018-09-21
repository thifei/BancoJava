package mainnn;

public class CaixaT {
    
    static int notas100 = 1;
    static int notas50 = 200;
    static int notas20 = 200;
    static int notas10 = 100;
    static int notas5 = 100;
    
    public static String sacaNotas(double valor){
        int quantidade100 = 0;
        int quantidade50 = 0;
        int quantidade20 = 0;
        int quantidade10 = 0;
        int quantidade5 = 0;
        if(valor >= 100){
            while(notas100 >= 0 && valor/100 >= 1){
                notas100 = notas100 - 1;
                valor = valor - 100;
                quantidade100++;
            }
        }
        if(valor >= 50){
            while(notas50 >= 0 && valor/50 >= 1){
                notas50 = notas50 - 1;
                valor = valor - 50;
                quantidade50++;
            }
        }

        if(valor>=20){
            while(notas20 >=1 && valor/20 >= 1){
                notas20 = notas20 - 1;
                valor = valor - 20;
                quantidade20++;
            }
        }
        
        if(valor>=10){
            while(notas10 >=1 && valor/10 >= 1){
                notas10 = notas10 - 1;
                valor = valor - 10;
                quantidade10++;
            }
        }  
        if(valor>=5){
          while(notas5 >= 1 && valor/5 >= 1){
                notas5 = notas5 - 1;
                valor = valor - 5;
                quantidade5++;
            }
        }
       
        if((quantidade100 == 0 && quantidade50 == 0 && quantidade20 == 0 && quantidade10 == 0 && quantidade5 ==0) || valor!=0){
            notas100+= quantidade100;
            notas50+= quantidade50;
            notas20+= quantidade20;
            notas10+= quantidade10;
            return "Falha no saque";
        } 
        else {
            return "Notas de 100: " + quantidade100 + " -Notas de 50: " + quantidade50 + " -Notas de 20: " + quantidade20 +
                " -Notas de 10: " + quantidade10 + " -Notas de 5: " + quantidade5; 
        }        
    }
}
