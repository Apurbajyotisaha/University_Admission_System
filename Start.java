import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form1 extends JFrame implements ActionListener
{
		JLabel l1,l2;
		JButton b1,b2; 
		JPanel p1;
		
	public Form1()
	{
		super(" Page-1 ");
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,800));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("WELCOME TO UNIVERSITY ADMISSION");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		l1.setForeground(Color.blue);
		l1.setBounds(50,100,820,60);
		p1.add(l1);
		
		l2 = new JLabel("[2020-2021]");
		l2.setFont(new Font("Arial",Font.BOLD,40));
		l2.setForeground(Color.yellow);
		l2.setBounds(350,250,300,60);
		p1.add(l2);
		
		
		b1 = new JButton("GoToMenu");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(640,690,200,50);
		b1.addActionListener(this);
		p1.add(b1);

		b2 = new JButton("Start");
		b2.setFont(new Font("Arial",Font.BOLD,30));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(350,500,200,50);
		b2.addActionListener(this);
		p1.add(b2);
		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
	        if(ae.getSource()==b1)
			{
				Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				Form2 f = new Form2();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}


}





class Form2 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1;
		
	public Form2()
	{
		super(" Page-2 ");
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,800));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("ADMIN CONFERMATION");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(300,80,500,30);
		p1.add(l1);
		
		l2 = new JLabel("Email");
		l2.setFont(new Font("Arial",Font.BOLD,30));
		l2.setForeground(Color.green);
		l2.setBounds(250,200,150,30);
		p1.add(l2);
		
		l3 = new JLabel("Password");
		l3.setFont(new Font("Arial",Font.BOLD,30));
		l3.setForeground(Color.green);
		l3.setBounds(250,300,150,30);
		p1.add(l3);
		
		l4 = new JLabel();
		l4.setFont(new Font("Arial",Font.BOLD,20));
		l4.setForeground(Color.green);
		l4.setBounds(250,400,400,30);
		p1.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(400,200,300,40);
		p1.add(t1);

		t2 = new JTextField();
		t2.setBounds(400,300,300,40);
		p1.add(t2);
		
		b1 = new JButton("Sign in");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.green);
		b1.setBounds(250,450,200,50);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Cancel");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setForeground(Color.green);
		b2.setBounds(500,450,200,50);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("GoToMenu");
		b3.setFont(new Font("Arial",Font.BOLD,20));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(640,690,200,50);
		b3.addActionListener(this);
		p1.add(b3);	
		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
	
			  if(ae.getSource()==b1)
			{
				int a = Integer.parseInt(t2.getText());
			    if(a==1234)
				{
			    Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true);
			    }
				else if(a!=1234)
				{
			     l4.setText("password incorrect");
				}
			}
			
			else if(ae.getSource()==b2)
			{
				Form2 f = new Form2();
				this.setVisible(false);
				f.setVisible(true);
			}
			 else if(ae.getSource()==b3)
			{
				Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}


}







