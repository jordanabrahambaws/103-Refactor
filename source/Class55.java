
public final class Class55 {

	static Class46 aClass46_541 = new Class46();

	public static int method276(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		Class46 var5 = aClass46_541;
		synchronized (var5) {
			aClass46_541.aByteArray471 = var2;
			aClass46_541.anInt486 = var4 * -1227292875;
			aClass46_541.aByteArray467 = var0;
			aClass46_541.anInt483 = 0;
			aClass46_541.anInt479 = var1 * -1267751543;
			aClass46_541.anInt470 = 0;
			aClass46_541.anInt480 = 0;
			aClass46_541.anInt476 = 0;
			aClass46_541.anInt477 = 0;
			method278(aClass46_541);
			var1 -= aClass46_541.anInt479 * 30302393;
			aClass46_541.aByteArray471 = null;
			aClass46_541.aByteArray467 = null;
			return var1;
		}
	}

	static void method277(Class46 var0) {
		byte var1 = var0.aByte478;
		int var2 = var0.anInt502 * -1718017815;
		int var3 = var0.anInt473 * 65994825;
		int var4 = var0.anInt484 * -1516697305;
		int[] var5 = Class93.anIntArray732;
		int var6 = var0.anInt481 * 1254255873;
		byte[] var10 = var0.aByteArray467;
		int var11 = var0.anInt483 * -41744017;
		int var7 = var0.anInt479 * 30302393;
		int var9 = var0.anInt501 * -18095537 + 1;

		label116: while (true) {
			if (var2 > 0) {
				while (true) {
					if (var7 == 0) {
						break label116;
					}

					if (var2 == 1) {
						if (var7 == 0) {
							var2 = 1;
							break label116;
						}

						var10[var11] = var1;
						++var11;
						--var7;
						break;
					}

					var10[var11] = var1;
					--var2;
					++var11;
					--var7;
				}
			}

			boolean var13 = true;

			byte var12;
			while (var13) {
				var13 = false;
				if (var3 == var9) {
					var2 = 0;
					break label116;
				}

				var1 = (byte) var4;
				var6 = var5[var6];
				var12 = (byte) (var6 & 255);
				var6 >>= 8;
				++var3;
				if (var12 != var4) {
					var4 = var12;
					if (var7 == 0) {
						var2 = 1;
						break label116;
					}

					var10[var11] = var1;
					++var11;
					--var7;
					var13 = true;
				} else if (var3 == var9) {
					if (var7 == 0) {
						var2 = 1;
						break label116;
					}

					var10[var11] = var1;
					++var11;
					--var7;
					var13 = true;
				}
			}

			var2 = 2;
			var6 = var5[var6];
			var12 = (byte) (var6 & 255);
			var6 >>= 8;
			++var3;
			if (var3 != var9) {
				if (var12 != var4) {
					var4 = var12;
				} else {
					var2 = 3;
					var6 = var5[var6];
					var12 = (byte) (var6 & 255);
					var6 >>= 8;
					++var3;
					if (var3 != var9) {
						if (var12 != var4) {
							var4 = var12;
						} else {
							var6 = var5[var6];
							var12 = (byte) (var6 & 255);
							var6 >>= 8;
							++var3;
							var2 = (var12 & 255) + 4;
							var6 = var5[var6];
							var4 = (byte) (var6 & 255);
							var6 >>= 8;
							++var3;
						}
					}
				}
			}
		}

		int var14 = var0.anInt477 * -1561403323;
		var0.anInt477 += (var7 - var7) * -1666370931;
		if (var0.anInt477 * -1561403323 < var14) {
			;
		}

		var0.aByte478 = var1;
		var0.anInt502 = var2 * -617236647;
		var0.anInt473 = var3 * 186970617;
		var0.anInt484 = var4 * 761517719;
		Class93.anIntArray732 = var5;
		var0.anInt481 = var6 * 1655083777;
		var0.aByteArray467 = var10;
		var0.anInt483 = var11 * 1549956495;
		var0.anInt479 = var7 * -1267751543;
	}

