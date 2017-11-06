
public class StarRating {
	/**
	 * @author Jacob Smith 
	 * The method we create interprets a String for the double rating where we
	 * receive a different rating if rating is 5.0 or greater, 4.5 or great, 4.0
	 * or great, and 0.0 or greater. Anything below 0.0 returns a "not rated"
	 * rating as defined by the exercise.
	 */
	public static String interpret(double rating) {
		if (rating >= 5.0) { // if the rating is greater than or equal to 5.0
			return "[HAS ONLY ONE REVIEW]"; // return this review
		} else if (rating >= 4.5) { // greater than or equal to 4.5
			return "EXCELLENT"; // return excellent
		} else if (rating >= 4.0) { // greater than or equal to 4.0
			return "OK"; // return okay
		} else if (rating >= 0.0) { // greater than or equal to 0.0
			return "CRAP"; // return crap
		} else
			return "not rated"; // else all not rated
	}

}
