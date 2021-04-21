import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.GridLayout;


public class Window extends JFrame {
	
	private GridLayout layout = null;
	
	public Window() {
		
		super("Teste GridLayout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setPreferredSize(new Dimension(800,400));
		
		layout = new GridLayout(3,3);
		
		getContentPane().setLayout(layout);
		
		for (int i=0; i<20; i++) {
			add(new JButton("Botão - " + i));
		}
		
		pack();
	}
	
}
