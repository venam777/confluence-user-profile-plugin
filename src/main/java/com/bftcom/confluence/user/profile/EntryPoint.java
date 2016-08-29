package com.bftcom.confluence.user.profile;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.ApplicationProperties;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class EntryPoint {

    @Inject
    public EntryPoint(@ComponentImport ApplicationProperties applicationProperties) {
        int k = 5;
    }
}
