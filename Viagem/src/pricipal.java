public class pricipal {
    static void main(String[] args) {

Pessoa C1 = new Cliente("maria", 19, 1337900, 1500);
Pessoa C2 = new Cliente("Jp", 22, 8382803, 2000);
Pessoa C3 = new Cliente("marco", 17, 98269303, 750 );
Pessoa C4 = new Cliente("Dimarco", 37, 628930284, 0);

        System.out.println(C1);
C1.Permissao();
C1.CreditoSuficiente();
        System.out.println("----------------------");
        System.out.println(C2);
C2.Permissao();
C2.CreditoSuficiente();
        System.out.println("----------------------");
        System.out.println(C3);
C3.Permissao();
C3.CreditoSuficiente();
        System.out.println("-----------------------");
        System.out.println(C4);
C4.Permissao();
C4.CreditoSuficiente();

    }
}
