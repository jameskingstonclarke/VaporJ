package platform;

/**
 * Interface for a class that has an associated config
 * */
public abstract class Configurable {
    /**
     * The config associated with this Configurable
     * */
    Config config;

    public Config getConfig(){
        return this.config;
    }
}
