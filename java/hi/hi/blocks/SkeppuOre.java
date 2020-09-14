/*    */ package hi.hi.blocks;
/*    */ 
/*    */ import com.sun.glass.ui.Window;
import net.minecraft.advancements.criterion.PlayerPredicate;
import net.minecraft.block.*;
/*    */
/*    */
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraftforge.common.ToolType;
/*    */
/*    */ public class SkeppuOre extends OreBlock {
/*    */   public SkeppuOre() {
/* 11 */     super(Properties.create(Material.IRON)
/* 12 */         .hardnessAndResistance(6.5F, 100.0F)
/* 13 */         .harvestTool(ToolType.PICKAXE)
/* 14 */         .sound(SoundType.METAL)
/* 15 */         .speedFactor(2.0F)

/* 16 */         .harvestLevel(3));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Downloads\andrewmodBeta1.0.jar!\hi\hi\blocks\SkeppuOre.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */