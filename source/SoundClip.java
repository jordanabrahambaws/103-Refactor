import java.util.Random;

public class SoundClip {

	int[] anIntArray185 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray192 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray193 = new int[] { 0, 0, 0, 0, 0 };
	int anInt194 = 0;
	int anInt195 = 100;
	int anInt198 = 500;
	int anInt199 = 0;
	MidiSequence aClass15_196;
	MidiSequence aClass15_184;
	MidiSequence aClass15_204;
	MidiSequence aClass15_190;
	MidiSequence aClass15_187;
	MidiSequence aClass15_200;
	MidiSequence aClass15_189;
	MidiSequence aClass15_203;
	Class11 aClass11_183;
	MidiSequence aClass15_197;
	static int[] anIntArray201 = new int['\u8000'];
	static int[] anIntArray202;
	static int[] anIntArray188;
	static int[] anIntArray191;
	static int[] anIntArray186;
	static int[] anIntArray205;
	static int[] anIntArray206;
	static int[] anIntArray207;

	final int[] method98(int var1, int var2) {
		Class45.method232(anIntArray188, 0, var1);
		if (var2 < 10) {
			return anIntArray188;
		} else {
			double var6 = (double) var1 / ((double) var2 + 0.0D);
			this.aClass15_196.method124();
			this.aClass15_184.method124();
			int var14 = 0;
			int var13 = 0;
			int var18 = 0;
			if (this.aClass15_204 != null) {
				this.aClass15_204.method124();
				this.aClass15_190.method124();
				var14 = (int) ((double) (this.aClass15_204.anInt236 - this.aClass15_204.anInt233) * 32.768D / var6);
				var13 = (int) ((double) this.aClass15_204.anInt233 * 32.768D / var6);
			}

			int var12 = 0;
			int var15 = 0;
			int var16 = 0;
			if (this.aClass15_187 != null) {
				this.aClass15_187.method124();
				this.aClass15_200.method124();
				var12 = (int) ((double) (this.aClass15_187.anInt236 - this.aClass15_187.anInt233) * 32.768D / var6);
				var15 = (int) ((double) this.aClass15_187.anInt233 * 32.768D / var6);
			}

			int var10;
			for (var10 = 0; var10 < 5; var10++) {
				if (this.anIntArray185[var10] != 0) {
					anIntArray191[var10] = 0;
					anIntArray186[var10] = (int) ((double) this.anIntArray193[var10] * var6);
					anIntArray205[var10] = (this.anIntArray185[var10] << 14) / 100;
					anIntArray206[var10] = (int) ((double) (this.aClass15_196.anInt236 - this.aClass15_196.anInt233)
							* 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray192[var10]) / var6);
					anIntArray207[var10] = (int) ((double) this.aClass15_196.anInt233 * 32.768D / var6);
				}
			}

			int var3;
			int var4;
			int var11;
			int var17;
			for (var10 = 0; var10 < var1; var10++) {
				var4 = this.aClass15_196.method125(var1);
				var11 = this.aClass15_184.method125(var1);
				if (this.aClass15_204 != null) {
					var3 = this.aClass15_204.method125(var1);
					var17 = this.aClass15_190.method125(var1);
					var4 += this.method100(var18, var17, this.aClass15_204.anInt238) >> 1;
					var18 += (var3 * var14 >> 16) + var13;
				}

				if (this.aClass15_187 != null) {
					var3 = this.aClass15_187.method125(var1);
					var17 = this.aClass15_200.method125(var1);
					var11 = ((this.method100(var16, var17, this.aClass15_187.anInt238) >> 1) + '\u8000') * var11 >> 15;
					var16 += (var3 * var12 >> 16) + var15;
				}

				for (var3 = 0; var3 < 5; var3++) {
					if (this.anIntArray185[var3] != 0) {
						var17 = anIntArray186[var3] + var10;
						if (var17 < var1) {
							anIntArray188[var17] += this.method100(anIntArray191[var3],
									anIntArray205[var3] * var11 >> 15, this.aClass15_196.anInt238);
							anIntArray191[var3] += (anIntArray206[var3] * var4 >> 16) + anIntArray207[var3];
						}
					}
				}
			}

			int var8;
			if (this.aClass15_189 != null) {
				this.aClass15_189.method124();
				this.aClass15_203.method124();
				var10 = 0;
				boolean var9 = false;
				boolean var5 = true;

				for (var3 = 0; var3 < var1; var3++) {
					var17 = this.aClass15_189.method125(var1);
					var8 = this.aClass15_203.method125(var1);
					if (var5) {
						var4 = this.aClass15_189.anInt233
								+ ((this.aClass15_189.anInt236 - this.aClass15_189.anInt233) * var17 >> 8);
					} else {
						var4 = this.aClass15_189.anInt233
								+ ((this.aClass15_189.anInt236 - this.aClass15_189.anInt233) * var8 >> 8);
					}

					var10 += 256;
					if (var10 >= var4) {
						var10 = 0;
						var5 = !var5;
					}

					if (var5) {
						anIntArray188[var3] = 0;
					}
				}
			}

			if (this.anInt194 > 0 && this.anInt195 > 0) {
				var10 = (int) ((double) this.anInt194 * var6);

				for (var4 = var10; var4 < var1; var4++) {
					anIntArray188[var4] += anIntArray188[var4 - var10] * this.anInt195 / 100;
				}
			}

			if (this.aClass11_183.anIntArray215[0] > 0 || this.aClass11_183.anIntArray215[1] > 0) {
				this.aClass15_197.method124();
				var10 = this.aClass15_197.method125(var1 + 1);
				var4 = this.aClass11_183.method101(0, (float) var10 / 65536.0F);
				var11 = this.aClass11_183.method101(1, (float) var10 / 65536.0F);
				if (var1 >= var4 + var11) {
					var3 = 0;
					var17 = var11;
					if (var11 > var1 - var4) {
						var17 = var1 - var4;
					}

					int var19;
					while (var3 < var17) {
						var8 = (int) ((long) anIntArray188[var3 + var4] * (long) Class11.anInt214 >> 16);

						for (var19 = 0; var19 < var4; var19++) {
							var8 += (int) ((long) anIntArray188[var3 + var4 - 1 - var19]
									* (long) Class11.anIntArrayArray212[0][var19] >> 16);
						}

						for (var19 = 0; var19 < var3; var19++) {
							var8 -= (int) ((long) anIntArray188[var3 - 1 - var19]
									* (long) Class11.anIntArrayArray212[1][var19] >> 16);
						}

						anIntArray188[var3] = var8;
						var10 = this.aClass15_197.method125(var1 + 1);
						++var3;
					}

					var17 = 128;

					while (true) {
						if (var17 > var1 - var4) {
							var17 = var1 - var4;
						}

						int var20;
						while (var3 < var17) {
							var19 = (int) ((long) anIntArray188[var3 + var4] * (long) Class11.anInt214 >> 16);

							for (var20 = 0; var20 < var4; var20++) {
								var19 += (int) ((long) anIntArray188[var3 + var4 - 1 - var20]
										* (long) Class11.anIntArrayArray212[0][var20] >> 16);
							}

							for (var20 = 0; var20 < var11; var20++) {
								var19 -= (int) ((long) anIntArray188[var3 - 1 - var20]
										* (long) Class11.anIntArrayArray212[1][var20] >> 16);
							}

							anIntArray188[var3] = var19;
							var10 = this.aClass15_197.method125(var1 + 1);
							++var3;
						}

						if (var3 >= var1 - var4) {
							while (var3 < var1) {
								var19 = 0;

								for (var20 = var3 + var4 - var1; var20 < var4; var20++) {
									var19 += (int) ((long) anIntArray188[var3 + var4 - 1 - var20]
											* (long) Class11.anIntArrayArray212[0][var20] >> 16);
								}

								for (var20 = 0; var20 < var11; var20++) {
									var19 -= (int) ((long) anIntArray188[var3 - 1 - var20]
											* (long) Class11.anIntArrayArray212[1][var20] >> 16);
								}

								anIntArray188[var3] = var19;
								this.aClass15_197.method125(var1 + 1);
								++var3;
							}
							break;
						}

						var4 = this.aClass11_183.method101(0, (float) var10 / 65536.0F);
						var11 = this.aClass11_183.method101(1, (float) var10 / 65536.0F);
						var17 += 128;
					}
				}
			}

			for (var10 = 0; var10 < var1; var10++) {
				if (anIntArray188[var10] < -32768) {
					anIntArray188[var10] = -32768;
				}

				if (anIntArray188[var10] > 32767) {
					anIntArray188[var10] = 32767;
				}
			}

			return anIntArray188;
		}
	}

	final void method99(ByteBuf var1) {
		this.aClass15_196 = new MidiSequence();
		this.aClass15_196.method123(var1);
		this.aClass15_184 = new MidiSequence();
		this.aClass15_184.method123(var1);
		int var3 = var1.getUByte();
		if (var3 != 0) {
			--var1.position;
			this.aClass15_204 = new MidiSequence();
			this.aClass15_204.method123(var1);
			this.aClass15_190 = new MidiSequence();
			this.aClass15_190.method123(var1);
		}

		var3 = var1.getUByte();
		if (var3 != 0) {
			--var1.position;
			this.aClass15_187 = new MidiSequence();
			this.aClass15_187.method123(var1);
			this.aClass15_200 = new MidiSequence();
			this.aClass15_200.method123(var1);
		}

		var3 = var1.getUByte();
		if (var3 != 0) {
			--var1.position;
			this.aClass15_189 = new MidiSequence();
			this.aClass15_189.method123(var1);
			this.aClass15_203 = new MidiSequence();
			this.aClass15_203.method123(var1);
		}

		for (int var4 = 0; var4 < 10; var4++) {
			int var2 = var1.getUSmart();
			if (var2 == 0) {
				break;
			}

			this.anIntArray185[var4] = var2;
			this.anIntArray192[var4] = var1.getSmart();
			this.anIntArray193[var4] = var1.getUSmart();
		}

		this.anInt194 = var1.getUSmart();
		this.anInt195 = var1.getUSmart();
		this.anInt198 = var1.getUShort();
		this.anInt199 = var1.getUShort();
		this.aClass11_183 = new Class11();
		this.aClass15_197 = new MidiSequence();
		this.aClass11_183.method104(var1, this.aClass15_197);
	}

	final int method100(int var1, int var2, int var3) {
		return var3 == 1 ? ((var1 & 0x7fff) < 16384 ? var2 : -var2)
				: (var3 == 2 ? anIntArray202[var1 & 0x7fff] * var2 >> 14
						: (var3 == 3 ? ((var1 & 0x7fff) * var2 >> 14) - var2
								: (var3 == 4 ? anIntArray201[var1 / 2607 & 0x7fff] * var2 : 0)));
	}

	static {
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < '\u8000'; var1++) {
			anIntArray201[var1] = (var0.nextInt() & 0x2) - 1;
		}

		anIntArray202 = new int['\u8000'];

		for (var1 = 0; var1 < '\u8000'; var1++) {
			anIntArray202[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}

		anIntArray188 = new int[220500];
		anIntArray191 = new int[5];
		anIntArray186 = new int[5];
		anIntArray205 = new int[5];
		anIntArray206 = new int[5];
		anIntArray207 = new int[5];
	}

}
