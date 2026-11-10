public class Data {
    private int dia;
    private int mes;
    private int ano;

    // construtores
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Alterando data para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Métodos de acesso
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validaData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Data inválida. Não foi possível alterar o dia.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validaData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Data inválida. Não foi possível alterar o mês.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validaData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Não foi possível alterar o ano.");
        }
    }

    // Método toString
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    // Método verifica ano bissexto
    private static final int[] diasNoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public boolean verificaAnoBissexto() {
        int[] diasNoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verifica se o ano é bissexto
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            diasNoMes[2] = 29;
        }

        return dia <= diasNoMes[mes];
    }

    // Método privado para validar a data
    private boolean validaData(int dia, int mes, int ano) {
        return ano > 0 && mes > 0 && mes <= 12 && dia > 0 && dia <= diasNoMes[mes];
    }
}
