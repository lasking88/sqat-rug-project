package nl.tudelft.jpacman.level;

import static sqat.series2.Api.hit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.tudelft.jpacman.board.Unit;

public class CollisionInteractionMap implements CollisionMap  {

	/**
	 * The collection of collision handlers.
	 */
	private final Map<
			Class<? extends Unit>,
			Map<Class<? extends Unit>, CollisionHandler<?, ?>>
	> handlers;

	/**
	 * Creates a new, empty collision map.
	 */
	public CollisionInteractionMap()  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(572,72,<29,1>,<31,2>)", "888"); this.handlers = new HashMap<>();
	}

	/**
	 * Adds a two-way collision interaction to this collection, i.e. the
	 * collision handler will be used for both C1 versus C2 and C2 versus C1.
	 * 
	 * @param <C1>
	 *            The collider type.
	 * @param <C2>
	 *            The collidee (unit that was moved into) type.
	 * 
	 * @param collider
	 *            The collider type.
	 * @param collidee
	 *            The collidee type.
	 * @param handler
	 *            The handler that handles the collision.
	 */
	public <C1 extends Unit, C2 extends Unit> void onCollision(
			Class<C1> collider, Class<C2> collidee,
			CollisionHandler<C1, C2> handler)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(1121,194,<49,1>,<53,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(1121,194,<49,1>,<53,2>)", "889"); onCollision(collider, collidee, true, handler); }

	/**
	 * Adds a collision interaction to this collection.
	 * 
	 * @param <C1>
	 *            The collider type.
	 * @param <C2>
	 *            The collidee (unit that was moved into) type.
	 * 
	 * @param collider
	 *            The collider type.
	 * @param collidee
	 *            The collidee type.
	 * @param symetric
	 *            <code>true</code> if this collision is used for both
	 *            C1 against C2 and vice versa;
	 *            <code>false</code> if only for C1 against C2.
	 * @param handler
	 *            The handler that handles the collision.
	 */
	public <C1 extends Unit, C2 extends Unit> void onCollision(
			Class<C1> collider, Class<C2> collidee, boolean symetric,
			CollisionHandler<C1, C2> handler)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(1894,308,<74,1>,<82,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(1894,308,<74,1>,<82,2>)", "891"); addHandler(collider, collidee, handler); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(1894,308,<74,1>,<82,2>)", "892"); if (symetric) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(1894,308,<74,1>,<82,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(1894,308,<74,1>,<82,2>)", "890"); addHandler(collidee, collider, new InverseCollisionHandler<>(
					handler)); } }

	/**
	 * Adds the collision interaction..
	 * 
	 * @param collider
	 *            The collider type.
	 * @param collidee
	 *            The collidee type.
	 * @param handler
	 *            The handler that handles the collision.
	 */
	private void addHandler(Class<? extends Unit> collider,
			Class<? extends Unit> collidee, CollisionHandler<?, ?> handler)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(2439,346,<94,1>,<105,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(2439,346,<94,1>,<105,2>)", "894"); if (!handlers.containsKey(collider)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(2439,346,<94,1>,<105,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(2439,346,<94,1>,<105,2>)", "893"); handlers.put(
					collider,
					new HashMap<>()); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(2439,346,<94,1>,<105,2>)", "895"); Map<Class<? extends Unit>, CollisionHandler<?, ?>> map = handlers
				.get(collider); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(2439,346,<94,1>,<105,2>)", "896"); map.put(collidee, handler); }

	/**
	 * Handles the collision between two colliding parties, if a suitable
	 * collision handler is listed.
	 * 
	 * @param <C1>
	 *            The collider type.
	 * @param <C2>
	 *            The collidee (unit that was moved into) type.
	 * 
	 * @param collider
	 *            The collider.
	 * @param collidee
	 *            The collidee.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <C1 extends Unit, C2 extends Unit> void collide(C1 collider,
			C2 collidee)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "900"); Class<? extends Unit> colliderKey = getMostSpecificClass(handlers,
				collider.getClass()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "901"); if (colliderKey == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "897"); return; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "902"); Map<Class<? extends Unit>, CollisionHandler<?, ?>> map = handlers
				.get(colliderKey); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "903"); Class<? extends Unit> collideeKey = getMostSpecificClass(map,
				collidee.getClass()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "904"); if (collideeKey == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "898"); return; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "905"); CollisionHandler<C1, C2> collisionHandler = (CollisionHandler<C1, C2>) map
				.get(collideeKey); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "906"); if (collisionHandler == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "899"); return; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(3137,703,<121,1>,<146,2>)", "907"); collisionHandler.handleCollision(collider, collidee); }

	/**
	 * Figures out the most specific class that is listed in the map. I.e. if A
	 * extends B and B is listed while requesting A, then B will be returned.
	 * 
	 * @param map
	 *            The map with the key collection to find a matching class in.
	 * @param key
	 *            The class to search the most suitable key for.
	 * @return The most specific class from the key collection.
	 */
	private Class<? extends Unit> getMostSpecificClass(
			Map<Class<? extends Unit>, ?> map, Class<? extends Unit> key)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4239,335,<158,1>,<167,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4239,335,<158,1>,<167,2>)", "910"); List<Class<? extends Unit>> collideeInheritance = getInheritance(key); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4239,335,<158,1>,<167,2>)", "911"); for (Class<? extends Unit> pointer : collideeInheritance) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4239,335,<158,1>,<167,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4239,335,<158,1>,<167,2>)", "909"); if (map.containsKey(pointer)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4239,335,<158,1>,<167,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4239,335,<158,1>,<167,2>)", "908"); return pointer; } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4239,335,<158,1>,<167,2>)", "912"); return null; }

	/**
	 * Returns a list of all classes and interfaces the class inherits.
	 * 
	 * @param clazz
	 *            The class to create a list of super classes and interfaces
	 *            for.
	 * @return A list of all classes and interfaces the class inherits.
	 */
	@SuppressWarnings("unchecked")
	private List<Class<? extends Unit>> getInheritance(
			Class<? extends Unit> clazz)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "921"); List<Class<? extends Unit>> found = new ArrayList<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "922"); found.add(clazz); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "923"); int index = 0; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "924"); while (found.size() > index) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "916"); Class<?> current = found.get(index); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "917"); Class<?> superClass = current.getSuperclass(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "918"); if (superClass != null && Unit.class.isAssignableFrom(superClass)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "913"); found.add((Class<? extends Unit>) superClass); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "919"); for (Class<?> classInterface : current.getInterfaces()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "915"); if (Unit.class.isAssignableFrom(classInterface)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "914"); found.add((Class<? extends Unit>) classInterface); } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "920"); index++; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(4841,682,<177,1>,<199,2>)", "925"); return found; }

	/**
	 * Handles the collision between two colliding parties.
	 * 
	 * @author Michael de Jong
	 * 
	 * @param <C1>
	 *            The collider type.
	 * @param <C2>
	 *            The collidee type.
	 */
	public interface CollisionHandler<C1 extends Unit, C2 extends Unit> {

		/**
		 * Handles the collision between two colliding parties.
		 * 
		 * @param collider
		 *            The collider.
		 * @param collidee
		 *            The collidee.
		 */
		void handleCollision(C1 collider, C2 collidee);
	}

	/**
	 * An symmetrical copy of a collision hander.
	 * 
	 * @author Michael de Jong
	 * 
	 * @param <C1>
	 *            The collider type.
	 * @param <C2>
	 *            The collidee type.
	 */
	private static class InverseCollisionHandler<C1 extends Unit, C2 extends Unit>
			implements CollisionHandler<C1, C2> {

		/**
		 * The handler of this collision.
		 */
		private final CollisionHandler<C2, C1> handler;

		/**
		 * Creates a new collision handler.
		 * 
		 * @param handler
		 *            The symmetric handler for this collision.
		 */
		InverseCollisionHandler(CollisionHandler<C2, C1> handler)  {
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "926"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(6230,705,<234,1>,<260,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(6586,90,<248,2>,<250,3>)", "886"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "927"); this.handler = handler;
		}

		/**
		 * Handles this collision by flipping the collider and collidee, making
		 * it compatible with the initial collision.
		 */
		@Override
		public void handleCollision(C1 collider, C2 collidee)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "928"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(6230,705,<234,1>,<260,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(6813,119,<256,2>,<259,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "929"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(6230,705,<234,1>,<260,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(6813,119,<256,2>,<259,3>)", "887"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/CollisionInteractionMap.java|(291,6647,<16,0>,<262,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "930"); handler.handleCollision(collidee, collider); }
	}

}
