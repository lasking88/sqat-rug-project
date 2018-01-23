package nl.tudelft.jpacman.ui;

import static sqat.series2.Api.hit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;

class PacKeyListener implements KeyListener  {

	/**
	 * The mappings of keyCode to action.
	 */
	private final Map<Integer, Action> mappings;
	
	/**
	 * Create a new key listener based on a set of keyCode-action pairs.
	 * @param keyMappings The mappings of keyCode to action.
	 */
	PacKeyListener(Map<Integer, Action> keyMappings)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(501,114,<23,1>,<26,2>)", "495"); assert keyMappings != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(501,114,<23,1>,<26,2>)", "496"); this.mappings = keyMappings;
	}
	
	@Override
	public void keyPressed(KeyEvent e)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(619,168,<28,1>,<35,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(619,168,<28,1>,<35,2>)", "498"); assert e != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(619,168,<28,1>,<35,2>)", "499"); Action action = mappings.get(e.getKeyCode()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(619,168,<28,1>,<35,2>)", "500"); if (action != null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(619,168,<28,1>,<35,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(619,168,<28,1>,<35,2>)", "497"); action.doAction(); } }

	@Override
	public void keyTyped(KeyEvent e)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(790,64,<37,1>,<40,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(790,64,<37,1>,<40,2>)", "501"); }
	
	@Override
	public void keyReleased(KeyEvent e)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(858,67,<42,1>,<45,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(218,709,<12,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacKeyListener.java|(858,67,<42,1>,<45,2>)", "502"); }
}