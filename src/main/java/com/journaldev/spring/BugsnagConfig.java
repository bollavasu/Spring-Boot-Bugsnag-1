package com.journaldev.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.bugsnag.BugsnagSpringConfiguration;
import com.bugsnag.Bugsnag;

@Configuration
@Import(BugsnagSpringConfiguration.class)
public class BugsnagConfig {
    @Bean
    public Bugsnag bugsnag() {
        return new Bugsnag("BUGSNAG-API-KEY");
    }
}
