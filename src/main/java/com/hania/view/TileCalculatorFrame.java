package com.hania.view;

import javax.swing.*;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
public class TileCalculatorFrame extends JFrame {

    private JPanel mainPanel;
    private JButton backButton;
    private JTextField tileWidthTextField;
    private JTextField tileLengthTextField;
    private JTextField tilePriceTextField;
    private JTextField roomWidthTextField;
    private JTextField roomLengthTextField;
    private JButton calculateButton;
    private JTextField summaryTilesTextField;
    private JTextField summaryPriceTextField;

    public TileCalculatorFrame() {
        super("Tile calculator");
        setSize(MainFrame.WIDTH, MainFrame.HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        manageTextFields();
    }

    private void manageTextFields() {
        summaryTilesTextField.setEditable(false);
        summaryPriceTextField.setEditable(false);
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JTextField getTileWidthTextField() {
        return tileWidthTextField;
    }

    public JTextField getTileLengthTextField() {
        return tileLengthTextField;
    }

    public JTextField getTilePriceTextField() {
        return tilePriceTextField;
    }

    public JTextField getRoomWidthTextField() {
        return roomWidthTextField;
    }

    public JTextField getRoomLengthTextField() {
        return roomLengthTextField;
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }

    public JTextField getSummaryTilesTextField() {
        return summaryTilesTextField;
    }

    public JTextField getSummaryPriceTextField() {
        return summaryPriceTextField;
    }
}
