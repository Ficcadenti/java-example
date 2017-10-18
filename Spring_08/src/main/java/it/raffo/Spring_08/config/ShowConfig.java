package it.raffo.Spring_08.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("it.raffo.Spring_08")
@PropertySource("classpath:/resources/concerto.properties")
public class ShowConfig {
}
