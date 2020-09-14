/*    */ package hi.hi;
/*    */ 
/*    */ import hi.hi.util.RegistryHandler;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.fml.DeferredWorkQueue;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mod("andrewmod")
/*    */ public class andrewmod
/*    */ {
/* 20 */   public static final Logger LOGGER = LogManager.getLogger();
/*    */   public static final String MOD_ID = "andrewmod";
/*    */   
/*    */   public andrewmod() {
/* 24 */     FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
/* 25 */     FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
/*    */ 
/*    */     
/* 28 */     RegistryHandler.init();
/* 29 */     MinecraftForge.EVENT_BUS.register(this);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private void setup(FMLCommonSetupEvent event) {
/* 35 */     DeferredWorkQueue.runLater(() -> {
/*    */         
/*    */         });
/*    */   }
/*    */   
/*    */   private void doClientStuff(FMLClientSetupEvent event) {}
/*    */ }


/* Location:              C:\Users\Administrator\Downloads\andrewmodBeta1.0.jar!\hi\hi\andrewmod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */