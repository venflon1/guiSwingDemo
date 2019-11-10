import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Logger logger = Logger.getLogger(MyFrame.class.getName());

	private String titleJFrame;
	private Dimension dimensionFrame;
	private LayoutManager layoutFrame;
	private JButton buttonNorth;
	private JButton buttonSouth;
	private JButton buttonEast;
	private JButton buttonWest;
	private JButton buttonCenter;

	public MyFrame(String title, int width, int height, LayoutManager layout) {
		this.titleJFrame = title;
		this.dimensionFrame = new Dimension(width, height);
		this.layoutFrame = layout;
		this.initFrame();

		this.buttonNorth = new JButton("bottone sopra");
		buttonNorth.addActionListener((e) -> {
			logger.info("pressed button above");
		});
		this.buttonSouth = new JButton("bottone sotto");
		buttonSouth.addActionListener((e) -> {
			logger.info("pressed button below!");
		});

		this.buttonEast = new JButton("bottone destro");
		buttonEast.addActionListener((e) -> {
			logger.info("pressed right button!");
		});

		this.buttonWest = new JButton("bottone sinistro");
		buttonWest.addActionListener((e) -> {
			logger.info("pressed left button!");
		});
		this.buttonCenter = new JButton("bottone centale");
		buttonCenter.addActionListener((e) -> {
			logger.info("pressed center button!");
		});

		this.add(this.buttonNorth, BorderLayout.NORTH);
		this.add(this.buttonSouth, BorderLayout.SOUTH);
		this.add(this.buttonCenter, BorderLayout.CENTER);
		this.add(this.buttonEast, BorderLayout.EAST);
		this.add(this.buttonWest, BorderLayout.WEST);
	}

	public void initFrame() {
		this.setTitle(this.titleJFrame);
		logger.info("FrameTitle:\"" + this.titleJFrame + "\"");
		this.setSize(this.dimensionFrame);
		logger.info("DimensionFrame: { width:" + dimensionFrame.getWidth() + ", height:" + dimensionFrame.getHeight()
				+ " }");
		this.setLayout(this.layoutFrame);
		logger.info("Layout frame: " + layoutFrame.getClass().getSimpleName());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