class Form3 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13; 
		JPanel p1;
		
	public Form3()
	{
		super(" Page-3 ");
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,800));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("Information of(GM)");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		
		l1.setForeground(Color.green);
		l1.setBounds(300,30,500,50);
		p1.add(l1);
		
		l2 = new JLabel("GROUP NAME: CODE WARRIORS");
		l2.setFont(new Font("Serif",Font.BOLD,40));
		l2.setForeground(Color.BLUE);
		l2.setBounds(100,110,850,40);
		p1.add(l2);
		
		l3 = new JLabel("PROJECT NAME :");
		l3.setFont(new Font("Serif",Font.BOLD,30));
		l3.setForeground(Color.green);
		l3.setBounds(10,210,600,30);
		p1.add(l3);
		
		l4 = new JLabel("University Admission Management System");
		l4.setFont(new Font("Serif",Font.BOLD,30));
		l4.setForeground(Color.BLUE);
		l4.setBounds(240,270,700,40);
		p1.add(l4);
		
		
		b1 = new JButton("Name");
		b1.setBounds(40,380,250,30);
		b1.setForeground(Color.red);
		b1.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b1);
		
		b2 = new JButton("Id");
		b2.setBounds(290,380,250,30);
		b2.setForeground(Color.red);
		b2.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b2);
		
		b3 = new JButton("Department");
		b3.setBounds(540,380,250,30);
		b3.setForeground(Color.red);
		b3.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b3);
		
		b4 = new JButton("Apurbajyoti Saha");
		b4.setBounds(40,410,250,30);
		b4.setForeground(Color.black);
		b4.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b4);
		
		b5 = new JButton("20-42423-1");
		b5.setBounds(290,410,250,30);
		b5.setForeground(Color.black);
		b5.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b5);
		
		b6 = new JButton("CSE");
		b6.setBounds(540,410,250,30);
		b6.setForeground(Color.black);
		b6.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b6);
		
		b7 = new JButton("Md.Washim Akram");
		b7.setBounds(40,440,250,30);
		b7.setForeground(Color.black);
		b7.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b7);
		
		b8 = new JButton("20-43232-1");
		b8.setBounds(290,440,250,30);
		b8.setForeground(Color.black);
		b8.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b8);
		
		b9 = new JButton("CSE");
		b9.setBounds(540,440,250,30);
		b9.setForeground(Color.black);
		b9.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b9);
		
		b10 = new JButton("Jishan Firdows Navil");
		b10.setBounds(40,470,250,30);
		b10.setForeground(Color.black);
		b10.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b10);
		
		b11 = new JButton("20-42544-1");
		b11.setBounds(290,470,250,30);
		b11.setForeground(Color.black);
		b11.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b11);
		
		b12 = new JButton("CSE");
		b12.setBounds(540,470,250,30);
		b12.setForeground(Color.black);
		b12.setFont(new Font("Arial",Font.BOLD,20));
		p1.add(b12);
		
		
		
	    b13 = new JButton("GoToMenu");
		b13.setFont(new Font("Arial",Font.BOLD,20));
		b13.setForeground(Color.white);
		b13.setBackground(Color.green);
		b13.setBounds(640,690,200,50);
		b13.addActionListener(this);
		p1.add(b13);	
		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
	
			  if(ae.getSource()==b13)
			{
				Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			
		}


}
















class Form4 extends JFrame implements ActionListener
{
		JLabel l1;
		JButton b1,b2,b3,b4,b5,b6; 
		JPanel p1;
		
	public Form4()
	{
		super(" Page-4 ");
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,800));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("Main Menu");
		l1.setFont(new Font("Serif",Font.BOLD,50));
		l1.setForeground(Color.BLUE);
		l1.setBounds(330,30,500,50);
		p1.add(l1);
		
		
		b1 = new JButton("Admin Confirmation");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.red);
		b1.setBounds(300,200,330,40);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Information");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.red);
		b2.setBounds(300,280,330,40);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("UAMS Step");
		b3.setFont(new Font("Arial",Font.BOLD,20));
		b3.setBackground(Color.yellow);
		b3.setForeground(Color.red);
		b3.setBounds(300,360,330,40);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("Login Page");
		b4.setFont(new Font("Arial",Font.BOLD,20));
		b4.setBackground(Color.yellow);
		b4.setForeground(Color.red);
		b4.setBounds(300,440,330,40);
		b4.addActionListener(this);
		p1.add(b4);
		
		b5 = new JButton("Sign Up Page");
		b5.setFont(new Font("Arial",Font.BOLD,20));
		b5.setBackground(Color.yellow);
		b5.setForeground(Color.red);
		b5.setBounds(300,520,330,40);
		b5.addActionListener(this);
		p1.add(b5);
		
		b6 = new JButton("Fee Receipt");
		b6.setFont(new Font("Arial",Font.BOLD,20));
		b6.setBackground(Color.yellow);
		b6.setForeground(Color.red);
		b6.setBounds(300,600,330,40);
		b6.addActionListener(this);
		p1.add(b6);	
		
        this.add(p1);		
	}



		public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==b1)
			{
			    Form2 f = new Form2();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b3)
			{
				Form5 f = new Form5();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b4)
			{
				Form6 f = new Form6();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b5)
			{
				Form7 f = new Form7();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b6)
			{
				Form10 f = new Form10();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}

}









