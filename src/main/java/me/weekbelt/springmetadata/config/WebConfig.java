package me.weekbelt.springmetadata.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(OutboundProperties.class)
public class WebConfig {

}
