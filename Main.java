public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");
		MelonType musk = new MelonType(
				"musk",
				"Muskmelon",
				1998,
				"green",
				True,
				True
		);

		MelonType cas = new MelonType(
				"cas",
				"Casaba",
				2003,
				"orange",
				False,
				False
		);

		MelonType cren = new MelonType(
				"cren",
				"Crenshaw",
				1996,
				"green",
				False,
				False
		);

		MelonType yw = new MelonType(
				"yw",
				"Yellow Watermelon",
				2013,
				"yellow",
				False,
				True
		);

		MelonType[] melonTypes = {musk, cas, cren, yw};

		Melon melon1 = new Melon(melonTypes[3], 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(melonTypes[3], 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(melonTypes[1], 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(melonTypes[2], 8, 9, 35, "Michael");
		Melon melon5 = new Melon(melonTypes[2], 8, 2, 35, "Michael");
		Melon melon6 = new Melon(melonTypes[0], 6, 7, 4, "Michael");
		Melon melon7 = new Melon(melonTypes[3], 7, 10, 3, "Sheila");

		Melon[] melons = {melon1,melon2,melon3,melon4,melon5,melon6,melon7};

		getStabilityReport(melons);

	}

	public static void getStabilityReport(Melon[] melonInst) {
		String sellability;
		for (Melon melon: melonInst) {
			boolean iSsellable = Melon.isSellable(melon);
			if (iSsellable == True) {
				sellability = "(CAN BE SOLD)";
			} else {
				sellability = "(NOT SELLABLE)";
			}
			System.out.println("Harvested by " + melon.harvester + " from Field " + melon.field + sellability)
		}
	}
}
