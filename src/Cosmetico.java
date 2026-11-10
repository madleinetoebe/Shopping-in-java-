public class Cosmetico extends Loja {
    private Double taxaComercializacao;

    // Construtor
    public Cosmetico(String nome, int quantidadedefuncionario, double salariobasefuncionario, Endereco endereco, Data datadefundacao, double taxaComercializacao, int capacidadeEstoqueProdutos) {
        super(nome, quantidadedefuncionario, salariobasefuncionario, endereco, datadefundacao, capacidadeEstoqueProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Métodos de acesso
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cosmetico{" +
                "nome='" + getNome() + '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
                ", endereco=" + getEndereco() +
                ", dataFundacao=" + getDataFundacao() +
                ", taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}
