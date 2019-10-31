import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

// MainMenu is a JMenuBar that also implements the ActionListener interface by
// having a concrete actionPerformed method
public class MainMenu extends JMenuBar implements ActionListener {
    JMenu menu; // One menu
    public MainMenu(){
        ArrayList<JMenuItem> item=new ArrayList<JMenuItem>(); // Which has one item
        menu=new JMenu("The Menu");
        item.add(new JMenuItem("Item 1"));
        item.add(new JMenuItem("Item 2"));
        add(menu);  // Add the JMenu to the JMenuBar
        for(JMenuItem m: item){
            m.addActionListener(this);
            menu.add(m); // Add the JMenuItem to the JMenu
        }
    }
    @Override
    // If 'this' is set as the ActionListener to all menu items, this method will
    // be called whenever any menu item is selected, but the ActionEvent
    // command will be the text of the menu item selected
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
