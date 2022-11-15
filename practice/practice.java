// import javax.swing.JOptionPane;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JButton;
// import javax.swing.JMenu;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;
// import java.awt.BorderLayout;
// import java.awt.Color;
import java.awt.*;
import javax.swing.*;



public class practice extends JFrame{

	public practice(){
		super();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JLabel label = new JLabel("Maire Baap", JLabel.CENTER);
		// label.setBounds(20,20,100,30);
		label.setOpaque(true);
		label.setBackground(Color.RED);
		add(label, BorderLayout.PAGE_START);

		// JButton button = new JButton("Maire Baap");
		// button.setBounds(20,20,120,30);
		// button.addActionListener(event -> System.out.println(event.getActionCommand()));

		// 	// new ActionListener(){
		// 	// public void actionPerformed(ActionEvent event){
		// 	// String str = event.getActionCommand();
		// 	// System.out.println(str);

		// 				//}
		
		// add(button, BorderLayout.PAGE_END);

		JMenuBar menubar = new JMenuBar();
        
        JMenu     file       = new JMenu("File");
        JMenuItem haga       = new JMenuItem("New");
        JMenuItem open       = new JMenuItem("Open");
        JMenuItem save       = new JMenuItem("Save");
        JMenu     saveAs     = new JMenu("Save As");
        JMenuItem saveAsExam = new JMenuItem("Exam");
        JMenuItem saveAsQuiz = new JMenuItem("Quiz");
        JMenuItem exit       = new JMenuItem("Exit");
        
        file.add(haga);
        file.add(open);
        file.add(save);
        saveAs.add(saveAsExam);
        saveAs.add(saveAsQuiz);
        file.add(saveAs);
        file.add(exit);
        
        menubar.add(file);
        setJMenuBar(menubar);
        
        setVisible(true);


		setSize(220,160);
		// setLayout(null);
		// setVisible(true);
	}


	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Hello, Java!");
	
		practice testrun = new practice();
		testrun.setVisible(true);

	}
}