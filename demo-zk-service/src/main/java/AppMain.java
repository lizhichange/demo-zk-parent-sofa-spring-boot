import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lizhi
 * @date 2018-11-23
 */
@SpringBootApplication
@ComponentScan("com.fulihui.demo")
public class AppMain {

    public static void main(String[] args) {

        new SpringApplicationBuilder(AppMain.class).web(true).run(args);
    }
}
