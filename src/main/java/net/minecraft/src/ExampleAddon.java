package net.minecraft.src;

public class ExampleAddon extends FCAddOn {
    private static ExampleAddon instance;

    private ExampleAddon() {
        super("Example Name", "0.1.0", "Ex");
    }

    @Override
    public void Initialize() {
        FCAddOnHandler.LogMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }

    public static ExampleAddon getInstance() {
        if (instance == null)
            instance = new ExampleAddon();
        return instance;
    }
}
