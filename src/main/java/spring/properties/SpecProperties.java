package spring.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * Created by aoyonggang on 2022/4/4.
 */
@Data
@ConfigurationProperties("spec")
public class SpecProperties {
    private String name;
    private Integer age;
    private String spec;
}
