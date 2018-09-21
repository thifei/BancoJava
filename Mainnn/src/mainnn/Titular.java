package mainnn;

public class Titular {
    private String endereco, nome,senha;
    private boolean bloqueio= false;
    private int chances = 3;
    
    protected Titular(String e, String n, String senha){
        setEndereco(e);
        setNome(n);
        setSenha(senha);
    }

    private void setEndereco(String endereco) {
        if(endereco==null || endereco.trim().length()==0){
            throw new RuntimeException("Erro! Endereço não pode ser nulo.");
        }
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().length()==0){
            throw new RuntimeException("Erro! Nome não pode ser nulo.");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Titular{" + "endereco=" + endereco + ", nome=" + nome + " Senha: " + senha + '}';
    }
    
    public void setSenha(String senha){
        if(senha.isEmpty() || senha.length() != 6) {
            throw new RuntimeException("Senha não atende as condições.");
        } else {
            this.senha = senha;
        }
    }
    
    public String getSenha(){
        return senha;
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean getBloqueio(){
        return bloqueio;
    }
    
    public void setChances(){
        chances-=1;
        if(chances==0)
            bloqueio= true;
    }
    
    public void setChances(int i){
        chances= i;
    }
}
