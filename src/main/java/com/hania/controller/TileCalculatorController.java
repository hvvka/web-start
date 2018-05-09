package com.hania.controller;

import com.hania.Calculator;
import com.hania.model.Size;
import com.hania.view.TileCalculatorFrame;
import javafx.util.Pair;

import javax.swing.*;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
class TileCalculatorController {

    private TileCalculatorFrame tileCalculatorFrame;
    private JButton backButton;
    private JTextField tileWidthTextField;
    private JTextField tileLengthTextField;
    private JTextField tilePriceTextField;
    private JTextField roomWidthTextField;
    private JTextField roomLengthTextField;
    private JButton calculateButton;
    private JTextField summaryTilesTextField;
    private JTextField summaryPriceTextField;
    private Calculator calculator;

    TileCalculatorController(Calculator calculator) {
        this.calculator = calculator;
        initComponents();
        initListeners();
    }

    private void initComponents() {
        tileCalculatorFrame = new TileCalculatorFrame();
        backButton = tileCalculatorFrame.getBackButton();
        tileWidthTextField = tileCalculatorFrame.getTileWidthTextField();
        tileLengthTextField = tileCalculatorFrame.getTileLengthTextField();
        tilePriceTextField = tileCalculatorFrame.getTilePriceTextField();
        roomWidthTextField = tileCalculatorFrame.getRoomWidthTextField();
        roomLengthTextField = tileCalculatorFrame.getRoomLengthTextField();
        calculateButton = tileCalculatorFrame.getCalculateButton();
        summaryTilesTextField = tileCalculatorFrame.getSummaryTilesTextField();
        summaryPriceTextField = tileCalculatorFrame.getSummaryPriceTextField();
    }

    private void initListeners() {
        setBackButtonListener();
        setCalculateButtonListener();
    }

    private void setBackButtonListener() {
        backButton.addActionListener(e -> {
            new MainController();
            tileCalculatorFrame.dispose();
        });
    }

    private void setCalculateButtonListener() {
        calculateButton.addActionListener(e -> {
            float tileWidth = Float.parseFloat(tileWidthTextField.getText());
            float tileLength = Float.parseFloat(tileLengthTextField.getText());
            Size tile = new Size(tileWidth, tileLength);
            float tilePrice = Float.parseFloat(tilePriceTextField.getText());
            float roomWidth = Float.parseFloat(roomWidthTextField.getText());
            float roomLength = Float.parseFloat(roomLengthTextField.getText());
            Size room = new Size(roomWidth, roomLength);

            Pair summary = calculator.createTileCalculator(tile, room, tilePrice);

            summaryTilesTextField.setText(summary.getKey().toString());
            summaryPriceTextField.setText("$" + summary.getValue().toString());
        });
    }
}
