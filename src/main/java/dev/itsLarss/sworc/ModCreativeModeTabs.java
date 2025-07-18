package dev.itsLarss.sworc;

import dev.itsLarss.sworc.block.ModBlocks;
import dev.itsLarss.sworc.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sworc.MODID);

    public static final RegistryObject<CreativeModeTab> OUTER_RIM_CHRONICLES = CREATIVE_MODE_TABS.register("outer_rim_chronicles",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRYSTAL.get()))
                    //bei mehreren hier .withTabsBefore() benutzen
                    .title(Component.translatable("creativetab.sworc.outer_rim_chronicles"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CRYSTAL.get());
                        output.accept(ModBlocks.CRYSTAL_BLOCK.get());
                        output.accept(ModItems.RAW_PLASTIC.get());
                        output.accept(ModItems.PLASTIC.get());
                        output.accept(ModItems.PLASTOID.get());
                        output.accept(ModItems.PHASE_ONE_BLUEPRINT.get());
                        output.accept(ModItems.PHASE_TWO_BLUEPRINT.get());
                        output.accept(ModItems.RAW_PLASMA.get());
                        output.accept(ModItems.PLASMA.get());
                        output.accept(ModItems.PLASMA_CELL.get());
                        output.accept(ModItems.CELL.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
