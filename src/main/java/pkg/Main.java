package pkg;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger();
    private static final Marker kijelentes = MarkerManager.getMarker("KIJELENTES");
    private static final Marker kerdes = MarkerManager.getMarker("KERDES");

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < Integer.parseInt(args[0]); i++) {
            ThreadContext.put("iteration", String.valueOf(i));
            logger.trace(kijelentes, "%Zöld erdőben jártam,");
            logger.info(kijelentes, "Kék ibolyát láttam,");
            logger.warn("El akart hervadni,");
            logger.fatal(kerdes, "Szabad-e locsolni?");
            Thread.sleep(1000);
        }
//        logger.fatal("This is a FATAL message");
//        logger.error("This is an ERROR message");
//        logger.warn("This is a WARN message");
//        logger.info("This is an INFO message");
//        logger.debug("This is a DEBUG message");
//        logger.trace("This is a TRACE message");
//        logger.info("Java version is {}", System.getProperty("java.version"));
//        logger.trace("Available free memory: {} kB", () -> Runtime.getRuntime().freeMemory() / 1024);
//        logger.error("An exception occurred", new RuntimeException("Oops, something went wrong"));
//        logger.error("This is an ERROR message that contains 'FAIL'");
    }

}
