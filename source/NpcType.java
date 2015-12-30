
public class NpcType extends DualNode {

	public int anInt1577 = 1076528657;
	short[] colors;
	public static Class106 aClass106_1578 = new Class106(50);
	public int id;
	int varpIndex = 341695561;
	public static Class106 npcs = new Class106(64);
	int[] anIntArray1581;
	int[] anIntArray1582;
	public int[] transformIds;
	public int anInt1583 = -1066302605;
	public int anInt1584 = -499392937;
	public int anInt1585 = -1381705353;
	public boolean aBool1586 = false;
	public int anInt1587 = 2058554739;
	public int anInt1588 = -592426295;
	public int anInt1589 = 569075545;
	public boolean aBool1590 = true;
	public int anInt1591 = 1309687233;
	short[] aShortArray1592;
	public String[] actions = new String[5];
	public boolean aBool1593 = true;
	public int combatLevel = 634114841;
	int anInt1594 = -787489920;
	int anInt1595 = 1544651392;
	static AbstractIndex aClass87_1596;
	short[] modifiedColors;
	int anInt1597 = 0;
	int anInt1598 = 0;
	public int anInt1599 = -1404806752;
	short[] aShortArray1600;
	public int anInt1601 = -382962751;
	public String name = "null";
	public boolean aBool1602 = true;
	int varp32Index = -87498741;
	public boolean aBool1603 = false;
	public int anInt1604 = -2080856918;

