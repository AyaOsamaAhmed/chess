package chessgame;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//import javax.swing.event.MouseInputListener;
import javax.swing.*;

//import com.sun.org.apache.bcel.internal.generic.Select;


public class actions extends JFrame {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private  JButton [] panel1 = new JButton [65];
   
    private ImageIcon image1 [] = new ImageIcon [13];
    
    private Icon  icons;
    private String i;
    private String panel;
    private boolean [] select = new boolean [64] ; // choose between true if have icon or false if no icon 
    private String [] image =new String[64];
    private int number ;
    
    
    public actions(){
	    
	     build();
	     
	    }
    
	    public void build (){
	    System.out.print(select[0]);
        
	        setSize(800,800);
	        setTitle(" Games ");
	        setLayout(new GridLayout(8,8));
	        	
            image1[1] = new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\1.png");
            image1[2] = new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\2.png");
            image1[3]= new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\3.png");
            image1[4]= new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\4.png");
            image1[5]= new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\5.png");
            image1[6]= new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\soldier.png");
            image1[7]= new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\111.png");
            image1[8]= new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\211.png");
            image1[9]= new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\311.png");
            image1[10] = new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\411.png");
            image1[11]= new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\511.png");
            image1[12]= new ImageIcon("C:\\Users\\aya\\Desktop\\chess\\soldier11.png");
            
            panel1[0] = new JButton();
            panel1[0].setBackground(Color.black);
            panel1[0].setIcon(image1[1]);
            panel1[0].addMouseListener(new actionbutton1());
	             	
	        panel1[1] = new JButton();
	        panel1[1].setBackground(Color.WHITE);
	        panel1[1].setIcon(image1[2]);
	        panel1[1].addMouseListener(new actionbutton2());
	                
	        panel1[2] = new JButton();
	        panel1[2].setBackground(Color.black);
	        panel1[2].setIcon(image1[3]);
	        panel1[2].addMouseListener(new actionbutton3());
	             	
	        panel1[3] = new JButton();
	        panel1[3].setBackground(Color.WHITE);
	        panel1[3].setIcon(image1[4]);
	        panel1[3].addMouseListener(new actionbutton4());
	                
	        panel1[4] = new JButton();
	        panel1[4].setBackground(Color.black);
	        panel1[4].setIcon(image1[5]);
	        panel1[4].addMouseListener(new actionbutton5());
	        	    
	        panel1[5] = new JButton();
	        panel1[5].setBackground(Color.WHITE);
	        panel1[5].setIcon(image1[3]);
	        panel1[5].addMouseListener(new actionbutton6());
	               
	        panel1[6] = new JButton();
	        panel1[6].setBackground(Color.black);
	        panel1[6].setIcon(image1[2]);
	        panel1[6].addMouseListener(new actionbutton7());
	        	   
	        panel1[7] = new JButton();
	        panel1[7].setBackground(Color.WHITE);
	        panel1[7].setIcon(image1[1]);
	        panel1[7].addMouseListener(new actionbutton8());
	               
	        panel1[8] = new JButton();
	        panel1[8].setBackground(Color.white);
	        panel1[8].setIcon(image1[6]);
	        panel1[8].addMouseListener(new actionbutton9());
	            
	        panel1[9] = new JButton();
	        panel1[9].setBackground(Color.black);
	        panel1[9].setIcon(image1[6]);
	        panel1[9].addMouseListener(new actionbutton10());
	        	    
	        panel1[10] = new JButton();
	        panel1[10].setBackground(Color.WHITE);
	        panel1[10].setIcon(image1[6]);
	        panel1[10].addMouseListener(new actionbutton11());
	                
	        panel1[11] = new JButton();
	        panel1[11].setBackground(Color.black);
	        panel1[11].setIcon(image1[6]);
	        panel1[11].addMouseListener(new actionbutton12());
	                
	        panel1[12] = new JButton();
	        panel1[12].setBackground(Color.WHITE);
	        panel1[12].setIcon(image1[6]);
	        panel1[12].addMouseListener(new actionbutton13());
	                	
	        panel1[13] = new JButton();
	        panel1[13].setBackground(Color.black);
	        panel1[13].setIcon(image1[6]);
	        panel1[13].addMouseListener(new actionbutton14());
	        	    
	        panel1[14] = new JButton();
	        panel1[14].setBackground(Color.white);
	        panel1[14].setIcon(image1[6]);
	        panel1[14].addMouseListener(new actionbutton15());
	                
	        panel1[15] = new JButton();
	        panel1[15].setBackground(Color.black);
	        panel1[15].setIcon(image1[6]);
	        panel1[15].addMouseListener(new actionbutton16());
	      	       
	        panel1[16] = new JButton();
	        panel1[16].setBackground(Color.black);
	        panel1[16].addMouseListener(new actionbutton17());
	               
	        panel1[17] = new JButton();
	        panel1[17].setBackground(Color.WHITE);	
	        panel1[17].addMouseListener(new actionbutton18());
	               
	        panel1[18] = new JButton();
	        panel1[18] .setBackground(Color.black);
	        panel1[18] .addMouseListener(new actionbutton19());
	            	 
	        panel1[19] = new JButton();
	        panel1[19].setBackground(Color.WHITE);   
	        panel1[19].addMouseListener(new actionbutton20());
	               
	        panel1[20] = new JButton();
	        panel1[20].setBackground(Color.black);
	        panel1[20].addMouseListener(new actionbutton21());
	             
	        panel1[21] = new JButton();
	        panel1[21].setBackground(Color.WHITE);
	        panel1[21].addMouseListener(new actionbutton22()); 
	                
	        panel1[22] = new JButton();
	        panel1[22].setBackground(Color.black);
	        panel1[22].addMouseListener(new actionbutton23());
	        	    
	        panel1[23] = new JButton();
	        panel1[23].setBackground(Color.WHITE);
	        panel1[23].addMouseListener(new actionbutton24());
	                
	        panel1[24] = new JButton();
	        panel1[24].setBackground(Color.WHITE);
	        panel1[24].addMouseListener(new actionbutton25());
	                
	        panel1[25] = new JButton();
	        panel1[25].setBackground(Color.black);
	        panel1[25].addMouseListener(new actionbutton26());
	        	    
	        panel1[26] = new JButton();
	        panel1[26].setBackground(Color.WHITE);
	        panel1[26].addMouseListener(new actionbutton27());
	                
	        panel1[27] = new JButton();
	        panel1[27].setBackground(Color.black);
	        panel1[27].addMouseListener(new actionbutton28());
	        	    
	        panel1[28] = new JButton();
	        panel1[28].setBackground(Color.WHITE);
	        panel1[28].addMouseListener(new actionbutton29());
	               
	        panel1[29] = new JButton();
	        panel1[29].setBackground(Color.black);
	        panel1[29].addMouseListener(new actionbutton30());
	        	    
	        panel1[30] = new JButton();
	        panel1[30].setBackground(Color.WHITE);
	        panel1[30].addMouseListener(new actionbutton31());
	                
	        panel1[31] = new JButton();
	        panel1[31].setBackground(Color.black);
	        panel1[31].addMouseListener(new actionbutton32());
	            	
	        panel1[32] = new JButton();
	        panel1[32].setBackground(Color.black);
	        panel1[32].addMouseListener(new actionbutton33());
	            	
	        panel1[33] = new JButton();
	        panel1[33].setBackground(Color.WHITE);
	        panel1[33].addMouseListener(new actionbutton34());
	                
	        panel1[34] = new JButton();
	        panel1[34].setBackground(Color.black);
	        panel1[34].addMouseListener(new actionbutton35());
	        	
	        panel1[35] = new JButton();
	        panel1[35].setBackground(Color.WHITE);
	        panel1[35].addMouseListener(new actionbutton36());    
	                 
	        panel1[36] = new JButton();
	        panel1[36].setBackground(Color.black);
	        panel1[36].addMouseListener(new actionbutton37());
	        	   
	        panel1[37] = new JButton();
	        panel1[37].setBackground(Color.WHITE);
	        panel1[37].addMouseListener(new actionbutton38());
	               
	        panel1[38]= new JButton();
	        panel1[38].setBackground(Color.black);
	        panel1[38].addMouseListener(new actionbutton39());
	        	    
	        panel1[39] = new JButton();
	        panel1[39].setBackground(Color.WHITE);
	        panel1[39].addMouseListener(new actionbutton40());
	                
	        panel1[40] = new JButton();
	        panel1[40].setBackground(Color.WHITE);
	        panel1[40].addMouseListener(new actionbutton41());
	                 
	        panel1[41] = new JButton();
	        panel1[41].setBackground(Color.black);
	        panel1[41].addMouseListener(new actionbutton42());
	        	     
	        panel1[42] = new JButton();
	        panel1[42].setBackground(Color.WHITE);
	        panel1[42].addMouseListener(new actionbutton43());
	                  
	        panel1[43] = new JButton();
	        panel1[43].setBackground(Color.black);
	        panel1[43].addMouseListener(new actionbutton44());
	        	      
	        panel1[44] = new JButton();
	        panel1[44].setBackground(Color.WHITE);
	        panel1[44].addMouseListener(new actionbutton45());
	                  
	        panel1[45] = new JButton();
	        panel1[45].setBackground(Color.black);
	        panel1[45].addMouseListener(new actionbutton46());
	        	      
	        panel1[46] = new JButton();
	        panel1[46].setBackground(Color.WHITE);
	        panel1[46].addMouseListener(new actionbutton47());
	                   
	        panel1[47] = new JButton();
	        panel1[47].setBackground(Color.black);
	        panel1[47].addMouseListener(new actionbutton48());
	        	       
	        panel1[48] = new JButton();
	        panel1[48].setBackground(Color.black);
	        panel1[48].setIcon(image1[12]);
	        panel1[48].addMouseListener(new actionbutton49());
	        	       
	        panel1[49] = new JButton();
	        panel1[49].setBackground(Color.WHITE);
	        panel1[49].setIcon(image1[12]);
	        panel1[49].addMouseListener(new actionbutton50());
	                   
	        panel1[50] = new JButton();
	        panel1[50].setBackground(Color.black);
	        panel1[50].setIcon(image1[12]);
	        panel1[50].addMouseListener(new actionbutton51());
	        	       
	        panel1[51] = new JButton();
	        panel1[51].setBackground(Color.WHITE);
	        panel1[51].setIcon(image1[12]);
	        panel1[51].addMouseListener(new actionbutton52());
	                   
	        panel1[52] = new JButton();
	        panel1[52].setBackground(Color.black);
	        panel1[52].setIcon(image1[12]);
	        panel1[52].addMouseListener(new actionbutton53());
	        	       
	        panel1[53] = new JButton();
	        panel1[53].setBackground(Color.WHITE);
	        panel1[53].setIcon(image1[12]);
	        panel1[53].addMouseListener(new actionbutton54());
	                   
	        panel1[54] = new JButton();
	        panel1[54].setBackground(Color.black);
	        panel1[54].setIcon(image1[12]);
	        panel1[54].addMouseListener(new actionbutton55());
	                	
	        panel1[55] = new JButton();
	        panel1[55].setBackground(Color.WHITE);
	        panel1[55].setIcon(image1[12]);
	        panel1[55].addMouseListener(new actionbutton56());
	                   
	        panel1[56] = new JButton();
	        panel1[56].setBackground(Color.WHITE);
	        panel1[56].setIcon(image1[7]);
	        panel1[56].addMouseListener(new actionbutton57());
	                   
	        panel1[57] = new JButton();
	        panel1[57] .setBackground(Color.black);
	        panel1[57] .setIcon(image1[8]);
	        panel1[57] .addMouseListener(new actionbutton58());
	                	
	        panel1[58] = new JButton();
	        panel1[58].setBackground(Color.WHITE);
	        panel1[58].setIcon(image1[9]);
	        panel1[58].addMouseListener(new actionbutton59());
	                    
	        panel1[59] = new JButton();
	        panel1[59].setBackground(Color.black);
	        panel1[59].setIcon(image1[11]);
	        panel1[59].addMouseListener(new actionbutton60());
	        	        
	        panel1[60] = new JButton();
	        panel1[60] .setBackground(Color.WHITE);
	        panel1[60] .setIcon(image1[10]);
	        panel1[60] .addMouseListener(new actionbutton61());
	                    
	        panel1[61]  = new JButton();
	        panel1[61].setBackground(Color.black);
	        panel1[61].setIcon(image1[9]);
	        panel1[61].addMouseListener(new actionbutton62());
	                	
	        panel1[62] = new JButton();
	        panel1[62].setBackground(Color.WHITE);
	        panel1[62].setIcon(image1[8]);
	        panel1[62].addMouseListener(new actionbutton63());
	                    
	        panel1[63] = new JButton();
	        panel1[63].setBackground(Color.black);
	        panel1[63].setIcon(image1[7]);
	        panel1[63].addMouseListener(new actionbutton64());
	        	
	                
	        	for (int l =0 ;l<=63;l++ ){
	        	      add(panel1[l]);
	        	}
	        	    	
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	setVisible(true);
	    
	    
	    
	    
	    
	    }
	    
