package lec18;

public class DistinctPermutaion {
	public static void main(String[] args) {
		String string="122";
		answer(string, "");
	}
	public static void answer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean falg = false;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					falg = true;
					break;
				}

			}
			if (!falg) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);

				answer(s1 + s2, ans + ch);
			}
		}

	}

}