	void method797(ByteBuf var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.getUByte();
			this.anIntArray1581 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.anIntArray1581[var4] = var1.getUShort();
			}
		} else if (var2 == 2) {
			this.name = var1.getString();
		} else if (var2 == 12) {
			this.anInt1589 = var1.getUByte() * 569075545;
		} else if (var2 == 13) {
			this.anInt1601 = var1.getUShort() * 382962751;
		} else if (var2 == 14) {
			this.anInt1585 = var1.getUShort() * 1381705353;
		} else if (var2 == 15) {
			this.anInt1583 = var1.getUShort() * 1066302605;
		} else if (var2 == 16) {
			this.anInt1591 = var1.getUShort() * -1309687233;
		} else if (var2 == 17) {
			this.anInt1585 = var1.getUShort() * 1381705353;
			this.anInt1584 = var1.getUShort() * 499392937;
			this.anInt1587 = var1.getUShort() * -2058554739;
			this.anInt1588 = var1.getUShort() * 592426295;
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.getString();
			if (this.actions[var2 - 30].equalsIgnoreCase(GameStrings.aString845)) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.getUByte();
			this.colors = new short[var3];
			this.modifiedColors = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.colors[var4] = (short) var1.getUShort();
				this.modifiedColors[var4] = (short) var1.getUShort();
			}
		} else if (var2 == 41) {
			var3 = var1.getUByte();
			this.aShortArray1600 = new short[var3];
			this.aShortArray1592 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.aShortArray1600[var4] = (short) var1.getUShort();
				this.aShortArray1592[var4] = (short) var1.getUShort();
			}
		} else if (var2 == 60) {
			var3 = var1.getUByte();
			this.anIntArray1582 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.anIntArray1582[var4] = var1.getUShort();
			}
		} else if (var2 == 93) {
			this.aBool1593 = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.getUShort() * -634114841;
		} else if (var2 == 97) {
			this.anInt1594 = var1.getUShort() * -6152265;
		} else if (var2 == 98) {
			this.anInt1595 = var1.getUShort() * 112730885;
		} else if (var2 == 99) {
			this.aBool1586 = true;
		} else if (var2 == 100) {
			this.anInt1598 = var1.getByte() * 1037968587;
		} else if (var2 == 101) {
			this.anInt1597 = var1.getByte() * 1528591265;
		} else if (var2 == 102) {
			this.anInt1577 = var1.getUShort() * -1076528657;
		} else if (var2 == 103) {
			this.anInt1599 = var1.getUShort() * 627188429;
		} else if (var2 == 106) {
			this.varpIndex = var1.getUShort() * -341695561;
			if (this.varpIndex * 1660103175 == '\uffff') {
				this.varpIndex = 341695561;
			}

			this.varp32Index = var1.getUShort() * 87498741;
			if (-1519823779 * this.varp32Index == '\uffff') {
				this.varp32Index = -87498741;
			}

			var3 = var1.getUByte();
			this.transformIds = new int[1 + var3];

			for (var4 = 0; var4 <= var3; ++var4) {
				this.transformIds[var4] = var1.getUShort();
				if (this.transformIds[var4] == '\uffff') {
					this.transformIds[var4] = -1;
				}
			}
		} else if (var2 == 107) {
			this.aBool1602 = false;
		} else if (var2 == 109) {
			this.aBool1590 = false;
		} else if (var2 == 111) {
			this.aBool1603 = true;
		} else if (var2 == 112) {
			this.anInt1604 = var1.getUByte() * 1075962715;
		}

	}

	void post() {
	}

	public final Model method799(SequenceType var1, int var2, SequenceType var3, int var4) {
		if (this.transformIds != null) {
			NpcType var10 = this.transform();
			return var10 == null ? null : var10.method799(var1, var2, var3, var4);
		} else {
			Model var5 = (Model) aClass106_1578.get((long) (this.id * -2095462435));
			if (var5 == null) {
				boolean var9 = false;

				for (int var7 = 0; var7 < this.anIntArray1581.length; ++var7) {
					if (!aClass87_1596.method388(this.anIntArray1581[var7], 0)) {
						var9 = true;
					}
				}

				if (var9) {
					return null;
				}

				Entity_Sub1[] var8 = new Entity_Sub1[this.anIntArray1581.length];

				int var6;
				for (var6 = 0; var6 < this.anIntArray1581.length; ++var6) {
					var8[var6] = Entity_Sub1.method887(aClass87_1596, this.anIntArray1581[var6], 0);
				}

				Entity_Sub1 var11;
				if (var8.length == 1) {
					var11 = var8[0];
				} else {
					var11 = new Entity_Sub1(var8, var8.length);
				}

				if (this.colors != null) {
					for (var6 = 0; var6 < this.colors.length; ++var6) {
						var11.method895(this.colors[var6], this.modifiedColors[var6]);
					}
				}

				if (this.aShortArray1600 != null) {
					for (var6 = 0; var6 < this.aShortArray1600.length; ++var6) {
						var11.method896(this.aShortArray1600[var6], this.aShortArray1592[var6]);
					}
				}

				var5 = var11.method902(this.anInt1598 * 482615523 + 64, 850 + this.anInt1597 * -1720520219, -30, -50,
						-30);
				aClass106_1578.put(var5, (long) (-2095462435 * this.id));
			}

			Model var12;
			if (var1 != null && var3 != null) {
				var12 = var1.method678(var5, var2, var3, var4);
			} else if (var1 != null) {
				var12 = var1.method681(var5, var2);
			} else if (var3 != null) {
				var12 = var3.method681(var5, var4);
			} else {
				var12 = var5.method995(true);
			}

			if (this.anInt1594 * -2053902841 != 128 || 402141645 * this.anInt1595 != 128) {
				var12.method1007(-2053902841 * this.anInt1594, 402141645 * this.anInt1595,
						-2053902841 * this.anInt1594);
			}

			return var12;
		}
	}

	public final Entity_Sub1 method800() {
		if (this.transformIds != null) {
			NpcType var5 = this.transform();
			return var5 == null ? null : var5.method800();
		} else if (this.anIntArray1582 == null) {
			return null;
		} else {
			boolean var2 = false;

			for (int var4 = 0; var4 < this.anIntArray1582.length; ++var4) {
				if (!aClass87_1596.method388(this.anIntArray1582[var4], 0)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				Entity_Sub1[] var7 = new Entity_Sub1[this.anIntArray1582.length];

				for (int var3 = 0; var3 < this.anIntArray1582.length; ++var3) {
					var7[var3] = Entity_Sub1.method887(aClass87_1596, this.anIntArray1582[var3], 0);
				}

				Entity_Sub1 var6;
				if (var7.length == 1) {
					var6 = var7[0];
				} else {
					var6 = new Entity_Sub1(var7, var7.length);
				}

				int var1;
				if (this.colors != null) {
					for (var1 = 0; var1 < this.colors.length; ++var1) {
						var6.method895(this.colors[var1], this.modifiedColors[var1]);
					}
				}

				if (this.aShortArray1600 != null) {
					for (var1 = 0; var1 < this.aShortArray1600.length; ++var1) {
						var6.method896(this.aShortArray1600[var1], this.aShortArray1592[var1]);
					}
				}

				return var6;
			}
		}
	}

	public final NpcType transform() {
		int var1 = -1;
		if (this.varpIndex * 1660103175 != -1) {
			var1 = Class91.method401(this.varpIndex * 1660103175);
		} else if (-1519823779 * this.varp32Index != -1) {
			var1 = Class94.tempVars[this.varp32Index * -1519823779];
		}

		return var1 >= 0 && var1 < this.transformIds.length && this.transformIds[var1] != -1
				? VarPlayerType.getNpcType(this.transformIds[var1]) : null;
	}

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method797(var1, var2);
		}
	}

	static final int method802(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var6 = var2;
			if (var2 < 3 && (Class39.renderRules[1][var3][var4] & 2) == 2) {
				var6 = var2 + 1;
			}

			int var7 = var0 & 127;
			int var5 = var1 & 127;
			int var9 = Class39.tileHeights[var6][var3][var4] * (128 - var7)
					+ Class39.tileHeights[var6][1 + var3][var4] * var7 >> 7;
			int var8 = var7 * Class39.tileHeights[var6][var3 + 1][var4 + 1]
					+ Class39.tileHeights[var6][var3][1 + var4] * (128 - var7) >> 7;
			return var9 * (128 - var5) + var8 * var5 >> 7;
		} else {
			return 0;
		}
	}

	public boolean method803() {
		if (this.transformIds == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.varpIndex * 1660103175 != -1) {
				var1 = Class91.method401(1660103175 * this.varpIndex);
			} else if (-1519823779 * this.varp32Index != -1) {
				var1 = Class94.tempVars[-1519823779 * this.varp32Index];
			}

			return var1 >= 0 && var1 < this.transformIds.length && this.transformIds[var1] != -1;
		}
	}

	static int method804(int var0, int var1) {
		long var2 = (long) (var1 + (var0 << 16));
		return Class1.currentRequest != null && Class1.currentRequest.key == var2
				? 1084578137 * Class81.currentBuffer.position
						/ (Class81.currentBuffer.payload.length - Class1.currentRequest.padding) + 1
				: 0;
	}

	static final void method805(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		Node_Sub8 var9 = null;

		for (Node_Sub8 var10 = (Node_Sub8) Client.aDeque2193
				.method471(); var10 != null; var10 = (Node_Sub8) Client.aDeque2193.method473()) {
			if (var0 == var10.anInt1302 * 584375567 && var1 == -1096801001 * var10.anInt1300
					&& -127960105 * var10.anInt1312 == var2 && var10.anInt1303 * -1976125003 == var3) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new Node_Sub8();
			var9.anInt1302 = var0 * 1663988207;
			var9.anInt1303 = 831597725 * var3;
			var9.anInt1300 = -2106367321 * var1;
			var9.anInt1312 = var2 * 1453500391;
			Class41.method226(var9);
			Client.aDeque2193.method475(var9);
		}

		var9.anInt1307 = 618060995 * var4;
		var9.anInt1305 = 545495947 * var5;
		var9.anInt1308 = 1646635879 * var6;
		var9.anInt1310 = -900151381 * var7;
		var9.anInt1311 = -622541955 * var8;
	}

	static CacheIndex openCacheIndex(int var0, boolean var1, boolean var2, boolean var3) {
		IndexTable var4 = null;
		if (Class75.cacheDataFile != null) {
			var4 = new IndexTable(var0, Class75.cacheDataFile, Class39.cacheIndexFiles[var0], 1000000);
		}

		return new CacheIndex(var4, Class3.aClass62_92, var0, var1, var2, var3);
	}
}
