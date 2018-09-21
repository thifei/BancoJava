package mainnn;

import java.util.ArrayList;

public class Mainnn {

    public static void main(String[] args) {
        BDBanco banco = new BDBanco();
        BDBanco.verContas();
        System.out.println(BDBanco.BD.get(0).saca(135));
        System.out.println(BDBanco.BD.get(1).saca(1000));
        System.out.println("a");
        
    }
}
