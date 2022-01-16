import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea ca= new JTextArea();
	private JTextField cf=new JTextField();                                  
	private JButton b=new JButton();
	private JLabel l=new JLabel();
	
	Chatbot(){                                                // 09                                 
		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.gray);
		f.setTitle("09 the chatbot");
		f.add(ca);
		f.add(cf);
		ca.setSize(300,310);
		ca.setLocation(1, 1);
		ca.setBackground(Color.BLACK);
		cf.setSize(300,20);
		cf.setLocation(1,320);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(400,20);
		b.setLocation(300,320);
		
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==b) {                           // Paan
					
					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.GREEN);
					ca.append("You-->"+text+"\n");
					cf.setText("");
					
					if(text.contains("hi")) {                         // baua
						replyMeth("Hi there, Welcome to 09"+"\n"+"The ChatBot");
					}
					else if(text.contains("help")) {
					    replyMeth("You can only ask me questions in"+"\n"+"lowercase characteres");
					}
					//introduction
					else if(text.contains("your name")) {
						replyMeth("My name is 09");
					}
					else if(text.contains("gender")) {
						replyMeth("I'm Female.Don't Try to Flirt with me"+"\n"+"you Fell in love :)");
					}
					else if(text.contains("love you")) {
						replyMeth("I'm Feeling Shy :) Love you to");
					}
					else if(text.contains("bye")) {
						replyMeth("Too Soon :( AnyWays"+"\n"+"STAY HOME STAY SAFE ");
					}
					else if(text.contains("are you girl")) {
						replyMeth("Yes...");
					}
					else if(text.contains("are you boy")) {
						replyMeth("No...");
					}
					//question command
					else if(text.contains("why")) {
						replyMeth("You must search it on google");
					}
					else if(text.contains("why")) {
						replyMeth("You must search it on google");
					}
					else if(text.contains("what")) {
						replyMeth("You must search on google");
					}
				    else if(text.contains("how")) {
					    replyMeth("You must search on google");
					}
					else if(text.contains("where")) {
					    replyMeth("You must search on google");
					}
					else if(text.contains("where")) {
					    replyMeth("You must search on google");
					}
					else if(text.contains("who")) {
					    replyMeth("You must search on google");
					}
					else if(text.contains("what is the location for windows folder")) {
						replyMeth("C:\\Windows");
					}
					//feeling lucky comand
					else if(text.contains("i'm feeling lucky")) {
					    replyMeth("You must go on google doodles");
					}
					else if(text.contains("i am feeling lucky")) {
					    replyMeth("You must go on google doodles");
					//Weather command
					}
					else if(text.contains("what is the weather today")) {
					    replyMeth("Go ahead go  to your browser, check it there");
					}
					else if(text.contains("whats the weather today")) {
					    replyMeth("Go ahead go  to your browser, check it there");
					}
					else if(text.contains("what's the weather today")) {
					    replyMeth("Go ahead go  to your browser, check it there");
					}
					else if(text.contains("good morning")) {
						replyMeth("Good morning");
					}
					else if(text.contains("good night")) {
						replyMeth("Good night, have a nice sleep...");
					}
					else if(text.contains("ask a question")) {
						replyMeth("RIP, you forgot i don't study");
					}
					else if(text.contains("code.source")) {
						replyMeth("");
					}
					else 
						replyMeth("Sorry, I didn't understand");
					
				}
				
			}
			
		});
		
	}
	public void replyMeth(String s) {                          // Reply 
		ca.append("09-->"+s+"\n");         
	}
			

}



public class ChatBotDemo {                                     //Driver Class

	public static void main(String[] args) {             //main class
		System.out.println("Welcome");
          new Chatbot();                                  // instantiation 
	}

}
