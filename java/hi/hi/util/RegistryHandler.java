/*    */ package hi.hi.util;
/*    */ 
/*    */ import hi.hi.armor.ModArmorMaterial;

/*    */ import hi.hi.blocks.BlockItemBase;
/*    */ import hi.hi.items.nuggets;
/*    */ import hi.hi.tools.SkeppuItemTeir;
/*    */
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.inventory.EquipmentSlotType;
/*    */ import net.minecraft.item.ArmorItem;
/*    */ import net.minecraft.item.AxeItem;
/*    */
/*    */ import net.minecraft.item.HoeItem;
/*    */ import net.minecraft.item.IArmorMaterial;
/*    */
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemGroup;
/*    */ import net.minecraft.item.PickaxeItem;
/*    */ import net.minecraft.item.Rarity;
/*    */ import net.minecraft.item.ShovelItem;
/*    */ import net.minecraft.item.SwordItem;
/*    */ import net.minecraftforge.fml.RegistryObject;
/*    */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RegistryHandler
/*    */ {
/* 32 */   public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "andrewmod");
/* 33 */   public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "andrewmod");
/*    */   public static void init() {
/* 35 */     ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
/* 36 */     BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
/*    */   }
/*    */ 
/*    */   
/* 40 */   public static final RegistryObject<Item> SKEPPUINGOT = ITEMS.register("skeppu_ingot", hi.hi.items.ItemBase::new);
/*    */   
/* 42 */   public static final RegistryObject<Item> SCRAP = ITEMS.register("skeppu_scrap", hi.hi.items.ItemBase::new);
/* 43 */   public static final RegistryObject<nuggets> NUGGS = ITEMS.register("nugget", nuggets::new);
/*    */   
/*    */
/*    */   
/* 51 */   public static final RegistryObject<SwordItem> SKEPPU_SWORD = ITEMS.register("skeppu_sword", () -> new SwordItem(SkeppuItemTeir.SKEPPU, 1201, 0.0F, (new Item.Properties()).group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));
/*    */   
/* 53 */   public static final RegistryObject<PickaxeItem> SKEPPU_PICKAXE = ITEMS.register("skeppu_pickaxe", () -> new PickaxeItem(SkeppuItemTeir.SKEPPU, 0, 1.0F, (new Item.Properties()).group(ItemGroup.TOOLS).rarity(Rarity.EPIC)));
/*    */   
/* 55 */   public static final RegistryObject<AxeItem> SKEPPU_AXE = ITEMS.register("skeppu_axe", () -> new AxeItem(SkeppuItemTeir.SKEPPU, 11.0F, 1.0F, (new Item.Properties()).group(ItemGroup.TOOLS).rarity(Rarity.EPIC)));
/*    */   
/* 57 */   public static final RegistryObject<HoeItem> SKEPPU_HOE = ITEMS.register("skeppu_hoe", () -> new HoeItem(SkeppuItemTeir.SKEPPU, 0, 1.0F, (new Item.Properties()).group(ItemGroup.TOOLS).rarity(Rarity.EPIC)));
/*    */   
/* 59 */   public static final RegistryObject<ShovelItem> SKEPPU_SHOVEL = ITEMS.register("skeppu_shovel", () -> new ShovelItem(SkeppuItemTeir.SKEPPU, 0.0F, 1.0F, (new Item.Properties()).group(ItemGroup.TOOLS).rarity(Rarity.EPIC)));
/*    */
/*    */ 
/*    */ 
/*    */   
/* 64 */   public static final RegistryObject<ArmorItem> SKEPPU_HELMET = ITEMS.register("skeppu_helmet", () -> new ArmorItem((IArmorMaterial) ModArmorMaterial.SKEPPU, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));
/*    */   
/* 66 */   public static final RegistryObject<ArmorItem> SKEPPU_CHESTPLATE = ITEMS.register("skeppu_chestplate", () -> new ArmorItem((IArmorMaterial)ModArmorMaterial.SKEPPU, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));
/*    */   
/* 68 */   public static final RegistryObject<ArmorItem> SKEPPU_LEGGINGS = ITEMS.register("skeppu_leggings", () -> new ArmorItem((IArmorMaterial)ModArmorMaterial.SKEPPU, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));
/*    */   
/* 70 */   public static final RegistryObject<ArmorItem> SKEPPU_BOOTS = ITEMS.register("skeppu_boots", () -> new ArmorItem((IArmorMaterial)ModArmorMaterial.SKEPPU, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));
/*    */ 
/*    */ 
/*    */   
/* 74 */   public static final RegistryObject<Block> SKEPPU_BLOCK = BLOCKS.register("skeppu_block", hi.hi.blocks.Skeppublock::new);
/* 75 */   public static final RegistryObject<Block> SKEPPU_ORE_BLOCK = BLOCKS.register("skeppu_ore", hi.hi.blocks.SkeppuOre::new);
/*    */   
/* 77 */   public static final RegistryObject<Item> SKEPPU_block_ITEM = ITEMS.register("skeppu_block", () -> new BlockItemBase(SKEPPU_BLOCK.get()));
/* 78 */   public static final RegistryObject<Item> SKEPPU_ORE_BLOCK_ITEM = ITEMS.register("skeppu_ore", () -> new BlockItemBase(SKEPPU_ORE_BLOCK.get()));
/*    */ }


/* Location:              C:\Users\Administrator\Downloads\andrewmodBeta1.0.jar!\hi\h\\util\RegistryHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */