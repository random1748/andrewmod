/*    */ package hi.hi.blocks;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.item.BlockItem;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemGroup;
/*    */ 
/*    */ public class BlockItemBase extends BlockItem {
/*    */   public BlockItemBase(Block block) {
/* 10 */     super(block, (new Item.Properties()).group(ItemGroup.BUILDING_BLOCKS));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Downloads\andrewmodBeta1.0.jar!\hi\hi\blocks\BlockItemBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */