package nl.tudelft.jpacman.sprite;

import static sqat.series2.Api.hit;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import nl.tudelft.jpacman.PacmanConfigurationException;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.npc.ghost.GhostColor;

public class PacManSprites extends SpriteStore  {

	/**
	 * The sprite files are vertically stacked series for each direction, this
	 * array denotes the order.
	 */
	private static final Direction[] DIRECTIONS = { Direction.NORTH,
			Direction.EAST, Direction.SOUTH, Direction.WEST };

	/**
	 * The image size in pixels.
	 */
	private static final int SPRITE_SIZE = 16;

	/**
	 * The amount of frames in the pacman animation.
	 */
	private static final int PACMAN_ANIMATION_FRAMES = 4;

	/**
	 * The amount of frames in the pacman dying animation.
	 */
	private static final int PACMAN_DEATH_FRAMES = 11;
	
	/**
	 * The amount of frames in the ghost animation.
	 */
	private static final int GHOST_ANIMATION_FRAMES = 2;

	/**
	 * The delay between frames.
	 */
	private static final int ANIMATION_DELAY = 200;

	/**
	 * @return A map of animated Pac-Man sprites for all directions.
	 */
	public Map<Direction, Sprite> getPacmanSprites()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(1243,126,<53,1>,<55,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(1243,126,<53,1>,<55,2>)", "342"); return directionSprite("/sprite/pacman.png", PACMAN_ANIMATION_FRAMES); }

	/**
	 * @return The animation of a dying Pac-Man.
	 */
	public AnimatedSprite getPacManDeathAnimation()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(1428,301,<60,1>,<69,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(1428,301,<60,1>,<69,2>)", "343"); String resource = "/sprite/dead.png"; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(1428,301,<60,1>,<69,2>)", "344"); Sprite baseImage = loadSprite(resource); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(1428,301,<60,1>,<69,2>)", "345"); AnimatedSprite animation = createAnimatedSprite(baseImage, PACMAN_DEATH_FRAMES,
				ANIMATION_DELAY, false); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(1428,301,<60,1>,<69,2>)", "346"); animation.setAnimating(false); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(1428,301,<60,1>,<69,2>)", "347"); return animation; }

	/**
	 * Returns a new map with animations for all directions.
	 * 
	 * @param resource
	 *            The resource name of the sprite.
	 * @param frames
	 *            The number of frames in this sprite.
	 * @return The animated sprite facing the given direction.
	 */
	private Map<Direction, Sprite> directionSprite(String resource, int frames)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)", "352"); Map<Direction, Sprite> sprite = new HashMap<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)", "353"); Sprite baseImage = loadSprite(resource); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)", "354"); for (int i = 0; i < DIRECTIONS.length; i++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)", "348"); Sprite directionSprite = baseImage.split(0, i * SPRITE_SIZE, frames
					* SPRITE_SIZE, SPRITE_SIZE); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)", "349"); AnimatedSprite animation = createAnimatedSprite(directionSprite,
					frames, ANIMATION_DELAY, true); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)", "350"); animation.setAnimating(true); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)", "351"); sprite.put(DIRECTIONS[i], animation); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2003,529,<80,1>,<94,2>)", "355"); return sprite; }

	/**
	 * Returns a map of animated ghost sprites for all directions.
	 * 
	 * @param color
	 *            The colour of the ghost.
	 * @return The Sprite for the ghost.
	 */
	public Map<Direction, Sprite> getGhostSprite(GhostColor color)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2709,232,<103,1>,<109,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2709,232,<103,1>,<109,2>)", "356"); assert color != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2709,232,<103,1>,<109,2>)", "357"); String resource = "/sprite/ghost_" + color.name().toLowerCase()
				+ ".png"; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2709,232,<103,1>,<109,2>)", "358"); return directionSprite(resource, GHOST_ANIMATION_FRAMES); }

	/**
	 * @return The sprite for the wall.
	 */
	public Sprite getWallSprite()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2991,75,<114,1>,<116,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(2991,75,<114,1>,<116,2>)", "359"); return loadSprite("/sprite/wall.png"); }

	/**
	 * @return The sprite for the ground.
	 */
	public Sprite getGroundSprite()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3118,78,<121,1>,<123,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3118,78,<121,1>,<123,2>)", "360"); return loadSprite("/sprite/floor.png"); }

	/**
	 * @return The sprite for the
	 */
	public Sprite getPelletSprite()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3240,79,<128,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3240,79,<128,1>,<130,2>)", "361"); return loadSprite("/sprite/pellet.png"); }

	/**
	 * Overloads the default sprite loading, ignoring the exception. This class
	 * assumes all sprites are provided, hence the exception will be thrown as a
	 * {@link RuntimeException}.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public Sprite loadSprite(String resource)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3540,219,<139,1>,<146,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3540,219,<139,1>,<146,2>)", "364"); try { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3540,219,<139,1>,<146,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3540,219,<139,1>,<146,2>)", "362"); return super.loadSprite(resource); } catch (IOException e) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3540,219,<139,1>,<146,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(355,3406,<16,0>,<147,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/PacManSprites.java|(3540,219,<139,1>,<146,2>)", "363"); throw new PacmanConfigurationException("Unable to load sprite: " + resource, e); } }
}
