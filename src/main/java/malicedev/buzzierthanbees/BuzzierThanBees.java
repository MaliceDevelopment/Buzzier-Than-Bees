package malicedev.buzzierthanbees;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockRotatableHorizontal;
import net.minecraft.core.block.material.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class BuzzierThanBees implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "buzzierthanbees";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Block hive;
    @Override
    public void onInitialize() {
        LOGGER.info("BuzzierthanBees initialized.");
    }


	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {
		hive = new BlockBuilder(MOD_ID)
			.build(new BlockRotatableHorizontal("hive",2000, Material.wood){{}});
	}

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}
}


