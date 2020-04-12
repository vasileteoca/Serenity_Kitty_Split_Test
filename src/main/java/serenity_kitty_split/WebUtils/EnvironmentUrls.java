package serenity_kitty_split.WebUtils;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class EnvironmentUrls {

    private static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    private static String env = System.getProperty("testEnv").toLowerCase();

    private static String url;

    public static String ROOT_URL(){
        if(env.contains("prod")){
            url = variables.getProperty("default.url");
        }
        else if(env.contains("dev-test")){
            url = variables.getProperty("default.url");
        }
        else if(env.contains("uat")){
            url = variables.getProperty("default.url");
        }
        else if(env.contains("kittySplit")){
            url = variables.getProperty("default.url");
        }
        return url;
    }
}
