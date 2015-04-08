package uvaoj.volume114;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Writer writer = new BufferedWriter(new OutputStreamWriter(System.out));
		P11498.solve(reader, writer);
	}
}

class P11498 {
	
	public static void solve(BufferedReader reader, Writer writer) throws Exception {
		String line;
		while (!(line = reader.readLine()).equals("0")) {
			int residenceCount = Integer.parseInt(line);
			int[] divisionPoint = parsePoint(reader);
			int[][] residences = new int[residenceCount][];
			for (int i = 0; i < residenceCount; i++) {
				residences[i] = parsePoint(reader);
			}
			Country[] countries = P11498.countries(residences, divisionPoint);
			String result = formatResult(countries);
			writer.write(result);
		}
		writer.flush();
	}
	
	private static int[] parsePoint(BufferedReader reader) throws Exception {
		String[] tokens = reader.readLine().split(" ");
		int[] point = new int[] {
				Integer.parseInt(tokens[0]),
				Integer.parseInt(tokens[1])
		};
		return point;
	}
	
	private static Country[] countries(int[][] residences, int[] divisionPoint) {
		Country[] result = new Country[residences.length];
		for (int i = 0; i < residences.length; i++) {
			result[i] = country(residences[i], divisionPoint);
		}
		return result;
	}
	
	private static Country country(int[] residence, int[] divisionPoint) {
		Country result = Country.BORDER;
		if (residence[0] > divisionPoint[0]) {
			if (residence[1] > divisionPoint[1]) {
				result = Country.NE;
			} else if (residence[1] < divisionPoint[1]) {
				result = Country.SE;
			}
		} else if (residence[0] < divisionPoint[0]) {
			if (residence[1] > divisionPoint[1]) {
				result = Country.NW;
			} else if (residence[1] < divisionPoint[1]) {
				result = Country.SW;
			}
		}
		return result;
	}
	
	private static String formatResult(Country[] countries) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < countries.length; i++) {
			String country = "divisa";
			if (countries[i] == Country.NW) {
				country = "NO";
			} else if (countries[i] == Country.NE) {
				country = "NE";
			} else if (countries[i] == Country.SE) {
				country = "SE";
			} else if (countries[i] == Country.SW) {
				country = "SO";
			}
			builder.append(country + "\n");
		}
		return builder.toString();
	}
}

enum Country {
	BORDER,
	NW,
	NE,
	SE,
	SW
}
