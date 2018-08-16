package springProfile;

import org.omg.CORBA.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.Properties;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
    return springApplicationBuilder
        .sources(Application.class)
        .properties(getProperties());
  }

  public static void main(String[] args) {

    new SpringApplicationBuilder(Application.class)
        .sources(Application.class)
        .properties(getProperties())
        .run(args);
  }

  static Properties getProperties() {
    Properties props = new Properties();
    props.put("spring.config.location", "classpath:myapp1/");
    return props;
  }
}
