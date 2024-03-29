package gui;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import product.*;
import emporium.*;

public class MainWin extends JFrame 
{
    public MainWin()
    {
        super("Mavs Ice Cream Emporium");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        emporium = new Emporium();

        //menu

        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem quit = new JMenuItem("Quit");
        JMenu view = new JMenu("View");
        JMenuItem icecreamview = new JMenuItem("Ice Cream Flavor");
        JMenuItem mixinview = new JMenuItem("Mix In Flavor");
        JMenuItem scoopview = new JMenuItem("Scoop");
        JMenu create = new JMenu("Create");
        JMenuItem icecreamcreate = new JMenuItem("Ice Cream Flavor");
        JMenuItem mixincreate = new JMenuItem("Mix In Flavor");
        JMenuItem scoopcreate = new JMenuItem("Scoop");
        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");

        quit.addActionListener(event-> onQuitClick());
        icecreamview.addActionListener(event -> view(Screen.ICE_CREAM_FLAVORS));
        mixinview.addActionListener(event -> view(Screen.MIX_IN_FLAVORS));
        scoopview.addActionListener(event -> view(Screen.SCOOPS));
        icecreamcreate.addActionListener(event -> onCreateIceCreamFlavorClick());
        mixincreate.addActionListener(event -> onCreateMixInFlavorClick());
        scoopcreate.addActionListener(event -> onCreateScoopClick());
        //scoopcreate.setEnabled(false);
        about.addActionListener(event -> onAboutClick());

        file.add(quit);
        view.add(icecreamview);
        view.add(mixinview);
        view.add(scoopview);
        create.add(icecreamcreate);
        create.add(mixincreate);
        create.add(scoopcreate);
        help.add(about);

        menubar.add(file);
        menubar.add(view);
        menubar.add(create);
        menubar.add(help);
        setJMenuBar(menubar);

        JToolBar toolbar = new JToolBar("Ice cream Controls");

        JButton save = new JButton();
        save.setActionCommand("save");
        save.setToolTipText("Save to write all the data");
        //save.setBorder(null);
        toolbar.add(save);
        save.addActionListener(event -> onSaveClick());

        toolbar.add(Box.createHorizontalStrut(25));

        JButton saveas = new JButton();
        saveas.setActionCommand("save-as");
        saveas.setToolTipText("Save as");
        //saveas.setBorder(null);
        toolbar.add(saveas);
        saveas.addActionListener(event -> onSaveAsClick());

         JButton open = new JButton();
        open.setActionCommand("open");
        open.setToolTipText("open");
        //open.setBorder(null);
        toolbar.add(open);
        open.addActionListener(event -> onOpenClick());

         JButton creamcreate  = new JButton();
        creamcreate.setActionCommand("create a ice cream flavor");
        creamcreate.setToolTipText("Save to write all the data");
        //creamcreate.setBorder(null);
        toolbar.add(creamcreate);
        creamcreate.addActionListener(event -> onCreateIceCreamFlavorClick());

         JButton mixcreate = new JButton();
        mixcreate.setActionCommand("save");
        mixcreate.setToolTipText("Save to write all the data");
        //mixcreate.setBorder(null);
        toolbar.add(mixcreate);
        mixcreate.addActionListener(event -> onCreateMixInFlavorClick());

         JButton createscop = new JButton();
        createscop.setActionCommand("save");
        createscop.setToolTipText("Save to write all the data");
        //createscop.setBorder(null);
        toolbar.add(createscop);
        createscop.addActionListener(event -> onCreateScoopClick());

         JButton creamview = new JButton();
        creamview.setActionCommand("save");
        creamview.setToolTipText("Save to write all the data");
        //creamview.setBorder(null);
        toolbar.add(creamview);
        creamview.addActionListener(event -> view(Screen.ICE_CREAM_FLAVORS));

         JButton mixview = new JButton();
        mixview.setActionCommand("save");
        mixview.setToolTipText("Save to write all the data");
        //mixview.setBorder(null);
        toolbar.add(mixview);
        mixview.addActionListener(event ->view(Screen.MIX_IN_FLAVORS) );

         JButton viewscop = new JButton();
        viewscop.setActionCommand("save");
        viewscop.setToolTipText("Save to write all the data");
        //viewscop.setBorder(null);
        toolbar.add(viewscop);
        viewscop.addActionListener(event -> view(Screen.SCOOPS));

        getContentPane().add(toolbar, BorderLayout.PAGE_START);

        
        display = new JLabel();
        display.setFont(new Font("SansSerif", Font.BOLD, 18));
        display.setVerticalAlignment(JLabel.TOP);
        add(display, BorderLayout.CENTER);
        setVisible(true);
        //scoopcreate.setEnabled(false);

    }

