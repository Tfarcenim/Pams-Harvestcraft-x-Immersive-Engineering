package tfar.pamsharvestcraftximmersiveengineering;

import blusunrize.immersiveengineering.api.crafting.ClocheRecipe;
import blusunrize.immersiveengineering.api.crafting.StackWithChance;
import blusunrize.immersiveengineering.client.utils.ClocheRenderFunctions;
import blusunrize.immersiveengineering.data.recipes.builder.ClocheRecipeBuilder;
import com.pam.pamhc2crops.blocks.BlockPamCrop;
import com.pam.pamhc2crops.setup.BlockRegistration;
import com.pam.pamhc2crops.setup.ItemRegistration;
import com.pam.pamhc2trees.worldgen.placers.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompatRecipes extends RecipeProvider {
    public CompatRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static final String PAM_TREES = "pamhc2trees";

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {


        this.createClocheOutput(BlockRegistration.pamagavecrop.get(), ItemRegistration.agaveitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamalfalfacrop.get(), ItemRegistration.alfalfaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamaloecrop.get(), ItemRegistration.aloeitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamamaranthcrop.get(), ItemRegistration.amaranthitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamarrowrootcrop.get(), ItemRegistration.arrowrootitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamartichokecrop.get(), ItemRegistration.artichokeitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamasparaguscrop.get(), ItemRegistration.asparagusitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pambarleycrop.get(), ItemRegistration.barleyitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pambarrelcactuscrop.get(), ItemRegistration.barrelcactusitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pambeancrop.get(), ItemRegistration.beanitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pambellpeppercrop.get(), ItemRegistration.bellpepperitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamblackberrycrop.get(), ItemRegistration.blackberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamblueberrycrop.get(), ItemRegistration.blueberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pambokchoycrop.get(), ItemRegistration.bokchoyitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pambroccolicrop.get(), ItemRegistration.broccoliitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pambrusselsproutcrop.get(), ItemRegistration.brusselsproutitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcabbagecrop.get(), ItemRegistration.cabbageitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcactusfruitcrop.get(), ItemRegistration.cactusfruititem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcalabashcrop.get(), ItemRegistration.calabashitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcandleberrycrop.get(), ItemRegistration.candleberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcanolacrop.get(), ItemRegistration.canolaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcantaloupecrop.get(), ItemRegistration.cantaloupeitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcassavacrop.get(), ItemRegistration.cassavaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcattailcrop.get(), ItemRegistration.cattailitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcauliflowercrop.get(), ItemRegistration.caulifloweritem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcelerycrop.get(), ItemRegistration.celeryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamchiacrop.get(), ItemRegistration.chiaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamchickpeacrop.get(), ItemRegistration.chickpeaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamchilipeppercrop.get(), ItemRegistration.chilipepperitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcloudberrycrop.get(), ItemRegistration.cloudberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcoffeebeancrop.get(), ItemRegistration.coffeebeanitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcorncrop.get(), ItemRegistration.cornitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcottoncrop.get(), ItemRegistration.cottonitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcranberrycrop.get(), ItemRegistration.cranberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamcucumbercrop.get(), ItemRegistration.cucumberitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pameggplantcrop.get(), ItemRegistration.eggplantitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamelderberrycrop.get(), ItemRegistration.elderberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamflaxcrop.get(), ItemRegistration.flaxitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamgarliccrop.get(), ItemRegistration.garlicitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamgingercrop.get(), ItemRegistration.gingeritem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamgrapecrop.get(), ItemRegistration.grapeitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamgreengrapecrop.get(), ItemRegistration.greengrapeitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamguaranacrop.get(), ItemRegistration.guaranaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamhuckleberrycrop.get(), ItemRegistration.huckleberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamjicamacrop.get(), ItemRegistration.jicamaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamjuniperberrycrop.get(), ItemRegistration.juniperberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamjutecrop.get(), ItemRegistration.juteitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamkalecrop.get(), ItemRegistration.kaleitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamkenafcrop.get(), ItemRegistration.kenafitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamkiwicrop.get(), ItemRegistration.kiwiitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamkohlrabicrop.get(), ItemRegistration.kohlrabiitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamleekcrop.get(), ItemRegistration.leekitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamlentilcrop.get(), ItemRegistration.lentilitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamlettucecrop.get(), ItemRegistration.lettuceitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamlotuscrop.get(), ItemRegistration.lotusitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pammilletcrop.get(), ItemRegistration.milletitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pammulberrycrop.get(), ItemRegistration.mulberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pammustardseedscrop.get(), ItemRegistration.mustardseedsitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamnettlescrop.get(), ItemRegistration.nettlesitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamnopalescrop.get(), ItemRegistration.nopalesitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamoatscrop.get(), ItemRegistration.oatsitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamokracrop.get(), ItemRegistration.okraitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamonioncrop.get(), ItemRegistration.onionitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pampapyruscrop.get(), ItemRegistration.papyrusitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamparsnipcrop.get(), ItemRegistration.parsnipitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pampeanutcrop.get(), ItemRegistration.peanutitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pampeascrop.get(), ItemRegistration.peasitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pampineapplecrop.get(), ItemRegistration.pineappleitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamquinoacrop.get(), ItemRegistration.quinoaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamradishcrop.get(), ItemRegistration.radishitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamraspberrycrop.get(), ItemRegistration.raspberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamrhubarbcrop.get(), ItemRegistration.rhubarbitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamricecrop.get(), ItemRegistration.riceitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamrutabagacrop.get(), ItemRegistration.rutabagaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamryecrop.get(), ItemRegistration.ryeitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamscallioncrop.get(), ItemRegistration.scallionitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamsesameseedscrop.get(), ItemRegistration.sesameseedsitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamsisalcrop.get(), ItemRegistration.sisalitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamsorghumcrop.get(), ItemRegistration.sorghumitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamsoybeancrop.get(), ItemRegistration.soybeanitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamspiceleafcrop.get(), ItemRegistration.spiceleafitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamspinachcrop.get(), ItemRegistration.spinachitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamstrawberrycrop.get(), ItemRegistration.strawberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamsunchokecrop.get(), ItemRegistration.sunchokeitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamsweetpotatocrop.get(), ItemRegistration.sweetpotatoitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamtarocrop.get(), ItemRegistration.taroitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamtealeafcrop.get(), ItemRegistration.tealeafitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamtomatillocrop.get(), ItemRegistration.tomatilloitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamtomatocrop.get(), ItemRegistration.tomatoitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamtrufflecrop.get(), ItemRegistration.truffleitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamturnipcrop.get(), ItemRegistration.turnipitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamwaterchestnutcrop.get(), ItemRegistration.waterchestnutitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamwhitemushroomcrop.get(), ItemRegistration.whitemushroomitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamwintersquashcrop.get(), ItemRegistration.wintersquashitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamwolfberrycrop.get(), ItemRegistration.wolfberryitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamyuccacrop.get(), ItemRegistration.yuccaitem.get(), recipeOutput);
        this.createClocheOutput(BlockRegistration.pamzucchinicrop.get(), ItemRegistration.zucchiniitem.get(), recipeOutput);

        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.apple_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, Items.APPLE, recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.avocado_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.avocadoitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.candlenut_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.candlenutitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.cherry_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.cherryitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.chestnut_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.chestnutitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.gooseberry_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.gooseberryitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.lemon_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.lemonitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.nutmeg_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.nutmegitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.orange_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.orangeitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.peach_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.peachitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.pear_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.pearitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.plum_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.plumitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.walnut_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.walnutitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.spiderweb_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, Items.COBWEB, recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.hazelnut_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.hazelnutitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.pawpaw_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.pawpawitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.soursop_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.soursopitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.acorn_sapling.get(), Blocks.OAK_LOG, Blocks.OAK_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.acornitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.almond_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.almonditem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.apricot_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.apricotitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.banana_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.bananaitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.cashew_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.cashewitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.coconut_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.coconutitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.date_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.dateitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.dragonfruit_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.dragonfruititem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.durian_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.durianitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.fig_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.figitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.grapefruit_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.grapefruititem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.lime_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.limeitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.mango_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.mangoitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.olive_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.oliveitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.papaya_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.papayaitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.pecan_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.pecanitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.peppercorn_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.peppercornitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.persimmon_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.persimmonitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.pistachio_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.pistachioitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.pomegranate_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.pomegranateitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.starfruit_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.starfruititem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.vanillabean_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.vanillabeanitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.breadfruit_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.breadfruititem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.guava_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.guavaitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.jackfruit_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.jackfruititem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.lychee_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.lycheeitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.passionfruit_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.passionfruititem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.rambutan_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.rambutanitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.tamarind_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.tamarinditem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.cinnamon_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.cinnamonitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.paperbark_sapling.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LEAVES, Items.PAPER, recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.maple_sapling.get(), Blocks.SPRUCE_LOG, Blocks.SPRUCE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.maplesyrupitem.get(), recipeOutput);
        createClocheTreeOutput(com.pam.pamhc2trees.init.BlockRegistration.pinenut_sapling.get(), Blocks.SPRUCE_LOG, Blocks.SPRUCE_LEAVES, com.pam.pamhc2trees.init.ItemRegistration.pinenutitem.get(), recipeOutput);

    }

    private void createClocheTreeOutput(Block crop, Block log, Block leaves, ItemLike drop, RecipeOutput output) {
        ClocheRecipeBuilder.builder()
                .soil(Blocks.DIRT)
                .seed(crop)
                .output(drop)
                .output(log, .125f)
                .output(leaves, .125f)
                .output(crop, .125f)
                .setTime(200)
                .setRender(new ClocheRenderFunctions.RenderFunctionGeneric(crop))
                .build(output, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, BuiltInRegistries.ITEM.getKey(drop.asItem()).getPath()));
    }


    private void createClocheOutput(BlockPamCrop crop, Item drop, RecipeOutput output) {
        ClocheRecipeBuilder.builder()
                .soil(Blocks.DIRT)
                .seed(crop)
                .output(drop)
                .output(crop, .125f)
                .setTime(200)
                .setRender(new ClocheRenderFunctions.RenderFunctionCrop(crop))
                .build(output, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, BuiltInRegistries.ITEM.getKey(drop).getPath()));
    }


}
