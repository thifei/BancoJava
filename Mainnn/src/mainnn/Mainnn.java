package mainnn;

import java.util.ArrayList;

public class Mainnn {

    public static void main(String[] args) {
        BDBanco banco = new BDBanco();
        BDBanco.verContas();
        System.out.println(BDBanco.logar(200,1, "256591"));
        System.out.println(BDBanco.logar(200,1, "256592"));
        System.out.println(BDBanco.logar(200,1, "256595"));
        System.out.println(BDBanco.logar(6666,2,"333333"));
        
    }
}
