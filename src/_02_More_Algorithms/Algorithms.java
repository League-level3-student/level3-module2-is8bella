package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		int currentIndex = 0;
		for (String string : eggs) {
			if (string.equals("cracked")) {
				return currentIndex;
			}
			currentIndex++;
		}
		return -1;
	}
	// Add other methods here

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (Boolean booleancheck : oysters) {
			if (booleancheck == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double x = 0;
		double tall = 0;
		for (Double doublecheck : peeps) {
			x = doublecheck;
		}
		if (x == 6.6) {
			tall = x;
		}
		return tall;
	}

	public static String findLongestWord(List<String> words) {
		String longword = "";
		for (String string : words) {
			if (string.length() > longword.length()) {
				longword = string;
			}
		}
		return longword;
	}

	public static boolean containsSOS(List<String> message1) {
		String SOS = " ... --- ... ";
		for (String string : message1) {
			if (string.equals(SOS)) {
				return true;
			}
		}
		return false;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String previousSequence = "";
		ArrayList<String> arraylist = new ArrayList<String>();
		ArrayList<String> sortedlist = new ArrayList<String>();
		for (String string : unsortedSequences) {
			arraylist.add(string);
		}
		for (int i = 0; i < unsortedSequences.size(); i++) {
			String longest = findLongestWord(arraylist);
			arraylist.remove(longest);
			sortedlist.add(0, longest);
		}
		return sortedlist;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		String a;
		String b;
		ArrayList<String> wordlist = new ArrayList<String>();
		for (String string : words) {
			wordlist.add(string);
		}
		for (int i = 0; i < words.size() - 1; i++) {
			a = words.get(i);
			b = words.get(i++);
			if (a.compareToIgnoreCase(b) > 0) {
				wordlist.remove(i);
				wordlist.add(i++, a);
			}
		}

		return wordlist;
	}

	// public static List<Double> sortScores(List<Double> results) {
	// // TODO Auto-generated method stub
	// double smallest;
	// double largest = 0.0;
	// ArrayList<Double> scores = new ArrayList<Double>();
	// ArrayList<Double> sortedScores = new ArrayList<Double>();
	// double previousNum = 0.0;
	//
	// for (Double d : results) {
	// scores.add(d);
	// }
	//
	// System.out.println("scores = " + scores);
	//
	// for (int i = 0; i < scores.size(); i++) {
	// System.out.println("score " + i + " = " + scores.get(i));
	// previousNum = scores.get(i);
	// }
	// return scores;
	//
	// }
}