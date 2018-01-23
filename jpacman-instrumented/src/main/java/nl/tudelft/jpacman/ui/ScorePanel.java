package nl.tudelft.jpacman.ui;

import static sqat.series2.Api.hit;
import java.awt.GridLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;

import nl.tudelft.jpacman.level.Player;

public class ScorePanel extends JPanel  {

	/**
	 * Default serialisation ID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The map of players and the labels their scores are on.
	 */
	private final Map<Player, JLabel> scoreLabels;
	
	/**
	 * The default way in which the score is shown.
	 */
	public static final ScoreFormatter DEFAULT_SCORE_FORMATTER =
			// this lambda breaks cobertura 2.7 ...
			// player) -> String.format("Score: %3d", player.getScore());
			new ScoreFormatter() {
				public String format(Player p)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(914,93,<39,4>,<41,5>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(914,93,<39,4>,<41,5>)", "68"); return String.format("Score: %3d", p.getScore()); }
			};

	/**
	 * The way to format the score information.
	 */
	private ScoreFormatter scoreFormatter = DEFAULT_SCORE_FORMATTER;

	/**
	 * Creates a new score panel with a column for each player.
	 * 
	 * @param players
	 *            The players to display the scores of.
	 */
	public ScorePanel(List<Player> players)  {
		super();
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)", "73"); assert players != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)", "74"); setLayout(new GridLayout(2, players.size())); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)", "75"); for (int i = 1; i <= players.size(); i++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)", "69"); add(new JLabel("Player " + i, JLabel.CENTER)); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)", "76"); scoreLabels = new LinkedHashMap<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)", "77"); for (Player p : players) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)", "70"); JLabel scoreLabel = new JLabel("0", JLabel.CENTER); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)", "71"); scoreLabels.put(p, scoreLabel); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1286,413,<55,1>,<70,2>)", "72"); add(scoreLabel); }
	}

	/**
	 * Refreshes the scores of the players.
	 */
	protected void refresh()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)", "84"); for (Map.Entry<Player, JLabel> entry : scoreLabels.entrySet()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)", "79"); Player p = entry.getKey(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)", "80"); String score = ""; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)", "81"); if (!p.isAlive()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)", "78"); score = "You died. "; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)", "82"); score += scoreFormatter.format(p); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(1753,280,<75,1>,<85,2>)", "83"); entry.getValue().setText(score); } }
	
	/**
	 * Provide means to format the score for a given player.
	 */
	public interface ScoreFormatter {
		
		/**
		 * Format the score of a given player.
		 * @param p The player and its score
		 * @return Formatted score.
		 */
		String format(Player p);
	}
	
	/**
	 * Let the score panel use a dedicated score formatter.
	 * @param sf Score formatter to be used.
	 */
	public void setScoreFormatter(ScoreFormatter sf)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(2406,97,<104,1>,<107,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(2406,97,<104,1>,<107,2>)", "85"); assert sf != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(403,2102,<20,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/ScorePanel.java|(2406,97,<104,1>,<107,2>)", "86"); scoreFormatter = sf; }
}
