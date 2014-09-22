package tomate.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile(value = {"dev", "default"})
public class DevProfile {
 
}
