package com.bukkit.yogoda.movecraft;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Joel
 */
public class BlocksInfo {

	public static BlockInfo[] blocks = new BlockInfo[255];

	public static void loadBlocksInfo() {

		// name, isDataBlock, needsSupport, isComplexBlock
		blocks[0] = new BlockInfo(0,"air", false, false, false, -1, 0);
		blocks[1] = new BlockInfo(1,"smoothstone", false, false, false, 4, 1);
		blocks[2] = new BlockInfo(2,"grass", false, false, false, 3, 1);
		blocks[3] = new BlockInfo(3,"dirt", false, false, false, 3, 1);
		blocks[4] = new BlockInfo(4,"cobblestone", false, false, false);
		blocks[5] = new BlockInfo(5,"wood", false, false, false);
		blocks[6] = new BlockInfo(6,"sapling", false, false, false);
		blocks[7] = new BlockInfo(7,"adminium", false, false, false);
		blocks[8] = new BlockInfo(8,"water", true, false, false, -1, 0);
		blocks[9] = new BlockInfo(9,"water", true, false, false, -1, 0);
		blocks[10] = new BlockInfo(10,"lava", true, false, false, -1, 0);
		blocks[11] = new BlockInfo(11,"lava", true, false, false, -1, 0);
		blocks[12] = new BlockInfo(12,"sand", false, false, false);
		blocks[13] = new BlockInfo(13,"gravel", false, false, false);
		blocks[14] = new BlockInfo(14,"gold ore", false, false, false);
		blocks[15] = new BlockInfo(15,"iron ore", false, false, false);
		blocks[16] = new BlockInfo(16,"charcoal", false, false, false, 263, 1);
		blocks[17] = new BlockInfo(17,"trunc", false, false, false);
		blocks[18] = new BlockInfo(18,"foliage", false, false, false, -1, 0);
		blocks[19] = new BlockInfo(19,"sponge", false, false, false);
		blocks[20] = new BlockInfo(20,"glass", false, false, false, -1, 0);
		blocks[35] = new BlockInfo(35,"wool", false, false, false, 35, 1);
		blocks[37] = new BlockInfo(37,"yellow flower", false, true, false);
		blocks[38] = new BlockInfo(38,"red flower", false, true, false);
		blocks[39] = new BlockInfo(39,"brown mushroom", false, true, false);
		blocks[40] = new BlockInfo(40,"red mushroom", false, true, false);
		blocks[41] = new BlockInfo(41,"gold block", false, false, false, 266, 9);
		blocks[42] = new BlockInfo(42,"iron block", false, false, false, 265, 9);
		blocks[43] = new BlockInfo(43,"double steps", false, false, false, 44, 2);
		blocks[44] = new BlockInfo(44,"step", false, false, false);
		blocks[45] = new BlockInfo(45,"brick", false, false, false, 336, 4);
		blocks[46] = new BlockInfo(46,"TNT", false, false, false);
		blocks[47] = new BlockInfo(47,"library", false, false, false);
		blocks[48] = new BlockInfo(48,"mossy cobblestone", false, false, false);
		blocks[49] = new BlockInfo(49,"obsidian", false, false, false);
		blocks[50] = new BlockInfo(50,"torch", true, true, false);
		blocks[51] = new BlockInfo(51,"fire", true, true, false, -1, 0);
		blocks[52] = new BlockInfo(52,"spawner", true, false, false);
		blocks[53] = new BlockInfo(53,"wooden stair", true, false, false);
		blocks[54] = new BlockInfo(54,"chest", true, false, true);
		blocks[55] = new BlockInfo(55,"redstone dust", true, true, false, 331, 1);
		blocks[56] = new BlockInfo(56,"diamond", false, false, false, 264, 1);
		blocks[57] = new BlockInfo(57,"diamond block", false, false, false, 264, 9);
		blocks[58] = new BlockInfo(58,"workbench", false, false, false);
		blocks[59] = new BlockInfo(59,"seed", true, true, false, 295, 1);
		blocks[60] = new BlockInfo(60,"field", true, false, false, 3, 1);
		blocks[61] = new BlockInfo(61,"furnace", true, false, false, 4, 8);
		blocks[62] = new BlockInfo(62,"furnace", true, false, false, 4, 8);
		blocks[63] = new BlockInfo(63,"sign", true, true, true, 323, 1);
		blocks[64] = new BlockInfo(64,"wooden door", true, true, false, 5, 3);
		blocks[65] = new BlockInfo(65,"ladder", true, true, false);
		blocks[66] = new BlockInfo(66,"rail", true, true, false);
		blocks[67] = new BlockInfo(67,"cobblestone stair", true, false, false);
		blocks[68] = new BlockInfo(68,"sign", true, true, true, 323, 1);
		blocks[69] = new BlockInfo(69,"lever", true, true, false);
		blocks[70] = new BlockInfo(70,"pressure plate", true, true, false);
		blocks[71] = new BlockInfo(71,"steel door", true, true, false, 265, 3);
		blocks[72] = new BlockInfo(72,"wooden pressure plate", true, true, false);
		blocks[73] = new BlockInfo(73,"redstone ore", false, false, false, 331, 4);
		blocks[74] = new BlockInfo(74,"redstone ore", false, false, false, 331, 4);
		blocks[75] = new BlockInfo(75,"redstone torch", true, true, false);
		blocks[76] = new BlockInfo(76,"redstone torch", true, true, false);
		blocks[77] = new BlockInfo(77,"stone button", true, true, false);
		blocks[78] = new BlockInfo(78,"snow", false, true, false, 332, 1);
		blocks[79] = new BlockInfo(79,"ice", false, false, false);
		blocks[80] = new BlockInfo(80,"snow block", false, false, false);
		blocks[81] = new BlockInfo(81,"cacti", false, true, false);
		blocks[82] = new BlockInfo(82,"clay", false, false, false);
		blocks[83] = new BlockInfo(83,"reed", true, true, false, 338, 1);
		blocks[84] = new BlockInfo(84,"jukebox", true, false, false);
		blocks[85] = new BlockInfo(85,"fence", true, false, false);
		blocks[86] = new BlockInfo(86,"pumpkin", true, false, false);
		blocks[87] = new BlockInfo(87,"hellstone", false, false, false);
		blocks[88] = new BlockInfo(88,"mud", false, false, false);
		blocks[89] = new BlockInfo(89,"lightstone", false, false, false);
		blocks[90] = new BlockInfo(90,"portal", true, true, false);
		blocks[91] = new BlockInfo(91,"pumpkin", true, false, false);
	}

