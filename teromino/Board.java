import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

class Board extends JComponent {

	private static final int SCALE = 16; // number of pixels per square

	private int cols;
	private int rows;

	public Board(int cols, int rows) {
		super();
		setPreferredSize(new Dimension(cols * SCALE, rows * SCALE));

	}

	public void paintComponent(Graphics g) {
		// clear the screen with black
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());

		// demonstrate drawing a rectangle
		g.setColor(Color.blue);
		g.fillRect(120, 120, 42, 19);

	}

	// Move the active piece down one step. Check for collisions.
	//  Check for complete rows that can be destroyed.
	public void nextTurn() {
	}

	public void slide(int dx) {
		// TO DO: move the active piece one square in the direction dx
		// (which has a value -1 or 1):

		// request that paintComponent be called again:
		repaint();

	}

	public void rotateRight() {
		// TO DO: rotate the active piece to the right:


		repaint();
	}

	public void rotateLeft() {
		// TO DO: rotate the active piece to the left:
		repaint();
	}

}
