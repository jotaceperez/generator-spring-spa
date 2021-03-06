package <%= packageName %>;

/**
 * Application Constants.
 */

public abstract class Constants {
    // Spring profile for development, production
    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";
    public static final String SPRING_PROFILE_PRODUCTION = "prod";
    // Spring profile used when deploying with Spring Cloud (used when deploying to CloudFoundry)
    public static final String SPRING_PROFILE_CLOUD = "cloud";
    // Spring profile used when deploying to Heroku
    public static final String SPRING_PROFILE_HEROKU = "heroku";
    // Spring profile when running on continuous integration
    public static final String SPRING_PROFILE_CI = "ci";
}
