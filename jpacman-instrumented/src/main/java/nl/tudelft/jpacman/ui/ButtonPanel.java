package nl.tudelft.jpacman.ui;

import static sqat.series2.Api.hit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ButtonPanel extends JPanel  {
	
	/**
	 * Default serialisation ID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create a new button panel with a button for every action.
	 * @param buttons The map of caption - action for each button.
	 * @param parent The parent frame, used to return window focus.
	 */
	ButtonPanel(final Map<String, Action> buttons, final JFrame parent)  {
		super();
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "462"); assert buttons != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "463"); assert parent != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "464"); for (final String caption : buttons.keySet()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "459"); JButton button = new JButton(caption); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "460"); button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "454"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(923,138,<37,4>,<41,5>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "455"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(923,138,<37,4>,<41,5>)", "452"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "456"); buttons.get(caption).doAction(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "457"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(923,138,<37,4>,<41,5>)", "453"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "458"); parent.requestFocusInWindow(); }
			}); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(309,784,<16,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ButtonPanel.java|(640,451,<28,1>,<45,2>)", "461"); add(button); }
	}
}
