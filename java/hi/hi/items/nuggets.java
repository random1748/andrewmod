/*    */ package hi.hi.items;
/*    */ 
/*    */ import net.minecraft.item.Food;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemGroup;
/*    */ import net.minecraft.potion.EffectInstance;
/*    */ import net.minecraft.potion.Effects;
/*    */ 
/*    */ public class nuggets
/*    */   extends Item {
/*    */   public nuggets() {
/* 12 */     super((new Item.Properties())
/* 13 */         .group(ItemGroup.FOOD)
/* 14 */         .food((new Food.Builder())
/* 15 */           .saturation(12)
/* 16 */           .hunger(100)
/* 17 */           .effect(new EffectInstance(Effects.SPEED, 999999999, 5), 100.0F)
/* 18 */           .fastToEat()
/* 19 */           .meat()
/* 20 */           .effect(new EffectInstance(Effects.JUMP_BOOST, 999999999, 3), 100.0F)
/* 21 */           .build()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Downloads\andrewmodBeta1.0.jar!\hi\hi\items\nuggets.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */