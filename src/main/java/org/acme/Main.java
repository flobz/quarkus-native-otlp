package org.acme;

import java.util.logging.Logger;
import io.quarkus.logging.Log;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {
    private static final Logger LOGGER = Logger.getLogger("ListenerBean");

    public static void main(String ... args) {


        LOGGER.info("aaa");
        Log.info("Hello from quarkus");

        Quarkus.run(args);
    }
}