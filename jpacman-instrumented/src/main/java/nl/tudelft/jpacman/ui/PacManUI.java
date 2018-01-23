package nl.tudelft.jpacman.ui;

import static sqat.series2.Api.hit;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import nl.tudelft.jpacman.game.Game;
import nl.tudelft.jpacman.ui.ScorePanel.ScoreFormatter;

public class PacManUI extends JFrame  {

	/**
	 * Default serialisation UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The desired frame rate interval for the graphics in milliseconds, 40
	 * being 25 fps.
	 */
	private static final int FRAME_INTERVAL = 40;

	/**
	 * The panel displaying the player scores.
	 */
	private final ScorePanel scorePanel;

	/**
	 * The panel displaying the game.
	 */
	private final BoardPanel boardPanel;

	/**
	 * Creates a new UI for a JPac-Man game.
	 * 
	 * @param game
	 *            The game to play.
	 * @param buttons
	 *            The map of caption-to-action entries that will appear as
	 *            buttons on the interface.
	 * @param keyMappings
	 *            The map of keyCode-to-action entries that will be added as key
	 *            listeners to the interface.
	 * @param sf
	 *            The formatter used to display the current score. 
	 */
	public PacManUI(final Game game, final Map<String, Action> buttons,
			final Map<Integer, Action> keyMappings, ScoreFormatter sf)  {
		super("JPac-Man");
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "718"); assert game != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "719"); assert buttons != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "720"); assert keyMappings != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "721"); setDefaultCloseOperation(EXIT_ON_CLOSE); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "722"); PacKeyListener keys = new PacKeyListener(keyMappings); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "723"); addKeyListener(keys); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "724"); JPanel buttonPanel = new ButtonPanel(buttons, this); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "725"); scorePanel = new ScorePanel(game.getPlayers()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "726"); if (sf != null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "717"); scorePanel.setScoreFormatter(sf); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "727"); boardPanel = new BoardPanel(game); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "728"); Container contentPanel = getContentPane(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "729"); contentPanel.setLayout(new BorderLayout()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "730"); contentPanel.add(buttonPanel, BorderLayout.SOUTH); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "731"); contentPanel.add(scorePanel, BorderLayout.NORTH); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "732"); contentPanel.add(boardPanel, BorderLayout.CENTER); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(1693,833,<67,1>,<95,2>)", "733"); pack();
	}

	/**
	 * Starts the "engine", the thread that redraws the interface at set
	 * intervals.
	 */
	public void start()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2624,289,<101,1>,<115,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2624,289,<101,1>,<115,2>)", "738"); setVisible(true); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2624,289,<101,1>,<115,2>)", "739"); ScheduledExecutorService service = Executors
				.newSingleThreadScheduledExecutor(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2624,289,<101,1>,<115,2>)", "740"); service.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2624,289,<101,1>,<115,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2624,289,<101,1>,<115,2>)", "735"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2807,54,<109,3>,<112,4>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2624,289,<101,1>,<115,2>)", "736"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2807,54,<109,3>,<112,4>)", "734"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2624,289,<101,1>,<115,2>)", "737"); nextFrame(); }
		}, 0, FRAME_INTERVAL, TimeUnit.MILLISECONDS); }

	/**
	 * Draws the next frame, i.e. refreshes the scores and game.
	 */
	private void nextFrame()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2988,77,<120,1>,<123,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2988,77,<120,1>,<123,2>)", "741"); boardPanel.repaint(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(773,2294,<30,0>,<124,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/PacManUI.java|(2988,77,<120,1>,<123,2>)", "742"); scorePanel.refresh(); }
}
