package A_FinalHomework.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setLayout(){
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ){
            if("Nimbus".equals(info.getName())){
                try{
                    UIManager.setLookAndFeel(info.getClassName());
                }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }

    public static boolean isEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }

    public static void showMsg(String msg){
        String title = "Onaylandi";
        switch (msg){
            case "suc":
                msg = "İşlemlerin başarılı bir şekilde tamamlandı!";
                title = "İşlem Başarılı";
                break;
            case "err":
                msg = "Beklenmedik bir Hata oluştu";
                title = "İşlem Başarısız";
                break;
            case "fill":
                msg = "Lütfen gerekli kutuları doldurun!";
                title = "Uyarı";
                break;
            case "typeErr":
                msg = "Yanliş tipte veri girdiniz!";
                title = "işlem Başarısız";
                break;
        }
        JOptionPane.showMessageDialog(null,msg,title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static int screenCenter(String point, Dimension size){
        if(point.equals("x"))
            return (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
        else if(point.equals("y"))
            return (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
        return 0;
    }
}
