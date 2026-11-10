import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadedefuncionario;
    private double salariobasefuncionario;
    private Endereco endereco;
    private Data datadefundacao;
    private Produto[] estoqueProdutos;



//construtores
    public Loja (String  nome, int quantidadedefuncionario, double salariobasefuncionario, Endereco endereco, Data datadefundacao, int maxProdutos){
        this.nome = nome;
        this.quantidadedefuncionario = quantidadedefuncionario;
        this.salariobasefuncionario = salariobasefuncionario;
        this.endereco = endereco;
        this.datadefundacao = datadefundacao; 
        this.estoqueProdutos = new Produto[maxProdutos];
    
    }
    public Loja (String nome, int quantidadedefuncionario, Endereco endereco, Data datadefundacao, int maxProdutos){
        this(nome, quantidadedefuncionario, -1, endereco, datadefundacao, maxProdutos);// indica que o salário base não foi informado
    }

    public Loja(String nome, int quantidadedefuncionario, int maxProdutos) {
        this(nome, quantidadedefuncionario, -1, null, null, maxProdutos);
    }

    //Métodos get e set
    public String getNome(){
        return nome; 
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public int getQuantidadeFuncionarios(){
        return quantidadedefuncionario; 
    }

    public void setQuantidadeFuncionarios(int quantidadedefuncionario){
        this.quantidadedefuncionario = quantidadedefuncionario;
    }
    
    public double getSalarioBaseFuncionario(){
        return salariobasefuncionario; 
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salariobasefuncionario = salarioBaseFuncionario; 
    }

    public Endereco getEndereco (){
        return endereco;
    }

    public void setEndereco (Endereco endereco){
        this.endereco = endereco;
    }

    public Data getDataFundacao(){
         return datadefundacao;
    }

    public void setDataFundacao( Data datadefundacao){
        this.datadefundacao = datadefundacao;
    }

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    public void setEstoqueProdutos (Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }

//método toString

 @Override
    public String toString() {
    return "Loja{" +
            "nome='" + nome + '\'' +
            ", quantidadeFuncionarios=" + quantidadedefuncionario +
            ", salarioBaseFuncionario=" + salariobasefuncionario +
            ", endereco=" + endereco +
            ", datadefundacao=" + datadefundacao +
            ", estoqueProdutos=" + Arrays.toString(estoqueProdutos) +
            '}';
        }

        //método gasto com salário
          public double gastosComSalario() {  
        if (salariobasefuncionario == -1) { 
            return -1; 
        } else {
            return quantidadedefuncionario * salariobasefuncionario; 
        }
}

//Método que retorna ‘P’, caso a loja possua menos de 10 
//funcionários; ‘M’, caso a loja possua entre 10 (inclusive) e 30 (inclusive) 
//funcionários; ou ‘G’, caso a loja possua mais do que 31 (inclusive)
//funcionários.
    public char tamanhoDaLoja(){
    if (quantidadedefuncionario < 10){
        return 'P';
    } else if (quantidadedefuncionario >= 10 && quantidadedefuncionario <= 30 ){
        return 'M';
    } else { 
        return 'G'; 
    }

    }

//Método que imprime informações sobre todos os produtos da loja
    public void imprimeProdutos (){
        System.out.println("Produtos da Loja" + nome + ":"); 
            if (estoqueProdutos != null) {  
                for (Produto produto : estoqueProdutos){ 
                    if (produto != null){ 
                        System.out.println (produto);
                    }
                }

            } else {
                System.out.println("Nenhum produto disponível."); 
            }
    }

    // Método para inserir produtos no estoque
    public boolean insereProduto(Produto novoProduto){
        if (estoqueProdutos == null){
            return false; 
        }
        for (int i = 0; i < estoqueProdutos.length; i++){ 
            if (estoqueProdutos[i] == null){ 
                estoqueProdutos[i] = novoProduto;
                return true; 
            }
        }
        return false; 
    }
// Método para remover um produto do estoque 
public boolean removeProduto(String nomeProduto) {
        if (estoqueProdutos != null) {
            for (int i = 0; i < estoqueProdutos.length; i++) {
                if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                    estoqueProdutos[i] = null;
                    return true; 
        }
    }
    
}
return false;

}
}
