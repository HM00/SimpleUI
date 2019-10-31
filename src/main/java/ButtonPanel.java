import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonPanel extends JPanel {
    public ButtonPanel(){
        setLayout(new GridLayout(2,2));

        ArrayList<JButton> buttons=new ArrayList<JButton>();
        for(int i=0;i<4;i++){
            buttons.add(new JButton("Press me"));
        }
        for(JButton b: buttons){
            b.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Button Pressed");
                }
            });
            add(b);
        }

//        JButton butt1=new JButton("Press me");
//        butt1.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                System.out.println("Button Pressed");
//            }
//        });
//        add(butt1);
//
//        JButton butt2=new JButton("Press me");
//        butt2.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                System.out.println("Button Pressed");
//            }
//        });
//        add(butt2);
//
//        JButton butt3=new JButton("Press me");
//        butt3.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                System.out.println("Button Pressed");
//            }
//        });
//        add(butt3);
//
//        JButton butt4=new JButton("Press me");
//        butt4.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                System.out.println("Button Pressed");
//            }
//        });
//        add(butt4);
    }
}
