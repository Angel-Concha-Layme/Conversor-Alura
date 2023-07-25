package com.alura.conversor.modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkModeExample {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private boolean darkMode = false;

    public static void main(String[] args) {
        DarkModeExample window = new DarkModeExample();
        window.frame.setVisible(true);
    }

    public DarkModeExample() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout(0, 0));

        button = new JButton("Cambiar a modo oscuro");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                darkMode = !darkMode;
                updateColors();
            }
        });
        panel.add(button, BorderLayout.CENTER);
    }

    private void updateColors() {
        if (darkMode) {
            panel.setBackground(Color.BLACK);
            button.setForeground(Color.WHITE);
            button.setText("Cambiar a modo claro");
        } else {
            panel.setBackground(Color.WHITE);
            button.setForeground(Color.BLACK);
            button.setText("Cambiar a modo oscuro");
        }
    }
}
