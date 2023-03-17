package LoginForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginForm extends JFrame implements ActionListener {
    
    //deklarasi komponen ui
    private JLabel labelUsername, labelPassword;
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton btnLogin;

    public LoginForm() {
        // mengatur frame form login
        setTitle("Login Form");
        setSize(350, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
        // instansiasi komponen ui
        labelUsername = new JLabel("Username:");
        labelPassword = new JLabel("Password:");
        tfUsername = new JTextField();
        pfPassword = new JPasswordField();
        btnLogin = new JButton("Login");

        // mengatur posisi dan ukuran komponen ui
        labelUsername.setBounds(50, 30, 100, 30);
        labelPassword.setBounds(50, 70, 100, 30);
        tfUsername.setBounds(150, 30, 150, 30);
        pfPassword.setBounds(150, 70, 150, 30);
        btnLogin.setBounds(120, 120, 100, 30);

        // menambahkan komponen ui ke dalam frame
        add(labelUsername);
        add(tfUsername);
        add(labelPassword);
        add(pfPassword);
        add(btnLogin);

        // menambahkan action listener pada tombol login
        btnLogin.addActionListener(this);
        
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = tfUsername.getText();
        String password = new String(pfPassword.getPassword());

        if (username.equals("admin") && password.equals("123")) {
            JOptionPane.showMessageDialog(this, "Login berhasil!");
            dispose();
            new FormData();
        } else {
            JOptionPane.showMessageDialog(this, "Username atau password salah!");
        }
    }

}
