package lab11.app;

import javax.swing.*;

public class TemperatureConverter extends JFrame {
    private JTextField c2fTextFieldInput;
    private JTextField c2fTextFieldOutput;
    private JButton c2fConvertButton;
    private JPanel rootPanel;
    private JTextField f2cTextFieldInput;
    private JTextField f2cTextFieldOutput;
    private JButton f2cConvertButton;
    private JPanel historyPanel;

    public TemperatureConverter() {
        setTitle("Temperature converter");
        setSize(300, 180);
        add(rootPanel);
        pack(); // se auto-ajusteaza fereastra ca sa incapa toate elementele
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setupC2fConvertButton();
        setupF2cConvertButton();

    }

    private void setupC2fConvertButton() {
        c2fConvertButton.addActionListener(e -> {
            String c2fInputText = c2fTextFieldInput.getText();
            if (!c2fInputText.isEmpty()) {
                try {
                    double valueToConvert = Double.parseDouble(c2fInputText);
                    String result = String.format("%,.2f", valueToConvert * 1.8d + 32.0d); // pastram doua zecimale de dupa virgula
                    c2fTextFieldOutput.setText(result);
                    historyPanel.add(new JLabel(valueToConvert + " in Celsius = " + result + " in Fahrenheit"));
                } catch (NumberFormatException exception) {
                    System.err.println("Input text must be a number!");
                    JOptionPane.showMessageDialog(rootPanel, "The value you entered is not a number");
                    c2fTextFieldInput.setText("");
                }
            }
        });
    }

    private void setupF2cConvertButton() {
        f2cConvertButton.addActionListener(e -> {
            String f2cInputText = f2cTextFieldInput.getText();
            if (!f2cInputText.isEmpty()) {
                try {
                    double valueToConvert = Double.parseDouble(f2cInputText);
                    String result = String.format("%,.2f", (valueToConvert - 32.0d) * 0.5556d);
                    f2cTextFieldOutput.setText(result);
                    historyPanel.add(new JLabel(valueToConvert + " in Fahrenheit = " + result + " in Celsius"));
                } catch (NumberFormatException exception) {
                    System.err.println("Input text must be a number!");
                    JOptionPane.showMessageDialog(rootPanel, "The value you entered is not a number");
                    f2cTextFieldOutput.setText("");
                }
            }
        });
    }
}
