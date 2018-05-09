package com.hania.controller;

import com.hania.Calculator;
import com.hania.model.Efficiency;
import com.hania.view.WallPaintCalculatorFrame;
import javafx.util.Pair;

import javax.swing.*;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
class WallPaintCalculatorController {

    private WallPaintCalculatorFrame wallPaintCalculatorFrame;
    private JButton backButton;
    private JTextField wallAreaTextField;
    private JTextField paintEfficienyTextField;
    private JTextField paintCanVolumeTextField;
    private JTextField paintPriceTextField;
    private JButton calculateButton;
    private JTextField summaryCansTextField;
    private JTextField summaryPriceTextField;
    private Calculator calculator;

    WallPaintCalculatorController(Calculator calculator) {
        this.calculator = calculator;
        initComponents();
        initListeners();
    }

    private void initComponents() {
        wallPaintCalculatorFrame = new WallPaintCalculatorFrame();
        backButton = wallPaintCalculatorFrame.getBackButton();
        wallAreaTextField = wallPaintCalculatorFrame.getWallAreaTextField();
        paintEfficienyTextField = wallPaintCalculatorFrame.getPaintEfficiencyTextField();
        paintCanVolumeTextField = wallPaintCalculatorFrame.getPaintCanVolumeTextField();
        paintPriceTextField = wallPaintCalculatorFrame.getPaintPriceTextField();
        calculateButton = wallPaintCalculatorFrame.getCalculateButton();
        summaryCansTextField = wallPaintCalculatorFrame.getSummaryCansTextField();
        summaryPriceTextField = wallPaintCalculatorFrame.getSummaryPriceTextField();
    }

    private void initListeners() {
        setBackButtonListener();
        setCalculateButtonListener();
    }

    private void setBackButtonListener() {
        backButton.addActionListener(e -> {
            new MainController();
            wallPaintCalculatorFrame.dispose();
        });
    }

    private void setCalculateButtonListener() {
        calculateButton.addActionListener(e -> {
            float wallArea = Float.parseFloat(wallAreaTextField.getText());
            float paintEfficieny = Float.parseFloat(paintEfficienyTextField.getText());
            float paintCanVolume = Float.parseFloat(paintCanVolumeTextField.getText());
            float paintPrice = Float.parseFloat(paintPriceTextField.getText());
            Efficiency paint = new Efficiency(paintEfficieny, paintCanVolume, paintPrice);

            Pair summary = calculator.createWallPaintCalculator(paint, wallArea);

            summaryCansTextField.setText(summary.getKey().toString());
            summaryPriceTextField.setText("$" + summary.getValue().toString());
        });
    }
}
