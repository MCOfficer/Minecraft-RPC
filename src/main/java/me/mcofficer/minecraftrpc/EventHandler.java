package me.mcofficer.minecraftrpc;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class EventHandler {

    MinecraftRPC main;

    public EventHandler (MinecraftRPC main) {
        this.main = main;
    }

    @SubscribeEvent
    public void onClientConnectedToServerEvent(FMLNetworkEvent.ClientConnectedToServerEvent event) {
        if (event.isLocal())
        master
            main.proxy.rpcupdate(main, "Singleplayer");
        else
            main.proxy.rpcupdate(main, "Multiplayer");
=======
            main.proxy.rpcupdate(main, "Single Player", main.configHandler);
        else
            main.proxy.rpcupdate(main, "Multi Player", main.configHandler);
        master
    }

}
