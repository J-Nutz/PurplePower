package com.jnutz.purplepower.world.generation;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModGenerationInit
{

    public static void init(){

        initOreGen();

    }

    public static void initOreGen(){

        registerWorldGen(new OreBlockGeneration(), 1);
        //registerWorldGen(new IronBlockGeneration(), 1);
        System.out.println("Why...");

    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){

        GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);

    }

}
