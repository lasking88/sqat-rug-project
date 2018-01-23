package nl.tudelft.jpacman.game;

import static sqat.series2.Api.hit;
import java.util.List;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.Level.LevelObserver;
import nl.tudelft.jpacman.level.Player;

public abstract class Game implements LevelObserver  {

	/**
	 * <code>true</code> if the game is in progress.
	 */
	private boolean inProgress;

	/**
	 * Object that locks the start and stop methods.
	 */
	private final Object progressLock = new Object();

	/**
	 * Creates a new game.
	 */
	protected Game()  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(609,43,<30,1>,<32,2>)", "1"); inProgress = false;
	}

	/**
	 * Starts or resumes the game.
	 */
	public void start()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)", "8"); synchronized (progressLock) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)", "6"); if (isInProgress()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)", "2"); return; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)", "7"); if (getLevel().isAnyPlayerAlive()
					&& getLevel().remainingPellets() > 0) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)", "3"); inProgress = true; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)", "4"); getLevel().addObserver(this); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(697,270,<37,1>,<49,2>)", "5"); getLevel().start(); } } }

	/**
	 * Pauses the game.
	 */
	public void stop()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1001,147,<54,1>,<62,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1001,147,<54,1>,<62,2>)", "13"); synchronized (progressLock) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1001,147,<54,1>,<62,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1001,147,<54,1>,<62,2>)", "10"); if (!isInProgress()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1001,147,<54,1>,<62,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1001,147,<54,1>,<62,2>)", "9"); return; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1001,147,<54,1>,<62,2>)", "11"); inProgress = false; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1001,147,<54,1>,<62,2>)", "12"); getLevel().stop(); } }

	/**
	 * @return <code>true</code> iff the game is started and in progress.
	 */
	public boolean isInProgress()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1232,55,<67,1>,<69,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1232,55,<67,1>,<69,2>)", "14"); return inProgress; }

	/**
	 * @return An immutable list of the participants of this game.
	 */
	public abstract List<Player> getPlayers() ;

	/**
	 * @return The level currently being played.
	 */
	public abstract Level getLevel() ;

	/**
	 * Moves the specified player one square in the given direction.
	 * 
	 * @param player
	 *            The player to move.
	 * @param direction
	 *            The direction to move in.
	 */
	public void move(Player player, Direction direction)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1697,151,<89,1>,<94,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1697,151,<89,1>,<94,2>)", "16"); if (isInProgress()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1697,151,<89,1>,<94,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1697,151,<89,1>,<94,2>)", "15"); getLevel().move(player, direction); } }
	
	@Override
	public void levelWon()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1852,48,<96,1>,<99,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1852,48,<96,1>,<99,2>)", "17"); stop(); }
	
	@Override
	public void levelLost()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1904,49,<101,1>,<104,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(317,1638,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/Game.java|(1904,49,<101,1>,<104,2>)", "18"); stop(); }
}
