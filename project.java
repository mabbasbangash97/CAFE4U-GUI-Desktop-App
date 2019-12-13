import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.io.*;

public class project{
	public static void main(String [] args){
		menu obj = new menu("CAFE4'U'");

	}

}

class menu extends JFrame {


	menu(String title){

	super(title);

	JFrame start=new JFrame(title);
	JFrame items=new JFrame(title);
	JFrame last=new JFrame(title);

	start.setLayout(null);
	start.setSize(700,700);
	start.setResizable(false);
	start.setDefaultCloseOperation(EXIT_ON_CLOSE);
	start.getContentPane().setBackground(Color.BLACK);
	
	items.setLayout(null);
	items.setSize(1100,1020);
	items.setResizable(false);
	items.setDefaultCloseOperation(EXIT_ON_CLOSE);
	//items.getContentPane().setBackground(Color.BLACK);

	last.setLayout(null);
	last.setSize(500,540);
	last.setResizable(false);
	last.setDefaultCloseOperation(EXIT_ON_CLOSE);
	//last.getContentPane().setBackground(Color.BLACK);

	JLabel lbl=new JLabel("",new ImageIcon("start.jpg"),JLabel.CENTER);
	lbl.setBounds(0,0,700,675);
//	lbl.setFont(new Font("Consolas",Font.BOLD,80));
//	lbl.setForeground(Color.RED);
	
	JButton menu=new JButton("View Menu!");
	menu.setBounds(230,170,200,100);
	menu.setOpaque(false);
	menu.setContentAreaFilled(false);
	menu.setBorderPainted(false);
	menu.setFont(new Font("Consolas",Font.BOLD,0));
	start.add(menu);
	menu.setVisible(true);

	JButton exit=new JButton("Exit!");
	exit.setBounds(230,290,200,100);
	exit.setOpaque(false);
	exit.setContentAreaFilled(false);
	exit.setBorderPainted(false);
	exit.setFont(new Font("Consolas",Font.BOLD,0));
	start.add(exit);
	exit.setVisible(true);

	
	JTextField box=new JTextField("Enter Comments Here...");
	box.setBounds(50,480,600,80);
	box.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0)));
	box.setFont(new Font("Consolas",Font.BOLD,18));
	box.setOpaque(false);
	box.setForeground(Color.BLACK);
	box.setBackground(new Color(0,0,0,0));
	start.add(box);
	box.setVisible(true);

	start.add(lbl);
	lbl.setVisible(true);
	JButton submit=new JButton("Submit!");
	submit.setBounds(520,578,130,50);
	submit.setOpaque(false);
	submit.setContentAreaFilled(false);
	submit.setBorderPainted(false);
	submit.setFont(new Font("Consolas",Font.BOLD,0));
	start.add(submit);
	submit.setVisible(true);

	
	////////////////////////////////////END of 1st FRAME /////////////////////

	JLabel heading =new JLabel("CAFE MENU");
	heading.setBounds(370,30,400,150);
	heading.setFont(new Font("Consolas",Font.BOLD,70));
	heading.setForeground(Color.RED);
	items.add(heading);
	heading.setVisible(true);


	JButton samosa=new JButton("Samosa");
	samosa.setBounds(50,200,100,100);
	samosa.setBorder(null);
	try {
    Image img = ImageIO.read(getClass().getResource("samosa.jpg"));
    samosa.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("Samosa.jpg not found!");
  	}
	items.add(samosa);
	samosa.setVisible(true);

	JButton fries=new JButton("Fries");
	fries.setBounds(50,305,100,100);
	fries.setBorder(null);
	try {
    Image img = ImageIO.read(getClass().getResource("fries.jpg"));
    fries.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("fries.jpg not found!");
  	}
	items.add(fries);
	fries.setVisible(true);

	JButton roll=new JButton("ROLL");
	roll.setBounds(50,410,100,100);
	roll.setBorder(null);
	try {
    Image img = ImageIO.read(getClass().getResource("roll.jpg"));
    roll.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("Tea.bmp not found!");
  	}
	items.add(roll);
	roll.setVisible(true);

	JButton chaat=new JButton("CHAAT");
	chaat.setBounds(50,515,100,100);
	chaat.setBorder(null);
	try {
    Image img = ImageIO.read(getClass().getResource("chaat.jpg"));
    chaat.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("chaat.jpg not found!");
  	}
	items.add(chaat);
	chaat.setVisible(true);

	JButton tea=new JButton("TEA");
	tea.setBounds(50,620,100,100);
	tea.setBorder(null);
	try {
    Image img = ImageIO.read(getClass().getResource("tea.bmp"));
    tea.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("Tea.bmp not found!");
  	}
	items.add(tea);
	tea.setVisible(true);

	JButton biryani=new JButton("BIRYANI");
	biryani.setBounds(610,200,100,100);
	biryani.setBorder(null);
	try {
    Image img = ImageIO.read(getClass().getResource("biryani.jpg"));
    biryani.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("biryani.jpg not found!");
  	}
	items.add(biryani);
	biryani.setVisible(true);

	JButton drink=new JButton("COLD DRINK");
	drink.setBounds(610,305,100,100);
	try {
    Image img = ImageIO.read(getClass().getResource("drink.jpg"));
    drink.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("drink.jpg not found!");
  	}
	items.add(drink);
	drink.setVisible(true);

	JButton paratha=new JButton("PARATHA ROLL");
	paratha.setBounds(610,410,100,100);
	paratha.setBorder(null);
	try {
    Image img = ImageIO.read(getClass().getResource("paratha.jpg"));
    paratha.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("paratha.jpg not found!");
  	}
	items.add(paratha);
	paratha.setVisible(true);

	JButton spaghetti=new JButton("SPAGHETTI");
	spaghetti.setBounds(610,515,100,100);
	spaghetti.setBorder(null);
	try {
    Image img = ImageIO.read(getClass().getResource("spaghetti.jpeg"));
    spaghetti.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("spaghetti.jpeg not found!");
  	}
	items.add(spaghetti);
	spaghetti.setVisible(true);

	JButton fruit=new JButton("FRUIT CHAAT");
	fruit.setBounds(610,620,100,100);
	fruit.setBorder(null);
	try {
    Image img = ImageIO.read(getClass().getResource("fruit.jpg"));
    fruit.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("fruit.jpg not found!");
  	}
	items.add(fruit);
	fruit.setVisible(true);

	JButton q1=new JButton("Samosa+1");
	q1.setBounds(160,225,120,50);
	q1.setFont(new Font("Ariel",Font.BOLD,15));
	q1.setForeground(Color.BLACK);
	items.add(q1);
	q1.setVisible(true);

	JButton q2=new JButton("Fries+1");
	q2.setBounds(160,330,120,50);
	q2.setFont(new Font("Ariel",Font.BOLD,15));
	q2.setForeground(Color.BLACK);
	items.add(q2);
	q2.setVisible(true);

	JButton q3=new JButton("Roll+1");
	q3.setBounds(160,435,120,50);
	q3.setFont(new Font("Ariel",Font.BOLD,15));
	q3.setForeground(Color.BLACK);
	items.add(q3);
	q3.setVisible(true);

	JButton q4=new JButton("Chaat+1");
	q4.setBounds(160,540,120,50);
	q4.setFont(new Font("Ariel",Font.BOLD,15));
	q4.setForeground(Color.BLACK);
	items.add(q4);
	q4.setVisible(true);

	JButton q5=new JButton("Tea+1");
	q5.setBounds(160,645,120,50);
	q5.setFont(new Font("Ariel",Font.BOLD,15));
	q5.setForeground(Color.BLACK);
	items.add(q5);
	q5.setVisible(true);

	JButton q6=new JButton("Biryani+1");
	q6.setBounds(720,225,120,50);
	q6.setFont(new Font("Ariel",Font.BOLD,15));
	q6.setForeground(Color.BLACK);
	items.add(q6);
	q6.setVisible(true);

	JButton q7=new JButton("Drink+1");
	q7.setFont(new Font("Ariel",Font.BOLD,15));
	q7.setForeground(Color.BLACK);
	q7.setBounds(720,330,120,50);
	items.add(q7);
	q7.setVisible(true);

	JButton q8=new JButton("Paratha+1");
	q8.setBounds(720,435,120,50);
	q8.setFont(new Font("Ariel",Font.BOLD,15));
	q8.setForeground(Color.BLACK);
	items.add(q8);
	q8.setVisible(true);

	JButton q9=new JButton("Spaghetti+1");
	q9.setBounds(720,540,120,50);
	q9.setFont(new Font("Ariel",Font.BOLD,15));
	q9.setForeground(Color.BLACK);
	items.add(q9);
	q9.setVisible(true);

	JButton q10=new JButton("Fruit+1");
	q10.setBounds(720,645,120,50);
	q10.setFont(new Font("Ariel",Font.BOLD,15));
	q10.setForeground(Color.BLACK);
	items.add(q10);
	q10.setVisible(true);

	JTextField t1=new JTextField();
	t1.setEditable(false);
	t1.setFont(new Font("Times New Roman",Font.BOLD,23));
	t1.setBounds(290,200,200,100);
	items.add(t1);
	t1.setVisible(true);

	JTextField t2=new JTextField();
	t2.setEditable(false);
	t2.setFont(new Font("Times New Roman",Font.BOLD,23));
	t2.setBounds(290,305,200,100);
	items.add(t2);
	t2.setVisible(true);

	JTextField t3=new JTextField();
	t3.setEditable(false);
	t3.setFont(new Font("Times New Roman",Font.BOLD,23));
	t3.setBounds(290,410,200,100);
	items.add(t3);
	t3.setVisible(true);

	JTextField t4=new JTextField();
	t4.setEditable(false);
	t4.setFont(new Font("Times New Roman",Font.BOLD,23));
	t4.setBounds(290,515,200,100);
	items.add(t4);
	t4.setVisible(true);

	JTextField t5=new JTextField();
	t5.setEditable(false);
	t5.setFont(new Font("Times New Roman",Font.BOLD,23));
	t5.setBounds(290,620,200,100);
	items.add(t5);
	t5.setVisible(true);

	JTextField t6=new JTextField();
	t6.setEditable(false);
	t6.setFont(new Font("Times New Roman",Font.BOLD,23));
	t6.setBounds(850,200,200,100);
	items.add(t6);
	t6.setVisible(true);

	JTextField t7=new JTextField();
	t7.setEditable(false);
	t7.setFont(new Font("Times New Roman",Font.BOLD,23));
	t7.setBounds(850,305,200,100);
	items.add(t7);
	t7.setVisible(true);

	JTextField t8=new JTextField();
	t8.setEditable(false);
	t8.setFont(new Font("Times New Roman",Font.BOLD,23));
	t8.setBounds(850,410,200,100);
	items.add(t8);
	t8.setVisible(true);

	JTextField t9=new JTextField();
	t9.setEditable(false);
	t9.setFont(new Font("Times New Roman",Font.BOLD,23));
	t9.setBounds(850,515,200,100);
	items.add(t9);
	t9.setVisible(true);

	JTextField t10=new JTextField();
	t10.setEditable(false);
	t10.setFont(new Font("Times New Roman",Font.BOLD,23));
	t10.setBounds(850,620,200,100);
	items.add(t10);
	t10.setVisible(true);

	JButton checkout=new JButton("CHECKOUT!");
	checkout.setBounds(780,750,200,100);
	/*try {
    Image img = ImageIO.read(getClass().getResource("checkout.jpg"));
    checkout.setIcon(new ImageIcon(img));
  	} catch (Exception ex) {
    System.out.println("checkout.jpg not found!");
  	}*/
	items.add(checkout);
	checkout.setVisible(true);

	JButton reset=new JButton("Reset!");
	reset.setBounds(50,750,150,100);
	reset.setFont(new Font("Consolas", Font.BOLD, 24));
	items.add(reset);
	items.setVisible(true);

	JLabel amount=new JLabel("TOTAL AMOUNT");
	amount.setFont(new Font("Times New Roman",Font.BOLD,30));
	amount.setBounds(380,765,300,80);
	amount.setForeground(Color.BLACK);
	amount.setVisible(true);
	items.add(amount);

	JTextField total=new JTextField("0");
	total.setBounds(300,830,400,110);
	total.setEditable(false);
	total.setFont(new Font("Consolas",Font.BOLD,60));
	total.setForeground(Color.RED);
	total.setBackground(Color.GRAY);
	items.add(total);
	total.setVisible(true);

	//////////////////////////////////////////////Frame 2 ends

	JLabel end=new JLabel();
	end.setBounds(175,250,200,100);
	end.setFont(new Font("Times New Roman",Font.BOLD,40));
	end.setForeground(Color.BLACK);
	last.add(end);
	end.setVisible(true);

	JButton exit2=new JButton("EXIT");
	exit2.setBounds(312,428,100,50);
	exit2.setFont(new Font("Verdana",Font.BOLD,20));
	exit2.setForeground(Color.BLACK);
	exit2.setOpaque(false);
	exit2.setContentAreaFilled(false);
	exit2.setBorderPainted(false);
	last.add(exit2);
	exit2.setVisible(true);

	JLabel db=new JLabel("",new ImageIcon("last.jpg"),JLabel.CENTER);
	db.setBounds(0,0,500,500);
	last.add(db);
	last.setVisible(true);



	////////////////////// FRAMES VISIBILITY


	start.setVisible(true); ////////////	FRAME 1 

	items.setVisible(false); ///////////     FRAME 2

	last.setVisible(false); /////////////	FRAME 3

	/////////////////////////         BUTTONS REGISTERATION /////////////////////////////////////////////

	menu.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	exit.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	submit.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q1.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q2.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q3.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q4.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q5.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q6.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q7.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q8.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q9.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	q10.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	reset.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	checkout.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));
	exit2.addActionListener(new actionHandler(start,items,last,menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2,box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total,end));

	}

}

