//Scanner.java: Represents a barcode scanner. Each time the "scan" button is pressed,
// a random product is selected and UPC code is returned

import java.awt.BorderLayout;
import javax.swing.*;
import java.util.*;

public class Scanner {
    private JFrame frame;
    private JPanel scannerPanel;
    private JButton scanButton;
    private CashRegister cashRegister;
    private Random random;

    // Passing CashRegister so Scanner knows the products
    public Scanner(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
        this.random = new Random();

        frame = new JFrame("Scanner");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(150, 100);
        frame.setLocation(300, 50);

        scanButton = new JButton("Scan");
        scannerPanel = new JPanel();
        scannerPanel.add(scanButton);
        frame.getContentPane().add(scannerPanel);

        frame.setVisible(true);
    }

    // Picking a random product's UPC
    public String generateUPC() {
        List<String> upcs = cashRegister.getAllUPCs();
        int idx = random.nextInt(upcs.size());
        String upc = upcs.get(idx);
        System.out.println("Scanned UPC: " + upc);
        return upc;
    }

    public JButton getScanButton() {
        return scanButton;
    }
}
