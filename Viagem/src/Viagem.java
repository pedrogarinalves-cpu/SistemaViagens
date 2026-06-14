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

    public void Pacotes(){

        switch (3){
            case 0:
                System.out.println("Pacote frances!!");
                String país = "França";
                int custo = 1200;
                int dias = 4;

                break;

            case 1:
                System.out.println("Pacote verao no RIO!!!");
                custo = 1500;
                país = "italia";
                dias = 7;

                break;

            case 2:
                System.out.println("pacote Inverno canadense!!");
                país = "canada";
                custo = 2000;
                dias = 5;
        }

    }
}