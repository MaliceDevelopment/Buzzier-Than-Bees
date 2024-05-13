package malicedev.buzzierthanbees;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.model.BlockModelHorizontalRotation;
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

		 hive = new BlockBuilder(MOD_ID)
			 .setBlockModel((b) -> new BlockModelHorizontalRotation(b))
			 .setNorthTexture("buzzierthanbees:block/hive_north")
			 .setTopBottomTextures("buzzierthanbees:block/hive_top")
			 .setSouthTexture("buzzierthanbees:block/hive")
			 .setEastTexture("buzzierthanbees:block/hive")
			 .setWestTexture("buzzierthanbees:block/hive")
			.build(new BlockRotatableHorizontal("hive", 15999, Material.wood) {
			});
	}
	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}
}


// I <3 INTELLIJ&JAVA
