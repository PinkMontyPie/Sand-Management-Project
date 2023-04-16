package sand_management;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Sand_Management {

    public static void main(String[] args) throws Exception{
        String str = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        UIManager.setLookAndFeel(str);
        JFrame loginUI = new login_ui();
        loginUI.setVisible(true);
    }
}