class actionHandler implements ActionListener{
	JFrame start,items,last;
	JButton menu,exit,submit,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,reset,checkout,exit2;
	JTextField box,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,total;
	JLabel end;
	actionHandler(JFrame start,JFrame items,JFrame last,JButton menu,JButton exit,JButton submit,JButton q1,JButton q2,JButton q3,JButton q4,JButton q5,JButton q6,JButton q7,JButton q8,JButton q9,JButton q10,JButton reset,JButton checkout,JButton exit2,JTextField box,JTextField t1,JTextField t2,JTextField t3,JTextField t4,JTextField t5,JTextField t6,JTextField t7,JTextField t8,JTextField t9,JTextField t10,JTextField total,JLabel end){
		this.start=start;
		this.items=items;
		this.last=last;	
		this.menu=menu;
		this.exit=exit;
		this.submit=submit;
		this.q1=q1;
		this.q2=q2;
		this.q3=q3;
		this.q4=q4;
		this.q5=q5;
		this.q6=q6;
		this.q7=q7;
		this.q8=q8;
		this.q9=q9;
		this.q10=q10;
		this.reset=reset;
		this.checkout=checkout;
		this.exit2=exit2;
		this.box=box;
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
		this.t4=t4;
		this.t5=t5;
		this.t6=t6;
		this.t7=t7;
		this.t8=t8;
		this.t9=t9;
		this.t10=t10;
		this.total=total;
		this.end=end;

	}

