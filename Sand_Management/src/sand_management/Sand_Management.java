package sand_management;


import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class Sand_Management {

    public static void main(String[] args) throws Exception{
        //String feel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        UIManager.setLookAndFeel(new FlatMacLightLaf());
        JFrame loginUI = new login_ui();
        loginUI.setVisible(true);
    }
}
