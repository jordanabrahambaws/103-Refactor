
public class IgnoredPlayer {

	static DualNode_Sub13_Sub2 aDualNode_Sub13_Sub2_754;
	String previousName;
	String displayName;
	static DualNode_Sub13_Sub2[] aDualNode_Sub13_Sub2Array755;

	public static byte method414(char var0) {
		byte var1;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var1 = -128;
			} else if (var0 == 8218) {
				var1 = -126;
			} else if (var0 == 402) {
				var1 = -125;
			} else if (var0 != 8222) {
				if (var0 == 8230) {
					var1 = -123;
				} else if (var0 == 8224) {
					var1 = -122;
				} else if (var0 == 8225) {
					var1 = -121;
				} else if (var0 == 710) {
					var1 = -120;
				} else if (var0 == 8240) {
					var1 = -119;
				} else if (var0 == 352) {
					var1 = -118;
				} else if (var0 == 8249) {
					var1 = -117;
				} else if (var0 == 338) {
					var1 = -116;
				} else if (var0 == 381) {
					var1 = -114;
				} else if (var0 == 8216) {
					var1 = -111;
				} else if (var0 == 8217) {
					var1 = -110;
				} else if (var0 == 8220) {
					var1 = -109;
				} else if (var0 == 8221) {
					var1 = -108;
				} else if (var0 == 8226) {
					var1 = -107;
				} else if (var0 == 8211) {
					var1 = -106;
				} else if (var0 == 8212) {
					var1 = -105;
				} else if (var0 == 732) {
					var1 = -104;
				} else if (var0 == 8482) {
					var1 = -103;
				} else if (var0 == 353) {
					var1 = -102;
				} else if (var0 == 8250) {
					var1 = -101;
				} else if (var0 == 339) {
					var1 = -100;
				} else if (var0 == 382) {
					var1 = -98;
				} else if (var0 == 376) {
					var1 = -97;
				} else {
					var1 = 63;
				}
			} else {
				var1 = -124;
			}
		} else {
			var1 = (byte) var0;
		}

		return var1;
	}

	public static DualNode_Sub13_Sub3_Sub1 method415(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			DualNode_Sub13_Sub3_Sub1 var1 = new DualNode_Sub13_Sub3_Sub1(var0, Class7.anIntArray149,
					DualNode_Sub11.anIntArray1544, Class7.anIntArray150, Class7.anIntArray151, Class85.anIntArray690,
					Npc.aByteArrayArray1966);
			Class65.method318();
			return var1;
		}
	}

}