public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Vipin", "kumar", 29, "java");
        programmer.showInfo();
        programmer.work();

        CEO ceo = new CEO ("Bob", "Marley", 48, 20);
        ceo.showInfo();
        ceo.work();
    }
}
