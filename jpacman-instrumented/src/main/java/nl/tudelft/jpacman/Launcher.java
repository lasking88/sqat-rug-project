package nl.tudelft.jpacman;

import static sqat.series2.Api.hit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.game.Game;
import nl.tudelft.jpacman.game.GameFactory;
import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.level.MapParser;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.level.PlayerFactory;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.ui.Action;
import nl.tudelft.jpacman.ui.PacManUI;
import nl.tudelft.jpacman.ui.PacManUiBuilder;

@SuppressWarnings("PMD.TooManyMethods")
public class Launcher  {

	private static final PacManSprites SPRITE_STORE = new PacManSprites();
	
	public static final String DEFAULT_MAP = "/board.txt";
	private String levelMap = DEFAULT_MAP;

	private PacManUI pacManUI;
	private Game game;

	/**
	 * @return The game object this launcher will start when {@link #launch()}
	 *         is called.
	 */
	public Game getGame()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1220,41,<43,1>,<45,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1220,41,<43,1>,<45,2>)", "219"); return game; }
	
	/**
	 * The map file used to populate the level.
	 * @return The name of the map file.
	 */
	protected String getLevelMap()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1358,54,<51,1>,<53,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1358,54,<51,1>,<53,2>)", "220"); return levelMap; }
	
	/**
	 * Set the name of the file containing this level's map.
	 * @param fileName Map to be used.
	 * @return Level corresponding to the given map.
	 */
	public Launcher withMapFile(String fileName)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1570,87,<60,1>,<63,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1570,87,<60,1>,<63,2>)", "221"); levelMap = fileName; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1570,87,<60,1>,<63,2>)", "222"); return this; }

	/**
	 * Creates a new game using the level from {@link #makeLevel()}.
	 * 
	 * @return a new Game.
	 */
	public Game makeGame()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1765,136,<70,1>,<74,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1765,136,<70,1>,<74,2>)", "223"); GameFactory gf = getGameFactory(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1765,136,<70,1>,<74,2>)", "224"); Level level = makeLevel(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(1765,136,<70,1>,<74,2>)", "225"); return gf.createSinglePlayerGame(level); }

	/**
	 * Creates a new level. By default this method will use the map parser to
	 * parse the default board stored in the <code>board.txt</code> resource.
	 * 
	 * @return A new level.
	 */
	public Level makeLevel()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2094,302,<82,1>,<90,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2094,302,<82,1>,<90,2>)", "228"); MapParser parser = getMapParser(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2094,302,<82,1>,<90,2>)", "229"); try (InputStream boardStream = Launcher.class
				.getResourceAsStream(getLevelMap())) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2094,302,<82,1>,<90,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2094,302,<82,1>,<90,2>)", "226"); return parser.parseMap(boardStream); } catch (IOException e) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2094,302,<82,1>,<90,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2094,302,<82,1>,<90,2>)", "227"); throw new PacmanConfigurationException("Unable to create level.", e); } }
	

	/**
	 * @return A new map parser object using the factories from
	 *         {@link #getLevelFactory()} and {@link #getBoardFactory()}.
	 */
	protected MapParser getMapParser()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2543,101,<97,1>,<99,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2543,101,<97,1>,<99,2>)", "230"); return new MapParser(getLevelFactory(), getBoardFactory()); }

	/**
	 * @return A new board factory using the sprite store from
	 *         {@link #getSpriteStore()}.
	 */
	protected BoardFactory getBoardFactory()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2756,90,<105,1>,<107,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2756,90,<105,1>,<107,2>)", "231"); return new BoardFactory(getSpriteStore()); }

	/**
	 * @return The default {@link PacManSprites}.
	 */
	protected PacManSprites getSpriteStore()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2906,68,<112,1>,<114,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(2906,68,<112,1>,<114,2>)", "232"); return SPRITE_STORE; }

	/**
	 * @return A new factory using the sprites from {@link #getSpriteStore()}
	 *         and the ghosts from {@link #getGhostFactory()}.
	 */
	protected LevelFactory getLevelFactory()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(3122,109,<120,1>,<122,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(3122,109,<120,1>,<122,2>)", "233"); return new LevelFactory(getSpriteStore(), getGhostFactory()); }

	/**
	 * @return A new factory using the sprites from {@link #getSpriteStore()}.
	 */
	protected GhostFactory getGhostFactory()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(3320,90,<127,1>,<129,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(3320,90,<127,1>,<129,2>)", "234"); return new GhostFactory(getSpriteStore()); }

	/**
	 * @return A new factory using the players from {@link #getPlayerFactory()}.
	 */
	protected GameFactory getGameFactory()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(3501,89,<134,1>,<136,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(3501,89,<134,1>,<136,2>)", "235"); return new GameFactory(getPlayerFactory()); }

	/**
	 * @return A new factory using the sprites from {@link #getSpriteStore()}.
	 */
	protected PlayerFactory getPlayerFactory()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(3679,93,<141,1>,<143,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(3679,93,<141,1>,<143,2>)", "236"); return new PlayerFactory(getSpriteStore()); }

	/**
	 * Adds key events UP, DOWN, LEFT and RIGHT to a game.
	 * 
	 * @param builder
	 *            The {@link PacManUiBuilder} that will provide the UI.
	 * @param game
	 *            The game that will process the events.
	 */
	protected void addSinglePlayerKeys(final PacManUiBuilder builder,
			final Game game)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "253"); final Player p1 = getSinglePlayer(game); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "254"); builder.addKey(KeyEvent.VK_UP, new Action() {

			@Override
			public void doAction()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "241"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4188,78,<159,3>,<162,4>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "242"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4188,78,<159,3>,<162,4>)", "237"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "243"); game.move(p1, Direction.NORTH); }
		}).addKey(KeyEvent.VK_DOWN, new Action() {

			@Override
			public void doAction()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "244"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4316,78,<165,3>,<168,4>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "245"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4316,78,<165,3>,<168,4>)", "238"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "246"); game.move(p1, Direction.SOUTH); }
		}).addKey(KeyEvent.VK_LEFT, new Action() {

			@Override
			public void doAction()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "247"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4444,77,<171,3>,<174,4>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "248"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4444,77,<171,3>,<174,4>)", "239"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "249"); game.move(p1, Direction.WEST); }
		}).addKey(KeyEvent.VK_RIGHT, new Action() {

			@Override
			public void doAction()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "250"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4572,77,<177,3>,<180,4>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "251"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4572,77,<177,3>,<180,4>)", "240"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4004,655,<153,1>,<183,2>)", "252"); game.move(p1, Direction.EAST); }
		}); }

	private Player getSinglePlayer(final Game game)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4662,214,<185,1>,<191,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4662,214,<185,1>,<191,2>)", "256"); List<Player> players = game.getPlayers(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4662,214,<185,1>,<191,2>)", "257"); if (players.isEmpty()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4662,214,<185,1>,<191,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4662,214,<185,1>,<191,2>)", "255"); throw new IllegalArgumentException("Game has 0 players."); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4662,214,<185,1>,<191,2>)", "258"); return players.get(0); }

	/**
	 * Creates and starts a JPac-Man game.
	 */
	public void launch()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4929,210,<196,1>,<202,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4929,210,<196,1>,<202,2>)", "259"); game = makeGame(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4929,210,<196,1>,<202,2>)", "260"); PacManUiBuilder builder = new PacManUiBuilder().withDefaultButtons(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4929,210,<196,1>,<202,2>)", "261"); addSinglePlayerKeys(builder, game); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4929,210,<196,1>,<202,2>)", "262"); pacManUI = builder.build(game); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(4929,210,<196,1>,<202,2>)", "263"); pacManUI.start(); }

	/**
	 * Disposes of the UI. For more information see {@link javax.swing.JFrame#dispose()}.
	 */
	public void dispose()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(5239,48,<207,1>,<209,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(5239,48,<207,1>,<209,2>)", "264"); pacManUI.dispose(); }

	/**
	 * Main execution method for the Launcher.
	 * 
	 * @param args
	 *            The command line arguments - which are ignored.
	 * @throws IOException
	 *             When a resource could not be read.
	 */
	public static void main(String[] args) throws IOException  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(5503,89,<219,1>,<221,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(825,4769,<28,0>,<222,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/Launcher.java|(5503,89,<219,1>,<221,2>)", "265"); new Launcher().launch(); }
}
