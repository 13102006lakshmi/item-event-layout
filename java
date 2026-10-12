import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
public class ItemEventExample extends JFrame implements ItemListener
  {
    JCheckBox checkBox;
    JLabel label;
    ItemEventExample() 
    {
      setLayout(new FlowLayout()); 
      checkBox = new JCheckBox("Java");
      label = new JLabel("Select Java");
      add(checkBox);
      add(label);
      checkBox.addItemListener(this);
      setSize(400, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setVisible(true);
    }
    public void itemStateChanged(ItemEvent e) 
    {
      if (checkBox.isSelected())
        label.setText("Java Selected"); 
      else label.setText("Java Deselected");
    }
    public static void main(String[] args)
    {
      new ItemEventExample();
    } 
  }
                                                                                                                                       }
