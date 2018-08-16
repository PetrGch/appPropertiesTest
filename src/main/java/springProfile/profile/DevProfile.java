package springProfile.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevProfile {

  public DevProfile() {
    System.out.println("#####################");
    System.out.println("   Dev data source   ");
    System.out.println("#####################");
  }

}
