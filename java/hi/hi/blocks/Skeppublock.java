/*    */ package hi.hi.blocks;
/*    */ 
/*    */ import net.minecraft.block.AbstractBlock;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.SoundType;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraftforge.common.ToolType;
/*    */ 
/*    */ public class Skeppublock extends Block {
/*    */   public Skeppublock() {
/* 11 */     super(Properties.create(Material.IRON)
            .hardnessAndResistance(6.5F, 100.0F)
/* 12 */         .speedFactor(6.5F)
/* 13 */         .harvestTool(ToolType.PICKAXE)
/* 14 */         .sound(SoundType.METAL)
/* 15 */         .jumpFactor(6.0F)
/* 16 */         .harvestLevel(3));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Downloads\andrewmodBeta1.0.jar!\hi\hi\blocks\Skeppublock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */