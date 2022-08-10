package za.ac.cput.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditSupplierGUI extends JFrame implements ActionListener {
    private JFrame mainFrame;

    //    String suppl_id;
//    String suppl_name;
//    String  Suppl_Address;
    // private JPanel pnlFrame;
    private JPanel pnlTitle;
    private JLabel Title;

    private JLabel Warnning;
    private JLabel lblSuppl_id;
    private JTextField suppl_id;


    private JLabel lblSuppl_name;
    private JTextField txtSuppl_name;

    private JLabel lblSuppl_Address;
    private JTextField txtSuppl_Address;

    //private JPanel pnlButtons;
    private JButton btnDone;
    private JButton btnCancel;



    public EditSupplierGUI(){
        mainFrame = new JFrame(" Updating this Supplier...");

        pnlTitle = new JPanel();
        Title = new JLabel("Edit Supplier");

        Warnning = new JLabel("You are about to Delete the folloing Supplier");
        lblSuppl_id = new JLabel("Supplier ID:");
        lblSuppl_name = new JLabel("Name:");
        lblSuppl_Address = new JLabel("Address:");
        suppl_id = new JTextField(" ");
        txtSuppl_name = new JTextField(" ");
        txtSuppl_Address = new JTextField(" ");
        btnCancel = new JButton("Cancel");
        btnDone = new JButton("Update");
    }


    public void setGUI(){

        mainFrame.add(pnlTitle, BorderLayout.NORTH);
        pnlTitle.setBackground(new Color(100,151,177));
        pnlTitle.add(Title);
        pnlTitle.setVisible(true);

        //Components dimentions
//Warnning.setBounds(100, 90, 10, 1);
        lblSuppl_id.setBounds(160,90,40,90);
        lblSuppl_id.setSize(100, 10);
        lblSuppl_name.setBounds(195,130, 40, 90);
        lblSuppl_name.setSize(100, 20);
        lblSuppl_Address.setBounds(210, 170, 40, 90);
        lblSuppl_Address.setSize(100, 10);
        suppl_id.setBounds(270, 85, 40, 90);
        suppl_id.setSize(130,20);
        txtSuppl_name.setBounds(270, 125, 40, 90);
        txtSuppl_name.setSize(130, 20);
        txtSuppl_Address.setBounds(270, 165, 40, 90);
        txtSuppl_Address.setSize(130, 20);
        btnCancel.setBounds(180, 360, 130, 20);
        btnDone.setBounds(320, 360, 140, 20);
        btnDone.addActionListener(this);
        btnCancel.addActionListener(this);

//Adding components to the Frame
        mainFrame.add(Warnning);
        mainFrame.add(lblSuppl_id);
        mainFrame.add(lblSuppl_name);
        mainFrame.add(lblSuppl_Address);
        mainFrame.add(suppl_id);
        mainFrame.add(txtSuppl_name);
        mainFrame.add(txtSuppl_Address);
        mainFrame.add(btnCancel);
        mainFrame.add(btnDone);

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
        }else if(txtSuppl_name.getText().equals("")){
            valid = false;
        }else if(txtSuppl_Address.getText().equals("")){
            valid = false;
        }else{
            valid = true;
        }
        return valid;
    }


    public static void main(String[] args) {
        new EditSupplierGUI().setGUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnDone) {
            if (isFill()) {
                JOptionPane.showMessageDialog(null, " " +
                        "Modification saved with success! "); //new Popup().setGUI();
            }
        } else if (e.getSource() == btnCancel) {
            System.exit(0);
        }
    }


}
