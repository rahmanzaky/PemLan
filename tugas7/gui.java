package tugas7;

import java.awt.*;
import javax.swing.*;

public class gui extends JFrame {
    JMenuBar menuBar = new JMenuBar();
    JMenu menuFile = new JMenu("File"), menuEdit = new JMenu("Edit"), menuHelp = new JMenu("Help");
    JMenuItem itemOpen = new JMenuItem("Open"), itemClose = new JMenuItem("Close"), itemQuit = new JMenuItem("Quit"),
              itemAbout = new JMenuItem("About"), itemCopy = new JMenuItem("Copy"), itemPaste = new JMenuItem("Paste"), 
              itemCut = new JMenuItem("Cut"), itemUndo = new JMenuItem("Undo"), itemRedo = new JMenuItem("Redo");

    JLabel labelNama = new JLabel("Nama"), labelTglLahir = new JLabel("Tanggal Lahir"), 
           labelNomor = new JLabel("No. Pendaftaran"), labelAlamat = new JLabel("Alamat"), 
           labelEmail = new JLabel("E-mail");
    JTextField fieldNama = new JTextField(30), fieldTglLahir = new JTextField(30), 
               fieldNomor = new JTextField(30), fieldEmail = new JTextField(30);
    JTextArea fieldAlamat = new JTextArea(3, 30);
    JScrollPane scrollPaneAlamat = new JScrollPane(fieldAlamat);
    JButton buttonSubmit = new JButton("Submit");
    JTextArea textAreaHasil = new JTextArea();

    gui() {
        setTitle("Form Pendaftaran Mahasiswa");
        setLocation(400, 200);
        setSize(400, 500);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeComponents();
        setVisible(true);
    }

    void initializeComponents() {
        setJMenuBar(menuBar);
        menuBar.add(menuFile); menuBar.add(menuEdit); menuBar.add(menuHelp);
        menuFile.add(itemOpen); menuFile.add(itemClose); menuFile.add(itemQuit);
        menuEdit.add(itemUndo); menuEdit.add(itemRedo); menuEdit.add(itemCopy); menuEdit.add(itemPaste); menuEdit.add(itemCut);
        menuHelp.add(itemAbout);
        itemClose.setEnabled(false);
        getContentPane().setLayout(null);

        getContentPane().setBackground(new Color(50, 50, 50));

        labelNama.setForeground(Color.WHITE); 
        labelTglLahir.setForeground(Color.WHITE); 
        labelNomor.setForeground(Color.WHITE);
        labelAlamat.setForeground(Color.WHITE); 
        labelEmail.setForeground(Color.WHITE); 
        
        fieldNama.setBackground(new Color(224, 255, 255)); 
        fieldTglLahir.setBackground(new Color(224, 255, 255)); 
        fieldNomor.setBackground(new Color(224, 255, 255)); 
        fieldAlamat.setBackground(new Color(224, 255, 255)); 
        fieldEmail.setBackground(new Color(224, 255, 255)); 

        addComponent(labelNama, 20, 20, 120, 25);
        addComponent(fieldNama, 160, 20, 200, 25);
        addComponent(labelTglLahir, 20, 55, 120, 25);
        addComponent(fieldTglLahir, 160, 55, 200, 25);
        addComponent(labelNomor, 20, 90, 120, 25);
        addComponent(fieldNomor, 160, 90, 200, 25);
        addComponent(labelAlamat, 20, 125, 120, 25);
        addComponent(scrollPaneAlamat, 160, 125, 200, 60);
        addComponent(labelEmail, 20, 200, 120, 25);
        addComponent(fieldEmail, 160, 200, 200, 25);
        addComponent(buttonSubmit, 260, 240, 100, 30);

        setUpActionListeners();
    }

    void addComponent(JComponent component, int x, int y, int width, int height) {
        getContentPane().add(component);
        component.setBounds(x, y, width, height);
    }

    void setUpActionListeners() {
        buttonSubmit.addActionListener(event -> {
            if (fieldNama.getText().isEmpty() || fieldTglLahir.getText().isEmpty() || 
                fieldNomor.getText().isEmpty() || fieldAlamat.getText().isEmpty() || 
                fieldEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            textAreaHasil.setText("");
            textAreaHasil.append(String.format("Nama\t\t: %s\n", fieldNama.getText()));
            textAreaHasil.append(String.format("Tanggal Lahir\t: %s\n", fieldTglLahir.getText()));
            textAreaHasil.append(String.format("No. Pendaftaran\t: %s\n", fieldNomor.getText()));
            textAreaHasil.append(String.format("Alamat\t\t: %s\n", fieldAlamat.getText()));
            textAreaHasil.append(String.format("E-mail\t\t: %s\n", fieldEmail.getText()));

            int confirmation = JOptionPane.showConfirmDialog(null, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (confirmation == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, textAreaHasil.getText(), "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        itemOpen.addActionListener(event -> JOptionPane.showMessageDialog(null, "Belum ngerti caranya kak, maaf WKWKWK", "Informasi", JOptionPane.INFORMATION_MESSAGE));
        itemClose.addActionListener(event -> JOptionPane.showMessageDialog(null, "Bismillah close", "Informasi", JOptionPane.INFORMATION_MESSAGE));
        itemQuit.addActionListener(event -> System.exit(0));
        itemAbout.addActionListener(event -> JOptionPane.showMessageDialog(null, "Aplikasi Pendaftaran Mahasiswa v1.0" + "\nBy Rahman Zaky", "Tentang", JOptionPane.INFORMATION_MESSAGE));
        itemCopy.addActionListener(event -> JOptionPane.showMessageDialog(null, "Belum ngerti caranya kak, maaf WKWKWK", "Informasi", JOptionPane.INFORMATION_MESSAGE));
        itemPaste.addActionListener(event -> JOptionPane.showMessageDialog(null, "Belum ngerti caranya kak, maaf WKWKWK", "Informasi", JOptionPane.INFORMATION_MESSAGE));
        itemCut.addActionListener(event -> JOptionPane.showMessageDialog(null, "Belum ngerti caranya kak, maaf WKWKWK", "Informasi", JOptionPane.INFORMATION_MESSAGE));

        itemUndo.addActionListener(event -> JOptionPane.showMessageDialog(null, "Belum ngerti caranya kak, maaf WKWKWK", "Informasi", JOptionPane.INFORMATION_MESSAGE));
        itemRedo.addActionListener(event -> JOptionPane.showMessageDialog(null, "Belum ngerti caranya kak, maaf WKWKWK", "Informasi", JOptionPane.INFORMATION_MESSAGE));
    }

    public static void main(String[] args) {
        new gui();
    }
}
