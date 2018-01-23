package nl.tudelft.jpacman.level;

import static sqat.series2.Api.hit;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.npc.ghost.Ghost;

public class PlayerCollisions implements CollisionMap  {

	@Override
	public void collide(Unit mover, Unit collidedOn)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(546,329,<19,1>,<31,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(546,329,<19,1>,<31,2>)", "816"); if (mover instanceof Player) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(546,329,<19,1>,<31,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(546,329,<19,1>,<31,2>)", "813"); playerColliding((Player) mover, collidedOn); }
		else if (mover instanceof Ghost) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(546,329,<19,1>,<31,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(546,329,<19,1>,<31,2>)", "814"); ghostColliding((Ghost) mover, collidedOn); }
		else if (mover instanceof Pellet) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(546,329,<19,1>,<31,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(546,329,<19,1>,<31,2>)", "815"); pelletColliding((Pellet) mover, collidedOn); } }
	
	private void playerColliding(Player player, Unit collidedOn)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(879,255,<33,1>,<41,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(879,255,<33,1>,<41,2>)", "819"); if (collidedOn instanceof Ghost) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(879,255,<33,1>,<41,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(879,255,<33,1>,<41,2>)", "817"); playerVersusGhost(player, (Ghost) collidedOn); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(879,255,<33,1>,<41,2>)", "820"); if (collidedOn instanceof Pellet) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(879,255,<33,1>,<41,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(879,255,<33,1>,<41,2>)", "818"); playerVersusPellet(player, (Pellet) collidedOn); } }
	
	private void ghostColliding(Ghost ghost, Unit collidedOn)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1138,154,<43,1>,<47,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1138,154,<43,1>,<47,2>)", "822"); if (collidedOn instanceof Player) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1138,154,<43,1>,<47,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1138,154,<43,1>,<47,2>)", "821"); playerVersusGhost((Player) collidedOn, ghost); } }
	
	private void pelletColliding(Pellet pellet, Unit collidedOn)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1296,161,<49,1>,<53,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1296,161,<49,1>,<53,2>)", "824"); if (collidedOn instanceof Player) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1296,161,<49,1>,<53,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1296,161,<49,1>,<53,2>)", "823"); playerVersusPellet((Player) collidedOn, pellet); } }
	
	
	/**
	 * Actual case of player bumping into ghost or vice versa.
     *
     * @param player The player involved in the collision.
     * @param ghost The ghost involved in the collision.
	 */
	public void playerVersusGhost(Player player, Ghost ghost)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1656,88,<62,1>,<64,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1656,88,<62,1>,<64,2>)", "825"); player.setAlive(false); }
	
	/**
	 * Actual case of player consuming a pellet.
     *
     * @param player The player involved in the collision.
     * @param pellet The pellet involved in the collision.
	 */
	public void playerVersusPellet(Player player, Pellet pellet)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1929,130,<72,1>,<75,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1929,130,<72,1>,<75,2>)", "826"); pellet.leaveSquare(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(488,1574,<17,0>,<77,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerCollisions.java|(1929,130,<72,1>,<75,2>)", "827"); player.addPoints(pellet.getValue()); }

}
