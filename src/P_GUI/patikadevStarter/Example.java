package P_GUI.patikadevStarter;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Example extends  JFrame{
    private JPanel wrapper;
    private JPanel wTop;
    private JPanel wBottom;
    private JTextField fld_username;
    private JPasswordField fld_password;
    private JButton btn_login;


    public Example(){
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
//            System.out.println(info.getName() +" : " + info.getClassName());
            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        this.add(wrapper);
        setSize(400,300);
        setTitle("App Name");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x, y);
        setVisible(true);

        btn_login.addActionListener(e -> {
            if(Objects.equals(fld_username.getText(), "") || fld_password.equals("")){
                JOptionPane.showMessageDialog(null,"Fill All Sections!","Warning",JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }
}
