import java.awt.Frame;

public class VarClientType extends DualNode {

	static Class106 varclients = new Class106(64);
	public boolean serialize = false;
	static AbstractIndex varclient_ref;
	static CacheIndex sfxIndex;
	protected static Frame gameFrame;

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method718(var1, var2);
		}
	}

	void method718(ByteBuf var1, int var2) {
		if (var2 == 2) {
			this.serialize = true;
		}

	}

	public static int method719() {
		return (Class74.anInt617 += 673144361) * 932126233 - 1;
	}

	static int decodeSkipCount(BitBuf var0) {
		int var1 = var0.getBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.getBits(5);
		} else if (var1 == 2) {
			var2 = var0.getBits(8);
		} else {
			var2 = var0.getBits(11);
		}

		return var2;
	}

	static final int method721(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (789221 + var2 * var2 * 15731) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
