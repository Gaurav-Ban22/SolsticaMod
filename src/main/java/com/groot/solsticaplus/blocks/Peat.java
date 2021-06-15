package com.groot.solsticaplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Peat extends Block {
    public Peat() {
        super(Block.Properties.create(Material.CLAY)

                .hardnessAndResistance(3.0f, 3.0f)
                .sound(SoundType.SAND)
                .harvestLevel(2)
                .setRequiresTool()
                .harvestTool(ToolType.SHOVEL)
                .setLightLevel(value -> 15)

        );
    }
}
