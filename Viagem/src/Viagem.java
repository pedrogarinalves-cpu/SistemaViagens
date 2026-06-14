public class Viagem{
    private int custo;
    private String email;
    private int CPF;

    public Viagem( int custo, String email, int CPF) {
        this.custo = custo;
        this.email = email;
        this.CPF = CPF;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Viagem{" +
                 '\'' +
                ", custo=" + custo +
                ", email='" + email + '\'' +
                ", CPF=" + CPF +
                '}';
    }

    public void Pacotes(){
        
        switch (3){
            case 0:
                System.out.println("Pacote frances!!");
                String país = "França";
                int custo = 1200;

                break;

            case 1:
                System.out.println("Pacote verao no RIO!!!");
                custo = 1500;
                país = "italia";

                break;

            case 2:
                System.out.println("pacote Inverno canadense!!");
                país = "canada";
                custo = 2000;
        }

    }
}