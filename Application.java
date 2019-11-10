import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Application {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			JFrame myFrame = new MyFrame("frame1", 600, 500, new BorderLayout());
		});

		Thread t2 = new Thread(() -> {
			JFrame myFrame = new MyFrame("frame2", 800, 600, new BorderLayout());
		});

		t1.start();
		t2.start();
	}
}