    public void onQuitClick()
    {
        System.exit(0);
    }

    public void onCreateIceCreamFlavorClick()
    {
        String name = JOptionPane.showInputDialog(this,
            "Name?");
        String description = JOptionPane.showInputDialog(this,
            "Description?");
        String sprice = JOptionPane.showInputDialog(this,
            "Price?");
        int price = Integer.parseInt(sprice);

        String scost = JOptionPane.showInputDialog(this,
            "Cost?");
        int cost = Integer.parseInt(scost);

        IceCreamFlavor addicecream = new IceCreamFlavor(name, description, cost, price);
        emporium.addIceCreamFlavor(addicecream);
        //scoopcreate.setEnabled(true);
        view(Screen.ICE_CREAM_FLAVORS);
    }

    public void onCreateMixInFlavorClick()
    {
        String name = JOptionPane.showInputDialog(this,
            "Name?");
        String description = JOptionPane.showInputDialog(this,"Description?");
        int price = Integer.parseInt(JOptionPane.showInputDialog(this,"Price?"));
        int cost = Integer.parseInt(JOptionPane.showInputDialog(this,"Cost?"));

        MixInFlavor mixinadd = new MixInFlavor(name, description, cost, price);
        emporium.addMixInFlavor(mixinadd);
        view(Screen.MIX_IN_FLAVORS);


    }

    public void onAboutClick()
    {
        JDialog about = new JDialog();
        about.setLayout(new FlowLayout());
        about.setTitle("Ice cream");
            
        try {
            BufferedImage myPicture = ImageIO.read(new File("gui/logo.png"));
            JLabel logo = new JLabel(new ImageIcon(myPicture));
            about.add(logo);
        } catch(IOException e) {
        }
        
        JLabel title = new JLabel("<html>"
          + "<p><font size=+4>MICE</font></p>"
          + "</html>");
        about.add(title);

        JLabel subTitle = new JLabel("<html>"
          + "<br/><p><font size=+1>Mavs Ice Cream Emporium</font></p>"
          + "</html>", JLabel.CENTER);
        about.add(subTitle);

        JLabel artists = new JLabel("<html>"
          + "<p>Version 0.3</p>"
          + "<p> Copyright 2022-2100 by Siddahrt M. Bhagavagar</p>"
          + "<p>Licensed under Gnu GPL 3.0</p>"
          + "</html>");
        about.add(artists);

        JButton ok = new JButton("OK");
        ok.addActionListener(event -> about.setVisible(false));
        about.add(ok);
        
        about.setSize(450,400);
        about.setVisible(true);
    }

    public void view(Screen screen)
    {
          display.setIcon(null);  // remove the splash image if present
        display.setHorizontalAlignment(JLabel.LEFT);
        display.setVerticalAlignment(JLabel.TOP);
        if(Screen.ICE_CREAM_FLAVORS == screen)
        {
            Object[] arr = emporium.iceCreamFlavors();
            display.setText("<html>" +"<p>ICE_CREAM_FLAVORS</p>" + Arrays.toString(arr).replace("[","").replace("]", "").replaceAll(",", "<br/>")
                + "</html>");
        }
        else if(Screen.MIX_IN_FLAVORS == screen)
        {
           Object[] arr = emporium.mixInFlavors();
            display.setText("<html>" +"<p>MIX_IN_FLAVORS</p>" + Arrays.toString(arr).replace("[","").replace("]", "").replaceAll(",", "<br/>")
                + "</html>");
           }
        else if(Screen.SCOOPS == screen)
        {
            Object[] arr = emporium.scoops();
            display.setText("<html>" +"<p>SCOOPS</p>" + Arrays.toString(arr).replace("[","").replace("]", "").replaceAll(" ", " ")
                + "</html>");
        }
        
    }

