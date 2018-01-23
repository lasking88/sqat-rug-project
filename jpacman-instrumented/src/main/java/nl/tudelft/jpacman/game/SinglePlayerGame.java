package nl.tudelft.jpacman.game;

import static sqat.series2.Api.hit;
import java.util.List;

import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.Player;

import com.google.common.collect.ImmutableList;

public class SinglePlayerGame extends Game  {

	/**
	 * The player of this game.
	 */
	private final Player player;

	/**
	 * The level of this game.
	 */
	private final Level level;

	/**
	 * Create a new single player game for the provided level and player.
	 * 
	 * @param p
	 *            The player.
	 * @param l
	 *            The level.
	 */
	protected SinglePlayerGame(Player p, Level l)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(271,650,<15,0>,<53,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(620,155,<35,1>,<42,2>)", "710"); assert p != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(271,650,<15,0>,<53,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(620,155,<35,1>,<42,2>)", "711"); assert l != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(271,650,<15,0>,<53,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(620,155,<35,1>,<42,2>)", "712"); this.player = p; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(271,650,<15,0>,<53,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(620,155,<35,1>,<42,2>)", "713"); this.level = l; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(271,650,<15,0>,<53,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(620,155,<35,1>,<42,2>)", "714"); level.registerPlayer(p);
	}

	@Override
	public List<Player> getPlayers()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(271,650,<15,0>,<53,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(778,83,<44,1>,<47,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(271,650,<15,0>,<53,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(778,83,<44,1>,<47,2>)", "715"); return ImmutableList.of(player); }

	@Override
	public Level getLevel()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(271,650,<15,0>,<53,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(864,55,<49,1>,<52,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(271,650,<15,0>,<53,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/SinglePlayerGame.java|(864,55,<49,1>,<52,2>)", "716"); return level; }
}