	    delet D = new delet();
            
	    public class delet {
	    	
	    	
	    public  void del (String panel){
	    	for (int p=0 ; p<=63;p++){
	    	  if (panel.equals("panel1["+p+"]")){ panel1[p].setIcon(null); }
	    	}
	    	  for(int l=0;l<=63;l++){
	    	    select [l] = false;
	      }
	    	  for (int i =0 ;i<=63;i++) {panel1[i].setBorder(BorderFactory.createLineBorder(null));}
	  	    	  
	    }
	    
	    public void delselect (){
	    	
	    	}
	    }
	    
	    public class actionbutton1 implements MouseListener{ 
                
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				number= 0;
				if (select[number]== true){
					// image [12] solider red
					if (image[number].equals("image12")){
					       D.del(panel);
					       panel1[number].setIcon(image1[12]);
						}
					// image [1] tabea white
					if (image[number].equals("image1")){
					       D.del(panel);
					       panel1[number].setIcon(image1[1]);
						}
					// image [111] tabea red
					if (image[number].equals("image111")){
					       D.del(panel);
					       panel1[number].setIcon(image1[111]);
						}
					
				}
			}
			
			public void mousePressed(MouseEvent arg0) { // move of peaces 
				number= 0;
				// image [1] tabea white 
				if (panel1[number].getIcon().equals(image1[1])){
					int x=8;
					int text= number+x; // next step in tabea 
					boolean stop =true;
					
					while (text <= 63 && stop){  // in columns under tabea 
					icons = panel1[text].getIcon();
					 i = String.valueOf(icons); 
					 stop=false;
					if (i.equals("null")){    // to select empty cells in columns  
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
						stop=true;
						text=text+x;
					}}
					// to select image red in front of tabea in columns  
					 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
						  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
						  select [text]= true;
					       	  image[text]= "image1";
						  panel = "panel1["+number+"]";
				    } 
				     
					 
					x=1; text=0;
					 text=number+x;
					 stop=true;
					 // to select cells in row and  stop in end of row 
					while (text!=8&&text!=16&&text!=24&&text!=32&&text!=40&&text!=48&&text!=56&&text!=64&&stop){
					icons = panel1[text].getIcon();
					  i = String.valueOf(icons);  
					  stop=false;
					  if (i.equals("null")){ // to select empty cells in rows 
							panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
							select [text]= true;
							image[text]= "image1";
							panel = "panel1["+number+"]";
						stop = true ;
						 text = text+x; 
					  }
					  // to select image red in rows 
					  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
						  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
				    }}
					
				}
				
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	    
	    public class actionbutton2 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				number =1 ;
				if (select[number]== true){
					// image [12] solider red
					if (image[number].equals("image12")){
					       D.del(panel);
					       panel1[number].setIcon(image1[12]);
						}
					// image [1] white tabea 
					if (image[number].equals("image1")){
					       D.del(panel);
					       panel1[number].setIcon(image1[1]);
						}
					// image [111] red tabea 
					if (image[number].equals("image111")){
					       D.del(panel);
					       panel1[number].setIcon(image1[111]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				number=1;
				// image [1] tabea white 
				if (panel1[number].getIcon().equals(image1[1])){
					int x=8;
					int text= number+x;
					boolean stop =true;
					
					while (text <= 63 && stop){
					icons = panel1[text].getIcon();
					 i = String.valueOf(icons); 
					 stop=false;
					if (i.equals("null")){    // to select empety cells in columns  
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
						stop=true;
						text=text+x;
					}}
					// to select image red in front of tabea in columns  
					 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
						  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
				    } 
					x=1; text=0;
					 text=number+x;
					 stop=true;
					 // to select cells in row and  stop in end of row 
					while (text!=8&&text!=16&&text!=24&&text!=32&&text!=40&&text!=48&&text!=56&&text!=64&&stop){
					icons = panel1[text].getIcon();
					  i = String.valueOf(icons);  
					  stop=false;
					  if (i.equals("null")){ // to select empty cells in rows 
							panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
							select [text]= true;
							image[text]= "image1";
							panel = "panel1["+number+"]";
						stop = true ;
						 text = text+x; 
					  }}
					  // to select image red in rows 
					  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
						  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";}
				    }
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	    
	    public class actionbutton3 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				number=2;
				if (select[number]== true){
					// image [12] solider red
					if (image[number].equals("image12")){
					       D.del(panel);
					       panel1[number].setIcon(image1[12]);
						}
					// image [1] white tabea 
					if (image[number].equals("image1")){
					       D.del(panel);
					       panel1[number].setIcon(image1[1]);
						}
					// image [111] red tabea 
					if (image[number].equals("image111")){
					       D.del(panel);
					       panel1[number].setIcon(image1[111]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				number =2;
				// image [1] tabea white 
				if (panel1[number].getIcon().equals(image1[1])){
					int x=8;
					int text= number+x;
					boolean stop =true;
					
					while (text <= 63 && stop){
					icons = panel1[text].getIcon();
					 i = String.valueOf(icons); 
					 stop=false;
					if (i.equals("null")){    // to select empety cells in columns  
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
						stop=true;
						text=text+x;
					}}
					// to select image red in front of tabea in columns  
					 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
						  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
				    } 
					x=1; text=0;
					 text=number+x;
					 stop=true;
					 // to select cells in row and  stop in end of row 
					while (text!=8&&text!=16&&text!=24&&text!=32&&text!=40&&text!=48&&text!=56&&text!=64&&stop){
					icons = panel1[text].getIcon();
					  i = String.valueOf(icons);  
					  stop=false;
					  if (i.equals("null")){ // to select empty cells in rows 
							panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
							select [text]= true;
							image[text]= "image1";
							panel = "panel1["+number+"]";
						stop = true ;
						 text = text+x; 
					  }}
					  // to select image red in rows 
					  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
						  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";}
				    }
				}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	    
	    public class actionbutton4 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[3]== true){
					// image [12] solider red
					if (image[3].equals("image12")){
					       D.del(panel);
					       panel1[3].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
			number= 3;
			// image [1] tabea white 
			if (panel1[number].getIcon().equals(image1[1])){
				int x=8;
				int text= number+x;
				boolean stop =true;
				
				while (text <= 63 && stop){
				icons = panel1[text].getIcon();
				 i = String.valueOf(icons); 
				 stop=false;
				if (i.equals("null")){    // to select empety cells in columns  
					panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
					stop=true;
					text=text+x;
				}}
				// to select image red in front of tabea in columns  
				 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
			    } 
				x=1; text=0;
				 text=number+x;
				 stop=true;
				 // to select cells in row and  stop in end of row 
				while (text!=8&&text!=16&&text!=24&&text!=32&&text!=40&&text!=48&&text!=56&&text!=64&&stop){
				icons = panel1[text].getIcon();
				  i = String.valueOf(icons);  
				  stop=false;
				  if (i.equals("null")){ // to select empty cells in rows 
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
					stop = true ;
					 text = text+x; 
				  }}
				  // to select image red in rows 
				  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";}
			    }
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	    
	    public class actionbutton5 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[4]== true){
				// image [12] solider red
				if (image[4].equals("image12")){
				       D.del(panel);
				       panel1[4].setIcon(image1[12]);
					}
				
			}}
			public void mousePressed(MouseEvent arg0) {
			number =4;
			// image [1] tabea white 
			if (panel1[number].getIcon().equals(image1[1])){
				int x=8;
				int text= number+x;
				boolean stop =true;
				
				while (text <= 63 && stop){
				icons = panel1[text].getIcon();
				 i = String.valueOf(icons); 
				 stop=false;
				if (i.equals("null")){    // to select empety cells in columns  
					panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
					stop=true;
					text=text+x;
				}}
				// to select image red in front of tabea in columns  
				 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
			    } 
				x=1; text=0;
				 text=number+x;
				 stop=true;
				 // to select cells in row and  stop in end of row 
				while (text!=8&&text!=16&&text!=24&&text!=32&&text!=40&&text!=48&&text!=56&&text!=64&&stop){
				icons = panel1[text].getIcon();
				  i = String.valueOf(icons);  
				  stop=false;
				  if (i.equals("null")){ // to select empty cells in rows 
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
					stop = true ;
					 text = text+x; 
				  }}
				  // to select image red in rows 
				  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";}
			    }
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	    
	    public class actionbutton6 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[5]== true){
					// image [12] solider red
					if (image[5].equals("image12")){
					       D.del(panel);
					       panel1[5].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
			number=5;
			// image [1] tabea white 
			if (panel1[number].getIcon().equals(image1[1])){
				int x=8;
				int text= number+x;
				boolean stop =true;
				
				while (text <= 63 && stop){
				icons = panel1[text].getIcon();
				 i = String.valueOf(icons); 
				 stop=false;
				if (i.equals("null")){    // to select empety cells in columns  
					panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
					stop=true;
					text=text+x;
				}}
				// to select image red in front of tabea in columns  
				 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
			    } 
				x=1; text=0;
				 text=number+x;
				 stop=true;
				 // to select cells in row and  stop in end of row 
				while (text!=8&&text!=16&&text!=24&&text!=32&&text!=40&&text!=48&&text!=56&&text!=64&&stop){
				icons = panel1[text].getIcon();
				  i = String.valueOf(icons);  
				  stop=false;
				  if (i.equals("null")){ // to select empty cells in rows 
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
					stop = true ;
					 text = text+x; 
				  }}
				  // to select image red in rows 
				  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";}
			    }
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	    
	    
	    public class actionbutton7 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[6]== true){
					// image [12] solider red
					if (image[6].equals("image12")){
					       D.del(panel);
					       panel1[6].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
			number=6;
			// image [1] tabea white 
			if (panel1[number].getIcon().equals(image1[1])){
				int x=8;
				int text= number+x;
				boolean stop =true;
				
				while (text <= 63 && stop){
				icons = panel1[text].getIcon();
				 i = String.valueOf(icons); 
				 stop=false;
				if (i.equals("null")){    // to select empety cells in columns  
					panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
					stop=true;
					text=text+x;
				}}
				// to select image red in front of tabea in columns  
				 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
			    } 
				x=1; text=0;
				 text=number+x;
				 stop=true;
				 // to select cells in row and  stop in end of row 
				while (text!=8&&text!=16&&text!=24&&text!=32&&text!=40&&text!=48&&text!=56&&text!=64&&stop){
				icons = panel1[text].getIcon();
				  i = String.valueOf(icons);  
				  stop=false;
				  if (i.equals("null")){ // to select empty cells in rows 
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
					stop = true ;
					 text = text+x; 
				  }}
				  // to select image red in rows 
				  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";}
			    }
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	    
	    
	    public class actionbutton8 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[7]== true){
					// image [12] solider red
					if (image[7].equals("image12")){
					       D.del(panel);
					       panel1[7].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
			number=7;
			// image [1] tabea white 
			if (panel1[number].getIcon().equals(image1[1])){
				int x=8;
				int text= number+x;
				boolean stop =true;
				
				while (text <= 63 && stop){
				icons = panel1[text].getIcon();
				 i = String.valueOf(icons); 
				 stop=false;
				if (i.equals("null")){    // to select empety cells in columns  
					panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
					stop=true;
					text=text+x;
				}}
				// to select image red in front of tabea in columns  
				 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
			    } 
				x=1; text=0;
				 text=number+x;
				 stop=true;
				 // to select cells in row and  stop in end of row 
				while (text!=8&&text!=16&&text!=24&&text!=32&&text!=40&&text!=48&&text!=56&&text!=64&&stop){
				icons = panel1[text].getIcon();
				  i = String.valueOf(icons);  
				  stop=false;
				  if (i.equals("null")){ // to select empty cells in rows 
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
					stop = true ;
					 text = text+x; 
				  }}
				  // to select image red in rows 
				  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
					  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";}
			    }
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  public class actionbutton9 implements MouseListener {

		public void mouseClicked(MouseEvent arg0) {}
		public void mouseEntered(MouseEvent arg0) {
			number = 8;
			if (select[number]== true){
				// image [12] solider red
				if (image[number].equals("image12")){
				       D.del(panel);
				       panel1[number].setIcon(image1[12]);
					}
				
			}
		}
		public void mouseExited(MouseEvent arg0) {}
		public void mousePressed(MouseEvent arg0) {
			
			// image [6] solider white 
			if (panel1[8].getIcon().equals(image1[6])){
				icons = panel1[16].getIcon();
				  i = String.valueOf(icons);  
				if (i.equals("null")){
					panel1[16].setBorder(BorderFactory.createLineBorder(Color.green));
					select [16]= true;
					image[16]= "image6";
					panel = "panel1[8]";
				}
				
				  if (panel1[17].getIcon().equals(image1[7])||panel1[17].getIcon().equals(image1[8])||panel1[17].getIcon().equals(image1[9])||panel1[17].getIcon().equals(image1[10])||panel1[17].getIcon().equals(image1[11])||panel1[17].getIcon().equals(image1[12])){
					  panel1[17].setBorder(BorderFactory.createLineBorder(Color.green));
					select [17]= true;
					image[17]= "image6";
					panel = "panel1[8]";
			    }}
			// image1 [12] solider red
			if (panel1[8].getIcon().equals(image1[12])){
				icons = panel1[0].getIcon();
				  i = String.valueOf(icons);
				if (i.equals("null")){
					panel1[0].setBorder(BorderFactory.createLineBorder(Color.RED));
					select [0]= true;
					image[0]= "image12";
					panel = "panel1[8]";
				}
				icons = panel1[1].getIcon();
				if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
					  panel1[1].setBorder(BorderFactory.createLineBorder(Color.red));
					select [1]= true;
					image[1]= "image12";
					panel = "panel1[8]";
			    }}
		
		number = 8;
		// image [1] tabea white 
		if (panel1[number].getIcon().equals(image1[1])){
			int x=8;
			int text= number+x;
			boolean stop =true;
			
			while (text <= 63 && stop){
			icons = panel1[text].getIcon();
			 i = String.valueOf(icons); 
			 stop=false;
			if (i.equals("null")){    // to select empety cells in columns  
				panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
				select [text]= true;
				image[text]= "image1";
				panel = "panel1["+number+"]";
				stop=true;
				text=text+x;
			}}
			// to select image red in front of tabea in columns  
			 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
				  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
				select [text]= true;
				image[text]= "image1";
				panel = "panel1["+number+"]";
		    } 
			x=1; text=0;
			 text=number+x;
			 stop=true;
			 // to select cells in row and  stop in end of row 
			while (text!=8&&text!=16&&text!=24&&text!=32&&text!=40&&text!=48&&text!=56&&text!=64&&stop){
			icons = panel1[text].getIcon();
			  i = String.valueOf(icons);  
			  stop=false;
			  if (i.equals("null")){ // to select empty cells in rows 
					panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
					select [text]= true;
					image[text]= "image1";
					panel = "panel1["+number+"]";
				stop = true ;
				 text = text+x; 
			  }}
			  // to select image red in rows 
			  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
				  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
				select [text]= true;
				image[text]= "image1";
				panel = "panel1["+number+"]";}
		    }
			
                 }
		public void mouseReleased(MouseEvent arg0) {}  
	  }
	       
	  public class actionbutton10 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[9]== true){
					// image [12] solider red
					if (image[9].equals("image12")){
					       D.del(panel);
					       panel1[9].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[9].getIcon().equals(image1[6])){
					icons = panel1[17].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[17].setBorder(BorderFactory.createLineBorder(Color.green));
						select [17]= true;
						image[17]= "image6";
						panel = "panel1[9]";
					}
					icons = panel1[16].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[16].setBorder(BorderFactory.createLineBorder(Color.green));
						select [16]= true;
						image[16]= "image6";
						panel = "panel1[9]";
				    }
					icons = panel1[18].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
								  panel1[18].setBorder(BorderFactory.createLineBorder(Color.green));
						select [18]= true;
						image[18]= "image6";
						panel = "panel1[9]";
				    }}
				// image1 [12] solider red
				if (panel1[9].getIcon().equals(image1[12])){
					icons = panel1[1].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[1].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [1]= true;
						image[1]= "image12";
						panel = "panel1[9]";
					}
					icons = panel1[0].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[0].setBorder(BorderFactory.createLineBorder(Color.red));
						select [0]= true;
						image[0]= "image12";
						panel = "panel1[9]";
				    }
					icons = panel1[2].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[2].setBorder(BorderFactory.createLineBorder(Color.red));
						select [2]= true;
						image[2]= "image12";
						panel = "panel1[9]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }

	  public class actionbutton11 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[10]== true){
					// image [12] solider red
					if (image[10].equals("image12")){
					       D.del(panel);
					       panel1[10].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[10].getIcon().equals(image1[6])){
					icons = panel1[18].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[18].setBorder(BorderFactory.createLineBorder(Color.green));
						select [18]= true;
						image[18]= "image6";
						panel = "panel1[10]";
					}
					icons = panel1[17].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
							  panel1[17].setBorder(BorderFactory.createLineBorder(Color.green));
						select [17]= true;
						image[17]= "image6";
						panel = "panel1[10]";
				    }
					icons = panel1[19].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
			   		  panel1[19].setBorder(BorderFactory.createLineBorder(Color.green));
						select [19]= true;
						image[19]= "image6";
						panel = "panel1[10]";
				    }}
				// image1 [12] solider red
				if (panel1[10].getIcon().equals(image1[12])){
					icons = panel1[2].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[2].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [2]= true;
						image[2]= "image12";
						panel = "panel1[10]";
					}
					icons = panel1[3].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[3].setBorder(BorderFactory.createLineBorder(Color.red));
						select [3]= true;
						image[3]= "image12";
						panel = "panel1[10]";
				    }
					icons = panel1[1].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[1].setBorder(BorderFactory.createLineBorder(Color.red));
						select [1]= true;
						image[1]= "image12";
						panel = "panel1[10]";
				    }}
			
				
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton12 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[11]== true){
					// image [12] solider red
					if (image[11].equals("image12")){
					       D.del(panel);
					       panel1[11].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
				//image [6] solider white 
				if (panel1[11].getIcon().equals(image1[6])){
					icons = panel1[19].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[19].setBorder(BorderFactory.createLineBorder(Color.green));
						select [19]= true;
						image[19]= "image6";
						panel = "panel1[11]";
					}
					icons = panel1[18].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
								  panel1[18].setBorder(BorderFactory.createLineBorder(Color.green));
						select [18]= true;
						image[18]= "image6";
						panel = "panel1[11]";
				    }
					icons = panel1[20].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
					  panel1[20].setBorder(BorderFactory.createLineBorder(Color.green));
						select [20]= true;
						image[20]= "image6";
						panel = "panel1[11]";
				    }}
				// image1 [12] solider red
				if (panel1[11].getIcon().equals(image1[12])){
					icons = panel1[3].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[3].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [3]= true;
						image[3]= "image12";
						panel = "panel1[11]";
					}
					icons = panel1[4].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[4].setBorder(BorderFactory.createLineBorder(Color.red));
						select [4]= true;
						image[4]= "image12";
						panel = "panel1[11]";
				    }
					icons = panel1[2].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[2].setBorder(BorderFactory.createLineBorder(Color.red));
						select [2]= true;
						image[2]= "image12";
						panel = "panel1[11]";
				    }}
			
				
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton13 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[12]== true){
					// image [12] solider red
					if (image[12].equals("image12")){
					       D.del(panel);
					       panel1[12].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[12].getIcon().equals(image1[6])){
				icons = panel1[20].getIcon();
				  i = String.valueOf(icons);
				if (i.equals("null")){
					panel1[20].setBorder(BorderFactory.createLineBorder(Color.green));
					select [20]= true;
					image[20]= "image6";
					panel = "panel1[12]";
				}
				icons = panel1[19].getIcon();
				if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
			    	  panel1[19].setBorder(BorderFactory.createLineBorder(Color.green));
					select [19]= true;
					image[19]= "image6";
					panel = "panel1[12]";
			    }
				icons = panel1[21].getIcon();
				if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
					  panel1[21].setBorder(BorderFactory.createLineBorder(Color.green));
					select [21]= true;
					image[21]= "image6";
					panel = "panel1[12]";
			    }}
				// image1 [12] solider red
				if (panel1[12].getIcon().equals(image1[12])){
					icons = panel1[4].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[4].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [4]= true;
						image[4]= "image12";
						panel = "panel1[12]";
					}
					icons = panel1[3].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[3].setBorder(BorderFactory.createLineBorder(Color.red));
						select [3]= true;
						image[3]= "image12";
						panel = "panel1[12]";
				    }
					icons = panel1[5].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[5].setBorder(BorderFactory.createLineBorder(Color.red));
						select [5]= true;
						image[5]= "image12";
						panel = "panel1[12]";
				    }}
			
				
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton14 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[13]== true){
					// image [12] solider red
					if (image[13].equals("image12")){
					       D.del(panel);
					       panel1[13].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[13].getIcon().equals(image1[6])){
					icons = panel1[21].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[21].setBorder(BorderFactory.createLineBorder(Color.green));
						select [21]= true;
						image[21]= "image6";
						panel = "panel1[13]";
					}
					icons = panel1[20].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[20].setBorder(BorderFactory.createLineBorder(Color.green));
						select [20]= true;
						image[20]= "image6";
						panel = "panel1[13]";
				    }	
					icons = panel1[22].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
								  panel1[22].setBorder(BorderFactory.createLineBorder(Color.green));
						select [22]= true;
						image[22]= "image6";
						panel = "panel1[13]";
				    }}
				// image1 [12] solider red
				if (panel1[13].getIcon().equals(image1[12])){
					icons = panel1[5].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[5].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [5]= true;
						image[5]= "image12";
						panel = "panel1[13]";
					}
					icons = panel1[4].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[4].setBorder(BorderFactory.createLineBorder(Color.red));
						select [4]= true;
						image[4]= "image12";
						panel = "panel1[13]";
				    }
					icons = panel1[6].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[6].setBorder(BorderFactory.createLineBorder(Color.red));
						select [6]= true;
						image[6]= "image12";
						panel = "panel1[13]";
				    }}
			
				}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton15 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[14]== true){
					// image [12] solider red
					if (image[14].equals("image12")){
					       D.del(panel);
					       panel1[14].setIcon(image1[12]);
						}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[14].getIcon().equals(image1[6])){
					icons = panel1[22].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[22].setBorder(BorderFactory.createLineBorder(Color.green));
						select [22]= true;
						image[22]= "image6";
						panel = "panel1[14]";
					}
					icons = panel1[21].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
				    	  panel1[21].setBorder(BorderFactory.createLineBorder(Color.green));
						select [21]= true;
						image[21]= "image6";
						panel = "panel1[14]";
				    }
					icons = panel1[23].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[23].setBorder(BorderFactory.createLineBorder(Color.green));
						select [23]= true;
						image[23]= "image6";
						panel = "panel1[14]";
				    }}
				// image1 [12] solider red
				if (panel1[14].getIcon().equals(image1[12])){
					icons = panel1[6].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[6].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [6]= true;
						image[6]= "image12";
						panel = "panel1[14]";
					}
					icons = panel1[5].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[5].setBorder(BorderFactory.createLineBorder(Color.red));
						select [5]= true;
						image[5]= "image12";
						panel = "panel1[14]";
				    }
					icons = panel1[7].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[7].setBorder(BorderFactory.createLineBorder(Color.red));
						select [7]= true;
						image[7]= "image12";
						panel = "panel1[14]";
				    }}
			
				}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton16 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[15]== true){
					// image [12] solider red
					if (image[15].equals("image12")){
					       D.del(panel);
					       panel1[15].setIcon(image1[12]);
						}
					// image [1] tabea white
					if (image[15].equals("image1")){
					       D.del(panel);
					       panel1[15].setIcon(image1[1]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[15].getIcon().equals(image1[6])){
				icons = panel1[23].getIcon();
				  i = String.valueOf(icons);
				if (i.equals("null")){
					panel1[23].setBorder(BorderFactory.createLineBorder(Color.green));
					select [23]= true;
					image[23]= "image6";
					panel = "panel1[15]";
				}
				icons = panel1[22].getIcon();
				if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
					  panel1[22].setBorder(BorderFactory.createLineBorder(Color.green));
					select [22]= true;
					image[22]= "image6";
					panel = "panel1[15]";
			    }}
				// image1 [12] solider red
				if (panel1[15].getIcon().equals(image1[12])){
					icons = panel1[7].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[7].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [7]= true;
						image[7]= "image12";
						panel = "panel1[15]";
					}
					icons = panel1[6].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[6].setBorder(BorderFactory.createLineBorder(Color.red));
						select [6]= true;
						image[6]= "image12";
						panel = "panel1[15]";
					}}
					
				
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton17 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				// image [6] solider white 
				if (select [16]== true){
					if (image[16].equals("image6")){
				       D.del(panel);
				       D.delselect();
				       panel1[16].setIcon(image1[6]); 
					}
				// image [12] solider red
						if (image[16].equals("image12")){
						       D.del(panel);
						       panel1[16].setIcon(image1[12]);
							}
						// image [1] tabea white
						if (image[16].equals("image1")){
						       D.del(panel);
						       panel1[16].setIcon(image1[1]);
							}
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[16].getIcon().equals(image1[6])){
					icons = panel1[24].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[24].setBorder(BorderFactory.createLineBorder(Color.green));
						select [24]= true;
						image[24]= "image6";
						panel = "panel1[16]";
					}
					icons = panel1[25].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[25].setBorder(BorderFactory.createLineBorder(Color.green));
						select [25]= true;
						image[25]= "image6";
						panel = "panel1[16]";
				    }}
				// image1 [12] solider red
				if (panel1[16].getIcon().equals(image1[12])){
					icons = panel1[8].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[8].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [8]= true;
						image[8]= "image12";
						panel = "panel1[16]";
					}
					icons = panel1[9].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[9].setBorder(BorderFactory.createLineBorder(Color.red));
						select [9]= true;
						image[9]= "image12";
						panel = "panel1[16]";
				    }}
			
				number= 16;
				// image [1] tabea white 
				if (panel1[number].getIcon().equals(image1[1])){
					int x=8;
					int text= number+x;
					boolean stop =true;
					// in columns under tabea 
					while (text <= 63 && stop){
					icons = panel1[text].getIcon();
					 i = String.valueOf(icons); 
					 stop=false;
					if (i.equals("null")){    // to select empty cells in columns  
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
						stop=true;
						text=text+x;
					}}
					// to select image red in front of tabea in columns  
					 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
						  panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";
				    } 
					 
					// in columns above tabea
					 text= number -x;
					 stop=true ;
					 while (text >= 0&& stop){  
							icons = panel1[text].getIcon();
							 i = String.valueOf(icons); 
							 stop=false;
							if (i.equals("null")){    // to select empty cells in columns  
								panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
								select [text]= true;
								image[text]= "image1";
								panel = "panel1["+number+"]";
								stop=true;
								text=text-x;
							}}
							// to select image red in front of tabea in columns  
							 if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
								panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
								select [text]= true;
								image[text]= "image1";
								panel = "panel1["+number+"]";
						    } 
					
			     		x=1; 
					 text=number+x;
					 stop=true;
					 // to select cells in row and  stop in end of row 
					while (text!=7&&text!=15&&text!=23&&text!=31&&text!=39&&text!=47&&text!=55&&text!=63&&stop){
					icons = panel1[text].getIcon();
					  i = String.valueOf(icons);  
					  stop=false;
					  if (i.equals("null")){ // to select empty cells in rows 
							panel1[text].setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
							select [text]= true;
							image[text]= "image1";
							panel = "panel1["+number+"]";
						stop = true ;
						 text = text+x; 
					  }}
					  // to select image red in rows 
					  if (panel1[text].getIcon().equals(image1[7])||panel1[text].getIcon().equals(image1[8])||panel1[text].getIcon().equals(image1[9])||panel1[text].getIcon().equals(image1[10])||panel1[text].getIcon().equals(image1[11])||panel1[text].getIcon().equals(image1[12])){
						panel1[text].setBorder(BorderFactory.createLineBorder(Color.magenta));
						select [text]= true;
						image[text]= "image1";
						panel = "panel1["+number+"]";}
				    }
				
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton18 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[17]== true){
					//  image [6] solider white 
					if (image[17].equals("image6")){
				       D.del(panel);
				       panel1[17].setIcon(image1[6]);
					}
						// image [12] solider red
						if (image[17].equals("image12")){
						       D.del(panel);
						       panel1[17].setIcon(image1[12]);
							}
						
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[17].getIcon().equals(image1[6])){
					icons = panel1[25].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[25].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [25]= true;
						image[25]= "image6";
						panel = "panel1[17]";
					}
					icons = panel1[24].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
					  panel1[24].setBorder(BorderFactory.createLineBorder(Color.red));
						select [24]= true;
						image[24]= "image6";
						panel = "panel1[17]";
				    }
					icons = panel1[26].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
				    	  panel1[26].setBorder(BorderFactory.createLineBorder(Color.red));
						select [26]= true;
						image[26]= "image6";
						panel = "panel1[17]";
				    }}
				// image1 [12] solider red
				if (panel1[17].getIcon().equals(image1[12])){
					icons = panel1[9].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[9].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [9]= true;
						image[9]= "image12";
						panel = "panel1[17]";
					}
					icons = panel1[10].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[10].setBorder(BorderFactory.createLineBorder(Color.red));
						select [10]= true;
						image[10]= "image12";
						panel = "panel1[17]";
				    }
					icons = panel1[8].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[8].setBorder(BorderFactory.createLineBorder(Color.red));
						select [8]= true;
						image[8]= "image12";
						panel = "panel1[17]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton19 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[18]== true){
					// image [6] solider white 
					if (image[18].equals("image6")){
				       D.del(panel);
				       panel1[18].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[18].equals("image12")){
					       D.del(panel);
					       panel1[18].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[18].getIcon().equals(image1[6])){
					icons = panel1[26].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[26].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [26]= true;
						image[26]= "image6";
						panel = "panel1[18]";
					}
					icons = panel1[25].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[25].setBorder(BorderFactory.createLineBorder(Color.red));
						select [25]= true;
						image[25]= "image6";
						panel = "panel1[18]";
				    }
					icons = panel1[27].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[27].setBorder(BorderFactory.createLineBorder(Color.red));
						select [27]= true;
						image[27]= "image6";
						panel = "panel1[18]";
				    }}
				// image1 [12] solider red
				if (panel1[18].getIcon().equals(image1[12])){
					icons = panel1[10].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[10].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [10]= true;
						image[10]= "image12";
						panel = "panel1[18]";
					}
					icons = panel1[11].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[11].setBorder(BorderFactory.createLineBorder(Color.red));
						select [11]= true;
						image[11]= "image12";
						panel = "panel1[18]";
				    }
					icons = panel1[9].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[9].setBorder(BorderFactory.createLineBorder(Color.red));
						select [9]= true;
						image[9]= "image12";
						panel = "panel1[18]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton20 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[19]== true){
					// image [6] solider white 
					if (image[19].equals("image6")){
				       D.del(panel);
				       panel1[19].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[19].equals("image12")){
					       D.del(panel);
					       panel1[19].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[19].getIcon().equals(image1[6])){
					icons = panel1[27].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[27].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [27]= true;
						image[27]= "image6";
						panel = "panel1[19]";
					}
					icons = panel1[26].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[26].setBorder(BorderFactory.createLineBorder(Color.red));
						select [26]= true;
						image[26]= "image6";
						panel = "panel1[19]";
				    }
					icons = panel1[28].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[28].setBorder(BorderFactory.createLineBorder(Color.red));
						select [28]= true;
						image[28]= "image6";
						panel = "panel1[19]";
				    }}
				// image1 [12] solider red
				if (panel1[19].getIcon().equals(image1[12])){
					icons = panel1[11].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[11].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [11]= true;
						image[11]= "image12";
						panel = "panel1[19]";
					}
					icons = panel1[12].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[12].setBorder(BorderFactory.createLineBorder(Color.red));
						select [12]= true;
						image[12]= "image12";
						panel = "panel1[19]";
				    }
					icons = panel1[10].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[10].setBorder(BorderFactory.createLineBorder(Color.red));
						select [10]= true;
						image[10]= "image12";
						panel = "panel1[19]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton21 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[20]== true){
					// image [6] solider white 
					if (image[20].equals("image6")){
				       D.del(panel);
				       panel1[20].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[20].equals("image12")){
					       D.del(panel);
					       panel1[20].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[20].getIcon().equals(image1[6])){
					icons = panel1[28].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[28].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [28]= true;
						image[28]= "image6";
						panel = "panel1[20]";
					}
					icons = panel1[27].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[27].setBorder(BorderFactory.createLineBorder(Color.red));
						select [27]= true;
						image[27]= "image6";
						panel = "panel1[20]";
				    }
					icons = panel1[29].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[29].setBorder(BorderFactory.createLineBorder(Color.red));
						select [29]= true;
						image[29]= "image6";
						panel = "panel1[20]";
				    }}
				// image1 [12] solider red
				if (panel1[20].getIcon().equals(image1[12])){
					icons = panel1[12].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[12].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [12]= true;
						image[12]= "image12";
						panel = "panel1[20]";
					}
					icons = panel1[13].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[13].setBorder(BorderFactory.createLineBorder(Color.red));
						select [13]= true;
						image[13]= "image12";
						panel = "panel1[20]";
				    }
					icons = panel1[11].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[11].setBorder(BorderFactory.createLineBorder(Color.red));
						select [11]= true;
						image[11]= "image12";
						panel = "panel1[20]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton22 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[21]== true){
					// image [6] solider white 
					if (image[21].equals("image6")){
				       D.del(panel);
				       panel1[21].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[21].equals("image12")){
					       D.del(panel);
					       panel1[21].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[21].getIcon().equals(image1[6])){
					icons = panel1[29].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[29].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [29]= true;
						image[29]= "image6";
						panel = "panel1[21]";
					}
					icons = panel1[28].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[28].setBorder(BorderFactory.createLineBorder(Color.red));
						select [28]= true;
						image[28]= "image6";
						panel = "panel1[21]";
				    }
					icons = panel1[30].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[30].setBorder(BorderFactory.createLineBorder(Color.red));
						select [30]= true;
						image[30]= "image6";
						panel = "panel1[21]";
				    }}
				// image1 [12] solider red
				if (panel1[21].getIcon().equals(image1[12])){
					icons = panel1[13].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[13].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [13]= true;
						image[13]= "image12";
						panel = "panel1[21]";
					}
					icons = panel1[14].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[14].setBorder(BorderFactory.createLineBorder(Color.red));
						select [14]= true;
						image[14]= "image12";
						panel = "panel1[21]";
				    }
					icons = panel1[12].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[12].setBorder(BorderFactory.createLineBorder(Color.red));
						select [12]= true;
						image[12]= "image12";
						panel = "panel1[21]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton23 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[22]== true){
					// image [6] solider white 
					if (image[22].equals("image6")){
				       D.del(panel);
				       panel1[22].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[22].equals("image12")){
					       D.del(panel);
					       panel1[22].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[22].getIcon().equals(image1[6])){
					icons = panel1[30].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[30].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [30]= true;
						image[30]= "image6";
						panel = "panel1[22]";
					}
					icons = panel1[29].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[29].setBorder(BorderFactory.createLineBorder(Color.red));
						select [29]= true;
						image[29]= "image6";
						panel = "panel1[22]";
				    }
					icons = panel1[31].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
					  panel1[31].setBorder(BorderFactory.createLineBorder(Color.red));
						select [31]= true;
						image[31]= "image6";
						panel = "panel1[22]";
				    }}
				// image1 [12] solider red
				if (panel1[22].getIcon().equals(image1[12])){
					icons = panel1[14].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[14].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [14]= true;
						image[14]= "image12";
						panel = "panel1[22]";
					}
					icons = panel1[13].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[13].setBorder(BorderFactory.createLineBorder(Color.red));
						select [13]= true;
						image[13]= "image12";
						panel = "panel1[22]";
				    }
					icons = panel1[15].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[15].setBorder(BorderFactory.createLineBorder(Color.red));
						select [15]= true;
						image[15]= "image12";
						panel = "panel1[22]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton24 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[23]== true){
					// image [6] solider white 
					if (image[23].equals("image6")){
				       D.del(panel);
				       panel1[23].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[23].equals("image12")){
					       D.del(panel);
					       panel1[23].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[23].getIcon().equals(image1[6])){
					icons = panel1[31].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[31].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [31]= true;
						image[31]= "image6";
						panel = "panel1[23]";
					}
					icons = panel1[30].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[30].setBorder(BorderFactory.createLineBorder(Color.red));
						select [30]= true;
						image[30]= "image6";
						panel = "panel1[23]";
				    }}
				// image1 [12] solider red
				if (panel1[23].getIcon().equals(image1[12])){
					icons = panel1[15].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[15].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [15]= true;
						image[15]= "image12";
						panel = "panel1[23]";
					}
					icons = panel1[14].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[14].setBorder(BorderFactory.createLineBorder(Color.red));
						select [14]= true;
						image[14]= "image12";
						panel = "panel1[23]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton25 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[24]== true){
					// image [6] solider white  
				if (image[24].equals("image6")){
				       D.del(panel);
				       panel1[24].setIcon(image1[6]);
					}
				// image [12] solider red
				if (image[24].equals("image12")){
				       D.del(panel);
				       panel1[24].setIcon(image1[12]);
					}
				
				}}
			public void mousePressed(MouseEvent arg0) {
				//image [6] solider white 
				if (panel1[24].getIcon().equals(image1[6])){
					icons = panel1[32].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[32].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [32]= true;
						image[32]= "image6";
						panel = "panel1[24]";
					}
					icons = panel1[33].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[33].setBorder(BorderFactory.createLineBorder(Color.red));
						select [33]= true;
						image[33]= "image6";
						panel = "panel1[24]";
				    }}
				// image1 [12] solider red
				if (panel1[24].getIcon().equals(image1[12])){
					icons = panel1[16].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[16].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [16]= true;
						image[16]= "image12";
						panel = "panel1[24]";
					}
					icons = panel1[17].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[17].setBorder(BorderFactory.createLineBorder(Color.red));
						select [17]= true;
						image[17]= "image12";
						panel = "panel1[24]";
				    }}
			
				
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton26 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[25]== true){
					// image [6] solider white 
				if (image[25].equals("image6")){
				       D.del(panel);
				       panel1[25].setIcon(image1[6]);
					}
				// image [12] solider red
				if (image[25].equals("image12")){
				       D.del(panel);
				       panel1[25].setIcon(image1[12]);
					}
				}}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[25].getIcon().equals(image1[6])){
					icons = panel1[33].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[33].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [33]= true;
						image[33]= "image6";
						panel = "panel1[25]";
					}
					icons = panel1[32].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[32].setBorder(BorderFactory.createLineBorder(Color.red));
						select [32]= true;
						image[32]= "image6";
						panel = "panel1[25]";
				    }
					icons = panel1[34].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[34].setBorder(BorderFactory.createLineBorder(Color.red));
						select [34]= true;
						image[34]= "image6";
						panel = "panel1[25]";
				    }}
				// image1 [12] solider red
				if (panel1[25].getIcon().equals(image1[12])){
					icons = panel1[17].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[17].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [17]= true;
						image[17]= "image12";
						panel = "panel1[25]";
					}
					icons = panel1[16].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[16].setBorder(BorderFactory.createLineBorder(Color.red));
						select [16]= true;
						image[16]= "image12";
						panel = "panel1[25]";
				    }
					icons = panel1[18].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[18].setBorder(BorderFactory.createLineBorder(Color.red));
						select [18]= true;
						image[18]= "image12";
						panel = "panel1[25]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton27 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[26]== true){
					// image [6] solider white 
				if (image[26].equals("image6")){
				       D.del(panel);
				       panel1[26].setIcon(image1[6]);
					}
				// image [12] solider red
				if (image[26].equals("image12")){
				       D.del(panel);
				       panel1[26].setIcon(image1[12]);
					}
				}}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[26].getIcon().equals(image1[6])){
					icons = panel1[34].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[34].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [34]= true;
						image[34]= "image6";
						panel = "panel1[26]";
					}
					icons = panel1[35].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[35].setBorder(BorderFactory.createLineBorder(Color.red));
						select [35]= true;
						image[35]= "image6";
						panel = "panel1[26]";
				    }
					icons = panel1[33].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[33].setBorder(BorderFactory.createLineBorder(Color.red));
						select [33]= true;
						image[33]= "image6";
						panel = "panel1[26]";
				    }}
				// image1 [12] solider red
				if (panel1[26].getIcon().equals(image1[12])){
					icons = panel1[18].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[18].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [18]= true;
						image[18]= "image12";
						panel = "panel1[26]";
					}
					icons = panel1[17].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[17].setBorder(BorderFactory.createLineBorder(Color.red));
						select [17]= true;
						image[17]= "image12";
						panel = "panel1[26]";
				    }
					icons = panel1[19].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[19].setBorder(BorderFactory.createLineBorder(Color.red));
						select [19]= true;
						image[19]= "image12";
						panel = "panel1[26]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton28 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[27]== true){
					// image [6] solider white 
					if (image[27].equals("image6")){
				       D.del(panel);
				       panel1[27].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[27].equals("image12")){
					       D.del(panel);
					       panel1[27].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[27].getIcon().equals(image1[6])){
					icons = panel1[35].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[35].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [35]= true;
						image[35]= "image6";
						panel = "panel1[27]";
					}
					icons = panel1[36].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[36].setBorder(BorderFactory.createLineBorder(Color.red));
						select [36]= true;
						image[36]= "image6";
						panel = "panel1[27]";
				    }
					icons = panel1[34].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[34].setBorder(BorderFactory.createLineBorder(Color.red));
						select [34]= true;
						image[34]= "image6";
						panel = "panel1[27]";
				    }}
				// image1 [12] solider red
				if (panel1[27].getIcon().equals(image1[12])){
					icons = panel1[19].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[19].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [19]= true;
						image[19]= "image12";
						panel = "panel1[27]";
					}
					icons = panel1[20].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[20].setBorder(BorderFactory.createLineBorder(Color.red));
						select [20]= true;
						image[20]= "image12";
						panel = "panel1[27]";
				    }
					icons = panel1[18].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[18].setBorder(BorderFactory.createLineBorder(Color.red));
						select [18]= true;
						image[18]= "image12";
						panel = "panel1[27]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton29 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[28]== true){
					// image [6] solider white 
					if (image[28].equals("image6")){
				       D.del(panel);
				       panel1[28].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[28].equals("image12")){
					       D.del(panel);
					       panel1[28].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[28].getIcon().equals(image1[6])){
					icons = panel1[36].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[36].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [36]= true;
						image[36]= "image6";
						panel = "panel1[28]";
					}
					icons = panel1[37].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[37].setBorder(BorderFactory.createLineBorder(Color.red));
						select [37]= true;
						image[37]= "image6";
						panel = "panel1[28]";
				    }
					icons = panel1[35].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[35].setBorder(BorderFactory.createLineBorder(Color.red));
						select [35]= true;
						image[35]= "image6";
						panel = "panel1[28]";
				    }}
				// image1 [12] solider red
				if (panel1[28].getIcon().equals(image1[12])){
					icons = panel1[20].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[20].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [20]= true;
						image[20]= "image12";
						panel = "panel1[28]";
					}
					icons = panel1[21].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[21].setBorder(BorderFactory.createLineBorder(Color.red));
						select [21]= true;
						image[21]= "image12";
						panel = "panel1[28]";
				    }
					icons = panel1[19].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[19].setBorder(BorderFactory.createLineBorder(Color.red));
						select [19]= true;
						image[19]= "image12";
						panel = "panel1[28]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton30 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[29]== true){
					// image [6] solider white 
				if (image[29].equals("image6")){
				       D.del(panel);
				       panel1[29].setIcon(image1[6]);
					}
				// image [12] solider red
				if (image[29].equals("image12")){
				       D.del(panel);
				       panel1[29].setIcon(image1[12]);
					}
				}}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[29].getIcon().equals(image1[6])){
					icons = panel1[37].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[37].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [37]= true;
						image[37]= "image6";
						panel = "panel1[29]";
					}
					icons = panel1[38].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[38].setBorder(BorderFactory.createLineBorder(Color.red));
						select [38]= true;
						image[38]= "image6";
						panel = "panel1[29]";
				    }
					icons = panel1[36].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[36].setBorder(BorderFactory.createLineBorder(Color.red));
						select [36]= true;
						image[36]= "image6";
						panel = "panel1[29]";
				    }}
				// image1 [12] solider red
				if (panel1[29].getIcon().equals(image1[12])){
					icons = panel1[21].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[21].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [21]= true;
						image[21]= "image12";
						panel = "panel1[29]";
					}
					icons = panel1[22].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[22].setBorder(BorderFactory.createLineBorder(Color.red));
						select [22]= true;
						image[22]= "image12";
						panel = "panel1[29]";
				    }
					icons = panel1[20].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[20].setBorder(BorderFactory.createLineBorder(Color.red));
						select [20]= true;
						image[20]= "image12";
						panel = "panel1[29]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton31 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[30]== true){
					// image [6] solider white
					if (image[30].equals("image6")){
				       D.del(panel);
				       panel1[30].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[30].equals("image12")){
				       D.del(panel);
				       panel1[30].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[30].getIcon().equals(image1[6])){
					icons = panel1[38].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[38].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [38]= true;
						image[38]= "image6";
						panel = "panel1[30]";
					}
					icons = panel1[39].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[39].setBorder(BorderFactory.createLineBorder(Color.red));
						select [39]= true;
						image[39]= "image6";
						panel = "panel1[30]";
				    }
					icons = panel1[37].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
				    	  panel1[37].setBorder(BorderFactory.createLineBorder(Color.red));
						select [37]= true;
						image[37]= "image6";
						panel = "panel1[30]";
				    }}
				// image1 [12] solider red
				if (panel1[30].getIcon().equals(image1[12])){
					icons = panel1[22].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[22].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [22]= true;
						image[22]= "image12";
						panel = "panel1[30]";
					}
					icons = panel1[23].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[23].setBorder(BorderFactory.createLineBorder(Color.red));
						select [23]= true;
						image[23]= "image12";
						panel = "panel1[30]";
				    }
					icons = panel1[21].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[21].setBorder(BorderFactory.createLineBorder(Color.red));
						select [21]= true;
						image[21]= "image12";
						panel = "panel1[30]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton32 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[31]== true){
					// image [6] solider white
				if (image[31].equals("image6")){
				       D.del(panel);
				       panel1[31].setIcon(image1[6]);
					}
				// image [12] solider red
				if (image[31].equals("image12")){
			       D.del(panel);
			       panel1[31].setIcon(image1[12]);
				}
				}}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[31].getIcon().equals(image1[6])){
					icons = panel1[39].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[39].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [39]= true;
						image[39]= "image6";
						panel = "panel1[31]";
					}
					icons = panel1[38].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[38].setBorder(BorderFactory.createLineBorder(Color.red));
						select [38]= true;
						image[38]= "image6";
						panel = "panel1[31]";
				    }}
				// image1 [12] solider red
				if (panel1[31].getIcon().equals(image1[12])){
					icons = panel1[23].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[23].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [23]= true;
						image[23]= "image12";
						panel = "panel1[31]";
					}
					icons = panel1[22].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[22].setBorder(BorderFactory.createLineBorder(Color.red));
						select [22]= true;
						image[22]= "image12";
						panel = "panel1[31]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton33 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[32]== true){
					// image [6] solider white 
					if (image[32].equals("image6")){
				       D.del(panel);
				       panel1[32].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[32].equals("image12")){
				       D.del(panel);
				       panel1[32].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] soilder white 
				if (panel1[32].getIcon().equals(image1[6])){
					icons = panel1[40].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[40].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [40]= true;
						image[40]= "image6";
						panel = "panel1[32]";
					}
					icons = panel1[41].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[41].setBorder(BorderFactory.createLineBorder(Color.red));
						select [41]= true;
						image[41]= "image6";
						panel = "panel1[32]";
				    }}
				// image1 [12] solider red
				if (panel1[32].getIcon().equals(image1[12])){
					icons = panel1[24].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[24].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [24]= true;
						image[24]= "image12";
						panel = "panel1[32]";
					}
					icons = panel1[25].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[25].setBorder(BorderFactory.createLineBorder(Color.red));
						select [25]= true;
						image[25]= "image12";
						panel = "panel1[32]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton34 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[33]== true){
					// image [6] solider white 
					if (image[33].equals("image6")){
				       D.del(panel);
				       panel1[33].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[33].equals("image12")){
					       D.del(panel);
					       panel1[33].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[33].getIcon().equals(image1[6])){
					icons = panel1[41].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[41].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [41]= true;
						image[41]= "image6";
						panel = "panel1[33]";
					}
					icons = panel1[42].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[42].setBorder(BorderFactory.createLineBorder(Color.red));
						select [42]= true;
						image[42]= "image6";
						panel = "panel1[33]";
				    }
					icons = panel1[40].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[40].setBorder(BorderFactory.createLineBorder(Color.red));
						select [40]= true;
						image[40]= "image6";
						panel = "panel1[33]";
				    }}
				// image1 [12] solider red
				if (panel1[33].getIcon().equals(image1[12])){
					icons = panel1[25].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[25].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [25]= true;
						image[25]= "image12";
						panel = "panel1[33]";
					}
					icons = panel1[24].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[24].setBorder(BorderFactory.createLineBorder(Color.red));
						select [24]= true;
						image[24]= "image12";
						panel = "panel1[33]";
				    }
					icons = panel1[26].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[26].setBorder(BorderFactory.createLineBorder(Color.red));
						select [26]= true;
						image[26]= "image12";
						panel = "panel1[33]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton35 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[34]== true){
					// image [6] solider white
					if (image[34].equals("image6")){
				       D.del(panel);
				       panel1[34].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[34].equals("image12")){
					       D.del(panel);
					       panel1[34].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[34].getIcon().equals(image1[6])){
					icons = panel1[42].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[42].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [42]= true;
						image[42]= "image6";
						panel = "panel1[34]";
					}
					icons = panel1[43].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[43].setBorder(BorderFactory.createLineBorder(Color.red));
						select [43]= true;
						image[43]= "image6";
						panel = "panel1[34]";
				    }
					icons = panel1[41].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[41].setBorder(BorderFactory.createLineBorder(Color.red));
						select [41]= true;
						image[41]= "image6";
						panel = "panel1[34]";
				    }}
				// image1 [12] solider red
				if (panel1[34].getIcon().equals(image1[12])){
					icons = panel1[26].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[26].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [26]= true;
						image[26]= "image12";
						panel = "panel1[34]";
					}
					icons = panel1[25].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[25].setBorder(BorderFactory.createLineBorder(Color.red));
						select [25]= true;
						image[25]= "image12";
						panel = "panel1[34]";
				    }
					icons = panel1[27].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[27].setBorder(BorderFactory.createLineBorder(Color.red));
						select [27]= true;
						image[27]= "image12";
						panel = "panel1[34]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton36 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[35]== true){
					// image [6] solider white 
					if (image[35].equals("image6")){
				       D.del(panel);
				       panel1[35].setIcon(image1[6]);
					}

					// image [12] solider red 
					if (image[35].equals("image12")){
				       D.del(panel);
				       panel1[35].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white
				if (panel1[35].getIcon().equals(image1[6])){
					icons = panel1[43].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[43].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [43]= true;
						image[43]= "image6";
						panel = "panel1[35]";
					}
					icons = panel1[44].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[44].setBorder(BorderFactory.createLineBorder(Color.red));
						select [44]= true;
						image[44]= "image6";
						panel = "panel1[35]";
				    }
					icons = panel1[42].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[42].setBorder(BorderFactory.createLineBorder(Color.red));
						select [42]= true;
						image[42]= "image6";
						panel = "panel1[35]";
				    }}
				// image1 [12] solider red
				if (panel1[35].getIcon().equals(image1[12])){
					icons = panel1[27].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[27].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [27]= true;
						image[27]= "image12";
						panel = "panel1[35]";
					}
					icons = panel1[26].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[26].setBorder(BorderFactory.createLineBorder(Color.red));
						select [26]= true;
						image[26]= "image12";
						panel = "panel1[35]";
				    }
					icons = panel1[28].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[28].setBorder(BorderFactory.createLineBorder(Color.red));
						select [28]= true;
						image[28]= "image12";
						panel = "panel1[35]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton37 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[36]== true){
					// image [6] solider white 
					if (image[36].equals("image6")){
				       D.del(panel);
				       panel1[36].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[36].equals("image12")){
				       D.del(panel);
				       panel1[36].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[36].getIcon().equals(image1[6])){
					icons = panel1[44].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[44].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [44]= true;
						image[44]= "image6";
						panel = "panel1[36]";
					}
					icons = panel1[43].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
                 		  panel1[43].setBorder(BorderFactory.createLineBorder(Color.red));
						select [43]= true;
						image[43]= "image6";
						panel = "panel1[36]";
				    }
					icons = panel1[45].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[45].setBorder(BorderFactory.createLineBorder(Color.red));
						select [45]= true;
						image[45]= "image6";
						panel = "panel1[36]";
				    }}
				// image1 [12] solider red
				if (panel1[36].getIcon().equals(image1[12])){
					icons = panel1[28].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[28].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [28]= true;
						image[28]= "image12";
						panel = "panel1[36]";
					}
					icons = panel1[27].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[27].setBorder(BorderFactory.createLineBorder(Color.red));
						select [27]= true;
						image[27]= "image12";
						panel = "panel1[36]";
				    }
					icons = panel1[29].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[29].setBorder(BorderFactory.createLineBorder(Color.red));
						select [29]= true;
						image[29]= "image12";
						panel = "panel1[36]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton38 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[37]== true){
					// image [6] solider white 
					if (image[37].equals("image6")){
				       D.del(panel);
				       panel1[37].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[37].equals("image12")){
				       D.del(panel);
				       panel1[37].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[37].getIcon().equals(image1[6])){
					icons = panel1[45].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[45].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [45]= true;
						image[45]= "image6";
						panel = "panel1[37]";
					}
					icons = panel1[46].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[46].setBorder(BorderFactory.createLineBorder(Color.red));
						select [46]= true;
						image[46]= "image6";
						panel = "panel1[37]";
				    }
					icons = panel1[44].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[44].setBorder(BorderFactory.createLineBorder(Color.red));
						select [44]= true;
						image[44]= "image6";
						panel = "panel1[37]";
				    }}
				// image1 [12] solider red
				if (panel1[37].getIcon().equals(image1[12])){
					icons = panel1[29].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[29].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [29]= true;
						image[29]= "image12";
						panel = "panel1[37]";
					}
					icons = panel1[28].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[28].setBorder(BorderFactory.createLineBorder(Color.red));
						select [28]= true;
						image[28]= "image12";
						panel = "panel1[37]";
				    }
					icons = panel1[30].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[30].setBorder(BorderFactory.createLineBorder(Color.red));
						select [30]= true;
						image[30]= "image12";
						panel = "panel1[37]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton39 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[38]== true){
					// image [6] solider white 
					if (image[38].equals("image6")){
				       D.del(panel);
				       panel1[38].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[38].equals("image12")){
				       D.del(panel);
				       panel1[38].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[38].getIcon().equals(image1[6])){
					icons = panel1[46].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[46].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [46]= true;
						image[46]= "image6";
						panel = "panel1[38]";
					}
					icons = panel1[47].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[47].setBorder(BorderFactory.createLineBorder(Color.red));
						select [47]= true;
						image[47]= "image6";
						panel = "panel1[38]";
				    }
					icons = panel1[45].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[45].setBorder(BorderFactory.createLineBorder(Color.red));
						select [45]= true;
						image[45]= "image6";
						panel = "panel1[38]";
				    }}
				// image1 [12] solider red
				if (panel1[38].getIcon().equals(image1[12])){
					icons = panel1[30].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[30].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [30]= true;
						image[30]= "image12";
						panel = "panel1[38]";
					}
					icons = panel1[29].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[29].setBorder(BorderFactory.createLineBorder(Color.red));
						select [29]= true;
						image[29]= "image12";
						panel = "panel1[38]";
				    }
					icons = panel1[31].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[31].setBorder(BorderFactory.createLineBorder(Color.red));
						select [31]= true;
						image[31]= "image12";
						panel = "panel1[38]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton40 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[39]== true){
					// image [6] solider white 
					if (image[39].equals("image6")){
				       D.del(panel);
				       panel1[39].setIcon(image1[6]);
					}
					// image [6] solider red 
					if (image[39].equals("image12")){
				       D.del(panel);
				       panel1[39].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[39].getIcon().equals(image1[6])){
					icons = panel1[47].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[47].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [47]= true;
						image[47]= "image6";
						panel = "panel1[39]";
					}
					icons = panel1[46].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[46].setBorder(BorderFactory.createLineBorder(Color.red));
						select [46]= true;
						image[46]= "image6";
						panel = "panel1[39]";
				    }}
				// image1 [12] solider red
				if (panel1[39].getIcon().equals(image1[12])){
					icons = panel1[31].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[31].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [31]= true;
						image[31]= "image12";
						panel = "panel1[39]";
					}
					icons = panel1[30].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[30].setBorder(BorderFactory.createLineBorder(Color.red));
						select [30]= true;
						image[30]= "image12";
						panel = "panel1[39]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton41 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[40]== true){
					// image [6] solider white 
					if (image[40].equals("image6")){
				       D.del(panel);
				       panel1[40].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[40].equals("image12")){
				       D.del(panel);
				       panel1[40].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[40].getIcon().equals(image1[6])){
					icons = panel1[48].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[48].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [48]= true;
						image[48]= "image6";
						panel = "panel1[40]";
					}
					icons = panel1[49].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[49].setBorder(BorderFactory.createLineBorder(Color.red));
						select [49]= true;
						image[49]= "image6";
						panel = "panel1[40]";
				    }}
				// image1 [12] solider red
				if (panel1[40].getIcon().equals(image1[12])){
					icons = panel1[32].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[32].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [32]= true;
						image[32]= "image12";
						panel = "panel1[40]";
					}
					icons = panel1[33].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[33].setBorder(BorderFactory.createLineBorder(Color.red));
						select [33]= true;
						image[33]= "image12";
						panel = "panel1[40]";
				    }}
			
				
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton42 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[41]== true){
					// image [6] solider white 
					if (image[41].equals("image6")){
				       D.del(panel);
				       panel1[41].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[41].equals("image12")){
				       D.del(panel);
				       panel1[41].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[41].getIcon().equals(image1[6])){
					icons = panel1[49].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[49].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [49]= true;
						image[49]= "image6";
						panel = "panel1[41]";
					}
					icons = panel1[50].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[50].setBorder(BorderFactory.createLineBorder(Color.red));
						select [50]= true;
						image[50]= "image6";
						panel = "panel1[41]";
				    }
					icons = panel1[48].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[48].setBorder(BorderFactory.createLineBorder(Color.red));
						select [48]= true;
						image[48]= "image6";
						panel = "panel1[41]";
				    }}
				// image1 [12] solider red
				if (panel1[41].getIcon().equals(image1[12])){
					icons = panel1[33].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[33].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [33]= true;
						image[33]= "image12";
						panel = "panel1[41]";
					}
					icons = panel1[34].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[34].setBorder(BorderFactory.createLineBorder(Color.red));
						select [34]= true;
						image[34]= "image12";
						panel = "panel1[41]";
				    }
					icons = panel1[32].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[32].setBorder(BorderFactory.createLineBorder(Color.red));
						select [32]= true;
						image[32]= "image12";
						panel = "panel1[41]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton43 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[42]== true){
					// image [6] solider white 
					if (image[42].equals("image6")){
				       D.del(panel);
				       panel1[42].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[42].equals("image12")){
				       D.del(panel);
				       panel1[42].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[42].getIcon().equals(image1[6])){
					icons = panel1[50].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[50].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [50]= true;
						image[50]= "image6";
						panel = "panel1[42]";
					}
					icons = panel1[51].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
                    	  panel1[51].setBorder(BorderFactory.createLineBorder(Color.red));
						select [51]= true;
						image[51]= "image6";
						panel = "panel1[42]";
				    }
					icons = panel1[49].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[49].setBorder(BorderFactory.createLineBorder(Color.red));
						select [49]= true;
						image[49]= "image6";
						panel = "panel1[42]";
				    }}
				// image1 [12] solider red
				if (panel1[42].getIcon().equals(image1[12])){
					icons = panel1[34].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[34].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [34]= true;
						image[34]= "image12";
						panel = "panel1[42]";
					}
					icons = panel1[33].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[33].setBorder(BorderFactory.createLineBorder(Color.red));
						select [33]= true;
						image[33]= "image12";
						panel = "panel1[42]";
				    }
					icons = panel1[35].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[35].setBorder(BorderFactory.createLineBorder(Color.red));
						select [35]= true;
						image[35]= "image12";
						panel = "panel1[42]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton44 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[43]== true){
					// image [6] solider white 
					if (image[43].equals("image6")){
				       D.del(panel);
				       panel1[43].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[43].equals("image12")){
				       D.del(panel);
				       panel1[43].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[43].getIcon().equals(image1[6])){
					icons = panel1[51].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[51].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [51]= true;
						image[51]= "image6";
						panel = "panel1[43]";
					}
					icons = panel1[52].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[52].setBorder(BorderFactory.createLineBorder(Color.red));
						select [52]= true;
						image[52]= "image6";
						panel = "panel1[43]";
				    }
					icons = panel1[50].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[50].setBorder(BorderFactory.createLineBorder(Color.red));
						select [50]= true;
						image[50]= "image6";
						panel = "panel1[43]";
				    }}
				// image1 [12] solider red
				if (panel1[43].getIcon().equals(image1[12])){
					icons = panel1[35].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[35].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [35]= true;
						image[35]= "image12";
						panel = "panel1[43]";
					}
					icons = panel1[34].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[34].setBorder(BorderFactory.createLineBorder(Color.red));
						select [34]= true;
						image[34]= "image12";
						panel = "panel1[43]";
				    }
					icons = panel1[36].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[36].setBorder(BorderFactory.createLineBorder(Color.red));
						select [36]= true;
						image[36]= "image12";
						panel = "panel1[43]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton45 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[44]== true){
					// image [6] solider white 
					if (image[44].equals("image6")){
				       D.del(panel);
				       panel1[44].setIcon(image1[6]);
					}
					// image [12] solider white 
					if (image[44].equals("image12")){
				       D.del(panel);
				       panel1[44].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[44].getIcon().equals(image1[6])){
					icons = panel1[52].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[52].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [52]= true;
						image[52]= "image6";
						panel = "panel1[44]";
					}
					icons = panel1[53].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[53].setBorder(BorderFactory.createLineBorder(Color.red));
						select [53]= true;
						image[53]= "image6";
						panel = "panel1[44]";
				    }
					icons = panel1[51].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[51].setBorder(BorderFactory.createLineBorder(Color.red));
						select [51]= true;
						image[51]= "image6";
						panel = "panel1[44]";
				    }}
				// image1 [12] solider red
				if (panel1[44].getIcon().equals(image1[12])){
					icons = panel1[36].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[36].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [36]= true;
						image[36]= "image12";
						panel = "panel1[44]";
					}
					icons = panel1[35].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[35].setBorder(BorderFactory.createLineBorder(Color.red));
						select [35]= true;
						image[35]= "image12";
						panel = "panel1[44]";
				    }
					icons = panel1[37].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[37].setBorder(BorderFactory.createLineBorder(Color.red));
						select [37]= true;
						image[37]= "image12";
						panel = "panel1[44]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton46 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[45]== true){
					// image [6] solider white 
					if (image[45].equals("image6")){
				       D.del(panel);
				       panel1[45].setIcon(image1[6]);
					}
					// image [12] solider white 
					if (image[45].equals("image12")){
				       D.del(panel);
				       panel1[45].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[45].getIcon().equals(image1[6])){
					icons = panel1[53].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[53].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [53]= true;
						image[53]= "image6";
						panel = "panel1[45]";
					}
					icons = panel1[52].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[52].setBorder(BorderFactory.createLineBorder(Color.red));
						select [52]= true;
						image[52]= "image6";
						panel = "panel1[45]";
				    }
					icons = panel1[54].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[54].setBorder(BorderFactory.createLineBorder(Color.red));
						select [54]= true;
						image[54]= "image6";
						panel = "panel1[45]";
				    }}
				// image1 [12] solider red
				if (panel1[45].getIcon().equals(image1[12])){
					icons = panel1[37].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[37].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [37]= true;
						image[37]= "image12";
						panel = "panel1[45]";
					}
					icons = panel1[36].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[36].setBorder(BorderFactory.createLineBorder(Color.red));
						select [36]= true;
						image[36]= "image12";
						panel = "panel1[45]";
				    }
					icons = panel1[38].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[38].setBorder(BorderFactory.createLineBorder(Color.red));
						select [38]= true;
						image[38]= "image12";
						panel = "panel1[45]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton47 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[46]== true){
					// image [6] solider white 
					if (image[46].equals("image6")){
				       D.del(panel);
				       panel1[46].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[46].equals("image12")){
				       D.del(panel);
				       panel1[46].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[46].getIcon().equals(image1[6])){
					icons = panel1[54].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[54].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [54]= true;
						image[54]= "image6";
						panel = "panel1[46]";
					}
					icons = panel1[55].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[55].setBorder(BorderFactory.createLineBorder(Color.red));
						select [55]= true;
						image[55]= "image6";
						panel = "panel1[46]";
				    }
					icons = panel1[53].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[53].setBorder(BorderFactory.createLineBorder(Color.red));
						select [53]= true;
						image[53]= "image6";
						panel = "panel1[46]";
				    }}
				// image1 [12] solider red
				if (panel1[46].getIcon().equals(image1[12])){
					icons = panel1[38].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[38].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [38]= true;
						image[38]= "image12";
						panel = "panel1[46]";
					}
					icons = panel1[39].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[39].setBorder(BorderFactory.createLineBorder(Color.red));
						select [39]= true;
						image[39]= "image12";
						panel = "panel1[46]";
				    }
					icons = panel1[37].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[37].setBorder(BorderFactory.createLineBorder(Color.red));
						select [37]= true;
						image[37]= "image12";
						panel = "panel1[46]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton48 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[47]== true){
					// image [6] solider white 
					if (image[47].equals("image6")){
				       D.del(panel);
				       panel1[47].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[47].equals("image12")){
				       D.del(panel);
				       panel1[47].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[47].getIcon().equals(image1[6])){
					icons = panel1[55].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[55].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [55]= true;
						image[55]= "image6";
						panel = "panel1[47]";
					}
					icons = panel1[54].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[54].setBorder(BorderFactory.createLineBorder(Color.red));
						select [54]= true;
						image[54]= "image6";
						panel = "panel1[47]";
				    }}
				// image1 [12] solider red
				if (panel1[47].getIcon().equals(image1[12])){
					icons = panel1[39].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[39].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [39]= true;
						image[39]= "image12";
						panel = "panel1[47]";
					}
					icons = panel1[38].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[38].setBorder(BorderFactory.createLineBorder(Color.red));
						select [38]= true;
						image[38]= "image12";
						panel = "panel1[47]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton49 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[48]== true){
					// image [6] solider white 
					if (image[48].equals("image6")){
				       D.del(panel);
				       panel1[48].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[48].equals("image12")){
				       D.del(panel);
				       panel1[48].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[48].getIcon().equals(image1[6])){
					icons = panel1[56].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[56].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [56]= true;
						image[56]= "image6";
						panel = "panel1[48]";
					}
					icons = panel1[57].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[57].setBorder(BorderFactory.createLineBorder(Color.red));
						select [57]= true;
						image[57]= "image6";
						panel = "panel1[48]";
				    }}
				// image1 [12] solider red
				if (panel1[48].getIcon().equals(image1[12])){
					icons = panel1[40].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[40].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [40]= true;
						image[40]= "image12";
						panel = "panel1[48]";
					}
					icons = panel1[41].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[41].setBorder(BorderFactory.createLineBorder(Color.red));
						select [41]= true;
						image[41]= "image12";
						panel = "panel1[48]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton50 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[49]== true){
					// image [6] solider white 
					if (image[49].equals("image6")){
				       D.del(panel);
				       panel1[49].setIcon(image1[6]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[49].getIcon().equals(image1[6])){
					icons = panel1[57].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[57].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [57]= true;
						image[57]= "image6";
						panel = "panel1[49]";
					}
					icons = panel1[58].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
			     		  panel1[58].setBorder(BorderFactory.createLineBorder(Color.red));
						select [58]= true;
						image[58]= "image6";
						panel = "panel1[49]";
				    }
					icons = panel1[56].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[56].setBorder(BorderFactory.createLineBorder(Color.red));
						select [56]= true;
						image[56]= "image6";
						panel = "panel1[49]";
				    }}
				// image1 [12] solider red
				if (panel1[49].getIcon().equals(image1[12])){
					icons = panel1[41].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[41].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [41]= true;
						image[41]= "image12";
						panel = "panel1[49]";
					}
					icons = panel1[40].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[40].setBorder(BorderFactory.createLineBorder(Color.red));
						select [40]= true;
						image[40]= "image12";
						panel = "panel1[49]";
				    }
					icons = panel1[42].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[42].setBorder(BorderFactory.createLineBorder(Color.red));
						select [42]= true;
						image[42]= "image12";
						panel = "panel1[49]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton51 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[50]== true){
					// image [6] solider white 
					if (image[50].equals("image6")){
				       D.del(panel);
				       panel1[50].setIcon(image1[6]);
					}
					// image [12] solider red 
					if (image[50].equals("image12")){
				       D.del(panel);
				       panel1[50].setIcon(image1[12]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white
				if (panel1[50].getIcon().equals(image1[6])){
					icons = panel1[58].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[58].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [58]= true;
						image[58]= "image6";
						panel = "panel1[50]";
					}
					icons = panel1[59].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[59].setBorder(BorderFactory.createLineBorder(Color.red));
						select [59]= true;
						image[59]= "image6";
						panel = "panel1[50]";
				    }
					icons = panel1[57].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[57].setBorder(BorderFactory.createLineBorder(Color.red));
						select [57]= true;
						image[57]= "image6";
						panel = "panel1[50]";
				    }}
				// image1 [12] solider red
				if (panel1[50].getIcon().equals(image1[12])){
					icons = panel1[42].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[42].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [42]= true;
						image[42]= "image12";
						panel = "panel1[50]";
					}
					icons = panel1[43].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[43].setBorder(BorderFactory.createLineBorder(Color.red));
						select [43]= true;
						image[43]= "image12";
						panel = "panel1[50]";
				    }
					icons = panel1[41].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[41].setBorder(BorderFactory.createLineBorder(Color.red));
						select [41]= true;
						image[41]= "image12";
						panel = "panel1[50]";
				    }}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton52 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[51]== true){
					// image1 [6] solider white
					if (image[51].equals("image6")){
				       D.del(panel);
				       panel1[51].setIcon(image1[6]);
					}
					// image1 [12] solider red
					if (image[51].equals("image12")){
					       D.del(panel);
					       panel1[51].setIcon(image1[12]);
						}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image1 [6] solider white
				if (panel1[51].getIcon().equals(image1[6])){
					icons = panel1[59].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[59].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [59]= true;
						image[59]= "image6";
						panel = "panel1[51]";
					}
					icons = panel1[60].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[60].setBorder(BorderFactory.createLineBorder(Color.red));
						select [60]= true;
						image[60]= "image6";
						panel = "panel1[51]";
				    }
					icons = panel1[58].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[58].setBorder(BorderFactory.createLineBorder(Color.red));
						select [58]= true;
						image[58]= "image6";
						panel = "panel1[51]";
				    }}
				// image1 [12] solider red
				if (panel1[51].getIcon().equals(image1[12])){
					icons = panel1[43].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[43].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [43]= true;
						image[43]= "image12";
						panel = "panel1[51]";
					}
					icons = panel1[44].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[44].setBorder(BorderFactory.createLineBorder(Color.red));
						select [44]= true;
						image[44]= "image12";
						panel = "panel1[51]";
				    }
					icons = panel1[45].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[45].setBorder(BorderFactory.createLineBorder(Color.red));
						select [45]= true;
						image[45]= "image12";
						panel = "panel1[51]";
				    }
			
				}
			
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton53 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				// image1 [6] solider white
				if (select[52]== true){
					if (image[52].equals("image6")){
				       D.del(panel);
				       panel1[52].setIcon(image1[6]);
					}
					// image1 [12] solider red
					if (select[52]== true){
						if (image[52].equals("image12")){
					       D.del(panel);
					       panel1[52].setIcon(image1[12]);
						}}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image1 [6] solider white
				if (panel1[52].getIcon().equals(image1[6])){
					icons = panel1[60].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[60].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [60]= true;
						image[60]= "image6";
						panel = "panel1[52]";
					}
					icons = panel1[61].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[61].setBorder(BorderFactory.createLineBorder(Color.red));
						select [61]= true;
						image[61]= "image6";
						panel = "panel1[52]";
				    }
					icons = panel1[59].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[59].setBorder(BorderFactory.createLineBorder(Color.red));
						select [59]= true;
						image[59]= "image6";
						panel = "panel1[52]";
				    }}
				
				// image1 [12] solider red
				if (panel1[52].getIcon().equals(image1[12])){
					icons = panel1[44].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[44].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [44]= true;
						image[44]= "image12";
						panel = "panel1[52]";
					}
					icons = panel1[45].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[45].setBorder(BorderFactory.createLineBorder(Color.red));
						select [45]= true;
						image[45]= "image12";
						panel = "panel1[52]";
				    }
					icons = panel1[46].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[46].setBorder(BorderFactory.createLineBorder(Color.red));
						select [46]= true;
						image[46]= "image12";
						panel = "panel1[52]";
				    }
			
				}
				
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton54 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[53]== true){
					// image1 [6] solider white
					if (image[53].equals("image6")){
				       D.del(panel);
				       panel1[53].setIcon(image1[6]);
					}
					// image1 [12] solider red 
					if (image[53].equals("image12")){
					       D.del(panel);
					       panel1[53].setIcon(image1[12]);
						}
					
					
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image1 [6] solider white
				if (panel1[53].getIcon().equals(image1[6])){
					icons = panel1[61].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[61].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [61]= true;
						image[61]= "image6";
						panel = "panel1[53]";
					}
					icons = panel1[62].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[62].setBorder(BorderFactory.createLineBorder(Color.red));
						select [62]= true;
						image[62]= "image6";
						panel = "panel1[53]";
				    }
					icons = panel1[60].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
				    	  panel1[60].setBorder(BorderFactory.createLineBorder(Color.red));
						select [60]= true;
						image[60]= "image6";
						panel = "panel1[53]";
				    }}
				// image1 [12] solider red 
				if (panel1[53].getIcon().equals(image1[12])){
					icons = panel1[45].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[45].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [45]= true;
						image[45]= "image12";
						panel = "panel1[53]";
					}
					icons = panel1[46].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[46].setBorder(BorderFactory.createLineBorder(Color.red));
						select [46]= true;
						image[46]= "image12";
						panel = "panel1[53]";
				    }
					icons = panel1[44].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[44].setBorder(BorderFactory.createLineBorder(Color.red));
						select [44]= true;
						image[44]= "image12";
						panel = "panel1[53]";
				    }
			
				}}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton55 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[54]== true){
					// image [6] solider white
					if (image[54].equals("image6")){
				       D.del(panel);
				       panel1[54].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[54].equals("image12")){
					       D.del(panel);
					       panel1[54].setIcon(image1[12]);
						}
					
				}}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white 
				if (panel1[54].getIcon().equals(image1[6])){
					icons = panel1[62].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[62].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [62]= true;
						image[62]= "image6";
						panel = "panel1[54]";
					}
					icons = panel1[63].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[63].setBorder(BorderFactory.createLineBorder(Color.red));
						select [63]= true;
						image[63]= "image6";
						panel = "panel1[54]";
				    }
					icons = panel1[61].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[61].setBorder(BorderFactory.createLineBorder(Color.red));
						select [61]= true;
						image[61]= "image6";
						panel = "panel1[54]";
				    }}
				
				// image1 [12] solider red 
				if (panel1[54].getIcon().equals(image1[12])){
					icons = panel1[46].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[46].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [46]= true;
						image[46]= "image12";
						panel = "panel1[54]";
					}
					icons = panel1[47].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[47].setBorder(BorderFactory.createLineBorder(Color.red));
						select [47]= true;
						image[47]= "image12";
						panel = "panel1[54]";
				    }
					icons = panel1[45].getIcon();
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						panel1[45].setBorder(BorderFactory.createLineBorder(Color.red));
						select [45]= true;
						image[45]= "image12";
						panel = "panel1[54]";
				    }
			}}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton56 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				 
				if (select[55]== true){
					// image [6] solider white 
					if (image[55].equals("image6")){
				       D.del(panel);
				       panel1[55].setIcon(image1[6]);
					}
					// image [12] solider red
					if (image[55].equals("image12")){
					       D.del(panel);
					       panel1[55].setIcon(image1[12]);
						}
					
				}
				
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white  
				if (panel1[55].getIcon().equals(image1[6])){
					icons = panel1[63].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[63].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [63]= true;
						image[63]= "image6";
						panel = "panel1[55]";
					}
					icons = panel1[62].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[62].setBorder(BorderFactory.createLineBorder(Color.red));
						select [62]= true;
						image[62]= "image6";
						panel = "panel1[55]";
				    }
				}
				// image1 [12] solider red 
				if (panel1[55].getIcon().equals(image1[12])){
					icons = panel1[47].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[47].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [47]= true;
						image[47]= "image12";
						panel = "panel1[55]";
					}
					if (icons.equals(image1[1])||icons.equals(image1[2])||icons.equals(image1[3])||icons.equals(image1[4])||icons.equals(image1[5])||icons.equals(image1[6])){
						  panel1[46].setBorder(BorderFactory.createLineBorder(Color.red));
						select [46]= true;
						image[46]= "image12";
						panel = "panel1[55]";
				    }
				}
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton57 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[56]== true){
					// image [6] solider white 
					if (image[56].equals("image6")){
				       D.del(panel);
				       panel1[56].setIcon(image1[6]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {
				// image [6] solider white
				if (panel1[56].getIcon().equals(image1[6])){
					icons = panel1[64].getIcon();
					  i = String.valueOf(icons);
					if (i.equals("null")){
						panel1[64].setBorder(BorderFactory.createLineBorder(Color.RED));
						select [64]= true;
						image[64]= "image6";
						panel = "panel1[56]";
					}
					icons = panel1[63].getIcon();
					if (icons.equals(image1[7])||icons.equals(image1[8])||icons.equals(image1[9])||icons.equals(image1[10])||icons.equals(image1[11])||icons.equals(image1[12])){
						  panel1[63].setBorder(BorderFactory.createLineBorder(Color.red));
						select [63]= true;
						image[63]= "image6";
						panel = "panel1[56]";
				    }
				
				}
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton58 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[57]== true){
					// image [6] solider white
					if (image[57].equals("image6")){
				       D.del(panel);
				       panel1[57].setIcon(image1[6]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton59 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[58]== true){
					// image [6] solider white
					if (image[58].equals("image6")){
				       D.del(panel);
				       panel1[58].setIcon(image1[6]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton60 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[59]== true){
					// image [6] solider white
					if (image[59].equals("image6")){
				       D.del(panel);
				       panel1[59].setIcon(image1[6]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  
	  
	  public class actionbutton61 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[60]== true){
					// image [6] solider white
					if (image[60].equals("image6")){
				       D.del(panel);
				       panel1[60].setIcon(image1[6]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	
	  
	  public class actionbutton62 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[61]== true){
					// image [6] solider white
					if (image[61].equals("image6")){
				       D.del(panel);
				       panel1[61].setIcon(image1[6]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	  
	  public class actionbutton63 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[62]== true){
					// image [6] solider white
					if (image[62].equals("image6")){
				       D.del(panel);
				       panel1[62].setIcon(image1[6]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }	  

	  public class actionbutton64 implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				if (select[63]== true){
					// image [6] solider white
					if (image[63].equals("image6")){
				       D.del(panel);
				       panel1[63].setIcon(image1[6]);
					}
				}
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
	    }
	    
	     
}
	    
	    
	    
	    
	    
	    

	

