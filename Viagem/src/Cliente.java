public class Cliente extends Pessoa {
private boolean credito;

    public Cliente(String nome, int idade, int CPF) {
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
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
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

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    @Override
    public void Permissao() {
        super.Permissao();
    }

    @Override
    public void CreditoSuficiente() {
        super.CreditoSuficiente();
        if (isCredito() == true) {
            System.out.println("saldo suficiente");
        }else {
            System.out.println("saldo insuficiente");
        }

    }

}
