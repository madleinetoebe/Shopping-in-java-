
import java.time.LocalDate;

public class Produto {
        private String nome;
        private double preco;
        private Data datadevalidade;
    
        // construtores da classe produto
        public Produto(String nome, double preco, Data datadevalidade) {
            this.nome = nome;
            this.preco = preco;
            this.datadevalidade = datadevalidade;
        }
    
        // métodos de acesso
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public double getPreco(){
            return preco;
        }
    
        public void setPreco(double preco){
            this.preco = preco;
        }

        public Data getdatadevalidade(){
            return datadevalidade;
        }

        public void setDatadeValidade (Data datadevalidade){
            this.datadevalidade = datadevalidade;
        }

        // Método toString
        @Override
        public String toString() {
            return "Produto [nome=" + nome + ", preco=" + preco + ",datadevalidade=" + datadevalidade + "]";
        }
    
    // meétodo para obter a data de validade
    public Data getDataValidade() {
        return datadevalidade;
    }

    // método para definur a data de validade
    public void setDataValidade(Data datadevalidade) {
        this.datadevalidade = datadevalidade;
    }

    // Método para verificar se o produto está vencido em relação a uma data específica
    public boolean estaVencido(Data dataAtual) {
        LocalDate hoje = LocalDate.of(dataAtual.getAno(), dataAtual.getMes(), dataAtual.getDia());
        LocalDate validade = LocalDate.of(datadevalidade.getAno(), datadevalidade.getMes(), datadevalidade.getDia());

        return validade.isBefore(hoje);
    }
    }
    

