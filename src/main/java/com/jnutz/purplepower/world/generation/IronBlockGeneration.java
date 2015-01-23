/**package com.jnutz.purplepower.world.generation;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class IronBlockGeneration implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkXI, int chunkZI, World worldI, IChunkProvider chunkGeneratorI, IChunkProvider chunkProviderI)
    {

        switch (worldI.provider.dimensionId)
        {

            case -1:
                generateNether(worldI, random, chunkXI * 16, chunkZI * 16);

            case 0:
                generateSurface(worldI, random, chunkXI * 16, chunkZI * 16);

            case 1:
                generateEnd(worldI, random, chunkXI * 16, chunkZI * 16);
        }

    }

    private void generateNether(World world, Random random, int chunkX, int chunkZ)
    {

    }

    private void generateSurface(World iworld, Random irandom, int ichunkX, int ichunkZ)
    {

        for(int i = 0; i < 250; i++)
        {

            int irandPosX = ichunkX + irandom.nextInt(16);
            int irandPosY = irandom.nextInt(64);
            int irandPosZ = ichunkZ + irandom.nextInt(16);


            (new WorldGenMinable(Blocks.iron_block, 2)).generate(iworld, irandom, irandPosX, irandPosY, irandPosZ);

        }

    }

    private void generateEnd(World world, Random random, int chunkX, int chunkZ){

    }


}
**/