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
    }

}