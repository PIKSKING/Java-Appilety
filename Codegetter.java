import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class FormAppletDemo extends Applet implements ActionListener
{
    Label entername;
    TextField name;
    Label enteremail;
    TextField email;
    Button click;
    Label result;
    public void init()
    {
        entername = new Label("Enter your name: ");
        name = new TextField(30);
        enteremail = new Label("Enter your email: ");
        email = new TextField(30);
        click = new Button("Click Here");
        result = new Label();

        add(entername);
        add(name);
        add(enteremail);
        add(email);
        add(click);
        click.addActionListener(this);
        add(result);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s = name.getText();
        String e = email.getText();
        String n = "";

        if (s.equals(n) || e.equals(n))
        {
            result.setText("Please enter appropriate information...");
        }
        else
        {
            result.setText("Welcome to Programming Hub");
        }
    }
}  
  
/* 
<applet code="FormAppletDemo.class" height="250" width="250"> 
</applet> 
*/  