	public void actionPerformed(ActionEvent ev){

		String op="";
		String zero="0";
		String blank="";
		int reset_button=1;
		int q_1=0,q_2=0,q_3=0,q_4=0,q_5=0,q_6=0,q_7=0,q_8=0,q_9=0,q_10=0,bill=0,qt1=0,qt2=0,qt3=0,qt4=0,qt5=0,qt6=0,qt7=0,qt8=0,qt9=0,qt10=0; //for value of t
		String qst1="",qst2=" ",qst3=" ",qst4=" ",qst5=" ",qst6=" ",qst7=" ",qst8=" ",qst9=" ",qst10=" "; // text of t
		int q1_i=1,q2_i=1,q3_i=1,q4_i=1,q5_i=1,q6_i=1,q7_i=1,q8_i=1,q9_i=1,q10_i=1;
		String q1_st="Samosa+"+q1_i,q2_st="Fries+"+q2_i,q3_st="Roll+"+q3_i,q4_st="Chaat+"+q4_i,q5_st="Tea+"+q5_i,q6_st="Biryani+"+q6_i,q7_st="Drink+"+q7_i,q8_st="Paratha+"+q8_i,q9_st="Spaghetti+"+q9_i,q10_st="Fruit+"+q10_i;
		String total_amount=total.getText();
		int amount=Integer.parseInt(total_amount);

		

		JButton b=(JButton)ev.getSource();
		op=b.getText();

		if(op.equals("View Menu!")){
				start.setVisible(false);
				items.setVisible(true);
				return;
				
		}
		else if(op.equals("Exit!")){

			System.exit(0);
			return;
		}
		else if(op.equals("Submit!")){
				try{

					FileWriter fw = new FileWriter("comments.txt",true);
					String feedback=box.getText();
						char [] feed=feedback.toCharArray();
							if(feedback.equals("")){

							}
							else{
						for(int i=0;i<feedback.length();i++){

							fw.write(feed[i]);
							}
							fw.write("\r\n");	
							for(int i=0;i<feedback.length();i++){
									fw.write('-');
								}
							fw.write("\r\n");
						}
							fw.close();
							box.setText("");

				}catch(Exception ex){

					System.out.println("Could not find/create comments.txt.Please refer to line: 466 of project.java");
				}
		}
		//////////////////////// Frame 1 ENDS/////////////////////////////// 



		else if(op.equals("Reset!")){

			total.setText(zero);
			t1.setText(blank);
			t2.setText(blank);
			t3.setText(blank);
			t4.setText(blank);
			t5.setText(blank);
			t6.setText(blank);
			t7.setText(blank);
			t8.setText(blank);
			t9.setText(blank);
			t10.setText(blank);
			
		

		}		////////// END of Reset 


		else if(op.equals(q1.getText())){
				qst1=t1.getText();
				if(qst1.equals("")){
					t1.setText("12");
					amount+=12;
					total.setText(Integer.toString(amount));
					return;
				}
					q_1=Integer.parseInt(qst1);
					q_1+=12;
					amount=Integer.parseInt(total.getText());
					amount+=12;
					qst1=Integer.toString(q_1)	;
					t1.setText(qst1);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(q2.getText())){
				qst2=t2.getText();
				q2_i=q_2+1;
				q2_st="Fries+"+q2_i;
				q2.setText(q2_st);
				if(qst2.equals("")){
					t2.setText("40");
					amount+=40;
					total.setText(Integer.toString(amount));
					return;
				}
					q_2=Integer.parseInt(qst2);
					q_2+=40;
					amount=Integer.parseInt(total.getText());
					amount+=40;
					qst2=Integer.toString(q_2)	;
					t2.setText(qst2);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(q3.getText())){
				qst3=t3.getText();
				if(qst3.equals("")){
					t3.setText("35");
					amount+=35;
					total.setText(Integer.toString(amount));
					return;
				}
					q_3=Integer.parseInt(qst3);
					q_3+=35;
					amount=Integer.parseInt(total.getText());
					amount+=35;
					qst3=Integer.toString(q_3)	;
					t3.setText(qst3);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(q4.getText())){
				qst4=t4.getText();
				if(qst4.equals("")){
					t4.setText("45");
					amount+=45;
					total.setText(Integer.toString(amount));
					return;
				}
					q_4=Integer.parseInt(qst4);
					q_4+=45;
					amount=Integer.parseInt(total.getText());
					amount+=45;
					qst4=Integer.toString(q_4)	;
					t4.setText(qst4);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(q5.getText())){
				qst5=t5.getText();
				if(qst5.equals("")){
					t5.setText("20");
					amount+=20;
					total.setText(Integer.toString(amount));
					return;
				}
					q_5=Integer.parseInt(qst5);
					q_5+=20;
					amount=Integer.parseInt(total.getText());
					amount+=20;
					qst5=Integer.toString(q_5)	;
					t5.setText(qst5);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(q6.getText())){
				qst6=t6.getText();
				if(qst6.equals("")){
					t6.setText("100");
					amount+=100;
					total.setText(Integer.toString(amount));
					return;
				}
					q_6=Integer.parseInt(qst6);
					q_6+=100;
					amount=Integer.parseInt(total.getText());
					amount+=100;
					qst6=Integer.toString(q_6)	;
					t6.setText(qst6);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(q7.getText())){
				qst7=t7.getText();
				if(qst7.equals("")){
					t7.setText("40");
					amount+=40;
					total.setText(Integer.toString(amount));
					return;
				}
					q_7=Integer.parseInt(qst7);
					q_7+=40;
					amount=Integer.parseInt(total.getText());
					amount+=40;
					qst7=Integer.toString(q_7)	;
					t7.setText(qst7);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(q8.getText())){
				qst8=t8.getText();
				if(qst8.equals("")){
					t8.setText("70");
					amount+=70;
					total.setText(Integer.toString(amount));
					return;
				}
					q_8=Integer.parseInt(qst8);
					q_8+=70;
					amount=Integer.parseInt(total.getText());
					amount+=70;
					qst8=Integer.toString(q_8)	;
					t8.setText(qst8);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(q9.getText())){
				qst9=t9.getText();
				if(qst9.equals("")){
					t9.setText("70");
					amount+=70;
					total.setText(Integer.toString(amount));
					return;
				}
					q_9=Integer.parseInt(qst9);
					q_9+=70;
					amount=Integer.parseInt(total.getText());
					amount+=45;
					qst9=Integer.toString(q_9)	;
					t9.setText(qst9);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(q10.getText())){
				qst10=t10.getText();
				if(qst10.equals("")){
					t10.setText("45");
					amount+=45;
					total.setText(Integer.toString(amount));
					return;
				}
					q_10=Integer.parseInt(qst10);
					q_10+=45;
					amount=Integer.parseInt(total.getText());
					amount+=45;
					qst10=Integer.toString(q_10)	;
					t10.setText(qst10);
					total.setText(Integer.toString(amount));
		}
		else if(op.equals(checkout.getText())){

				items.setVisible(false);
				last.setVisible(true);
				end.setText("Rs. "+amount+" /-");
				try{

					FileWriter f = new FileWriter("bill.txt",true);
					String a=end.getText();
						char [] final_bill=a.toCharArray();
							if(end.getText().equals("0") || end.getText().equals("")){

							}
							else{
								for(int i=0;i<a.length();i++){

									f.write(final_bill[i]);
								}
									f.write("\r\n");	
									for(int i=0;i<a.length();i++){
										f.write('.');
									}
								f.write("\r\n");
							}
								f.close();
				}catch(Exception ex){

				}
		}
		else if(op.equals(exit2.getText())){

			System.exit(0);
			return;
		}



		}	/////Method


	}	///////Class