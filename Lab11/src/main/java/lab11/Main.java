package lab11;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        buildUI();
    }

    private static void buildUI() {

        JFrame frame = new JFrame("Exemplu");
        frame.setSize(new Dimension(500, 250));

        JPanel rootPanel = (JPanel) frame.getContentPane();

        GridLayout gridLayout = new GridLayout(2, 2);
        rootPanel.setLayout(gridLayout);

        JLabel label = new JLabel("Default text");
        rootPanel.add(label);

        JButton button = new JButton("Press me");
        button.addActionListener(event -> {
            System.out.println("Button pressed!");
            label.setText("Updated text!");
        });
        rootPanel.add(button);

        Vector<String> data = new Vector<>();
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");

        JList<String> list = new JList<>(data);

        rootPanel.add(list);

        JTextField textField = new JTextField();
        textField.addActionListener(e -> {
            System.out.println(e);
        });
        rootPanel.add(textField);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
