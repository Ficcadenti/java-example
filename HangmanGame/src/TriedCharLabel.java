import java.awt.Color;

public class TriedCharLabel extends CharLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TriedCharLabel(char c) {
		super();
		super.setMyChar(c);
		super.setTypeD(false);
		setForeground(Color.RED);
	}
}
