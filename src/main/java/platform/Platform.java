package platform;

import java.util.HashMap;

/**
 * Packages are deployed onto platforms, platforms self-manage apps
 * */
public class Platform extends Configurable{
    /**
     * Reference to configurables, potentially Apps or Platforms
     * */
    private HashMap<Integer, Configurable> congigurables;
}
