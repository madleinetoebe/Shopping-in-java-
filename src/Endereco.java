public class Endereco {
    private String nomedarua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

//construtor 
    public Endereco(String nomedarua, String cidade, String estado, String pais, String cep, String numero, String complemento ){
        this.nomedarua = nomedarua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

//metodo de acesso

public String getNomeDaRua (){
    return nomedarua;
}

public void setNomeDaRua(String nomedarua){
    this.nomedarua = nomedarua;
}

public String getCidade(){
    return cidade;
}

public void setCidade(String cidade){
    this.cidade = cidade;
}

public String getEstado(){
    return estado;
}
public void setEstado(String estado){
    this.estado = estado;
}

public String getPais(){
    return pais;
}

public void setPais(String pais){
    this.pais = pais;
}

public String getCep(){
    return cep;
}

public void setCep(String cep){
    this.cep = cep;
}
public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
public String getComplemento(){
    return complemento;
}
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
//método to string
@Override
public String toString(){
    return "Endereco{" +
            "nomedarua='" + nomedarua + '\'' +
            ", cidade=" + cidade + '\'' +
            ", estado=" + estado + '\'' +
            ",pais=" + pais + '\'' +
            ",cep=" + cep + '\'' +
            ",numero=" + numero + '\'' +
            "complemento=" + complemento + '\'' +
            '}'; 

}
}
