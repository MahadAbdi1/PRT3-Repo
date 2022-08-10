package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSupplierGUI extends JFrame implements ActionListener {
//    String suppl_id;
//    String suppl_name;
//    String  Suppl_Address;

    private JFrame mainFrame;

    // private JPanel pnlFrame;
    private JPanel pnlTitle;
    private JLabel Title;

    private JLabel lblSuppl_id;
    private JTextField suppl_id;


    private JLabel lblSuppl_name;
    private JTextField suppl_name;


    private JLabel lblSuppl_Address;
    private JTextField Suppl_Address;


    //private JPanel pnlButtons;
    private JButton btnAdd;
    private JButton btnCancel;


    public AddSupplierGUI(){

        mainFrame = new JFrame(" Adding a Supplier... ");

        pnlTitle = new JPanel();
        Title = new JLabel("Add supplier");

        lblSuppl_id = new JLabel("Supplier Id:");
        lblSuppl_name = new JLabel("Name:");
        lblSuppl_Address = new JLabel("Address:");
        suppl_id = new JTextField(" ");
        suppl_name = new JTextField(" ");
        Suppl_Address = new JTextField(" ");
        btnCancel = new JButton("Cancel");
        btnAdd = new JButton("Add");


    }
    public void setGUI(){


        mainFrame.add(pnlTitle, BorderLayout.NORTH);
        pnlTitle.setBackground(new Color(100,151,177));
        pnlTitle.add(Title);
        pnlTitle.setVisible(true);

        //Components dimentions
        lblSuppl_id.setBounds(160,90,40,90);
        lblSuppl_id.setSize(100, 10);
        lblSuppl_name.setBounds(195,130, 40, 90);
        lblSuppl_name.setSize(100, 20);
        lblSuppl_Address.setBounds(210, 170, 40, 90);
        lblSuppl_Address.setSize(100, 10);
        suppl_id.setBounds(270, 85, 40, 90);
        suppl_id.setSize(130,20);
        suppl_name.setBounds(270, 125, 40, 90);
        suppl_name.setSize(130, 20);
        Suppl_Address.setBounds(270, 165, 40, 90);
        Suppl_Address.setSize(130, 20);
        btnCancel.setBounds(180, 360, 130, 20);
        btnAdd.setBounds(320, 360, 140, 20);


        btnAdd.addActionListener(this);
        btnCancel.addActionListener(this);


//Adding components to the Frame
        mainFrame.add(lblSuppl_id);
        mainFrame.add(lblSuppl_name);
        mainFrame.add(lblSuppl_Address);
        mainFrame.add(suppl_id);
        mainFrame.add(suppl_name);
        mainFrame.add(Suppl_Address);
        mainFrame.add(btnCancel);
        mainFrame.add(btnAdd);

//Main Frame Set ups

        mainFrame.getContentPane().setBackground(new Color(179,205,224));
        mainFrame.setLocation(250, 90);
        mainFrame.setSize(650,450);
        mainFrame.setLayout(new GridLayout(4,2));
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
    public boolean isFill() {
        boolean valid = true;

        if (suppl_id.getText().equals("")){
            valid = false;
        }else if(suppl_name.getText().equals("")){
            valid = false;
        }else if(Suppl_Address.getText().equals("")){
            valid = false;
        }else{
            valid = true;
        }
        return valid;

    }

    public static void main(String[] args) {
        new AddSupplierGUI().setGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            if (isFill()) {
                JOptionPane.showMessageDialog(null, "Supplier was successfully added!");   //new Popup().setGUI(); // write the gui info to a file
            }
        } else if (e.getSource() == btnCancel) {
            System.exit(0);
        }
    }

}