class Form5 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6;
		JButton b1,b2,b3,b4,b5,b6; 
		JPanel p1;
		
	public Form5()
	{
		super(" Page-5 ");
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,800));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		
		b1 = new JButton("Step 1");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.red);
		b1.setBounds(30,300,150,100);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Step 2");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setForeground(Color.red);
		b2.setBounds(200,300,150,100);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Step 3");
		b3.setFont(new Font("Arial",Font.BOLD,20));
		b3.setForeground(Color.red);
		b3.setBounds(370,300,150,100);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("Step 4");
		b4.setFont(new Font("Arial",Font.BOLD,20));
		b4.setForeground(Color.red);
		b4.setBounds(530,300,150,100);
		b4.addActionListener(this);
		p1.add(b4);
		
		b5 = new JButton("Step 5");
		b5.setFont(new Font("Arial",Font.BOLD,20));
		b5.setForeground(Color.red);
		b5.setBounds(700,300,150,100);
		b5.addActionListener(this);
		p1.add(b5);
		
		
		l1 = new JLabel("Signup or Login");
		l1.setFont(new Font("Serif",Font.BOLD,20));
		l1.setForeground(Color.green);
		l1.setBounds(30,420,150,30);
		p1.add(l1);
		
		l2 = new JLabel("Fill up the form");
		l2.setFont(new Font("Serif",Font.BOLD,20));
		l2.setForeground(Color.green);
		l2.setBounds(200,420,150,30);
		p1.add(l2);
		
		l3 = new JLabel("Print the form");
		l3.setFont(new Font("Serif",Font.BOLD,20));
		l3.setForeground(Color.green);
		l3.setBounds(370,420,150,30);
		p1.add(l3);
		
		l4 = new JLabel("Make payment");
		l4.setFont(new Font("Serif",Font.BOLD,20));
		l4.setForeground(Color.green);
		l4.setBounds(530,420,150,30);
		p1.add(l4);
		
		
		l5 = new JLabel("Collect admitcard");
		l5.setFont(new Font("Serif",Font.BOLD,20));
		l5.setForeground(Color.green);
		l5.setBounds(700,420,200,30);
		p1.add(l5);
		
		 b6 = new JButton("GoToMenu");
		b6.setFont(new Font("Arial",Font.BOLD,20));
		b6.setForeground(Color.white);
		b6.setBackground(Color.green);
		b6.setBounds(640,690,200,50);
		b6.addActionListener(this);
		p1.add(b6);	
		
		l6 = new JLabel("UAMS STEP");
		l6.setFont(new Font("Serif",Font.BOLD,50));
		l6.setForeground(Color.BLUE);
		l6.setBounds(330,30,500,50);
		p1.add(l6);
		
        this.add(p1);		
	}



		public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==b6)
			{
			    Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}

}








class Form6 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3,b4; 
		JPanel p1;
		
	public Form6()
	{
		super(" Page-6 ");
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,800));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("Login Page");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		l1.setForeground(Color.BLUE);
		l1.setBounds(300,30,300,50);
		p1.add(l1);
		
		l2 = new JLabel("User Name");
		l2.setFont(new Font("Arial",Font.PLAIN,30));
		l2.setForeground(Color.green);
		l2.setBounds(250,200,250,40);
		p1.add(l2);
		
		l3 = new JLabel("Password");
		l3.setFont(new Font("Arial",Font.PLAIN,30));
		l3.setForeground(Color.green);
		l3.setBounds(250,300,250,40);
		p1.add(l3);
		
		l4 = new JLabel();
		l4.setFont(new Font("Arial",Font.BOLD,20));
		l4.setForeground(Color.red);
		l4.setBounds(250,400,400,30);
		p1.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(450,200,250,40);
		p1.add(t1);

		t2 = new JTextField();
		t2.setBounds(450,300,250,40);
		p1.add(t2);
		
		b1 = new JButton("Login");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.black);
		b1.setBounds(250,450,200,40);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Cancel");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setForeground(Color.black);
		b2.setBounds(470,450,200,40);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Sign Up");
		b3.setFont(new Font("Arial",Font.BOLD,20));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(20,690,200,50);
		b3.addActionListener(this);
		p1.add(b3);	
		
		 b4 = new JButton("GoToMenu");
		b4.setFont(new Font("Arial",Font.BOLD,20));
		b4.setForeground(Color.white);
		b4.setBackground(Color.green);
		b4.setBounds(640,690,200,50);
		b4.addActionListener(this);
		p1.add(b4);	
		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
	
			   if(ae.getSource()==b1)
			{
				int a = Integer.parseInt(t2.getText());
			    if(a==12345)
				{
			    Form8 f = new Form8();
				this.setVisible(false);
				f.setVisible(true);
			    }
				else if(a!=12345)
				{
			     l4.setText("password incorrect");
				}
			}
			else if(ae.getSource()==b2)
			{
				Form6 f = new Form6();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b3)
			{
				Form7 f = new Form7();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}


}




