package uvaoj.volume117;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Writer writer = new BufferedWriter(new OutputStreamWriter(System.out));
		P11727.solve(reader, writer);
	}
}

class P11727 {
	
	public static void solve(BufferedReader reader, Writer writer) throws Exception {
		int testCount = Integer.parseInt(reader.readLine());
		for (int t = 0; t < testCount; t++) {
			String[] tokens = reader.readLine().split(" ");
			int s1 = Integer.parseInt(tokens[0]);
			int s2 = Integer.parseInt(tokens[1]);
			int s3 = Integer.parseInt(tokens[2]);
			int salary = salary(s1, s2, s3);
			String result = formatResult(t, salary);
			writer.write(result + "\n");
		}
		writer.flush();
	}
	
	private static int salary(int s1, int s2, int s3) {
		int[] salaries = new int[] {s1, s2, s3};
		Arrays.sort(salaries);
		return salaries[1];
	}
	
	private static String formatResult(int t, int salary) {
		return String.format("Case %d: %d", t + 1, salary);
	}
}
