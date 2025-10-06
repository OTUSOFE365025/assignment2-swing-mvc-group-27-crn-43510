// View.java: Handles the display of scanned items and running subtotal
import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;                 //TMain window
    private DefaultListModel<String> itemListModel; // Holds list of all the scanned items
    private JList<String> itemList;       // UI component to show all scanned items (scrollable)
    private JLabel subtotalLabel;         // Displays real-time subtotal

    public View(String title) {
        frame = new JFrame(title);     //creates a window with customized title      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); //setting window size
        frame.setLayout(new BorderLayout());

        // Set up list to show scanned items with scroll
        itemListModel = new DefaultListModel<>();
        itemList = new JList<>(itemListModel);
        JScrollPane scrollPane = new JScrollPane(itemList); //makes list scrollable

        subtotalLabel = new JLabel("Subtotal: $0.00"); // Initial subtotal label

        // Add components to the window
        frame.add(scrollPane, BorderLayout.CENTER); // Add scrollable list to center 
        frame.add(subtotalLabel, BorderLayout.SOUTH); // Add subtotal label at the bottom

        frame.setVisible(true); // Show the window
    }

    // Add a new item as text to the displayed list
    public void addItem(String item) {
        itemListModel.addElement(item);
    }

    // Update the subtotal display
    public void updateSubtotal(double subtotal) {
        subtotalLabel.setText("Subtotal: $" + String.format("%.2f", subtotal)); //updates the subtotal label in real time
    }
}
