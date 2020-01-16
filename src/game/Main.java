package game;

import java.awt.Frame;
import java.util.logging.Logger;

public class Main extends Frame {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
		LOG.info("Hello World!");
		new Main();
	}
	Main() {
		super("FrameTest");
		setSize(200, 100);
		setVisible(true);
	}
}
