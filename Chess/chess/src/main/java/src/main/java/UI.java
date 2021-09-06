package src.main.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class UI {
	
	JFrame frame = new JFrame();
	
	public static void main(String[] please) {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(8,8));
		
		   JPanel pn=new JPanel(){
	            @Override
	            public void paint(Graphics g) {
	            boolean white=true;
	                for(int y= 0;y<8;y++){
	            for(int x= 0;x<8;x++){
	                if(white){
	                    g.setColor(new Color(235,235, 208));
	                }else{
	                    g.setColor(new Color(119, 148, 85));
	                    
	                }
	                g.fillRect(x*64, y*64, 64, 64);
	           white=!white;
	            }
	            white=!white;
	            }
	                
	            
	            }
	            };
	            
	            
    		frame.add(pn);
	
       		frame.setVisible(true);
		
//		JLabel label= new JLabel();
//
//		BufferedImage img = null;
//		try {
//		    img = ImageIO.read(new File("C:/Users/josep/OneDrive/Desktop/ChessRepo/Chess/chess/src//main//resources//bb.png"));
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
//		
//		Image dimg = img.getScaledInstance(50, 50,
//		        Image.SCALE_SMOOTH);
//		
//		
//		ImageIcon image = new ImageIcon(dimg);
//		
//		
//		label.setIcon(image);

//	
	}
	
	
	

}