class Form7 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2,t3;
		JButton b1,b2; 
		JPanel p1;
		
	public Form7()
	{
		super(" Page-7 ");
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,800));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("Sign Up Page");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		l1.setForeground(Color.blue);
		l1.setBounds(300,30,300,50);
		p1.add(l1);
		
		l2 = new JLabel("User Name");
		l2.setFont(new Font("Arial",Font.BOLD,25));
		l2.setForeground(Color.green);
		l2.setBounds(250,200,250,30);
		p1.add(l2);
		
		l3 = new JLabel("Password");
		l3.setFont(new Font("Arial",Font.BOLD,25));
		l3.setForeground(Color.green);
		l3.setBounds(250,300,250,30);
		p1.add(l3);
		
		l4 = new JLabel("Confirm Password");
		l4.setFont(new Font("Arial",Font.BOLD,25));
		l4.setForeground(Color.green);
		l4.setBounds(250,400,250,30);
		p1.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(250,250,300,40);
		p1.add(t1); 

		t2 = new JTextField();
		t2.setBounds(250,350,300,40);
		p1.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(250,450,300,40);
		p1.add(t3);
		
		b1 = new JButton("Submit");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.black);
		b1.setBounds(250,550,200,40);
		b1.addActionListener(this);
		p1.add(b1);
		
		
		b2 = new JButton("GoToMenu");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(640,690,200,50);
		b2.addActionListener(this);
		p1.add(b2);		
		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
	
			  if(ae.getSource()==b1)
			{
				Form8 f = new Form8();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}


}


