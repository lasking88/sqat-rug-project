package nl.tudelft.jpacman.sprite;

import static sqat.series2.Api.hit;
import java.awt.Graphics;

public class AnimatedSprite implements Sprite  {

	/**
	 * Static empty sprite to serve as the end of a non-looping sprite.
	 */
	private static final Sprite END_OF_LOOP = new EmptySprite();

	/**
	 * The animation itself, in frames.
	 */
	private final Sprite[] animationFrames;

	/**
	 * The delay between frames.
	 */
	private final int animationDelay;

	/**
	 * Whether is animation should be looping or not.
	 */
	private final boolean looping;

	/**
	 * The index of the current frame.
	 */
	private int current;

	/**
	 * Whether this sprite is currently animating or not.
	 */
	private boolean animating;

	/**
	 * The {@link System#currentTimeMillis()} stamp of the last update.
	 */
	private long lastUpdate;

	/**
	 * Creates a new animating sprite that will change frames every interval. By
	 * default the sprite is not animating.
	 * 
	 * @param frames
	 *            The frames of this animation.
	 * @param delay
	 *            The delay between frames.
	 * @param loop
	 *            Whether or not this sprite should be looping.
	 */
	public AnimatedSprite(Sprite[] frames, int delay, boolean loop)  {
		this(frames, delay, loop, false);
	hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(1240,104,<59,1>,<61,2>)", "852");}

	/**
	 * Creates a new animating sprite that will change frames every interval.
	 * 
	 * @param frames
	 *            The frames of this animation.
	 * @param delay
	 *            The delay between frames.
	 * @param loop
	 *            Whether or not this sprite should be looping.
	 * @param isAnimating
	 *            Whether or not this sprite is animating from the start.
	 */
	public AnimatedSprite(Sprite[] frames, int delay, boolean loop,
			boolean isAnimating)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(1729,317,<75,1>,<86,2>)", "853"); assert frames.length > 0; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(1729,317,<75,1>,<86,2>)", "854"); this.animationFrames = frames.clone(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(1729,317,<75,1>,<86,2>)", "855"); this.animationDelay = delay; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(1729,317,<75,1>,<86,2>)", "856"); this.looping = loop; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(1729,317,<75,1>,<86,2>)", "857"); this.animating = isAnimating; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(1729,317,<75,1>,<86,2>)", "858"); this.current = 0; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(1729,317,<75,1>,<86,2>)", "859"); this.lastUpdate = System.currentTimeMillis();
	}

	/**
	 * @return The frame of the current index.
	 */
	private Sprite currentSprite()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2103,192,<91,1>,<98,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2103,192,<91,1>,<98,2>)", "861"); Sprite result = END_OF_LOOP; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2103,192,<91,1>,<98,2>)", "862"); if (current < animationFrames.length) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2103,192,<91,1>,<98,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2103,192,<91,1>,<98,2>)", "860"); result = animationFrames[current]; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2103,192,<91,1>,<98,2>)", "863"); assert result != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2103,192,<91,1>,<98,2>)", "864"); return result; }

	/**
	 * Starts or stops the animation of this sprite.
	 * 
	 * @param isAnimating
	 *            <code>true</code> to animate this sprite or <code>false</code>
	 *            to stop animating this sprite.
	 */
	public void setAnimating(boolean isAnimating)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2510,82,<107,1>,<109,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2510,82,<107,1>,<109,2>)", "865"); this.animating = isAnimating; }
	
	/**
	 * (Re)starts the current animation.
	 */
	public void restart()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2644,116,<114,1>,<118,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2644,116,<114,1>,<118,2>)", "866"); this.current = 0; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2644,116,<114,1>,<118,2>)", "867"); this.lastUpdate = System.currentTimeMillis(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2644,116,<114,1>,<118,2>)", "868"); setAnimating(true); }

	@Override
	public void draw(Graphics g, int x, int y, int width, int height)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2763,141,<120,1>,<124,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2763,141,<120,1>,<124,2>)", "869"); update(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2763,141,<120,1>,<124,2>)", "870"); currentSprite().draw(g, x, y, width, height); }

	@Override
	public Sprite split(int x, int y, int width, int height)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2907,137,<126,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2907,137,<126,1>,<130,2>)", "871"); update(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(2907,137,<126,1>,<130,2>)", "872"); return currentSprite().split(x, y, width, height); }

	/**
	 * Updates the current frame index depending on the current system time.
	 */
	private void update()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)", "880"); long now = System.currentTimeMillis(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)", "881"); if (animating) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)", "878"); while (lastUpdate < now) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)", "875"); lastUpdate += animationDelay; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)", "876"); current++; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)", "877"); if (looping) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)", "873"); current %= animationFrames.length; } else if (current == animationFrames.length) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)", "874"); animating = false; } } } else { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3131,347,<135,1>,<150,2>)", "879"); lastUpdate = now; } }

	@Override
	public int getWidth()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3481,108,<152,1>,<156,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3481,108,<152,1>,<156,2>)", "882"); assert currentSprite() != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3481,108,<152,1>,<156,2>)", "883"); return currentSprite().getWidth(); }

	@Override
	public int getHeight()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3592,110,<158,1>,<162,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3592,110,<158,1>,<162,2>)", "884"); assert currentSprite() != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(188,3517,<11,0>,<164,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/AnimatedSprite.java|(3592,110,<158,1>,<162,2>)", "885"); return currentSprite().getHeight(); }

}
