public class funcionarios extends Pessoa{
    private int salario;

    public funcionarios(String nome, int idade, int CPF) {
        super(nome, idade, CPF);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int  getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int  idade) {
        super.setIdade(idade);
    }

    @Override
    public int getCPF() {
        return super.getCPF();
    }

    @Override
    public void setCPF(int CPF) {
        super.setCPF(CPF);
    }

    @Override
    public void cargo() {
        super.cargo();
        if (getIdade() == 18) {
            System.out.println("junior ou estagiario");
            this.salario = 1200;
        } else if (getIdade() >= 25) {
            System.out.println("junior ou pleno");
            this.salario = 2500;
        }else if (getIdade() >= 27){
            System.out.println("pleno ou senior");
            this.salario = 4700;
        }else {
            System.out.println("senior");
            this.salario = 8000;
        }
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


}


