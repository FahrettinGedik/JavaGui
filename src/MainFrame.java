import java.awt.*;

import javax.swing.*;

public class MainFrame extends JFrame {

    final private Font mainFont = new Font("Arial", Font.PLAIN, 20);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;

    public void initialize() {
         /* Form Panel */
         JLabel lbFirstName = new JLabel("First Name");
         lbFirstName.setFont(mainFont);


        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5,5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);


        /* Main Panel Welcome Label */

        lbWelcome = new JLabel();

        lbWelcome.setFont(mainFont);

        /* Main Panel Buttons Panel */
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(mainFont);
        btnSubmit.addActionListener(e -> {
            String firstName = tfFirstName.getText();
            String lastName = tfLastName.getText();
            lbWelcome.setText("Welcome, " + firstName + " " + lastName);
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(e -> {
            tfFirstName.setText("");
            tfLastName.setText("");
            lbWelcome.setText("");
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnSubmit);
        buttonsPanel.add(btnClear);

        /* Main Panel */
        

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);


        setTitle("Welcome App");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.initialize();
    }

    
}