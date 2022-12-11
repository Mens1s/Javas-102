package P_GUI.patikadev.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setLayout(){
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                         UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }
    public static int screenCenter(String point, Dimension size){
        if(point.equals("x"))
            return (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
        else if(point.equals("y"))
            return (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
        return 0;
    }

    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }

    public static void showMsg(String str){
        optionPageTR();
        String msg;
        String title;

        switch (str){
            case "fill":
                msg = "Lütfen Tüm Alanları Doldurunuz!";
                title = "Hata";
                break;
            case "done":
                msg = "İşlem Başarılı!";
                title = "Başarılı";
                break;
            case "error":
                msg = "İşlem Başarısız!";
                title = "Başarısız";
                break;
            case "duplicate":
                msg = "Aynı kullanıcı adında birden fazla Kullanıcı bulunamaz! Kontrol Ediniz!";
                title = "Başarısız";
                break;
            default:
                msg = str;
                title = "Mesaj";
        }
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void optionPageTR(){
        UIManager.put("OptionPane.okButtonText", "Tamam");
    }
}
