package main.util;

public final class StringUtils {

	private StringUtils() {
		
	}
	
	/**
	 * Check string is empty or not.
	 * @param str - String need to validate
	 */
	public static boolean isEmpty(String str) {
		if (str == null || str.trim().isEmpty()) {
			return true;
		}
		
		return false;
	}
}
