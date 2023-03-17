package LoginForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DataOutput extends JFrame implements ActionListener {
    
    private JLabel labelNama, labelNim, labelKelas;
    private JButton btnKembali;
    private UserData userData;
    
    public DataOutput(UserData userData){
        
        setTitle("User Data Output");
        setSize(400, 350);
        setLayout(null);
        setLocationRelativeTo(null);
                
        this.userData = userData;
        
        labelNama = new JLabel("Nama\t: " + userData.getNama());
        labelNim = new JLabel("NIM\t: " + userData.getNim());
        labelKelas = new JLabel("Kelas\t: " + userData.getKelas());
        btnKembali = new JButton("Kembali");
        
        labelNama.setBounds(50, 30, 150, 30);
        labelNim.setBounds(50, 70, 100, 30);
        labelKelas.setBounds(50, 110, 100, 30);
        btnKembali.setBounds(50, 150,100, 30);
        
        add(labelNama);
        add(labelNim);
        add(labelKelas);
        add(btnKembali);
        
        btnKembali.addActionListener(this);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnKembali) {
            dispose();
            new FormData();
        }
    }
}
