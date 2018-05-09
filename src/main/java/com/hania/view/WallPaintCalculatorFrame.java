package com.hania.view;

import javax.swing.*;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
public class WallPaintCalculatorFrame extends JFrame {

    private JPanel mainPanel;
    private JButton backButton;
    private JTextField wallAreaTextField;
    private JTextField paintEfficiencyTextField;
    private JTextField paintCanVolumeTextField;
    private JTextField paintPriceTextField;
    private JButton calculateButton;
    private JTextField summaryCansTextField;
    private JTextField summaryPriceTextField;

    public WallPaintCalculatorFrame() {
        super("Wall paint calculator");
        setSize(MainFrame.WIDTH, MainFrame.HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        manageTextFields();
    }

    private void manageTextFields() {
        summaryCansTextField.setEditable(false);
        summaryPriceTextField.setEditable(false);
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JTextField getWallAreaTextField() {
        return wallAreaTextField;
    }

    public JTextField getPaintEfficiencyTextField() {
        return paintEfficiencyTextField;
    }

    public JTextField getPaintCanVolumeTextField() {
        return paintCanVolumeTextField;
    }

    public JTextField getPaintPriceTextField() {
        return paintPriceTextField;
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }

    public JTextField getSummaryCansTextField() {
        return summaryCansTextField;
    }

    public JTextField getSummaryPriceTextField() {
        return summaryPriceTextField;
    }
}
