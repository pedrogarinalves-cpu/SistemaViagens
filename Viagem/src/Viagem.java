public class Viagem{
    private int custo;
    private String email;

    public Viagem( int custo, String email) {
        this.custo = custo;
        this.email = email;

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

    @Override
    public String toString() {
        return "Viagem{" +
                 '\'' +
                ", custo=" + custo +
                ", email='" + email + '\'' +
                 +
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