    public void onCreateScoopClick(){

        Object[] arr = emporium.iceCreamFlavors();
        ImageIcon icon = new ImageIcon("Untitled_Artwork.jpg");
        Object name = (Object) JOptionPane.showInputDialog(this,
           "Selecte Ice Cream Flavor",
           "Creating a Scoop",
           JOptionPane.OK_CANCEL_OPTION,
           icon,
           arr,
           arr[0]);
        IceCreamFlavor ice = (IceCreamFlavor) name;
        if(ice == null)
        {
            System.err.println("Ice Cream not selected");
        }
        Scoop cop = new Scoop(ice);
        int i =0;
        Object[] temp = emporium.mixInFlavors();
        boolean cor = false;
    do
    {
        Object[] arr2 = emporium.mixInFlavors();
        ImageIcon icon2 = new ImageIcon("P06/gui/Untitled_Artwork.jpg");
        Object mix = (Object) JOptionPane.showInputDialog(this,
           "Selecte Mix Cream Flavor",
           "Creating a Scoop",
           JOptionPane.OK_CANCEL_OPTION,
           icon2,
           arr2,
           arr2[0]);

            MixInFlavor mixu = (MixInFlavor) mix;
            if(arr2 == null)
            {
                cor = true;
            }
            

        Object[] arr3 = MixInAmount.values();
        ImageIcon icon3 = new ImageIcon("P06/gui/Untitled_Artwork.jpg");
        Object amount = (Object) JOptionPane.showInputDialog(this,
           "Selecte Ice Cream Flavor",
           "Creating a Scoop",
           JOptionPane.OK_CANCEL_OPTION,
           icon3,
           arr3,
           arr3[0]);
            MixInAmount mout = (MixInAmount) amount;
        MixIn enmix = new MixIn(mixu,mout);

        i++;

        cop.addMixIn(enmix);
    }
    while(i < temp.length || cor != true);
        emporium.addScoop(cop);
        view(Screen.SCOOPS);


    }

    public void onSaveClick()
    {   
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(MAGIC_COOKIE + '\n');
            bw.write(FILE_VERSION + '\n');
            nim.save(bw);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unable to open " + filename + '\n' + e,
                "Failed", JOptionPane.ERROR_MESSAGE); 
        }

    }
    public void onSaveAsClick()
    {   
         final JFileChooser fc = new JFileChooser(filename);  // Create a file chooser dialog
        FileFilter nimFiles = new FileNameExtensionFilter("Nim files", "nim");
        fc.addChoosableFileFilter(nimFiles);         // Add "Nim file" filter
        fc.setFileFilter(nimFiles);                  // Show Nim files only by default
        
        int result = fc.showSaveDialog(this);        // Run dialog, return button clicked
        if (result == JFileChooser.APPROVE_OPTION) { // Also CANCEL_OPTION and ERROR_OPTION
            filename = fc.getSelectedFile();         // Obtain the selected File object
            if(!filename.getAbsolutePath().endsWith(".nim"))  // Ensure it ends with ".nim"
                filename = new File(filename.getAbsolutePath() + ".nim");
            onSaveGameClick();                       // Delegate to Save method
        }
        
    }
    public void onOpenClick()
    {   
        final JFileChooser fc = new JFileChooser(filename);  // Create a file chooser dialog
        FileFilter nimFiles = new FileNameExtensionFilter("Nim files", "nim");
        fc.addChoosableFileFilter(nimFiles);         // Add "Nim file" filter
        fc.setFileFilter(nimFiles);                  // Show Nim files only by default
        
        int result = fc.showOpenDialog(this);        // Run dialog, return button clicked
        if (result == JFileChooser.APPROVE_OPTION) { // Also CANCEL_OPTION and ERROR_OPTION
            filename = fc.getSelectedFile();        // Obtain the selected File object
            
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String magicCookie = br.readLine();
                if(!magicCookie.equals(MAGIC_COOKIE)) throw new RuntimeException("Not a Nim file");
                String fileVersion = br.readLine();
                if(!fileVersion.equals(FILE_VERSION)) throw new RuntimeException("Incompatible Nim file format");
                
                nim = new Nim(br);                   // Open a new game
                if(computerPlayer.isSelected()) 
                    computerPlayer.doClick();        // Turn off AI (can be turned on if desired)
                         // doClick() generates a click event, while setSelected(false) does not
                setSticks();                         // Update the user interface
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Unable to open " + filename + '\n' + e, 
                    "Failed", JOptionPane.ERROR_MESSAGE); 
             }
        }
        
    }

    private enum Screen {
    ICE_CREAM_FLAVORS,
    MIX_IN_FLAVORS,
    SCOOPS;
    }

    private JLabel display;
    public Emporium emporium; 

}