import java.awt.* ;
import java.awt.event.* ;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Myframe implements ActionListener
{
 static int operator = 0 ;
 static char symbol = '_' ;
 String str1 = new String(" ") ;
 String str2 = new String("0");
 String str3 = new String("0");
 Frame f;
 TextField t;
 Button b[] ;
 Myframe(String s)
 {
   int i;
   String s1[] = {"0",".","=","-","1","2","3","+","4","5","6","/","7","8","9","*"};
   b=new Button[16] ;
   f = new Frame(s) ;
   t = new TextField() ;
   t.setBounds(20 ,40 ,250 ,60) ;
   f.add(t) ;

   
   f.addWindowListener(new Close()) ;
   f.addMouseListener(new BgColor(this)) ;

   for(i=0 ; i<b.length ; i++)
   {
    
     b[i] = new Button(s1[i]) ;
     b[i].addActionListener(this) ;

     if(i>=0 && i<=3)
      {
        b[i].setBounds(20 +(i)*62,325 ,62 ,65) ;
        f.add(b[i]) ;
       }
      if(i>=4 && i<=7)
      {
        b[i].setBounds(20+((i-3)-1)*62,250,62,65) ;
        f.add(b[i]);
       }
      if(i>=8 && i<=11)
      {
        b[i].setBounds(20+((i-7)-1)*62,175,62,65) ;
        f.add(b[i]) ;
       }
      if(i>=12 && i<=15)
      {
        b[i].setBounds(20+((i-11)-1)*62,100,62,65) ;
        f.add(b[i]) ;
       }  
     
     
       }
   f.setLayout(null);
   f.setSize(300,400) ;
   f.setVisible(true);
}

public void actionPerformed(ActionEvent e)
 {
 
   if(e.getSource() == b[0])
    {
      if(operator == 1)
       {
         str3 = str3 + "0" ; 
        }
      else
       {
        str2 = str2 + "0" ;
        }
      str1 = str1 + "0" ;
      t.setText(str1) ;
     }
    if(e.getSource() == b[4])
    {   
      if(operator == 1)
       {
         str3 = str3 + "1" ;
        }   
      else
       {
         str2 = str2 + "1" ;
         }
      str1 = str1 + "1" ;
      t.setText(str1) ;
     }
    if(e.getSource() == b[5])
    {
     if(operator == 1)
       {
         str3 = str3 + "2" ;
        }   
      else
       {
         str2 = str2 + "2" ;
         }
      str1 = str1 + "2" ;
      t.setText(str1) ;
     }
    if(e.getSource() == b[6])
    {
     if(operator == 1)
       {
         str3 = str3 + "3" ;
        }   
      else
       {
         str2 = str2 + "3" ;
         }
      str1 = str1 + "3" ;
      t.setText(str1) ;
     }
    if(e.getSource() == b[8])
    {
     if(operator == 1)
       {
         str3 = str3 + "4" ;
        }   
      else
       {
         str2 = str2 + "4" ;
         }
      str1 = str1 + "4" ;
      t.setText(str1) ;
     }
    if(e.getSource() == b[9])
    {
     if(operator == 1)
       {
         str3 = str3 + "5" ;
        }   
      else
       {
         str2 = str2 + "5" ;
         }
      str1 = str1 + "5" ;
      t.setText(str1) ;
     }
    if(e.getSource() == b[10])
    {
     if(operator == 1)
       {
         str3 = str3 + "6" ;
        }   
      else
       {
         str2 = str2 + "6" ;
         }
      str1 = str1 + "6" ;
      t.setText(str1) ;
     }
   if(e.getSource() == b[12])
    {
      if(operator == 1)
       {
         str3 = str3 + "7" ;
        }   
      else
       {
         str2 = str2 + "7" ;
         }
      str1 = str1 + "7" ;
      t.setText(str1) ;
     }
    if(e.getSource() == b[13])
    {
     if(operator == 1)
       {
         str3 = str3 + "8" ;
        }   
      else
       {
         str2 = str2 + "8" ;
         }  
      str1 = str1 + "8" ;
      t.setText(str1) ;
     }
     if(e.getSource() == b[1])
    {
     if(operator == 1)
       {
         str3 = str3 + "." ;
 
        }   
      else 
       {
         str2 = str2 + "." ;
         } 
  
       str1 = str1 + "." ;
      t.setText(str1) ;
     }
    if(e.getSource() == b[14])
    {
     if(operator == 1)
       {
         str3 = str3 + "9" ;
        }   
      else
       {
         str2 = str2 + "9" ;
         }
      str1 = str1 + "9" ;
      t.setText(str1) ;
     }
     if(e.getSource() == b[7] )
      {
       t.setText(str1 + "+") ; 
        str1 = str1 + "+" ;
       operator = 1 ;
       symbol = '+' ;
       }
     if(e.getSource() == b[3] )
      {
       t.setText(str1 + "-") ; 
       str1 = str1 + "-" ;
       operator = 1 ;
       symbol = '-' ;
       }
     if(e.getSource() == b[11] )
      {
       t.setText(str1 + "/") ; 
       str1 = str1 + "/" ;
       operator = 1 ;
       symbol = '/' ;
       }
      if(e.getSource() == b[15] )
      {
       t.setText(str1 + "*") ; 
       str1 = str1 + "*" ;
       operator = 1 ;
       symbol = '*' ;
        }
      if(e.getSource() == b[2] )
      {
       if(symbol == '+')
       { 
       
        float n1 = Float.parseFloat(str2) ;
        float n2 = Float.parseFloat(str3) ;
        float n3 = n1 + n2 ;
        String z = String.valueOf(n3) ;
        t.setText(z) ;
        operator = 0 ;
        symbol= '_' ;
        str3 = "0" ;
         str1 = " " ;
         str2 = "0" ;
        }
       else if(symbol ==  '*')
        {
          float n1 = Float.parseFloat(str2) ;
          float n2 = Float.parseFloat(str3) ;
          float n3 = n1*n2 ;
         String z = String.valueOf(n3) ;
         t.setText(z);
         operator = 0 ;
         symbol= '_' ;
         str3 = "0" ;
         str1 = " " ;
         str2 = "0" ;
        }
        else if(symbol ==  '/')
        {
         float n1 = Float.parseFloat(str2) ;
         float n2 = Float.parseFloat(str3) ;
         float n3 = n1/n2 ;
         String z = String.valueOf(n3) ;
         t.setText(z);
         operator = 0 ;
         symbol= '_' ;
         str3 = "0" ;
         str1 = " " ;
         str2 = "0" ;
        }
        else if(symbol ==  '-')
        {
         float n1 = Float.parseFloat(str2) ;
         float n2 = Float.parseFloat(str3) ;
         float n3 = n1-n2 ;
         String z = String.valueOf(n3) ;
         t.setText(z);
         operator = 0 ;
         symbol= '_' ;
         str3 = "0" ;
         str1 = " " ;
         str2 = "0" ;
        }
        
     }
 } 

 public static void main(String... args)
 {
   new Myframe("my calculator") ;
 }

}

class Close extends WindowAdapter
{
  public void windowClosing(WindowEvent e1)
  {
    System.exit(0) ;
  }
}

class BgColor extends MouseAdapter
{
  Myframe f1 ;
  BgColor(Myframe f)
  {
    this.f1 = f ;
   }
 
  public void mouseClicked(MouseEvent e1)
   {
     f1.f.setBackground(Color.green) ;  
     f1.t.setBackground(Color.lightGray) ;
   }

}
