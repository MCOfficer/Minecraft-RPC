package me.mcofficer.minecraftrpc.proxy;

import me.mcofficer.minecraftrpc.MinecraftRPC;

public class ClientProxy extends CommonProxy{

    public void rpcinit(MinecraftRPC main) {
        main.rpcClient.init();
    }

    public void rpcupdate(MinecraftRPC main, String details) {
        main.rpcClient.updatePresence(details);
    }


}
