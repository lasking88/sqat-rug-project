package nl.tudelft.jpacman.sprite;

import static sqat.series2.Api.hit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

public class SpriteStore  {
	
	/**
	 * We only need to load images once, so we keep track
	 * of them in a hash map.
	 */
	private final Map<String, Sprite> spriteMap;
	
	/**
	 * Create a new sprite store.
	 */
	public SpriteStore()  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(494,56,<27,1>,<29,2>)", "506"); spriteMap = new HashMap<>();
	}
	
	/**
	 * Loads a sprite from a resource on the class path.
	 * Sprites are loaded once, and then stored in the store
	 * so that they can be efficiently retrieved.
	 * 
	 * @param resource
	 *            The resource path.
	 * @return The sprite for the resource.
	 * @throws IOException
	 *             When the resource could not be loaded.
	 */
	public Sprite loadSprite(String resource) throws IOException  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(902,235,<42,1>,<49,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(902,235,<42,1>,<49,2>)", "509"); Sprite result = spriteMap.get(resource); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(902,235,<42,1>,<49,2>)", "510"); if (result == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(902,235,<42,1>,<49,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(902,235,<42,1>,<49,2>)", "507"); result = loadSpriteFromResource(resource); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(902,235,<42,1>,<49,2>)", "508"); spriteMap.put(resource, result); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(902,235,<42,1>,<49,2>)", "511"); return result; }

	/**
	 * Loads a sprite from a resource on the class path.
	 * 
	 * @param resource
	 *            The resource path.
	 * @return A new sprite for the resource.
	 * @throws IOException
	 *             When the resource could not be loaded.
	 */
	private Sprite loadSpriteFromResource(String resource) throws IOException  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(1385,362,<60,1>,<69,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(1385,362,<60,1>,<69,2>)", "516"); try (InputStream input = SpriteStore.class.getResourceAsStream(resource)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(1385,362,<60,1>,<69,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(1385,362,<60,1>,<69,2>)", "513"); if (input == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(1385,362,<60,1>,<69,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(1385,362,<60,1>,<69,2>)", "512"); throw new IOException("Unable to load " + resource
					+ ", resource does not exist."); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(1385,362,<60,1>,<69,2>)", "514"); BufferedImage image = ImageIO.read(input); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(1385,362,<60,1>,<69,2>)", "515"); return new ImageSprite(image); } }

	/**
	 * Creates a new {@link AnimatedSprite} from a base image.
	 * 
	 * @param baseImage
	 *            The base image to convert into an animation.
	 * @param frames
	 *            The amount of frames of the animation.
	 * @param delay
	 *            The delay between frames.
	 * @param loop
	 *            Whether this sprite is a looping animation or not.
	 * @return The animated sprite.
	 */
	public AnimatedSprite createAnimatedSprite(Sprite baseImage, int frames,
			int delay, boolean loop)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(2151,438,<84,1>,<98,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(2151,438,<84,1>,<98,2>)", "518"); assert baseImage != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(2151,438,<84,1>,<98,2>)", "519"); assert frames > 0; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(2151,438,<84,1>,<98,2>)", "520"); int frameWidth = baseImage.getWidth() / frames; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(2151,438,<84,1>,<98,2>)", "521"); Sprite[] animation = new Sprite[frames]; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(2151,438,<84,1>,<98,2>)", "522"); for (int i = 0; i < frames; i++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(2151,438,<84,1>,<98,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(2151,438,<84,1>,<98,2>)", "517"); animation[i] = baseImage.split(i * frameWidth, 0, frameWidth,
					baseImage.getHeight()); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(283,2309,<16,0>,<100,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/SpriteStore.java|(2151,438,<84,1>,<98,2>)", "523"); return new AnimatedSprite(animation, delay, loop); }

}
