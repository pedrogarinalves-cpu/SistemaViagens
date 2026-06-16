public class Viagem{
    private int custo;
    private String país;
    private int dias;

    public Viagem(int custo, String país, int dias) {
        this.custo = custo;
        this.país = país;
        this.dias = dias;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }


    public String toString() {
        return "Viagem{" +
                "custo=" + custo +
                ", país='" + país + '\'' +
                ", dias=" + dias +
                '}';
    }

    public void Pacotes(){

        switch (3){
            case 0:
                System.out.println("Pacote frances!!");
                this.dias = 7;
                this.país = "França";
                this.custo = 1500;

                break;

            case 1:
                System.out.println("Pacote verao no RIO!!!");
                this.país = "Brasil";
                this.dias = 7;
                this.custo = 985;

                break;

            case 2:
                System.out.println("pacote Inverno canadense!!");
               this.custo = 1000;
               this.dias = 12;
               this.país = "canada";

               break;

        }


    }
}