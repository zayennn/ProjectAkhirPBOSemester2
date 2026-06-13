import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainForm extends JFrame {
    private JPanel main_form;
    private JLabel nim;
    private JLabel nama;
    private JLabel fakultas;
    public JTextField input_nim;
    public JTextField input_nama;
    public JTextField input_fakultas;
    public JTable data_table;
    private JButton btn_add;
    private JButton btn_update;
    private JButton btn_delete;
    private JButton btn_read;
    private DefaultTableModel tableModel;

    public MainForm() {
        setTitle("CRUD Mahasiswa");
        setContentPane(main_form);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void InitTable() {
        tableModel = new DefaultTableModel();

        tableModel.addColumn("NIM");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Fakultas");

        data_table.setModel(tableModel);
    }

    public void main(String[] args) {
        new MainForm();
    }
}
