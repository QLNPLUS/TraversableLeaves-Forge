package com.dreu.traversableleaves.interfaces;

import net.minecraft.world.level.block.Block;

import static com.dreu.traversableleaves.config.TLConfig.TL_BLOCKS_FAST;

public interface ITraversableBlock {
  default boolean isTraversable() {
    return TL_BLOCKS_FAST.contains((Block) this);
  }
}
