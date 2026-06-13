import javax.swing.*;

public class MainForm extends JFrame {
    private JPanel main_form;
    private JLabel nim;
    private JLabel nama;
    private JLabel fakultas;
    private JTextField input_nim;
    private JTextField input_nama;
    private JTextField input_fakultas;
    private JTable data_table;
    private JButton btn_add;
    private JButton btn_read;
    private JButton btn_hapus;

    public MainForm() {
        setTitle("CRUD Mahasiswa");
        setContentPane(main_form);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void main(String[] args) {
        new MainForm();
    }
}
