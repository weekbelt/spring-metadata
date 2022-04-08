package me.weekbelt.springmetadata.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "outbound")
public class OutboundProperties {

    private Def def;

    @Getter
    @Setter
    public static class Def {

        // outbound.def.call-type
        private String callType;
    }
}
