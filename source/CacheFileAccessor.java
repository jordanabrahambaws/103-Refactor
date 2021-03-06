import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class CacheFileAccessor {

	protected static int anInt836;
	long position;
	RandomAccessFile raf;
	long size;

	final void seek(long var1) throws IOException {
		this.raf.seek(var1);
		this.position = var1;
	}

	public final int read(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.raf.read(var1, var2, var3);
		if (var4 > 0) {
			this.position += (long) var4;
		}

		return var4;
	}

	public final long length() throws IOException {
		return this.raf.length();
	}

	public CacheFileAccessor(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() >= var3) {
			var1.delete();
		}

		this.raf = new RandomAccessFile(var1, var2);
		this.size = var3;
		this.position = 0L;
		int read = this.raf.read();
		if (read != -1 && !var2.equals("r")) {
			this.raf.seek(0L);
			this.raf.write(read);
		}

		this.raf.seek(0L);
	}

	public final void close() throws IOException {
		if (this.raf != null) {
			this.raf.close();
			this.raf = null;
		}

	}

	public final void write(byte[] var1, int var2, int var3) throws IOException {
		if ((long) var3 + this.position > this.size) {
			this.raf.seek(this.size + 1L);
			this.raf.write(1);
			throw new EOFException();
		} else {
			this.raf.write(var1, var2, var3);
			this.position += (long) var3;
		}
	}

}
