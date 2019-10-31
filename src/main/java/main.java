import javax.swing.*;
import java.awt.*;

public class main {
    static GraphicsConfiguration gc;
    public static void main(String[] args){
        JFrame frame=new JFrame(gc);
        frame.setSize(500,300);
        frame.getContentPane().add(new ButtonPanel());
        frame.setJMenuBar(new MainMenu());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
