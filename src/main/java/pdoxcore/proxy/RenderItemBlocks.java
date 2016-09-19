package pdoxcore.proxy;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import pdoxcore.init.ModItemBlocks;

import static pdoxcore.init.ModBlocks.helper;

/**
 * Created by WildWolf on 30/06/2016.
 */
public class RenderItemBlocks{

    public static void render(){

        for(int i = 0; i < ModItemBlocks.ores.length; i++) {
            helper.renderItem(ModItemBlocks.ores[i], 0, new ModelResourceLocation("pdoxcore:" + ModItemBlocks.ores[i].getUnlocalizedName().substring(5).replace(".","/"), "inventory"));
        }

    }

}
