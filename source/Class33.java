
public class Class33 {

	String[] aStringArray360;
	RuneScript aRuneScript361;
	int[] anIntArray362;
	int anInt363 = -954144041;
	static Class28 aClass28_364;
	static int[] anIntArray365;

	static final int method197(int var0, int var1) {
		int var2 = DualNode_Sub10.method721(var0 - 1, var1 - 1) + DualNode_Sub10.method721(var0 + 1, var1 - 1)
				+ DualNode_Sub10.method721(var0 - 1, 1 + var1) + DualNode_Sub10.method721(var0 + 1, var1 + 1);
		int var4 = DualNode_Sub10.method721(var0 - 1, var1) + DualNode_Sub10.method721(1 + var0, var1)
				+ DualNode_Sub10.method721(var0, var1 - 1) + DualNode_Sub10.method721(var0, 1 + var1);
		int var3 = DualNode_Sub10.method721(var0, var1);
		return var3 / 4 + var4 / 8 + var2 / 16;
	}

	static void method198(int var0) {
		ItemTable var1 = (ItemTable) ItemTable.itemTables.get((long) var0);
		if (var1 != null) {
			var1.unlink();
		}
	}

	static boolean method199(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
	}

	static final int method200(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & '\uff80');
		}
	}
}