class Form8 extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	JButton b1,b2;
	public Form8()
	{
    super (" Page-8 ");
	this. setSize(900,800);
	this. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	p1 = new  JPanel();
	p1.setSize (new Dimension(900,800));
	p1.setBackground(Color.gray);
	p1.setLayout(null);
	
	
	l1 = new JLabel("---- Fillup The Form----");
	l1.setBounds(200,8,600,40);
	l1.setForeground(Color.blue);
	l1.setFont(new Font ("Serif",Font.BOLD,35));
	p1.add(l1);
	
	
	l1 = new JLabel("Student's Name      :");
	l1.setBounds(8,50,180,20);
	l1.setForeground(Color.black);
	l1.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l1);
	 
	t1 = new JTextField();
	t1.setBounds(180,50,350,25);
	t1.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t1);
	
	l2 = new JLabel("Father's Name        :");
	l2.setBounds(8,100,180,20);
	l2.setForeground(Color.black);
	l2.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l2);
	 
	t2 = new JTextField();
	t2.setBounds(180,100,350,25);
	t2.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t2);
	
	l3 = new JLabel("Mother's Name       :");
	l3.setBounds(8,150,180,20);
    l3.setForeground(Color.black);
	l3.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l3);
	 
	t3 = new JTextField();
	t3.setBounds(180,150,350,25);
	t3.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t3);
	
	l4 = new JLabel("Present Address      :");
	l4.setBounds(8,200,180,20);
    l4.setForeground(Color.black);
	l4.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l4);
	 
	t4 = new JTextField();
	t4.setBounds(180,200,350,25);
	t4.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t4);
	
	l5 = new JLabel("Permanent Address :");
	l5.setBounds(8,250,180,20);
    l5.setForeground(Color.black);
	l5.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l5);
	 
	t5 = new JTextField();
	t5.setBounds(180,250,350,25);
	t5.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t5);
	
	
	l6 = new JLabel("Registation Number :");
	l6.setBounds(8,350,200,23);
    l6.setForeground(Color.black);
	l6.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l6);
	 
	t6 = new JTextField();
	t6.setBounds(180,350,220,25);
	t6.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t6);
	
	
	l7 = new JLabel("SSC Passing Year :");
	l7.setBounds(8,400,200,23);
    l7.setForeground(Color.black);
	l7.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l7);
	
	t7 = new JTextField();
	t7.setBounds(180,400,150,25);
	t7.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t7);
	
	l8 = new JLabel("SSC Roll              :");
	l8.setBounds(8,450,150,23);
    l8.setForeground(Color.black);
	l8.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l8);
	
	t8 = new JTextField();
	t8.setBounds(180,450,150,25);
	t8.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t8);
	
	l9 = new JLabel("SSC GPA             :");
	l9.setBounds(8,500,150,23);
    l9.setForeground(Color.black);
	l9.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l9);
	
	t9 = new JTextField();
	t9.setBounds(180,500,150,25);
	t9.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t9);
	
	l10 = new JLabel("HSC Passing Year :");
	l10.setBounds(500,400,200,23);
    l10.setForeground(Color.black);
	l10.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l10);
	
	t10 = new JTextField();
	t10.setBounds(680,400,150,25);
	t10.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t10);
	
	l11 = new JLabel("HSC Roll              :");
	l11.setBounds(500,450,150,23);
    l11.setForeground(Color.black);
    l11.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l11);
	
	t11 = new JTextField();
	t11.setBounds(680,450,150,25);
	t11.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t11);
	
	l12 = new JLabel("HSC GPA              :");
	l12.setBounds(500,500,160,23);
    l12.setForeground(Color.black);
	l12.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l12);
	
	t12 = new JTextField();
	t12.setBounds(680,500,150,25);
	t12.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t12);
	
	
	l13 = new JLabel("Email Id              :");
	l13.setBounds(8,600,150,23);
    l13.setForeground(Color.black);
	l13.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l13);
	
	t13 = new JTextField();
	t13.setBounds(180,600,220,25);
	t13.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t13);
	
	l14 = new JLabel("Phone Number    :");
	l14.setBounds(8,650,220,23);
    l14.setForeground(Color.black);
	l14.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(l14);
	
	t14 = new JTextField();
	t14.setBounds(180,650,220,25);
	t14.setFont(new Font ("Serif",Font.BOLD,18));
	p1.add(t14);
	
	    b1 = new JButton("Next");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(10,710,160,40);
		b1.addActionListener(this);
		p1.add(b1);
		
		
		b2 = new JButton("GoToMenu");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(640,690,200,50);
		b2.addActionListener(this);
		p1.add(b2);	
	
		this.add(p1);
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			
	
			  if(ae.getSource()==b1)
			{
				Form9 f = new Form9();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}
	
	
}


class Form9 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1;
		
	public Form9()
	{
		super(" Page-9 ");
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,800));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("Make Payment");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		l1.setForeground(Color.BLUE);
		l1.setBounds(300,10,300,50);
		p1.add(l1);
		
		l2 = new JLabel("Account Number");
		l2.setFont(new Font("Arial",Font.BOLD,25));
		l2.setForeground(Color.green);
		l2.setBounds(250,200,200,40);
		p1.add(l2);
		
		l3 = new JLabel("Transaction Id");
		l3.setFont(new Font("Arial",Font.BOLD,25));
		l3.setForeground(Color.green);
		l3.setBounds(250,300,200,40);
		p1.add(l3);
		
		l4 = new JLabel("Amount                1000 tk");
		l4.setFont(new Font("Arial",Font.BOLD,30));
		l4.setForeground(Color.green);
		l4.setBounds(250,400,500,40);
		p1.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(450,200,200,40);
		p1.add(t1);

		t2 = new JTextField();
		t2.setBounds(450,300,200,40);
		p1.add(t2);
		
		
		b1 = new JButton("Submit");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.black);
		b1.setBounds(200,500,200,40);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Cancel");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setForeground(Color.black);
		b2.setBounds(450,500,200,40);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Back");
		b3.setFont(new Font("Arial",Font.BOLD,20));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(640,690,200,40);
		b3.addActionListener(this);
		p1.add(b3);	
		
		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
	
			 if(ae.getSource()==b1)
			{
				Form10 f = new Form10();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				Form8 f = new Form8();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			
		}


}






