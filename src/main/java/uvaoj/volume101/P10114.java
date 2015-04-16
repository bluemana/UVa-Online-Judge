package uvaoj.volume101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Writer writer = new BufferedWriter(new OutputStreamWriter(System.out));
		P10114.solve(reader, writer);
	}
}

class P10114 {
	
	private static final int PRECISION_SCALE = 20;
	
	public static void solve(BufferedReader reader, Writer writer) throws Exception {
		String line;
		while (!(line = reader.readLine()).startsWith("-")) {
			String[] tokens = line.split(" ");
			int loanMonths = Integer.parseInt(tokens[0]);
			BigDecimal downPayment = new BigDecimal(tokens[1]);
			BigDecimal loanAmount = new BigDecimal(tokens[2]);
			int depreciationRecords = Integer.parseInt(tokens[3]);
			BigDecimal[] depreciations = parseDepreciations(reader, depreciationRecords, loanMonths);
			int minMonths = borrowerAdvantage(downPayment, loanAmount, loanMonths, depreciations);
			writer.write(formatResult(minMonths) + "\n");
		}
		writer.flush();
	}
	
	private static BigDecimal[] parseDepreciations(BufferedReader reader, int depreciationRecords, int loanMonths) throws Exception {
		BigDecimal[] result = new BigDecimal[loanMonths + 1];
		for (int i = 0; i < depreciationRecords; i++) {
			String[] tokens = reader.readLine().split(" ");
			int index = Integer.parseInt(tokens[0]);
			result[index] = new BigDecimal(tokens[1]);
		}
		for (int i = 1; i < result.length; i++) {
			if (result[i] == null) {
				result[i] = result[i - 1];
			}
		}
		return result;
	}
	
	private static int borrowerAdvantage(BigDecimal downPayment, BigDecimal loanAmount, int loanMonths, BigDecimal[] depreciations) {
		BigDecimal carValue = downPayment.add(loanAmount).multiply(BigDecimal.ONE.subtract(depreciations[0]));
		int result = 0;
		if (carValue.compareTo(loanAmount) <= 0) {
			BigDecimal repayment = loanAmount.divide(new BigDecimal(loanMonths), PRECISION_SCALE, RoundingMode.UP);
			int i = 1;
			while (carValue.compareTo(loanAmount) <= 0) {
				loanAmount = loanAmount.subtract(repayment);
				carValue = carValue.multiply(BigDecimal.ONE.subtract(depreciations[i]));
				i++;
			}
			result = i - 1;
		}
		return result;
	}
	
	private static String formatResult(int minMonths) {
		return String.format("%d month%s", minMonths, minMonths == 1 ? "" : "s");
	}
}