	static void method278(Class46 var0) {
		boolean var1 = false;
		boolean var30 = false;
		boolean var3 = false;
		boolean var29 = false;
		boolean var5 = false;
		boolean var31 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var6 = false;
		boolean var18 = false;
		boolean var11 = false;
		boolean var2 = false;
		boolean var4 = false;
		boolean var10 = false;
		boolean var12 = false;
		boolean var16 = false;
		boolean var14 = false;
		boolean var13 = false;
		int var19 = 0;
		int[] var20 = null;
		int[] var17 = null;
		int[] var15 = null;
		var0.anInt482 = 959267293;
		if (Class93.anIntArray732 == null) {
			Class93.anIntArray732 = new int[var0.anInt482 * -1332132064];
		}

		boolean var23 = true;

		while (var23) {
			byte var9 = method279(var0);
			if (var9 == 23) {
				return;
			}

			var9 = method279(var0);
			var9 = method279(var0);
			var9 = method279(var0);
			var9 = method279(var0);
			var9 = method279(var0);
			var9 = method279(var0);
			var9 = method279(var0);
			var9 = method279(var0);
			var9 = method279(var0);
			var9 = method283(var0);
			if (var9 != 0) {
				;
			}

			var0.anInt492 = 0;
			var9 = method279(var0);
			var0.anInt492 = (var0.anInt492 * -831286639 << 8 | var9 & 255) * -1293783439;
			var9 = method279(var0);
			var0.anInt492 = (var0.anInt492 * -831286639 << 8 | var9 & 255) * -1293783439;
			var9 = method279(var0);
			var0.anInt492 = (var0.anInt492 * -831286639 << 8 | var9 & 255) * -1293783439;

			int var35;
			for (var35 = 0; var35 < 16; ++var35) {
				var9 = method283(var0);
				if (var9 == 1) {
					var0.aBoolArray490[var35] = true;
				} else {
					var0.aBoolArray490[var35] = false;
				}
			}

			for (var35 = 0; var35 < 256; ++var35) {
				var0.aBoolArray475[var35] = false;
			}

			int var55;
			for (var35 = 0; var35 < 16; ++var35) {
				if (var0.aBoolArray490[var35]) {
					for (var55 = 0; var55 < 16; ++var55) {
						var9 = method283(var0);
						if (var9 == 1) {
							var0.aBoolArray475[var35 * 16 + var55] = true;
						}
					}
				}
			}

			method281(var0);
			int var54 = var0.anInt488 * -1672980685 + 2;
			int var39 = method280(3, var0);
			int var56 = method280(15, var0);
			var35 = 0;

			while (var35 < var56) {
				var55 = 0;

				while (true) {
					var9 = method283(var0);
					if (var9 == 0) {
						var0.aByteArray495[var35] = (byte) var55;
						++var35;
						break;
					}

					++var55;
				}
			}

			byte[] var21 = new byte[6];

			byte var22;
			for (var22 = 0; var22 < var39; var21[var22] = var22++) {
				;
			}

			for (var35 = 0; var35 < var56; ++var35) {
				var22 = var0.aByteArray495[var35];

				byte var27;
				for (var27 = var21[var22]; var22 > 0; --var22) {
					var21[var22] = var21[var22 - 1];
				}

				var21[0] = var27;
				var0.aByteArray494[var35] = var27;
			}

			int var37;
			for (var37 = 0; var37 < var39; ++var37) {
				int var44 = method280(5, var0);
				var35 = 0;

				while (var35 < var54) {
					while (true) {
						var9 = method283(var0);
						if (var9 == 0) {
							var0.aByteArrayArray496[var37][var35] = (byte) var44;
							++var35;
							break;
						}

						var9 = method283(var0);
						if (var9 == 0) {
							++var44;
						} else {
							--var44;
						}
					}
				}
			}

			for (var37 = 0; var37 < var39; ++var37) {
				byte var26 = 32;
				byte var32 = 0;

				for (var35 = 0; var35 < var54; ++var35) {
					if (var0.aByteArrayArray496[var37][var35] > var32) {
						var32 = var0.aByteArrayArray496[var37][var35];
					}

					if (var0.aByteArrayArray496[var37][var35] < var26) {
						var26 = var0.aByteArrayArray496[var37][var35];
					}
				}

				method282(var0.anIntArrayArray497[var37], var0.anIntArrayArray498[var37],
						var0.anIntArrayArray499[var37], var0.aByteArrayArray496[var37], var26, var32, var54);
				var0.anIntArray500[var37] = var26;
			}

			int var41 = var0.anInt488 * -1672980685 + 1;
			int var43 = -1;
			byte var40 = 0;

			for (var35 = 0; var35 <= 255; ++var35) {
				var0.anIntArray485[var35] = 0;
			}

			int var52 = 4095;

			int var51;
			int var53;
			for (var51 = 15; var51 >= 0; --var51) {
				for (var53 = 15; var53 >= 0; --var53) {
					var0.aByteArray489[var52] = (byte) (var51 * 16 + var53);
					--var52;
				}

				var0.anIntArray493[var51] = var52 + 1;
			}

			int var45 = 0;
			byte var47;
			if (var40 == 0) {
				++var43;
				var40 = 50;
				var47 = var0.aByteArray494[var43];
				var19 = var0.anIntArray500[var47];
				var20 = var0.anIntArrayArray497[var47];
				var15 = var0.anIntArrayArray499[var47];
				var17 = var0.anIntArrayArray498[var47];
			}

			int var42 = var40 - 1;
			int var46 = var19;

			byte var48;
			int var49;
			for (var49 = method280(var19, var0); var49 > var20[var46]; var49 = var49 << 1 | var48) {
				++var46;
				var48 = method283(var0);
			}

			int var50 = var15[var49 - var17[var46]];

			while (var50 != var41) {
				if (var50 != 0 && var50 != 1) {
					int var24 = var50 - 1;
					int var33;
					if (var24 < 16) {
						var33 = var0.anIntArray493[0];

						for (var9 = var0.aByteArray489[var33 + var24]; var24 > 3; var24 -= 4) {
							int var28 = var33 + var24;
							var0.aByteArray489[var28] = var0.aByteArray489[var28 - 1];
							var0.aByteArray489[var28 - 1] = var0.aByteArray489[var28 - 2];
							var0.aByteArray489[var28 - 2] = var0.aByteArray489[var28 - 3];
							var0.aByteArray489[var28 - 3] = var0.aByteArray489[var28 - 4];
						}

						while (var24 > 0) {
							var0.aByteArray489[var33 + var24] = var0.aByteArray489[var33 + var24 - 1];
							--var24;
						}

						var0.aByteArray489[var33] = var9;
					} else {
						int var25 = var24 / 16;
						int var34 = var24 % 16;
						var33 = var0.anIntArray493[var25] + var34;

						for (var9 = var0.aByteArray489[var33]; var33 > var0.anIntArray493[var25]; --var33) {
							var0.aByteArray489[var33] = var0.aByteArray489[var33 - 1];
						}

						++var0.anIntArray493[var25];

						while (var25 > 0) {
							--var0.anIntArray493[var25];
							var0.aByteArray489[var0.anIntArray493[var25]] = var0.aByteArray489[var0.anIntArray493[var25
									- 1] + 16 - 1];
							--var25;
						}

						--var0.anIntArray493[0];
						var0.aByteArray489[var0.anIntArray493[0]] = var9;
						if (var0.anIntArray493[0] == 0) {
							var52 = 4095;

							for (var51 = 15; var51 >= 0; --var51) {
								for (var53 = 15; var53 >= 0; --var53) {
									var0.aByteArray489[var52] = var0.aByteArray489[var0.anIntArray493[var51] + var53];
									--var52;
								}

								var0.anIntArray493[var51] = var52 + 1;
							}
						}
					}

					++var0.anIntArray485[var0.aByteArray491[var9 & 255] & 255];
					Class93.anIntArray732[var45] = var0.aByteArray491[var9 & 255] & 255;
					++var45;
					if (var42 == 0) {
						++var43;
						var42 = 50;
						var47 = var0.aByteArray494[var43];
						var19 = var0.anIntArray500[var47];
						var20 = var0.anIntArrayArray497[var47];
						var15 = var0.anIntArrayArray499[var47];
						var17 = var0.anIntArrayArray498[var47];
					}

					--var42;
					var46 = var19;

					for (var49 = method280(var19, var0); var49 > var20[var46]; var49 = var49 << 1 | var48) {
						++var46;
						var48 = method283(var0);
					}

					var50 = var15[var49 - var17[var46]];
				} else {
					int var36 = -1;
					int var38 = 1;

					do {
						if (var50 == 0) {
							var36 += 1 * var38;
						} else if (var50 == 1) {
							var36 += 2 * var38;
						}

						var38 *= 2;
						if (var42 == 0) {
							++var43;
							var42 = 50;
							var47 = var0.aByteArray494[var43];
							var19 = var0.anIntArray500[var47];
							var20 = var0.anIntArrayArray497[var47];
							var15 = var0.anIntArrayArray499[var47];
							var17 = var0.anIntArrayArray498[var47];
						}

						--var42;
						var46 = var19;

						for (var49 = method280(var19, var0); var49 > var20[var46]; var49 = var49 << 1 | var48) {
							++var46;
							var48 = method283(var0);
						}

						var50 = var15[var49 - var17[var46]];
					} while (var50 == 0 || var50 == 1);

					++var36;
					var9 = var0.aByteArray491[var0.aByteArray489[var0.anIntArray493[0]] & 255];

					for (var0.anIntArray485[var9 & 255] += var36; var36 > 0; --var36) {
						Class93.anIntArray732[var45] = var9 & 255;
						++var45;
					}
				}
			}

			var0.anInt502 = 0;
			var0.aByte478 = 0;
			var0.anIntArray487[0] = 0;

			for (var35 = 1; var35 <= 256; ++var35) {
				var0.anIntArray487[var35] = var0.anIntArray485[var35 - 1];
			}

			for (var35 = 1; var35 <= 256; ++var35) {
				var0.anIntArray487[var35] += var0.anIntArray487[var35 - 1];
			}

			for (var35 = 0; var35 < var45; ++var35) {
				var9 = (byte) (Class93.anIntArray732[var35] & 255);
				Class93.anIntArray732[var0.anIntArray487[var9 & 255]] |= var35 << 8;
				++var0.anIntArray487[var9 & 255];
			}

			var0.anInt481 = (Class93.anIntArray732[var0.anInt492 * -831286639] >> 8) * 1655083777;
			var0.anInt473 = 0;
			var0.anInt481 = Class93.anIntArray732[var0.anInt481 * 1254255873] * 1655083777;
			var0.anInt484 = (byte) (var0.anInt481 * 1254255873 & 255) * 761517719;
			var0.anInt481 = (var0.anInt481 * 1254255873 >> 8) * 1655083777;
			var0.anInt473 += 186970617;
			var0.anInt501 = var45 * -1276906321;
			method277(var0);
			if (var0.anInt473 * 65994825 == var0.anInt501 * -18095537 + 1 && var0.anInt502 * -1718017815 == 0) {
				var23 = true;
			} else {
				var23 = false;
			}
		}

	}

