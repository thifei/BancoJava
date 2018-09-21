package mainnn;

public interface IConta {
    boolean saca(double saque);
    boolean deposita(double deposito);
    boolean transfere(Conta c, double dinheiro);
}
