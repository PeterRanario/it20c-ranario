package topic_3_stack_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackCalculatorGUI extends JFrame implements ActionListener {
    private Stack<Integer> numberStack = new Stack<>();
    private JTextArea displayArea;

    public StackCalculatorGUI() {

        setTitle("Stack Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setResizable(false);

        JLabel headerLabel = new JLabel("Stack Calculator", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(headerLabel, BorderLayout.NORTH);

        displayArea = new JTextArea(5, 20);
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        displayArea.setMargin(new Insets(10, 10, 10, 10));
        displayArea.setBackground(new Color(240, 248, 255));
        displayArea.setForeground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));
        buttonPanel.setBackground(new Color(255, 255, 255));

        for (int i = 0; i <= 9; i++) {
            createButton(buttonPanel, String.valueOf(i), new Color(173, 216, 230));
        }

        String[] operations = {"+", "-", "*", "/"};
        Color[] opColors = {
            new Color(135, 206, 250),
            new Color(255, 99, 71),
            new Color(144, 238, 144),
            new Color(255, 215, 0)
        };

        for (int i = 0; i < operations.length; i++) {
            createButton(buttonPanel, operations[i], opColors[i]);
        }

        createButton(buttonPanel, "Clear", new Color(255, 165, 0));
        createButton(buttonPanel, "Exit", new Color(255, 0, 0));

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void createButton(JPanel panel, String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setBackground(bgColor);
        button.setForeground(Color.BLACK);
        button.addActionListener(this);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        panel.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789".contains(command)) {
            int number = Integer.parseInt(command);
            numberStack.push(number);
            displayCurrentStack();
        } else if (command.equals("Clear")) {
            numberStack.clear();
            displayArea.setText("Stack cleared.\n");
        } else if (command.equals("Exit")) {
            System.exit(0);
        } else {
            performOperation(command);
        }
    }

    private void performOperation(String operation) {
        if (numberStack.size() < 2) {
            displayArea.append("Error: Input at least two numbers to " + operation + ".\n");
            return;
        }
        int secondNumber = numberStack.pop();
        int firstNumber = numberStack.pop();
        int result = 0;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    displayArea.append("Error: Cannot divide by zero.\n");
                    numberStack.push(firstNumber);
                    numberStack.push(secondNumber);
                    return;
                }
                result = firstNumber / secondNumber;
                break;
        }

        numberStack.push(result);
        displayArea.append("Performed " + operation + ": " + firstNumber + " " + operation + " " + secondNumber + " = " + result + "\n");
        displayCurrentStack();
    }

}