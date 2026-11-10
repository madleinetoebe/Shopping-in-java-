public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja [] lojas; //Array de objetos do tipo Loja, representando as lojas presentes no shopping.

//Construtores
    public Shopping(String nome, Endereco endereco, int capacidadeLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

//Métodos get e set

    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }
    
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

//Método tostring

@Override
public String toString() {
    StringBuilder sb = new StringBuilder(); 
    sb.append("Shopping: ").append(nome).append("\n"); 
    sb.append("Endereço: ").append(endereco).append("\n");
    
    if (lojas != null) { 
        sb.append("Lojas:\n");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(loja).append("\n"); 
            }
        }
    } else {
        sb.append("Nenhuma loja cadastrada."); 
    }

    return sb.toString();
}

//método insere Loja

public boolean insereLoja(Loja novaLoja){  
    for (int i = 0; i < lojas.length; i++){ 
        if(lojas[i]== null){ 
            lojas[i] = novaLoja;
            return true; 
        }
    }
    return false; 
}

//Método remove loja 
public boolean removeLoja(String nomeLoja) { 
    for (int i = 0; i < lojas.length; i++) { 
        if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {  
            lojas[i] = null;
            return true; 
        }
    }
    return false; 
}

//Método quantidade de Lojas por tipo

public int quantidadeLojasPorTipo(String tipo) {
    int quantidade = 0;

    

    for (Loja loja : lojas) { 
        if (lojas.length > 0)  { 
            switch (tipo) { 
                case "Informática":
                    if (loja instanceof Informatica) {
                        quantidade++;
                    }
                    break;
                case "Cosmetico":
                    if (loja instanceof Cosmetico) { 
                        quantidade++;
                    }
                    break;
                case "Vestuario":
                    if (loja instanceof Vestuario) {
                        quantidade++;
                    }
                    break;
                case "Bijuteria":
                    if (loja instanceof Bijuteria) {
                        quantidade++;
                    }
                    break;
                case "Alimentacao":
                    if (loja instanceof Alimentacao) {
                        quantidade++;
                    }
                    break;
            }
        }
    }

    return (quantidade > 0) ? quantidade : -1; //Fecha o loop for-each.
}

//Metodo Seguro mais caro 

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaInformaticaMaisCara = null;
        double maiorSeguro = Double.MIN_VALUE; 
    
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) { 
                Informatica informatica = (Informatica) loja; 
                if (informatica.getSeguroEletronicos() > maiorSeguro) { 
                    maiorSeguro = informatica.getSeguroEletronicos();  
                    lojaInformaticaMaisCara = informatica;
                } 
            }
        }
    
        return lojaInformaticaMaisCara;
    } 
}