class Form10 extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2;
	JButton b1,b2;
	public Form10()
	{
    super ("Page-10");
	this. setSize(900,800);
	this. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	p1 = new  JPanel();
	p1.setSize (new Dimension(900,800));
	p1.setBackground(Color.gray);
	p1.setLayout(null);
	
	
	l1 = new JLabel(" Fee Receipt ");
	l1.setBounds(300,8,550,40);
	l1.setForeground(Color.blue);
	l1.setFont(new Font ("Serif",Font.BOLD,35));
	p1.add(l1);
	
	l2 = new JLabel(" Date :__________ ");
	l2.setBounds(0,40,250,30);
	l2.setForeground(Color.white);
	l2.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l2);
	
	l3 = new JLabel(" Name: __________ ");
	l3.setBounds(0,80,250,30);
	l3.setForeground(Color.white);
	l3.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l3);
	
	l4 = new JLabel(" Receipt No:1 ");
	l4.setBounds(650,40,250,30);
	l4.setForeground(Color.white);
	l4.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l4);
	
	l5 = new JLabel(" Session:2020-2021");
	l5.setBounds(650,80,250,30);
	l5.setForeground(Color.white);
	l5.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l5);
	
	
	l6 = new JLabel(" Section                                         Amount ");
	l6.setBounds(200,250,550,30);
	l6.setForeground(Color.black);
	l6.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l6);
	
	
	l7 = new JLabel(" Admission                                   25,000.00 ");
	l7.setBounds(200,300,550,30);
	l7.setForeground(Color.black);
	l7.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l7);
	
	l8 = new JLabel(" Tuition                                          82,500.00 ");
	l8.setBounds(200,350,550,30);
	l8.setForeground(Color.black);
	l8.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l8);
	
	l9 = new JLabel(" Lab Fee                                        5000.00 ");
	l9.setBounds(200,400,550,30);
	l9.setForeground(Color.black);
	l9.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l9);
	
	l10 = new JLabel(" Development                               10000.00 ");
	l10.setBounds(200,450,550,30);
	l10.setForeground(Color.black);
	l10.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l10);
	
    l11 = new JLabel(" Activity                                        9000.00 ");
	l11.setBounds(200,500,550,30);
	l11.setForeground(Color.black);
	l11.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l11);
	
	l12 = new JLabel(" Miscellaneous                              3500.00 ");
	l12.setBounds(200,550,550,30);
	l12.setForeground(Color.black);
	l12.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l12);
	
	l13 = new JLabel(" Total                                            135,000.00 ");
	l13.setBounds(200,600,550,30);
	l13.setForeground(Color.black);
	l13.setFont(new Font ("Serif",Font.BOLD,25));
	p1.add(l13);
	
	
	    b1 = new JButton("GoToMenu");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(640,690,200,40);
		b1.addActionListener(this);
		p1.add(b1);	
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(20,690,150,40);
		b2.addActionListener(this);
		p1.add(b2);
	
	

	
			this.add(p1);
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			
	
			  if(ae.getSource()==b1)
			{
				Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				Form11 f = new Form11();
				this.setVisible(false);
				f.setVisible(true);
			}
		
			
		}
}





class Form11 extends JFrame implements ActionListener
{
		JLabel l1;
		JButton b1,b2; 
		JPanel p1;
		
	public Form11()
	{
		super(" Page-11 ");
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,800));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("Thank You");
		l1.setFont(new Font("Serif",Font.BOLD,100));
		l1.setForeground(Color.black);
		l1.setBounds(200,200,700,120);
		p1.add(l1);
		
		
		b1 = new JButton("Logout");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setForeground(Color.red);
		b1.setBounds(200,500,200,40);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Exit");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setForeground(Color.red);
		b2.setBounds(550,500,200,40);
		b2.addActionListener(this);
		p1.add(b2);
		
		

		
        this.add(p1);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
	
			  if(ae.getSource()==b1)
			{
				Form1 f = new Form1();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				System.exit(0);
			}
			
		}


}







public class Start 
{
	public static void main(String [] args)
	{
		Form1 f1 = new Form1();
		f1.setVisible(true);
	}
}