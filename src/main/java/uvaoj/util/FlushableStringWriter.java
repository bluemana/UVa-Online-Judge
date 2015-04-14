package uvaoj.util;

import java.io.StringWriter;

public class FlushableStringWriter extends StringWriter {

	private final StringBuffer buffer;
	
	public FlushableStringWriter() {
		super();
		buffer = new StringBuffer();
	}
	
	public FlushableStringWriter(int initialSize) {
		super(initialSize);
		buffer = new StringBuffer();
	}
	
	@Override
	public void flush() {
		super.flush();
		buffer.append(super.toString());
	}
	
	@Override
	public StringBuffer getBuffer() {
		return buffer;
	}
	
	@Override
	public String toString() {
		return buffer.toString();
	}
}
