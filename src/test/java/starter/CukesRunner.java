package starter;


public class CukesRunner {
    public static void main(String[] args) throws Throwable {
        final String[] arguments = new String[]{
                "--glue", "starter",
                "src/test/resources/features/login"// This will look for the classpath inside the jar file
        };
        io.cucumber.core.cli.Main.main(arguments);
    }
}
