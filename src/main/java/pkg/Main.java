package pkg;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger();
    private static final Marker kijelentes = MarkerManager.getMarker("KIJELENTES");
    private static final Marker kerdes = MarkerManager.getMarker("KERDES");

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            ThreadContext.put("iteration", String.valueOf(i));
            logger.trace(kijelentes, "%Zöld erdőben jártam,");
            logger.info(kijelentes, "Kék ibolyát láttam,");
            logger.warn("El akart hervadni,");
            logger.fatal(kerdes, "Szabad-e locsolni?");
            Thread.sleep(1000);
        }
    }

}