	public static String getName(int blockId) {

		return blocks[blockId].name;
	}

	public static boolean isDataBlock(int blockId) {
		return blockId != -1 && blocks[blockId].isDataBlock;
	}

	public static boolean isComplexBlock(int blockId) {
		// So far just a sign or a chest
		return blockId != -1 && blocks[blockId].isComplexBlock;
	}

	public static boolean needsSupport(int blockId) {

		return blockId != -1 && blocks[blockId].needSupport;
	}

        public static int getDropItem(int blockId){

            return blocks[blockId].dropItem;
        }
        
        public static int getDropQuantity(int blockId){

            return blocks[blockId].dropQuantity;
        }

	private static class BlockInfo {

        @SuppressWarnings("unused")
		int id;
		String name;
		boolean isDataBlock;
		boolean needSupport;
		boolean isComplexBlock;
                int     dropItem = -1;
                int     dropQuantity = 0;

		public BlockInfo(int id, String name, boolean isDataBlock, boolean needSupport, boolean isComplexBlock) {
                    this(id, name, isDataBlock, needSupport, isComplexBlock, id, 1);
                }
                
		public BlockInfo(int id, String name, boolean isDataBlock, boolean needSupport,
				boolean isComplexBlock, int dropItem, int dropQuantity) {

                        this.id = id;
			this.name = name;
			this.isDataBlock = isDataBlock;
			this.needSupport = needSupport;
			this.isComplexBlock = isComplexBlock;
                        this.dropItem = dropItem;
                        this.dropQuantity = dropQuantity;
		}

	}
}