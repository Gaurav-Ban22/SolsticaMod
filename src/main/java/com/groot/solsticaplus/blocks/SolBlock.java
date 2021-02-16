package com.groot.solsticaplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SolBlock extends Block {

    public static final Block solble = null;

    public SolBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.SCAFFOLDING)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)


        );
    }
}
