package springProfile.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultProfile {

  public DefaultProfile() {
    System.out.println("##########################");
    System.out.println("   Default data source   ");
    System.out.println("##########################");
  }

}
