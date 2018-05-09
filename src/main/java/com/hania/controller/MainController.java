package com.hania.controller;

import com.hania.Calculator;
import com.hania.view.MainFrame;

import javax.swing.*;
import java.util.Objects;

/**
 * @author <a href="mailto:226154@student.pwr.edu.pl">Hanna Grodzicka</a>
 */
public class MainController {

    private MainFrame mainFrame;
    private JComboBox calculatorComboBox;
    private JButton submitButton;
    private Calculator calculator;

    public MainController() {
        initComponents();
        initListeners();
    }

    private void initComponents() {
        mainFrame = new MainFrame();
        calculator = new Calculator();
        calculatorComboBox = mainFrame.getCalculatorComboBox();
        submitButton = mainFrame.getSubmitButton();
    }

    private void initListeners() {
        submitButton.addActionListener(e -> {
            createCalculator();
            mainFrame.dispose();
        });
    }

    private void createCalculator() {
        String selection = Objects.requireNonNull(calculatorComboBox.getSelectedItem()).toString();
        if ("Tiles".equals(selection)) {
            new TileCalculatorController(calculator);
        } else if ("Wall paint".equals(selection)) {
            new WallPaintCalculatorController(calculator);
        }
    }
}
