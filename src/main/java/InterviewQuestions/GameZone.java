package InterviewQuestions;

import java.util.*;

public class GameZone {
	public static void main(String[] args) {

		// AssertEquals("Hi Charlie, your average score is 50", gameEndMessage("charlie", 500, 10));
		 System.out.println(gameEndMessage("charlie", 500, 0));
		 System.out.println(gameEndMessage("charlie", 500, -1));
		System.out.println(gameEndMessage("charlie", 0, 0));
		System.out.println(gameEndMessage("%$^$^&$&&%%8ere", null, 0));
		System.out.println(gameEndMessage("", null, 0));
		System.out.println (gameEndMessage(null, null, 0));
		System.out.println(gameEndMessage("%$^$^&$&&%%8ere", null, null));
	}

	public static String gameEndMessage(String alias, Integer score, Integer attempts) {
		//int a = null;
		try {
			if (Objects.isNull(alias) || alias.equalsIgnoreCase("")) {
				return "Please enter proper name";
			}
			return "Hi " + alias + ", your average score is " + score / attempts;

		} catch (ArithmeticException exception) {
			return "Oh! something wrong with your numbers";
		} catch (Exception e) {
			return "Could not fetch, your score";
		}
	}

}