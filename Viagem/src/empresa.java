public class empresa extends Viagem {

    public empresa(int custo, String país, int dias) {
        super(custo, país, dias);
    }

    private String nomeEmpresa;
    private int Faturamento;
    private int numFuncionarios;
    private boolean nacional;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getFaturamento() {
        return Faturamento;
    }

    public void setFaturamento(int faturamento) {
        Faturamento = faturamento;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public void fama(){
        if ( Faturamento == 1500000 ){
            nacional = true;
            numFuncionarios = 2000;
        } else if (Faturamento == 20000000) {
            nacional = false;
            numFuncionarios = 4500;
        }else {
            nacional = true;
            numFuncionarios = 7000;

        }
    }

    @Override
    public String toString() {
        return "empresa{" +
                "nomeEmpresa='" + nomeEmpresa + '\'' +
                ", Faturamento=" + Faturamento +
                ", numFuncionarios=" + numFuncionarios +
                ", nacional=" + nacional +
                '}';
    }
}
