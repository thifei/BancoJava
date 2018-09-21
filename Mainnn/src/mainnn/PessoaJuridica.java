package mainnn;

public class PessoaJuridica extends Titular {
    String cnpj, razaoSocial;

    public PessoaJuridica(String e, String n,String senha, String cnpj, String razaoSocial) {
        super(e, n,senha);
        setCnpj(cnpj);
        setRazaoSocial(razaoSocial);
    }
    

    private void setCnpj(String c) {
        if(c == null || c.trim().length()< 14){
            throw new RuntimeException("Erro! CNPJ não existente.");
        }
        this.cnpj = c;
    }

    private void setRazaoSocial(String r) {
        if(r==null || r.trim().length()==0){
            throw new RuntimeException("Erro! Razão Social não pode ser nula.");
        }
        this.razaoSocial = r;
    }
    
}
