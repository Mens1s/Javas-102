package P_GUI.patikadev.View;

import P_GUI.patikadev.Helper.Config;
import P_GUI.patikadev.Helper.Helper;
import P_GUI.patikadev.Model.Patika;

import javax.swing.*;
public class UpdatePatikaGUI extends JFrame{
    private JPanel wrapper;
    private JTextField fld_patika_name;
    private JButton btn_update;
    private Patika patika;

    public UpdatePatikaGUI(Patika patika){
        this.patika = patika;
        add(wrapper);
        setSize(300, 150);
        setLocation(Helper.screenCenter("x", getSize()), Helper.screenCenter("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        fld_patika_name.setText(patika.getName());

        btn_update.addActionListener(e -> {
            if(Helper.isFieldEmpty(fld_patika_name))
                Helper.showMsg("fill");
            else {
                if ( Patika.update( patika.getId() , fld_patika_name.getText() ) )
                    Helper.showMsg("done");
                else
                    Helper.showMsg("error");
                dispose();
            }
        });
    }
}
