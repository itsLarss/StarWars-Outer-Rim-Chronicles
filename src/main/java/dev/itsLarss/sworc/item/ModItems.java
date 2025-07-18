package dev.itsLarss.sworc.item;

import dev.itsLarss.sworc.Sworc;
import dev.itsLarss.sworc.item.custom.Fuelitem;
import dev.itsLarss.sworc.ModArmorMaterials;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sworc.MODID);

    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PLASTIC = ITEMS.register("raw_plastic",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASTOID = ITEMS.register("plastoid",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.sworc.plastoid"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> PHASE_ONE_BLUEPRINT = ITEMS.register("phase_one_blueprint",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PHASE_TWO_BLUEPRINT = ITEMS.register("phase_two_blueprint",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PLASMA = ITEMS.register("raw_plasma",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASMA = ITEMS.register("plasma",
            () -> new Fuelitem(new Item.Properties(), 2640));

    public static final RegistryObject<Item> PLASMA_CELL = ITEMS.register("plasma_cell",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CELL = ITEMS.register("cell",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASTOID_HELMET = ITEMS.register("plastoid_helmet",
            () -> new ArmorItem(ModArmorMaterials.PLASTOID_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final RegistryObject<Item> PLASTOID_CHESTPLATE = ITEMS.register("plastoid_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PLASTOID_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final RegistryObject<Item> PLASTOID_LEGGINGS = ITEMS.register("plastoid_leggings",
            () -> new ArmorItem(ModArmorMaterials.PLASTOID_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final RegistryObject<Item> PLASTOID_BOOTS = ITEMS.register("plastoid_boots",
            () -> new ArmorItem(ModArmorMaterials.PLASTOID_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
