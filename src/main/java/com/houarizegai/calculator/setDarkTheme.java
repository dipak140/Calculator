package com.houarizegai.calculator;

import java.awt.*;

public class setDarkTheme {
    static void setDarkTheme(Calculator calculator) {
        final Color primaryDarkColor = new Color(141, 38, 99);
        final Color secondaryDarkColor = new Color(171, 171, 171);
        calculator.window.getContentPane().setBackground(new Color(68, 68, 68));
        calculator.btn0.setBackground(secondaryDarkColor);
        calculator.btn1.setBackground(secondaryDarkColor);
        calculator.btn2.setBackground(secondaryDarkColor);
        calculator.btn3.setBackground(secondaryDarkColor);
        calculator.btn4.setBackground(secondaryDarkColor);
        calculator.btn5.setBackground(secondaryDarkColor);
        calculator.btn6.setBackground(secondaryDarkColor);
        calculator.btn7.setBackground(secondaryDarkColor);
        calculator.btn8.setBackground(secondaryDarkColor);
        calculator.btn9.setBackground(secondaryDarkColor);
        calculator.btnPoint.setBackground(secondaryDarkColor);

        calculator.getBtnC().setForeground(secondaryDarkColor);
        calculator.btnBack.setForeground(secondaryDarkColor);
        calculator.btnMod.setForeground(secondaryDarkColor);
        calculator.btnDiv.setForeground(secondaryDarkColor);
        calculator.btnMul.setForeground(secondaryDarkColor);
        calculator.btnSub.setForeground(secondaryDarkColor);
        calculator.btnAdd.setForeground(secondaryDarkColor);
        calculator.btnEqual.setForeground(secondaryDarkColor);
        calculator.btnLog.setForeground(secondaryDarkColor);
        calculator.btnPower.setForeground(secondaryDarkColor);
        calculator.btnRoot.setForeground(secondaryDarkColor);
        calculator.getBtnC().setBackground(primaryDarkColor);
        calculator.btnBack.setBackground(primaryDarkColor);
        calculator.btnMod.setBackground(primaryDarkColor);
        calculator.btnDiv.setBackground(primaryDarkColor);
        calculator.btnMul.setBackground(primaryDarkColor);
        calculator.btnSub.setBackground(primaryDarkColor);
        calculator.btnAdd.setBackground(primaryDarkColor);
        calculator.btnRoot.setBackground(primaryDarkColor);
        calculator.btnLog.setBackground(primaryDarkColor);
        calculator.btnPower.setBackground(primaryDarkColor);
        calculator.btnEqual.setBackground(primaryDarkColor);
    }

}
