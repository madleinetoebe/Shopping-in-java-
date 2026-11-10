public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeDeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data dataDeFundacao, double seguroEletronicos, int capacidadeEstoqueProdutos) {
super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, capacidadeEstoqueProdutos);
this.seguroEletronicos = seguroEletronicos;
    
}

public Double getSeguroEletronicos(){
    return seguroEletronicos;
}

public void setSeguroEletronicos (double seguroEletronicos){
    this.seguroEletronicos = seguroEletronicos;
}

@Override
public String toString() {
    return "Informatica{" +
            "nome='" + getNome() + '\'' +
            ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
            ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
            ", endereco=" + getEndereco() +
            ", dataFundacao=" + getDataFundacao() +
            ", seguroEletronicos=" + seguroEletronicos +
            '}';
}
}
