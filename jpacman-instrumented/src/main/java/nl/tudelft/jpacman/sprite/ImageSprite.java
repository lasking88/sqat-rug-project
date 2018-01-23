package nl.tudelft.jpacman.sprite;

import static sqat.series2.Api.hit;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;

public class ImageSprite implements Sprite  {

	/**
	 * Internal image.
	 */
	private final Image image;

	/**
	 * Creates a new sprite from an image.
	 * 
	 * @param img
	 *            The image to create a sprite from.
	 */
	public ImageSprite(Image img)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(568,54,<28,1>,<30,2>)", "465"); this.image = img;
	}

	@Override
	public void draw(Graphics g, int x, int y, int width, int height)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(625,193,<32,1>,<36,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(625,193,<32,1>,<36,2>)", "466"); g.drawImage(image, x, y, x + width, y + height, 0, 0,
				image.getWidth(null), image.getHeight(null), null); }

	@Override
	public Sprite split(int x, int y, int width, int height)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(821,375,<38,1>,<47,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(821,375,<38,1>,<47,2>)", "470"); if (withinImage(x, y) && withinImage(x + width - 1, y + height - 1)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(821,375,<38,1>,<47,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(821,375,<38,1>,<47,2>)", "467"); BufferedImage newImage = newImage(width, height); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(821,375,<38,1>,<47,2>)", "468"); newImage.createGraphics().drawImage(image, 0, 0, width, height, x,
					y, x + width, y + height, null); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(821,375,<38,1>,<47,2>)", "469"); return new ImageSprite(newImage); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(821,375,<38,1>,<47,2>)", "471"); return new EmptySprite(); }

	private boolean withinImage(int x, int y)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(1199,134,<49,1>,<52,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(1199,134,<49,1>,<52,2>)", "472"); return x < image.getWidth(null) && x >= 0 && y < image.getHeight(null)
				&& y >= 0; }

	/**
	 * Creates a new, empty image of the given width and height. Its
	 * transparency will be a bitmask, so no try ARGB image.
	 * 
	 * @param width
	 *            The width of the new image.
	 * @param height
	 *            The height of the new image.
	 * @return The new, empty image.
	 */
	private BufferedImage newImage(int width, int height)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(1631,271,<64,1>,<69,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(1631,271,<64,1>,<69,2>)", "473"); GraphicsConfiguration gc = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getDefaultScreenDevice()
				.getDefaultConfiguration(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(1631,271,<64,1>,<69,2>)", "474"); return gc.createCompatibleImage(width, height, Transparency.BITMASK); }

	@Override
	public int getWidth()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(1905,68,<71,1>,<74,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(1905,68,<71,1>,<74,2>)", "475"); return image.getWidth(null); }

	@Override
	public int getHeight()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(1976,70,<76,1>,<79,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(342,1707,<15,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/sprite/ImageSprite.java|(1976,70,<76,1>,<79,2>)", "476"); return image.getHeight(null); }

}