	static byte method279(Class46 var0) {
		return (byte) method280(8, var0);
	}

	static int method280(int var0, Class46 var1) {
		while (var1.anInt470 * -729094229 < var0) {
			var1.anInt480 = (var1.anInt480 * 296567033 << 8 | var1.aByteArray471[var1.anInt486 * 1779342109] & 255)
					* 947093833;
			var1.anInt470 += -729360360;
			var1.anInt486 += -1227292875;
			var1.anInt476 += 1204376179;
			if (var1.anInt476 * -1976786245 == 0) {
				;
			}
		}

		int var2 = var1.anInt480 * 296567033 >> var1.anInt470 * -729094229 - var0 & (1 << var0) - 1;
		var1.anInt470 -= var0 * 445700867;
		return var2;
	}

	static void method281(Class46 var0) {
		var0.anInt488 = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.aBoolArray475[var1]) {
				var0.aByteArray491[var0.anInt488 * -1672980685] = (byte) var1;
				var0.anInt488 += -1138787333;
			}
		}

	}

	static void method282(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var9;
		for (var9 = var4; var9 <= var5; ++var9) {
			for (int var8 = 0; var8 < var6; ++var8) {
				if (var3[var8] == var9) {
					var2[var7] = var8;
					++var7;
				}
			}
		}

		for (var9 = 0; var9 < 23; ++var9) {
			var1[var9] = 0;
		}

		for (var9 = 0; var9 < var6; ++var9) {
			++var1[var3[var9] + 1];
		}

		for (var9 = 1; var9 < 23; ++var9) {
			var1[var9] += var1[var9 - 1];
		}

		for (var9 = 0; var9 < 23; ++var9) {
			var0[var9] = 0;
		}

		int var10 = 0;

		for (var9 = var4; var9 <= var5; ++var9) {
			var10 += var1[var9 + 1] - var1[var9];
			var0[var9] = var10 - 1;
			var10 <<= 1;
		}

		for (var9 = var4 + 1; var9 <= var5; ++var9) {
			var1[var9] = (var0[var9 - 1] + 1 << 1) - var1[var9];
		}

	}

	static byte method283(Class46 var0) {
		return (byte) method280(1, var0);
	}

	Class55() throws Throwable {
		throw new Error();
	}
}