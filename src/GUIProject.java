import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GUIProject {
    public static void main(String[] args) {
        try {

            // Warna global
            UIManager.put("Panel.background", new Color(252, 185, 178));
            UIManager.put("OptionPane.background", new Color(252, 185, 178));
            UIManager.put("OptionPane.messageForeground", new Color(178, 58, 72));
            UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.BOLD, 15));
            UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.BOLD, 12));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Icon / GIF
        ImageIcon iconWelcome = new ImageIcon(GUIProject.class.getResource("/images/respectfulblink.gif"));
        ImageIcon iconInfo = new ImageIcon(GUIProject.class.getResource("/images/shrug.png"));
        ImageIcon iconInput = new ImageIcon(GUIProject.class.getResource("/images/cutegun.png"));
        ImageIcon iconCancel = new ImageIcon(GUIProject.class.getResource("/images/joesad.png"));
        ImageIcon iconEmpty = new ImageIcon(GUIProject.class.getResource("/images/joeangry.png"));
        ImageIcon iconNext = new ImageIcon(GUIProject.class.getResource("/images/doakes.png"));
        ImageIcon iconResult = new ImageIcon(GUIProject.class.getResource("/images/autistic.png"));
        ImageIcon iconHello = new ImageIcon(GUIProject.class.getResource("/images/caughtin4k.png"));

        //Rescale icon
        Image imgResult = iconResult.getImage().getScaledInstance(128,128, Image.SCALE_SMOOTH);
        iconResult = new ImageIcon(imgResult);
        //Image imgInput = iconInput.getImage().getScaledInstance(128,128, Image.SCALE_SMOOTH);
        //iconInput = new ImageIcon(imgInput);

        // === Dialog 1 - Welcome ===
        int dialog1 = JOptionPane.showConfirmDialog(
                null,
                "<html><body style='width:220px; font-family:Montserrat; font-size:16px;'>Welcome to my first Basic GUI Project!!!</body></html>",
                "Basic GUI Project",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                iconWelcome);
        if(dialog1 == JOptionPane.CLOSED_OPTION) return; // Stop kalau user tutup dialog

        // === Dialog 2 - Info Quest ===
        int dialog2 = JOptionPane.showConfirmDialog(
                null,
                "<html><body style='width:220px; font-family:Montserrat; font-size:16px;'>In this quest i will show you what percentage of autistic you are!</body></html>",
                "Basic GUI Project",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                iconInfo);
        if(dialog2 == JOptionPane.CLOSED_OPTION) return; // Stop kalau user tutup dialog

        // === Dialog 3 - Input Nama ===
        String name = (String) JOptionPane.showInputDialog(
                null,
                "<html><body style='width:220px; font-family:Montserrat; font-size:15px;'>please enter your name or something else will happen:</body></html>",
                "Basic GUI Project",
                JOptionPane.QUESTION_MESSAGE,
                iconInput,
                null,
                null);

        if(name == null) {
            // Cancel / Close
            JOptionPane.showMessageDialog(
                    null,
                    "<html><body style='width:150px; font-family:Montserrat; font-size:15px;'>Don't wanna do it? Fine.</body></html>",
                    "Basic GUI Project",
                    JOptionPane.INFORMATION_MESSAGE,
                    iconCancel);return;
        } else if(name.trim().isEmpty()) {
            // OK tapi kosong
            JOptionPane.showMessageDialog(
                    null,
                    "<html><body style='width:150px; font-family:Montserrat; font-size:15px;'>You haven't entered your name!</body></html>",
                    "Basic GUI Project",
                    JOptionPane.INFORMATION_MESSAGE,
                    iconEmpty);return;
        }
            // Input dengan nama
        JOptionPane.showMessageDialog(
                null,
                "<html><body style='width:110px; font-family:Montserrat; font-size:15px;'>Hello, " + name + "!</body></html>",
                "Basic GUI Project",
                JOptionPane.INFORMATION_MESSAGE,
                iconHello);

        // === Dialog 5 - Next info ===
        int dialog5 = JOptionPane.showConfirmDialog(
                null,
                "<html><body style='width:200px; font-family:Montserrat; font-size:15px;'>The next dialog will show your autism percentage!</body></html>",
                "Basic GUI Project",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                iconNext);
        if(dialog5 == JOptionPane.CLOSED_OPTION) return; // Stop kalau user tutup dialog

        // === Dialog 6 - Random Percent Result ===
        Random rand = new Random();
        int percent = rand.nextInt(101); // 0 - 100%

        JOptionPane.showMessageDialog(
                null,
                "<html><body style='font-family:Montserrat; font-size:20px; text-align:center;'>" + name + ", you are " + percent + "% autistic!</body></html>",
                "Basic GUI Project",
                JOptionPane.INFORMATION_MESSAGE,
                iconResult);
    }
}
