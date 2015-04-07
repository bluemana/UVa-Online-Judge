package uvaoj.volume111;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		reader.readLine();
		String line;
		while ((line = reader.readLine()) != null && !line.isEmpty()) {
			String[] tokens = line.split(" ");
			int i1 = Integer.parseInt(tokens[0]);
			int i2 = Integer.parseInt(tokens[1]);
			String result = P11172.solve(i1, i2);
			System.out.println(result);
		}
	}
}

class P11172 {
	
	public static String solve(int i1, int i2) {
		String result = "=";
		if (i1 < i2) {
			result = "<";
		} else if (i1 > i2) {
			result = ">";
		}
		return result;
	}
}
