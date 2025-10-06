//Controller.java: It connects model, view and scanner.
//When "scan" is pressed, gets a random UPC from scanner, adds product to CaaRegister and updates View

public class Controller {
    private CashRegister model;
    private View view;
    private Scanner scanner;

  //Constructor
    public Controller(CashRegister m, View v, Scanner s) {
        this.model = m;
        this.view = v;
        this.scanner = s;
        initController();
    }

    // Scan button listener
    public void initController() {
        scanner.getScanButton().addActionListener(e -> scanProduct());
    }

    // Handle scanning a product
    private void scanProduct() {
        String upc = scanner.generateUPC(); // get random UPC
        model.addProduct(upc);               // add to model

        Product p = model.getProduct(upc);
        if (p != null) {
            view.addItem(p.toString());         // show in list
            view.updateSubtotal(model.getSubtotal()); // update subtotal
        }
    }
}
