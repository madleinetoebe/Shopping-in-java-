public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int capacidadeEstoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoqueProdutos);
        this.produtosImportados = produtosImportados;
    }

    // get and set

    public boolean getProdutosImportados (){
        return produtosImportados;
    }

    public void setProdutosImportados(Boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "nome='" + getNome()+ '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
                ", endereco=" + getEndereco() +
                ", datadefundacao=" + getDataFundacao() +
                ",produtosImportados=" + produtosImportados +
                '}';
}

}
