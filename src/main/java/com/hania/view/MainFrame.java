package com.hania.view;

import javax.swing.*;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
public class MainFrame extends JFrame {

    static final int WIDTH = 500;
    static final int HEIGHT = 500;

    private JComboBox calculatorComboBox;
    private JButton submitButton;
    private JPanel mainPanel;

    public MainFrame() {
        super("Calculator");
        setSize(WIDTH, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JComboBox getCalculatorComboBox() {
        return calculatorComboBox;
    }
}
