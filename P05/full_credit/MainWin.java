import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class MainWin extends JFrame{
	private Emporium emporium;
	private JLabel display;

	public MainWin(){
		this.emporium = emporium;
		this.display = display;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		display = new JLabel("File -----");
		display.setBounds(20,20,100,30);
		add(display);

		JButton button = new JButton("Quit");
        button.setBounds(100,20,100,30); 
        button.addActionListener(event ->onQuitClick(event));  
        add(button); 

			display = new JLabel("View -----");
			display.setBounds(20,80,100,30);
			add(display);

			button = new JButton("Ice Cream Flavor");
	        button.setBounds(100,80,200,30); 
	        button.addActionListener(event ->onQuitClick(event));  
	        add(button); 

	        button = new JButton("Mix In Flavor");
	        button.setBounds(100,110,200,30); 
	        button.addActionListener(event ->onQuitClick(event));  
	        add(button); 

	        button = new JButton("Scoop");
	        button.setBounds(100,140,200,30); 
	        button.addActionListener(event ->onQuitClick(event));  
	        add(button); 

		display = new JLabel("Create -----");
		display.setBounds(20,200,100,30);
		add(display);

		button = new JButton("Ice Cream Flavor");
        button.setBounds(100,200,200,30); 
        button.addActionListener(event ->onCreateIceCreamFlavorClick(event));  
        add(button); 

        button = new JButton("Mix In Flavor");
        button.setBounds(100,230,200,30); 
        button.addActionListener(event ->onCreateMixInFlavorClick(event));  
        add(button); 

        button = new JButton("Scoop");
        button.setBounds(100,260,200,30); 
        button.addActionListener(event ->onCreateScoopClick(event));  
        add(button); 

			display = new JLabel("Help -----");
			display.setBounds(20,300,100,30);
			add(display);

			button = new JButton("About");
	        button.setBounds(100,300,200,30); 
	        button.addActionListener(event ->onAboutClick(event));  
	        add(button); 


		setSize(500,800);
		setLayout(null);
		setVisible(true);
	}

	public void onQuitClick(ActionEvent event) {
        System.exit(0);
    }

    public void onCreateIceCreamFlavorClick(ActionEvent event){
    	String name = JOptionPane.showInputDialog( "Name:" );
    	String description = JOptionPane.showInputDialog( "Description:" );
    	String cost = JOptionPane.showInputDialog( "Cost:" );
    	String price = JOptionPane.showInputDialog( "Price:" );

    	int Cost=Integer.parseInt(cost);
    	int Price=Integer.parseInt(price);

    	IceCreamFlavor flavor = new IceCreamFlavor(name,description,Cost,Price);
    	//emporium.addIceCreamFlavor(flavor);
    }
    public void onCreateMixInFlavorClick(ActionEvent event){
    	String name = JOptionPane.showInputDialog( "Name:" );
    	String description = JOptionPane.showInputDialog( "Description:" );
    	String cost = JOptionPane.showInputDialog( "Cost:" );
    	String price = JOptionPane.showInputDialog( "Price:" );

    	int Cost=Integer.parseInt(cost);
    	int Price=Integer.parseInt(price);

    	MixInFlavor flavor = new MixInFlavor(name,description,Cost,Price);
    	emporium.addMixInFlavor(flavor);
    }
    public void onCreateScoopClick(ActionEvent event){
    	String name = JOptionPane.showInputDialog( "Name:" );
    	String description = JOptionPane.showInputDialog( "Description:" );
    	String cost = JOptionPane.showInputDialog( "Cost:" );
    	String price = JOptionPane.showInputDialog( "Price:" );

    	int Cost=Integer.parseInt(cost);
    	int Price=Integer.parseInt(price);

    	//IceCreamFlavor flavor = new IceCreamFlavor(name,description,Cost,Price);
    	//Scoop scoop = new Scoop(flavor)
    	//emporium.addScoop(flavor);
    }
    public void onAboutClick(ActionEvent event){}

}