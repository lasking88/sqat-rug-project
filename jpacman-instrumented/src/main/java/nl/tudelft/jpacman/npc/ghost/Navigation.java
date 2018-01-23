package nl.tudelft.jpacman.npc.ghost;

import static sqat.series2.Api.hit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;

public final class Navigation  {

	private Navigation()  {
	hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(396,25,<19,1>,<20,2>)", "133");}
	
	/**
	 * Calculates the shortest path. This is done by BFS. This search ensures
	 * the traveller is allowed to occupy the squares on the way, or returns the
	 * shortest path to the square regardless of terrain if no traveller is
	 * specified.
	 * 
	 * @param from
	 *            The starting square.
	 * @param to
	 *            The destination.
	 * @param traveller
	 *            The traveller attempting to reach the destination. If
	 *            traveller is set to <code>null</code>, this method will ignore
	 *            terrain and find the shortest path whether it can actually be
	 *            reached or not.
	 * @return The shortest path to the destination or <code>null</code> if no
	 *         such path could be found. When the destination is the current
	 *         square, an empty list is returned.
	 */
	public static List<Direction> shortestPath(Square from, Square to,
			Unit traveller)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "141"); if (from.equals(to)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "134"); return new ArrayList<>(); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "142"); List<Node> targets = new ArrayList<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "143"); Set<Square> visited = new HashSet<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "144"); targets.add(new Node(null, from, null)); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "145"); while (!targets.isEmpty()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "136"); Node n = targets.remove(0); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "137"); Square s = n.getSquare(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "138"); if (s.equals(to)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "135"); return n.getPath(); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "139"); visited.add(s); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "140"); addNewTargets(traveller, targets, visited, n, s); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1252,509,<41,1>,<60,2>)", "146"); return null; }

	private static void addNewTargets(Unit traveller, List<Node> targets,
			Set<Square> visited, Node n, Square s)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1764,354,<62,1>,<72,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1764,354,<62,1>,<72,2>)", "150"); for (Direction d : Direction.values()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1764,354,<62,1>,<72,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1764,354,<62,1>,<72,2>)", "148"); Square target = s.getSquareAt(d); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1764,354,<62,1>,<72,2>)", "149"); if (!visited.contains(target)
					&& (traveller == null || target
							.isAccessibleTo(traveller))) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1764,354,<62,1>,<72,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(1764,354,<62,1>,<72,2>)", "147"); targets.add(new Node(d, target, n)); } } }

	/**
	 * Finds the nearest unit of the given type and returns its location. This
	 * method will perform a breadth first search starting from the given
	 * square.
	 * 
	 * @param type
	 *            The type of unit to search for.
	 * @param currentLocation
	 *            The starting location for the search.
	 * @return The nearest unit of the given type, or <code>null</code> if no
	 *         such unit could be found.
	 */
	public static Unit findNearest(Class<? extends Unit> type,
			Square currentLocation)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "160"); List<Square> toDo = new ArrayList<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "161"); Set<Square> visited = new HashSet<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "162"); toDo.add(currentLocation); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "163"); while (!toDo.isEmpty()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "155"); Square square = toDo.remove(0); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "156"); Unit unit = findUnit(type, square); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "157"); if (unit != null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "151"); return unit; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "158"); visited.add(square); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "159"); for (Direction d : Direction.values()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "153"); Square newTarget = square.getSquareAt(d); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "154"); if (!visited.contains(newTarget) && !toDo.contains(newTarget)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "152"); toDo.add(newTarget); } } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(2551,589,<86,1>,<108,2>)", "164"); return null; }

	/**
	 * Determines whether a square has an occupant of a certain type.
	 * 
	 * @param type
	 *            The type to search for.
	 * @param square
	 *            The square to search.
	 * @return A unit of type T, iff such a unit occupies this square, or
	 *         <code>null</code> of none does.
	 */
	public static Unit findUnit(Class<? extends Unit> type, Square square)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3450,183,<120,1>,<127,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3450,183,<120,1>,<127,2>)", "167"); for (Unit u : square.getOccupants()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3450,183,<120,1>,<127,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3450,183,<120,1>,<127,2>)", "166"); if (type.isInstance(u)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3450,183,<120,1>,<127,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3450,183,<120,1>,<127,2>)", "165"); return u; } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3450,183,<120,1>,<127,2>)", "168"); return null; }

	/**
	 * Helper class to keep track of the path.
	 * 
	 * @author Jeroen Roosen 
	 */
	private static final class Node  {

		/**
		 * The direction for this node, which is <code>null</code> for the root
		 * node.
		 */
		private final Direction direction;

		/**
		 * The parent node, which is <code>null</code> for the root node.
		 */
		private final Node parent;

		/**
		 * The square associated with this node.
		 */
		private final Square square;

		/**
		 * Creates a new node.
		 * 
		 * @param d
		 *            The direction, which is <code>null</code> for the root
		 *            node.
		 * @param s
		 *            The square.
		 * @param p
		 *            The parent node, which is <code>null</code> for the root
		 *            node.
		 */
		Node(Direction d, Square s, Node p)  {
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "169"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(4392,104,<164,2>,<168,3>)", "122"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "170"); this.direction = d; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "171"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(4392,104,<164,2>,<168,3>)", "123"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "172"); this.square = s; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "173"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(4392,104,<164,2>,<168,3>)", "124"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "174"); this.parent = p;
		}

		/**
		 * @return The direction for this node, or <code>null</code> if this
		 *         node is a root node.
		 */
		private Direction getDirection()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "175"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(4617,59,<174,2>,<176,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "176"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(4617,59,<174,2>,<176,3>)", "125"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "177"); return direction; }

		/**
		 * @return The square for this node.
		 */
		private Square getSquare()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "178"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(4731,50,<181,2>,<183,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "179"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(4731,50,<181,2>,<183,3>)", "126"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "180"); return square; }

		/**
		 * @return The parent node, or <code>null</code> if this node is a root
		 *         node.
		 */
		private Node getParent()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "181"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(4890,48,<189,2>,<191,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "182"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(4890,48,<189,2>,<191,3>)", "127"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "183"); return parent; }

		/**
		 * Returns the list of values from the root of the tree to this node.
		 * 
		 * @return The list of values from the root of the tree to this node.
		 */
		private List<Direction> getPath()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "187"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(5104,193,<198,2>,<205,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "188"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(5104,193,<198,2>,<205,3>)", "129"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "189"); if (getParent() == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "184"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(5104,193,<198,2>,<205,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "185"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(5104,193,<198,2>,<205,3>)", "128"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "186"); return new ArrayList<>(); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "190"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(5104,193,<198,2>,<205,3>)", "130"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "191"); List<Direction> path = parent.getPath(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "192"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(5104,193,<198,2>,<205,3>)", "131"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "193"); path.add(getDirection()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "194"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(3722,1578,<134,1>,<206,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(5104,193,<198,2>,<205,3>)", "132"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Navigation.java|(362,4940,<17,0>,<207,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "195"); return path; }
	}
}
