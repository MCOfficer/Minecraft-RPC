package me.mcofficer.minecraftrpc;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigHandler {

    private Configuration config;

    // default values
    public String largeImageKey = "minecraft";
    public String largeImageText = "Minecraft";
    public String smallImageKey = "minecraft";
    public String smallImageText = "Minecraft";

    public ConfigHandler(Configuration config) {
        this.config = config;
    }

    public void syncConfig() {
        try{
            config.load();

            Property largeImageKeyProp = config.get(Configuration.CATEGORY_GENERAL,
                    "largeImageKey",
                    "minecraft",
                    "The key of an image uploaded to the application.");
            Property lateImageTextProp = config.get(Configuration.CATEGORY_GENERAL,
                    "largeImageText",
                    "Minecraft",
                    "The text displayed when hovering over the small image");
            Property smallImageKeyProp = config.get(Configuration.CATEGORY_GENERAL,
                    "smallImageKey",
                    "minecraft",
                    "The key of an image uploaded to the application.");
            Property smallImageTextProp = config.get(Configuration.CATEGORY_GENERAL,
                    "smallImageText",
                    "Minecraft",
                    "The text displayed when hovering over the small image");

            largeImageKey = largeImageKeyProp.getString();
            largeImageText = lateImageTextProp.getString();
            smallImageKey = smallImageKeyProp.getString();
            smallImageText = smallImageTextProp.getString();
        }
        catch (Exception e) {
            System.out.println("Error loading Config - Falling back to default values:");
            e.printStackTrace(System.out);
        }
        finally {
            if (config.hasChanged() || config.)
                config.save();
        }
    }
}
