package nl.tudelft.jpacman.sprite;

import static sqat.series2.Api.hit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("magicnumber")
public class SpriteTest  {

    private Sprite sprite;
    private SpriteStore store;
    
    private static final int SPRITE_SIZE = 64;

    /**
     * The common fixture of this test class is
     * a 64 by 64 pixel white sprite.
     *
     * @throws java.io.IOException
     *      when the sprite could not be loaded.
     */
    @Before
    public void setUp() throws IOException  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(645,154,<31,4>,<35,5>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(645,154,<31,4>,<35,5>)", "524"); store = new SpriteStore(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(645,154,<31,4>,<35,5>)", "525"); sprite = store.loadSprite("/sprite/64x64white.png"); }

	/**
	 * Verifies the width of a static sprite.
	 */
	@Test
	public void spriteWidth()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(855,85,<40,1>,<43,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(855,85,<40,1>,<43,2>)", "526"); assertEquals(SPRITE_SIZE, sprite.getWidth()); }

	/**
	 * Verifies the height of a static sprite.
	 */
	@Test
	public void spriteHeight()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(997,87,<48,1>,<51,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(997,87,<48,1>,<51,2>)", "527"); assertEquals(SPRITE_SIZE, sprite.getHeight()); }

	/**
	 * Verifies that an IOException is thrown when the resource could not be
	 * loaded.
	 *
	 * @throws java.io.IOException
	 *             since the sprite cannot be loaded.
	 */
	@Test(expected = IOException.class)
	public void resourceMissing() throws IOException  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(1270,145,<60,1>,<63,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(1270,145,<60,1>,<63,2>)", "528"); store.loadSprite("/sprite/nonexistingresource.png"); }

	/**
	 * Verifies that an animated sprite is correctly cut from its base image.
	 */
	@Test
	public void animationWidth()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(1503,164,<68,1>,<73,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(1503,164,<68,1>,<73,2>)", "529"); AnimatedSprite animation = store.createAnimatedSprite(sprite, 4, 0,
				false); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(1503,164,<68,1>,<73,2>)", "530"); assertEquals(16, animation.getWidth()); }
	
	/**
	 * Verifies that an animated sprite is correctly cut from its base image.
	 */
	@Test
	public void animationHeight()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(1756,166,<78,1>,<83,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(1756,166,<78,1>,<83,2>)", "531"); AnimatedSprite animation = store.createAnimatedSprite(sprite, 4, 0,
				false); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(1756,166,<78,1>,<83,2>)", "532"); assertEquals(64, animation.getHeight()); }
	
	/**
	 * Verifies that an split sprite is correctly cut from its base image.
	 */
	@Test
	public void splitWidth()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(2008,121,<88,1>,<92,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(2008,121,<88,1>,<92,2>)", "533"); Sprite split = sprite.split(10, 11, 12, 13); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(2008,121,<88,1>,<92,2>)", "534"); assertEquals(12, split.getWidth()); }
	
	/**
	 * Verifies that an split sprite is correctly cut from its base image.
	 */
	@Test
	public void splitHeight()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(2215,123,<97,1>,<101,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(2215,123,<97,1>,<101,2>)", "535"); Sprite split = sprite.split(10, 11, 12, 13); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(2215,123,<97,1>,<101,2>)", "536"); assertEquals(13, split.getHeight()); }
	
	/**
	 * Verifies that a split that isn't within the actual sprite returns an empty sprite.
	 */
	@Test
	public void splitOutOfBounds()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(2439,133,<106,1>,<110,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(2439,133,<106,1>,<110,2>)", "537"); Sprite split = sprite.split(10, 10, 64, 10); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(277,2297,<16,0>,<111,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/sprite/SpriteTest.java|(2439,133,<106,1>,<110,2>)", "538"); assertTrue(split instanceof EmptySprite); }
}
