// MySwingMVCApp.java: Test driver class to launch and run the Cash Register application using MVC
// It sets up the model, view, and scanner, and connects them through the controller

public class MySwingMVCApp {
    public static void main(String[] args) {
        CashRegister model = new CashRegister("products.txt");// Create the model and load products from file

        View view = new View("Cash Register");// Create the GUI to display scanned items and subtotal

        Scanner scanner = new Scanner(model);// Create the scanner window to show scanning products in real-time

        Controller controller = new Controller(model, view, scanner);// Connect model, view, and scanner through the controller
    }
}
