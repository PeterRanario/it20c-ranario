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

        
    }

}