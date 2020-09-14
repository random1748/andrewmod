/*    */ package hi.hi.tools;
/*    */ 
/*    */ import hi.hi.util.RegistryHandler;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.item.IItemTier;
/*    */ import net.minecraft.item.crafting.Ingredient;
/*    */
/*    */ 
/*    */ public enum SkeppuItemTeir implements IItemTier {
/* 10 */   SKEPPU(5, 10000, 100000.0F, 8.0F, 500, () -> Ingredient.fromItems(RegistryHandler.SKEPPUINGOT.get()));
/*    */


/*    */   private final Supplier<Ingredient> repairmaterial;
/*    */   
/*    */   private final int enchantability;
/*    */   
/*    */   private final float attackDamage;
/*    */   
/*    */   private final float efficiency;
/*    */   
/*    */   private final int maxUses;
/*    */   
/*    */   private final int harvestLevel;
/*    */   
/*    */   SkeppuItemTeir(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairmaterial) {
/* 25 */     this.harvestLevel = harvestLevel;
/* 26 */     this.maxUses = maxUses;
/* 27 */     this.efficiency = efficiency;
/* 28 */     this.attackDamage = attackDamage;
/* 29 */     this.enchantability = enchantability;
/* 30 */     this.repairmaterial = repairmaterial;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_200926_a() {
/* 37 */     return this.maxUses;
/*    */   }
/*    */ 
/*    */   
/*    */   public float func_200928_b() {
/* 42 */     return this.efficiency;
/*    */   }
/*    */ 
/*    */   
/*    */   public float func_200929_c() {
/* 47 */     return this.attackDamage;
/*    */   }
/*    */ 
/*    */   
/*    */   public int func_200925_d() {
/* 52 */     return this.harvestLevel;
/*    */   }
/*    */ 
/*    */   
/*    */   public int func_200927_e() {
/* 57 */     return this.enchantability;
/*    */   }
/*    */ 
/*    */   
/*    */   public Ingredient func_200924_f() {
/* 62 */     return this.repairmaterial.get();
/*    */   }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return (Ingredient) this.repairmaterial;
    }
    /*    */ }


/* Location:              C:\Users\Administrator\Downloads\andrewmodBeta1.0.jar!\hi\hi\tools\SkeppuItemTeir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */