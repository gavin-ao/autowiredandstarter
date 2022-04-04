package spring.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.properties.SpecProperties;
import spring.workspecies.Farmer;
import spring.workspecies.Worker;

/**
 * Created by aoyonggang on 2022/4/4.
 */

@Configuration
@EnableConfigurationProperties(SpecProperties.class)
@ConditionalOnProperty(prefix = "spec", name = "enabled", havingValue = "true")
public class SpecConfig {


    @Bean
    public Worker getWorker(SpecProperties properties)
    {
        Worker worker = new Worker();
        worker.setName(properties.getName());
        worker.setAge(properties.getAge());
        worker.setSpec(properties.getSpec());
        return worker;
    }

    @Bean
    public Farmer getFarmer(SpecProperties properties)
    {
        Farmer farmer = new Farmer();
        farmer.setName(properties.getName() + " : farmer");
        farmer.setAge(properties.getAge() + 30);
        farmer.setSpec(properties.getSpec() + ": farmer do!");
        return farmer;

    }
}
