
package LoginForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormData extends JFrame implements ActionListener {
    
    //deklarasi komponen ui
    private JLabel labelNama, labelNim, labelKelas;
    private JTextField tfNama, tfNim;
    private JComboBox<String> cbKelas;
    private JButton btnSubmit, btnLogout;

    public FormData() {
        
        // mengatur frame form login
        setTitle("Form Data");
        setSize(400, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        
        // instansiasi komponen ui
        labelNama = new JLabel("Nama:");
        labelNim = new JLabel("NIM:");
        labelKelas = new JLabel("Kelas:");
        tfNama = new JTextField();
        tfNim = new JTextField();
        cbKelas = new JComboBox<String>(new String[]{"Kelas A", "Kelas B", "Kelas C", "Kelas D", "Kelas E", "Kelas F", "Kelas H"});
        
        btnSubmit = new JButton("Submit");
        btnLogout = new JButton("Logout");

        // mengatur posisi dan ukuran komponen ui
        labelNama.setBounds(50, 70, 100, 30);
        labelNim.setBounds(50, 110, 100, 30);
        labelKelas.setBounds(50, 150, 100, 30);
        tfNama.setBounds(150, 70, 150, 30);
        tfNim.setBounds(150, 110, 150, 30);
        cbKelas.setBounds(150, 150, 150, 30);
        btnSubmit.setBounds(120, 240, 100, 30);
        btnLogout.setBounds(250, 5, 100, 30);

        // menambahkan komponen ui ke dalam frame
        add(labelNama);
        add(tfNama);
        add(labelNim);
        add(tfNim);
        add(labelKelas);
        add(cbKelas);
        add(btnSubmit);
        add(btnLogout);

        // menambahkan action listener pada tombol submit dan tombol logout
        btnSubmit.addActionListener(this);
        btnLogout.addActionListener(this);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String nama = tfNama.getText();
            String nim = tfNim.getText();
            String kelas = cbKelas.getSelectedItem().toString();

            UserData userData = new UserData(nama, nim, kelas);
            dispose();
            new DataOutput(userData);

        } else if (e.getSource() == btnLogout) {
            dispose(); 
            new LoginForm(); 
        }
    }
}
