package pixel.academy.setter_injection_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pixel.academy.setter_injection_app.common.*;

@Configuration
public class RestaurantConfig {

    @Bean("batman")
    public Chef greekChef() {
        return new GreekChef();
    }

    @Bean("frenchChef")
    public Chef FrechChef() {
        return new FrechChef();
    }

    @Bean("batman")
    public Chef ItalianChef() {
        return new ItalianChef();
    }

    @Bean("batman")
    public Chef MexicanChef() {
        return new MexicanChef();
    }

    @Bean("batman")
    public Chef TurkishChef() {
        return new TurkishChef();
    }


}
