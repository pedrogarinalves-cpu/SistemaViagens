public class Cliente extends Pessoa {
private boolean credito;
private int saldo;

    public Cliente(String nome, int idade, int CPF, int saldo) {
        super(nome, idade, CPF);
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
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
        if (getIdade() >= 18){
            System.out.println("Permissão concedida");
        }else {
            System.out.println("menor de idade, permissão negada.");
        }
    }

       @Override
    public void CreditoSuficiente() {
        super.CreditoSuficiente();
      if (saldo >= 1500){
          credito = true;
          System.out.println("credito suficiente");
        }else {
          credito = false;
          System.out.println("insuficiente");
      }

    }

}
