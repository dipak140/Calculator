package com.houarizegai.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class initializeButton {
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 70;
    static JButton initBtn(Calculator calculator, String label, int x, int y, ActionListener event) {
        JButton btn = new JButton(label);
        btn.setBounds(x, y, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(event);
        btn.setFocusable(false);
        calculator.window.add(btn);
        return btn;
    }

}
