# Shopping (Java)

Sistema de um shopping center feito em Java para praticar **programação orientada a objetos**: classes, encapsulamento, construtores sobrecarregados, herança, polimorfismo e arrays de objetos.

Projeto da disciplina de Laboratório I (Unisinos).

## O que o sistema modela

Um `Shopping` tem um endereço e um conjunto de lojas. Cada `Loja` tem funcionários, endereço, data de fundação e um estoque de produtos.

```
Shopping ── tem várias ──> Loja ── tem vários ──> Produto
                            │
                            ├── Alimentacao   (data do alvará)
                            ├── Bijuteria     (meta de vendas)
                            ├── Cosmetico     (taxa de comercialização)
                            ├── Informatica   (seguro dos eletrônicos)
                            └── Vestuario     (produtos importados ou não)

Endereco e Data são usadas por Shopping, Loja e Produto.
```

## Classes

| Classe | Papel |
| --- | --- |
| `Shopping` | Guarda as lojas em um array. Insere e remove lojas, conta lojas por tipo e encontra a loja de informática com o seguro mais caro. |
| `Loja` | Classe base. Calcula gastos com salário, classifica o tamanho da loja, insere, remove e lista produtos. Tem três construtores. |
| `Alimentacao`, `Bijuteria`, `Cosmetico`, `Informatica`, `Vestuario` | Tipos de loja que herdam de `Loja` e acrescentam um atributo próprio. |
| `Produto` | Nome, preço e data de validade. |
| `Endereco` | Rua, número, complemento, cidade, estado, país e CEP. |
| `Data` | Dia, mês e ano, com validação (inclusive dias de cada mês). |

## Como compilar

Precisa do JDK instalado. Na pasta do projeto:

```
javac -d out src/*.java
```

Os arquivos `.class` vão para a pasta `out`. O projeto tem apenas as classes do modelo e não tem uma classe `main`, então para ver tudo funcionando é preciso criar uma classe de teste que instancie um `Shopping` e algumas lojas.

## O que eu pratiquei

- Dividir um problema em classes com responsabilidades claras
- Herança e `instanceof` para tratar tipos diferentes de loja
- Validação de dados na própria classe (`Data`)
- Trabalhar com arrays de objetos
