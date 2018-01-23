package nl.tudelft.jpacman.npc.ghost;

import static sqat.series2.Api.hit;
import nl.tudelft.jpacman.sprite.PacManSprites;

public class GhostFactory  {

	/**
	 * The sprite store containing the ghost sprites.
	 */
	private final PacManSprites sprites;

	/**
	 * Creates a new ghost factory.
	 * 
	 * @param spriteStore The sprite provider.
	 */
	public GhostFactory(PacManSprites spriteStore)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(158,1107,<10,0>,<65,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(380,81,<22,1>,<24,2>)", "931"); this.sprites = spriteStore;
	}

	/**
	 * Creates a new Blinky / Shadow, the red Ghost.
	 * 
	 * @see Blinky
	 * @return A new Blinky.
	 */
	public Ghost createBlinky()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(158,1107,<10,0>,<65,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(571,93,<32,1>,<34,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(158,1107,<10,0>,<65,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(571,93,<32,1>,<34,2>)", "932"); return new Blinky(sprites.getGhostSprite(GhostColor.RED)); }

	/**
	 * Creates a new Pinky / Speedy, the pink Ghost.
	 * 
	 * @see Pinky
	 * @return A new Pinky.
	 */
	public Ghost createPinky()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(158,1107,<10,0>,<65,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(772,92,<42,1>,<44,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(158,1107,<10,0>,<65,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(772,92,<42,1>,<44,2>)", "933"); return new Pinky(sprites.getGhostSprite(GhostColor.PINK)); }

	/**
	 * Creates a new Inky / Bashful, the cyan Ghost.
	 * 
	 * @see Inky
	 * @return A new Inky.
	 */
	public Ghost createInky()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(158,1107,<10,0>,<65,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(970,90,<52,1>,<54,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(158,1107,<10,0>,<65,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(970,90,<52,1>,<54,2>)", "934"); return new Inky(sprites.getGhostSprite(GhostColor.CYAN)); }

	/**
	 * Creates a new Clyde / Pokey, the orange Ghost.
	 * 
	 * @see Clyde
	 * @return A new Clyde.
	 */
	public Ghost createClyde()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(158,1107,<10,0>,<65,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(1169,94,<62,1>,<64,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(158,1107,<10,0>,<65,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/GhostFactory.java|(1169,94,<62,1>,<64,2>)", "935"); return new Clyde(sprites.getGhostSprite(GhostColor.ORANGE)); }
}
