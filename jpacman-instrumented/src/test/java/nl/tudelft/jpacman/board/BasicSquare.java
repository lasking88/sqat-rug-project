package nl.tudelft.jpacman.board;

import static sqat.series2.Api.hit;
import nl.tudelft.jpacman.sprite.Sprite;

class BasicSquare extends Square  {

	/**
	 * Creates a new basic square.
	 */
	BasicSquare()  {
		super();
	hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(150,243,<10,0>,<28,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(229,29,<15,1>,<17,2>)", "503");}

	@Override
	public boolean isAccessibleTo(Unit unit)  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(150,243,<10,0>,<28,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(261,71,<19,1>,<22,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(150,243,<10,0>,<28,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(261,71,<19,1>,<22,2>)", "504"); return true; }

	@Override
	public Sprite getSprite()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(150,243,<10,0>,<28,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(335,56,<24,1>,<27,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(150,243,<10,0>,<28,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BasicSquare.java|(335,56,<24,1>,<27,2>)", "505"); return null; }
}
