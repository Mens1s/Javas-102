package P_GUI.patikadev.View;

import P_GUI.patikadev.Helper.Config;
import P_GUI.patikadev.Helper.Helper;
import P_GUI.patikadev.Model.Operator;
import P_GUI.patikadev.Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField fld_user_uname;
    private JPasswordField fld_user_password;
    private JButton btn_login;

    public LoginGUI(){
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenter("x",getSize()), Helper.screenCenter("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

        btn_login.addActionListener(e ->{
            if( Helper.isFieldEmpty(fld_user_uname) || Helper.isFieldEmpty(fld_user_password) )
                Helper.showMsg("fill");
            else{
                char [] passChar = fld_user_password.getPassword();
                String pass= "";

                for(char c : passChar)
                    pass += c;

                User u = User.getFetch(fld_user_uname.getText(), pass);

                if (u != null){
                    switch (u.getType()){
                        case "operator":
                            OperatorGUI opGUI = new OperatorGUI( (Operator) u);
                            break;
                        case "educator":
                            EducatorGUI edGUI = new EducatorGUI();
                            break;
                        case "student":
                            StudentGUI stGUI = new StudentGUI();
                            break;
                    }
                    dispose();
                }else
                    Helper.showMsg("Kullanıcı Bulunamadı");

            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI a = new LoginGUI();
    }
}
