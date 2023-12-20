
public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto(1368, "AA000AA", "Fiat", "Punto");
        auto1.setModel("Tipo");

        System.out.println(auto1);
        System.out.println(auto1.getModel()); // Punto
    }
}