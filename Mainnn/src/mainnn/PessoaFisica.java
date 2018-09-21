package mainnn;

public class PessoaFisica extends Titular{
    String cpf;
    
    public PessoaFisica(String e, String n,String senha, String c){
        super(e, n,senha);
        setCpf(c);
    }
    
    private void setCpf(String c){
        if(c == null || c.trim().length()< 11){
            throw new RuntimeException("Erro! CPF digitado não existe.");
        }
        cpf = c;
    }
}
