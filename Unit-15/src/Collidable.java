public interface Collidable {
	boolean didCollideLeft(Object obj);
	boolean didCollideRight(Object obj);
	boolean didCollideTop(Object obj);
	boolean didCollideBottom(Object obj);
	default boolean didCollide(Object obj) {
		return didCollideLeft(obj) || didCollideRight(obj) || didCollideTop(obj) || didCollideBottom(obj);
	}
}