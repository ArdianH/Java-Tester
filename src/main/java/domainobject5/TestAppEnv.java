package domainobject5;

/**
 * Created by Ardian Hosen on 02/09/2016.
 */
public class TestAppEnv {
    public static final String DOMAIN = "192.118.24.10";
    public static final String PORT = "81";

    public static String getUrl()
    {
        return "http://" + DOMAIN + ":" + PORT;
    }

}
