import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Gameplaypanel gameplay = new Gameplaypanel();
		JFrame obj = new JFrame();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Break ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
	}

}
