package uvaoj.volume111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Writer writer = new BufferedWriter(new OutputStreamWriter(System.out));
		P11172.solve(reader, writer);
	}
}

class P11172 {
	
	public static void solve(BufferedReader reader, Writer writer) throws Exception {
		reader.readLine(); // skip first line
		String line;
		while ((line = reader.readLine()) != null && !line.isEmpty()) {
			String[] tokens = line.split(" ");
			int i1 = Integer.parseInt(tokens[0]);
			int i2 = Integer.parseInt(tokens[1]);
			Relation result = P11172.compare(i1, i2);
			writer.write(result + "\n");
		}
	}
	
	private static Relation compare(int i1, int i2) {
		Relation result = Relation.EQUAL;
		if (i1 < i2) {
			result = Relation.LESS_THAN;
		} else if (i1 > i2) {
			result = Relation.GREATER_THAN;
		}
		return result;
	}
}

enum Relation {
	
	EQUAL("="),
	LESS_THAN("<"),
	GREATER_THAN(">");
	
	private final String string;
	
	private Relation(String string) {
		this.string = string;
	}
	
	@Override
	public String toString() {
		return string;
	}
}
