package nl.tudelft.jpacman.level;

import static sqat.series2.Api.hit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import nl.tudelft.jpacman.PacmanConfigurationException;
import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.npc.NPC;

public class MapParser  {

	/**
	 * The factory that creates the levels.
	 */
	private final LevelFactory levelCreator;

	/**
	 * The factory that creates the squares and board.
	 */
	private final BoardFactory boardCreator;

	/**
	 * Creates a new map parser.
	 * 
	 * @param levelFactory
	 *            The factory providing the NPC objects and the level.
	 * @param boardFactory
	 *            The factory providing the Square objects and the board.
	 */
	public MapParser(LevelFactory levelFactory, BoardFactory boardFactory)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(978,147,<41,1>,<44,2>)", "936"); this.levelCreator = levelFactory; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(978,147,<41,1>,<44,2>)", "937"); this.boardCreator = boardFactory;
	}

	/**
	 * Parses the text representation of the board into an actual level.
	 * 
	 * <ul>
	 * <li>Supported characters:
	 * <li>' ' (space) an empty square.
	 * <li>'#' (bracket) a wall.
	 * <li>'.' (period) a square with a pellet.
	 * <li>'P' (capital P) a starting square for players.
	 * <li>'G' (capital G) a square with a ghost.
	 * </ul>
	 * 
	 * @param map
	 *            The text representation of the board, with map[x][y]
	 *            representing the square at position x,y.
	 * @return The level as represented by this text.
	 */
	public Level parseMap(char[][] map)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(1671,416,<63,1>,<76,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(1671,416,<63,1>,<76,2>)", "938"); int width = map.length; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(1671,416,<63,1>,<76,2>)", "939"); int height = map[0].length; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(1671,416,<63,1>,<76,2>)", "940"); Square[][] grid = new Square[width][height]; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(1671,416,<63,1>,<76,2>)", "941"); List<NPC> ghosts = new ArrayList<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(1671,416,<63,1>,<76,2>)", "942"); List<Square> startPositions = new ArrayList<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(1671,416,<63,1>,<76,2>)", "943"); makeGrid(map, width, height, grid, ghosts, startPositions); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(1671,416,<63,1>,<76,2>)", "944"); Board board = boardCreator.createBoard(grid); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(1671,416,<63,1>,<76,2>)", "945"); return levelCreator.createLevel(board, ghosts, startPositions); }

	private void makeGrid(char[][] map, int width, int height,
			Square[][] grid, List<NPC> ghosts, List<Square> startPositions)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2090,291,<78,1>,<86,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2090,291,<78,1>,<86,2>)", "949"); for (int x = 0; x < width; x++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2090,291,<78,1>,<86,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2090,291,<78,1>,<86,2>)", "948"); for (int y = 0; y < height; y++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2090,291,<78,1>,<86,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2090,291,<78,1>,<86,2>)", "946"); char c = map[x][y]; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2090,291,<78,1>,<86,2>)", "947"); addSquare(grid, ghosts, startPositions, x, y, c); } } }

	private void addSquare(Square[][] grid, List<NPC> ghosts,
			List<Square> startPositions, int x, int y, char c)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "966"); switch (c) {
		case ' ':
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "950"); grid[x][y] = boardCreator.createGround(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "951"); break;
		case '#':
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "952"); grid[x][y] = boardCreator.createWall(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "953"); break;
		case '.':
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "954"); Square pelletSquare = boardCreator.createGround(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "955"); grid[x][y] = pelletSquare; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "956"); levelCreator.createPellet().occupy(pelletSquare); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "957"); break;
		case 'G':
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "958"); Square ghostSquare = makeGhostSquare(ghosts); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "959"); grid[x][y] = ghostSquare; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "960"); break;
		case 'P':
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "961"); Square playerSquare = boardCreator.createGround(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "962"); grid[x][y] = playerSquare; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "963"); startPositions.add(playerSquare); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "964"); break;
		default:
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(2384,778,<88,1>,<115,2>)", "965"); throw new PacmanConfigurationException("Invalid character at "
					+ x + "," + y + ": " + c);
		} }

	private Square makeGhostSquare(List<NPC> ghosts)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3165,219,<117,1>,<123,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3165,219,<117,1>,<123,2>)", "967"); Square ghostSquare = boardCreator.createGround(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3165,219,<117,1>,<123,2>)", "968"); NPC ghost = levelCreator.createGhost(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3165,219,<117,1>,<123,2>)", "969"); ghosts.add(ghost); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3165,219,<117,1>,<123,2>)", "970"); ghost.occupy(ghostSquare); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3165,219,<117,1>,<123,2>)", "971"); return ghostSquare; }

	/**
	 * Parses the list of strings into a 2-dimensional character array and
	 * passes it on to {@link #parseMap(char[][])}.
	 * 
	 * @param text
	 *            The plain text, with every entry in the list being a equally
	 *            sized row of squares on the board and the first element being
	 *            the top row.
	 * @return The level as represented by the text.
	 * @throws PacmanConfigurationException If text lines are not properly formatted.
	 */
	public Level parseMap(List<String> text)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)", "974"); checkMapFormat(text); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)", "975"); int height = text.size(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)", "976"); int width = text.get(0).length(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)", "977"); char[][] map = new char[width][height]; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)", "978"); for (int x = 0; x < width; x++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)", "973"); for (int y = 0; y < height; y++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)", "972"); map[x][y] = text.get(y).charAt(x); } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(3853,326,<136,1>,<150,2>)", "979"); return parseMap(map); }
	
	/**
	 * Check the correctness of the map lines in the text.
	 * @param text Map to be checked
	 * @throws PacmanConfigurationException if map is not OK.
	 */
	private void checkMapFormat(List<String> text)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "985"); if (text == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "980"); throw new PacmanConfigurationException(
					"Input text cannot be null."); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "986"); if (text.isEmpty()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "981"); throw new PacmanConfigurationException(
					"Input text must consist of at least 1 row."); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "987"); int width = text.get(0).length(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "988"); if (width == 0) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "982"); throw new PacmanConfigurationException(
				"Input text lines cannot be empty."); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "989"); for (String line : text) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "984"); if (line.length() != width) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(4342,596,<157,1>,<181,2>)", "983"); throw new PacmanConfigurationException(
					"Input text lines are not of equal width."); } } }

	/**
	 * Parses the provided input stream as a character stream and passes it
	 * result to {@link #parseMap(List)}.
	 * 
	 * @param source
	 *            The input stream that will be read.
	 * @return The parsed level as represented by the text on the input stream.
	 * @throws IOException
	 *             when the source could not be read.
	 */
	public Level parseMap(InputStream source) throws IOException  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(5289,304,<193,1>,<202,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(5289,304,<193,1>,<202,2>)", "994"); try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				source, "UTF-8"))) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(5289,304,<193,1>,<202,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(5289,304,<193,1>,<202,2>)", "991"); List<String> lines = new ArrayList<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(5289,304,<193,1>,<202,2>)", "992"); while (reader.ready()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(5289,304,<193,1>,<202,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(5289,304,<193,1>,<202,2>)", "990"); lines.add(reader.readLine()); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(520,5075,<21,0>,<203,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/MapParser.java|(5289,304,<193,1>,<202,2>)", "993"); return parseMap(lines); } }
}
