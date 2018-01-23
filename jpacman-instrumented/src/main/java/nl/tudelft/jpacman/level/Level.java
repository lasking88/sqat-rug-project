package nl.tudelft.jpacman.level;

import static sqat.series2.Api.hit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.npc.NPC;

@SuppressWarnings("PMD.TooManyMethods")
public class Level  {

	/**
	 * The board of this level.
	 */
	private final Board board;

	/**
	 * The lock that ensures moves are executed sequential.
	 */
	private final Object moveLock = new Object();

	/**
	 * The lock that ensures starting and stopping can't interfere with each
	 * other.
	 */
	private final Object startStopLock = new Object();

	/**
	 * The NPCs of this level and, if they are running, their schedules.
	 */
	private final Map<NPC, ScheduledExecutorService> npcs;

	/**
	 * <code>true</code> iff this level is currently in progress, i.e. players
	 * and NPCs can move.
	 */
	private boolean inProgress;

	/**
	 * The squares from which players can start this game.
	 */
	private final List<Square> startSquares;

	/**
	 * The start current selected starting square.
	 */
	private int startSquareIndex;

	/**
	 * The players on this level.
	 */
	private final List<Player> players;

	/**
	 * The table of possible collisions between units.
	 */
	private final CollisionMap collisions;

	/**
	 * The objects observing this level.
	 */
	private final Set<LevelObserver> observers;

