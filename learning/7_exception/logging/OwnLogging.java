import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class OwnLogging {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(OwnLogging.class);
        log.info("start...");
        log.warn("end.");
    }
}
