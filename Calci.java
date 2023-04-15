import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Calci
{

    public static void main (String Arg [])
    {
        Calculator cobj=new Calculator(400,400,"CALULATOR");

    }
}

class Calculator extends  WindowAdapter implements ActionListener
{
     public Frame fobj;
     public Button B1,B2,B3,B4;
     public TextField T1,T2;
     public Label L1;
     public Integer No1,No2;

     public Calculator( int width, int height,String Name)
     {
        fobj=new Frame(Name);
        fobj.setSize(width,height);
        fobj.setVisible(true);

        B1=new Button("ADD");
        B2=new Button("SUB");
        B3=new Button("MULT");
        B4=new Button("DIV");

        fobj.add(B1);
        fobj.add(B2);
        fobj.add(B3);
        fobj.add(B4);
        B1.setBounds(100,300,50,50);
        B2.setBounds(150,300,50,50);
        B3.setBounds(200,300,50,50);
        B4.setBounds(250,300,50,50);
        
        fobj.addWindowListener(this);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);

        T1=new TextField();
        T2=new TextField();
        fobj.add(T1);
        fobj.add(T2);
        T1.setBounds(100,100,80,40);
        T2.setBounds(200,100,80,40);
        
        L1=new Label();
        fobj.add(L1);
        L1.setBounds(150,200,300,50);

        fobj.setLayout(null);
        fobj.setVisible(true);


        

     }

     public void windowClosing(WindowEvent obj)
     {
        System.exit(0);
     }

     public void actionPerformed (ActionEvent aobj)

     {
        try
        {
            No1=Integer.parseInt(T1.getText());
            No2=Integer.parseInt(T2.getText());

            if(aobj.getSource()==B1)
            {
                L1.setText("Addition is : "+(No1+No2));
            }
            else if(aobj.getSource()==B2)
            {
                L1.setText("Substarction is : "+(No1-No2));
            }
            else if(aobj.getSource()==B3)
            {
                L1.setText("Multipliction is : "+(No1*No2));
            }
            else if(aobj.getSource()==B4)
            {
                L1.setText("Division is : "+(No1/No2));
            }
            
        }
        catch(Exception eobj)
        {}

     }



    
}