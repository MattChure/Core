package pdoxcore.util;

/**
 * Created by WildWolf on 20/09/2016.
 */
public interface ILogger {
    void warning(String message);

    void info(String message);

    void fatal(String message);

    void error(String message);

    void devWarning(String message);

    void devInfo(String message);

    void devFatal(String message);

    void devError(String message);
}
