package com.jnutz.purplepower.world.generation;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreBlockGeneration implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {

        switch (world.provider.dimensionId)
        {

            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);

            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);

            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }

    }

    private void generateNether(World world, Random random, int chunkX, int chunkZ)
    {

    }

    private void generateSurface(World world, Random random, int chunkX, int chunkZ)
    {

        /** 12 = times it can gen in chunk **/
        for(int ic = 0; ic < 10; ic++)
        {

            int crandPosX = chunkX + random.nextInt(16);
            int crandPosY = random.nextInt(64);
            int crandPosZ = chunkZ + random.nextInt(16);

            /** 2 = is number of blocks per vein **/
            (new WorldGenMinable(Blocks.coal_block, 2)).generate(world, random, crandPosX, crandPosY, crandPosZ);

        }

        for(int ii = 0; ii < 8; ii++)
        {

            int irandPosX = chunkX + random.nextInt(16);
            int irandPosY = random.nextInt(64);
            int irandPosZ = chunkZ + random.nextInt(16);


            (new WorldGenMinable(Blocks.iron_block, 2)).generate(world, random, irandPosX, irandPosY, irandPosZ);

        }

        for(int ig = 0; ig < 6; ig++)
        {

            int grandPosX = chunkX + random.nextInt(16);
            int grandPosY = random.nextInt(64);
            int grandPosZ = chunkZ + random.nextInt(16);


            (new WorldGenMinable(Blocks.gold_block, 2)).generate(world, random, grandPosX, grandPosY, grandPosZ);

        }

        for(int id = 0; id < 4; id++)
        {

            int drandPosX = chunkX + random.nextInt(16);
            int drandPosY = random.nextInt(64);
            int drandPosZ = chunkZ + random.nextInt(16);


            (new WorldGenMinable(Blocks.diamond_block, 2)).generate(world, random, drandPosX, drandPosY, drandPosZ);

        }

    }

    private void generateEnd(World world, Random random, int chunkX, int chunkZ)
    {

    }


}