	/**
	 * Creates a new level for the board.
	 * 
	 * @param b
	 *            The board for the level.
	 * @param ghosts
	 *            The ghosts on the board.
	 * @param startPositions
	 *            The squares on which players start on this board.
	 * @param collisionMap
	 *            The collection of collisions that should be handled.
	 */
	public Level(Board b, List<NPC> ghosts, List<Square> startPositions,
			CollisionMap collisionMap)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "619"); assert b != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "620"); assert ghosts != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "621"); assert startPositions != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "622"); this.board = b; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "623"); this.inProgress = false; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "624"); this.npcs = new HashMap<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "625"); for (NPC g : ghosts) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "618"); npcs.put(g, null); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "626"); this.startSquares = startPositions; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "627"); this.startSquareIndex = 0; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "628"); this.players = new ArrayList<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "629"); this.collisions = collisionMap; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2161,482,<93,1>,<110,2>)", "630"); this.observers = new HashSet<>();
	}

	/**
	 * Adds an observer that will be notified when the level is won or lost.
	 * 
	 * @param observer
	 *            The observer that will be notified.
	 */
	public void addObserver(LevelObserver observer)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2806,79,<118,1>,<120,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(2806,79,<118,1>,<120,2>)", "631"); observers.add(observer); }

	/**
	 * Removes an observer if it was listed.
	 * 
	 * @param observer
	 *            The observer to be removed.
	 */
	public void removeObserver(LevelObserver observer)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3008,85,<128,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3008,85,<128,1>,<130,2>)", "632"); observers.remove(observer); }

	/**
	 * Registers a player on this level, assigning him to a starting position. A
	 * player can only be registered once, registering a player again will have
	 * no effect.
	 * 
	 * @param p
	 *            The player to register.
	 */
	public void registerPlayer(Player p)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)", "634"); assert p != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)", "635"); assert !startSquares.isEmpty(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)", "636"); if (players.contains(p)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)", "633"); return; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)", "637"); players.add(p); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)", "638"); Square square = startSquares.get(startSquareIndex); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)", "639"); p.occupy(square); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)", "640"); startSquareIndex++; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3333,297,<140,1>,<152,2>)", "641"); startSquareIndex %= startSquares.size(); }

	/**
	 * Returns the board of this level.
	 * 
	 * @return The board of this level.
	 */
	public Board getBoard()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3722,44,<159,1>,<161,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3722,44,<159,1>,<161,2>)", "642"); return board; }

	/**
	 * Moves the unit into the given direction if possible and handles all
	 * collisions.
	 * 
	 * @param unit
	 *            The unit to move.
	 * @param direction
	 *            The direction to move the unit in.
	 */
	public void move(Unit unit, Direction direction)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "653"); assert unit != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "654"); assert direction != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "655"); if (!isInProgress()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "643"); return; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "656"); synchronized (moveLock) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "648"); unit.setDirection(direction); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "649"); Square location = unit.getSquare(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "650"); Square destination = location.getSquareAt(direction); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "651"); if (destination.isAccessibleTo(unit)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "645"); List<Unit> occupants = destination.getOccupants(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "646"); unit.occupy(destination); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "647"); for (Unit occupant : occupants) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "644"); collisions.collide(unit, occupant); } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(3992,548,<172,1>,<194,2>)", "652"); updateObservers(); } }

	/**
	 * Starts or resumes this level, allowing movement and (re)starting the
	 * NPCs.
	 */
	public void start()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4636,163,<200,1>,<209,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4636,163,<200,1>,<209,2>)", "662"); synchronized (startStopLock) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4636,163,<200,1>,<209,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4636,163,<200,1>,<209,2>)", "658"); if (isInProgress()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4636,163,<200,1>,<209,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4636,163,<200,1>,<209,2>)", "657"); return; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4636,163,<200,1>,<209,2>)", "659"); startNPCs(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4636,163,<200,1>,<209,2>)", "660"); inProgress = true; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4636,163,<200,1>,<209,2>)", "661"); updateObservers(); } }

	/**
	 * Stops or pauses this level, no longer allowing any movement on the board
	 * and stopping all NPCs.
	 */
	public void stop()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4916,141,<215,1>,<223,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4916,141,<215,1>,<223,2>)", "667"); synchronized (startStopLock) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4916,141,<215,1>,<223,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4916,141,<215,1>,<223,2>)", "664"); if (!isInProgress()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4916,141,<215,1>,<223,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4916,141,<215,1>,<223,2>)", "663"); return; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4916,141,<215,1>,<223,2>)", "665"); stopNPCs(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(4916,141,<215,1>,<223,2>)", "666"); inProgress = false; } }

	/**
	 * Starts all NPC movement scheduling.
	 */
	private void startNPCs()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5110,293,<228,1>,<236,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5110,293,<228,1>,<236,2>)", "671"); for (final NPC npc : npcs.keySet()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5110,293,<228,1>,<236,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5110,293,<228,1>,<236,2>)", "668"); ScheduledExecutorService service = Executors
					.newSingleThreadScheduledExecutor(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5110,293,<228,1>,<236,2>)", "669"); service.schedule(new NpcMoveTask(service, npc),
					npc.getInterval() / 2, TimeUnit.MILLISECONDS); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5110,293,<228,1>,<236,2>)", "670"); npcs.put(npc, service); } }

	/**
	 * Stops all NPC movement scheduling and interrupts any movements being
	 * executed.
	 */
	private void stopNPCs()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5503,130,<242,1>,<246,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5503,130,<242,1>,<246,2>)", "673"); for (Entry<NPC, ScheduledExecutorService> e : npcs.entrySet()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5503,130,<242,1>,<246,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5503,130,<242,1>,<246,2>)", "672"); e.getValue().shutdownNow(); } }

	/**
	 * Returns whether this level is in progress, i.e. whether moves can be made
	 * on the board.
	 * 
	 * @return <code>true</code> iff this level is in progress.
	 */
	public boolean isInProgress()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5808,55,<254,1>,<256,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5808,55,<254,1>,<256,2>)", "674"); return inProgress; }

	/**
	 * Updates the observers about the state of this level.
	 */
	private void updateObservers()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)", "679"); if (!isAnyPlayerAlive()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)", "676"); for (LevelObserver o : observers) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)", "675"); o.levelLost(); } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)", "680"); if (remainingPellets() == 0) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)", "678"); for (LevelObserver o : observers) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(5933,230,<261,1>,<272,2>)", "677"); o.levelWon(); } } }

	/**
	 * Returns <code>true</code> iff at least one of the players in this level
	 * is alive.
	 * 
	 * @return <code>true</code> if at least one of the registered players is
	 *         alive.
	 */
	public boolean isAnyPlayerAlive()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6365,131,<281,1>,<288,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6365,131,<281,1>,<288,2>)", "683"); for (Player p : players) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6365,131,<281,1>,<288,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6365,131,<281,1>,<288,2>)", "682"); if (p.isAlive()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6365,131,<281,1>,<288,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6365,131,<281,1>,<288,2>)", "681"); return true; } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6365,131,<281,1>,<288,2>)", "684"); return false; }

	/**
	 * Counts the pellets remaining on the board.
	 * 
	 * @return The amount of pellets remaining on the board.
	 */
	public int remainingPellets()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)", "689"); Board b = getBoard(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)", "690"); int pellets = 0; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)", "691"); for (int x = 0; x < b.getWidth(); x++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)", "688"); for (int y = 0; y < b.getHeight(); y++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)", "687"); for (Unit u : b.squareAt(x, y).getOccupants()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)", "686"); if (u instanceof Pellet) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)", "685"); pellets++; } } } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)", "692"); assert pellets >= 0; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(6619,330,<295,1>,<309,2>)", "693"); return pellets; }

	/**
	 * A task that moves an NPC and reschedules itself after it finished.
	 * 
	 * @author Jeroen Roosen 
	 */
	private final class NpcMoveTask implements Runnable  {

		/**
		 * The service executing the task.
		 */
		private final ScheduledExecutorService service;

		/**
		 * The NPC to move.
		 */
		private final NPC npc;

		/**
		 * Creates a new task.
		 * 
		 * @param s
		 *            The service that executes the task.
		 * @param n
		 *            The NPC to move.
		 */
		NpcMoveTask(ScheduledExecutorService s, NPC n)  {
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "694"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7065,700,<316,1>,<350,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7438,90,<336,2>,<339,3>)", "611"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "695"); this.service = s; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "696"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7065,700,<316,1>,<350,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7438,90,<336,2>,<339,3>)", "612"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "697"); this.npc = n;
		}

		@Override
		public void run()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "701"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7065,700,<316,1>,<350,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7532,230,<341,2>,<349,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "702"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7065,700,<316,1>,<350,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7532,230,<341,2>,<349,3>)", "614"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "703"); Direction nextMove = npc.nextMove(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "704"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7065,700,<316,1>,<350,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7532,230,<341,2>,<349,3>)", "615"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "705"); if (nextMove != null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "698"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7065,700,<316,1>,<350,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7532,230,<341,2>,<349,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "699"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7065,700,<316,1>,<350,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7532,230,<341,2>,<349,3>)", "613"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "700"); move(npc, nextMove); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "706"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7065,700,<316,1>,<350,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7532,230,<341,2>,<349,3>)", "616"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "707"); long interval = npc.getInterval(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "708"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7065,700,<316,1>,<350,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(7532,230,<341,2>,<349,3>)", "617"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Level.java|(668,7516,<26,0>,<371,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "709"); service.schedule(this, interval, TimeUnit.MILLISECONDS); }
	}

	/**
	 * An observer that will be notified when the level is won or lost.
	 * 
	 * @author Jeroen Roosen 
	 */
	public interface LevelObserver {

		/**
		 * The level has been won. Typically the level should be stopped when
		 * this event is received.
		 */
		void levelWon();

		/**
		 * The level has been lost. Typically the level should be stopped when
		 * this event is received.
		 */
		void levelLost();
	}
}
