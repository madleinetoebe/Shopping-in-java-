public class Bijuteria extends Loja {
    private double metaVendas;
    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int capacidadeEstoqueProdutos) {
super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoqueProdutos);
this.metaVendas = metaVendas;
}
//  Criando metodo get and set

    public double getMetaVendas(){
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

// método tostring
@Override
public String toString() {
    return "Bijuteria{" +
            "nome='" + getNome() + '\'' +
            ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
            ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
            ", endereco=" + getEndereco() +
            ", dataFundacao=" + getDataFundacao() +
            ", metaVendas=" + metaVendas +
            '}';
}

}
