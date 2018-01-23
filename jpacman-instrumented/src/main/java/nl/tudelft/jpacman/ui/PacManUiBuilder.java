package nl.tudelft.jpacman.ui;

import static sqat.series2.Api.hit;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import nl.tudelft.jpacman.game.Game;
import nl.tudelft.jpacman.ui.ScorePanel.ScoreFormatter;

public class PacManUiBuilder  {

	/**
	 * Caption for the default stop button.
	 */
	private static final String STOP_CAPTION = "Stop";

	/**
	 * Caption for the default start button.
	 */
	private static final String START_CAPTION = "Start";

	/**
	 * Map of buttons and their actions.
	 */
	private final Map<String, Action> buttons;

	/**
	 * Map of key events and their actions.
	 */
	private final Map<Integer, Action> keyMappings;

	/**
	 * <code>true</code> iff this UI has the default buttons.
	 */
	private boolean defaultButtons;
	
	/**
	 * Way to format the score.
	 */
	private ScoreFormatter scoreFormatter = null;

	/**
	 * Creates a new Pac-Man UI builder without any mapped keys or buttons.
	 */
	public PacManUiBuilder()  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(989,138,<50,1>,<54,2>)", "87"); this.defaultButtons = false; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(989,138,<50,1>,<54,2>)", "88"); this.buttons = new LinkedHashMap<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(989,138,<50,1>,<54,2>)", "89"); this.keyMappings = new HashMap<>();
	}

	/**
	 * Creates a new Pac-Man UI with the set keys and buttons.
	 * 
	 * @param game
	 *            The game to build the UI for.
	 * @return A new Pac-Man UI with the set keys and buttons.
	 */
	public PacManUI build(final Game game)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1326,211,<63,1>,<71,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1326,211,<63,1>,<71,2>)", "92"); assert game != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1326,211,<63,1>,<71,2>)", "93"); if (defaultButtons) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1326,211,<63,1>,<71,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1326,211,<63,1>,<71,2>)", "90"); addStartButton(game); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1326,211,<63,1>,<71,2>)", "91"); addStopButton(game); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1326,211,<63,1>,<71,2>)", "94"); return new PacManUI(game, buttons, keyMappings, scoreFormatter); }

	/**
	 * Adds a button with the caption {@value #STOP_CAPTION} that stops the
	 * game.
	 * 
	 * @param game
	 *            The game to stop.
	 */
	private void addStopButton(final Game game)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1687,184,<80,1>,<89,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1687,184,<80,1>,<89,2>)", "99"); assert game != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1687,184,<80,1>,<89,2>)", "100"); buttons.put(STOP_CAPTION, new Action() {
			@Override
			public void doAction()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1687,184,<80,1>,<89,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1687,184,<80,1>,<89,2>)", "96"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1803,59,<84,3>,<87,4>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1687,184,<80,1>,<89,2>)", "97"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1803,59,<84,3>,<87,4>)", "95"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(1687,184,<80,1>,<89,2>)", "98"); game.stop(); }
		}); }

	/**
	 * Adds a button with the caption {@value #START_CAPTION} that starts the
	 * game.
	 * 
	 * @param game
	 *            The game to start.
	 */
	private void addStartButton(final Game game)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2024,187,<98,1>,<107,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2024,187,<98,1>,<107,2>)", "105"); assert game != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2024,187,<98,1>,<107,2>)", "106"); buttons.put(START_CAPTION, new Action() {
			@Override
			public void doAction()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2024,187,<98,1>,<107,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2024,187,<98,1>,<107,2>)", "102"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2142,60,<102,3>,<105,4>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2024,187,<98,1>,<107,2>)", "103"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2142,60,<102,3>,<105,4>)", "101"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2024,187,<98,1>,<107,2>)", "104"); game.start(); }
		}); }

	/**
	 * Adds a key listener to the UI.
	 * 
	 * @param keyCode
	 *            The key code of the key as used by {@link java.awt.event.KeyEvent}.
	 * @param action
	 *            The action to perform when the key is pressed.
	 * @return The builder.
	 */
	public PacManUiBuilder addKey(Integer keyCode, Action action)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2471,169,<118,1>,<124,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2471,169,<118,1>,<124,2>)", "107"); assert keyCode != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2471,169,<118,1>,<124,2>)", "108"); assert action != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2471,169,<118,1>,<124,2>)", "109"); keyMappings.put(keyCode, action); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2471,169,<118,1>,<124,2>)", "110"); return this; }

	/**
	 * Adds a button to the UI.
	 * 
	 * @param caption
	 *            The caption of the button.
	 * @param action
	 *            The action to execute when the button is clicked.
	 * @return The builder.
	 */
	public PacManUiBuilder addButton(String caption, Action action)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2856,196,<135,1>,<142,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2856,196,<135,1>,<142,2>)", "111"); assert caption != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2856,196,<135,1>,<142,2>)", "112"); assert !caption.isEmpty(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2856,196,<135,1>,<142,2>)", "113"); assert action != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2856,196,<135,1>,<142,2>)", "114"); buttons.put(caption, action); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(2856,196,<135,1>,<142,2>)", "115"); return this; }

	/**
	 * Adds a start and stop button to the UI. The actual actions for these
	 * buttons will be added upon building the UI.
	 * 
	 * @return The builder.
	 */
	public PacManUiBuilder withDefaultButtons()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(3216,159,<150,1>,<155,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(3216,159,<150,1>,<155,2>)", "116"); defaultButtons = true; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(3216,159,<150,1>,<155,2>)", "117"); buttons.put(START_CAPTION, null); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(3216,159,<150,1>,<155,2>)", "118"); buttons.put(STOP_CAPTION, null); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(3216,159,<150,1>,<155,2>)", "119"); return this; }
	
	/**
	 * Provide formatter for the score.
	 * 
	 * @param sf
	 *         The score formatter to be used.
	 * 
	 * @return The builder.
	 */
	public PacManUiBuilder withScoreFormatter(ScoreFormatter sf)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(3519,103,<165,1>,<168,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(3519,103,<165,1>,<168,2>)", "120"); scoreFormatter = sf; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(277,3347,<15,0>,<169,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUiBuilder.java|(3519,103,<165,1>,<168,2>)", "121"); return this; }
}
