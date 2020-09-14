package hi.hi.gen;

import hi.hi.andrewmod;
import hi.hi.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = andrewmod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen {

    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE",
            "end_stone", new BlockMatcher(Blocks.END_STONE));

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            //Nether Generation
            if (biome.getCategory() == Biome.Category.NETHER) {
                genOre(biome, 1, 5, 5, 120, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.SKEPPU_ORE_BLOCK.get().getDefaultState(), 12);
                //End Generation
            } else if (biome.getCategory() == Biome.Category.THEEND) {
                genOre(biome, 1, 3, 5, 120, END_STONE, RegistryHandler.SKEPPU_ORE_BLOCK.get().getDefaultState(), 12);
                //World Generation
            }  else if (biome.getCategory() == Biome.Category.TAIGA) {
            genOre(biome, 5, 3, 5, 120, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.SKEPPU_ORE_BLOCK.get().getDefaultState(), 12);
            //World Generation
        } else {
                genOre(biome, 1, 0, 5, 120, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.SKEPPU_ORE_BLOCK.get().getDefaultState(), 12);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
