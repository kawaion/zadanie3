package Adapter;

public class AdapterForUSA extends USAPlug {
    private EuroPlug euroPlug;

    public AdapterForUSA(EuroPlug euroPlug) {
        this.euroPlug = euroPlug;
        this.name = "переходник для " + euroPlug.name;
    }
}
