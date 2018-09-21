package mainnn;

public interface IConta {
    boolean saca(double saque);
    boolean deposita(double deposito);
    boolean transfere(int ag, int conta, double dinheiro);
}
