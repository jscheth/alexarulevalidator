package com.cybercitycode.alexarulevalidation;

import java.util.List;

public class AlexaValidator {
    public AlexaValidator() {
    }

    public boolean validate(AlexaRequest request, List<Rule> rules) {
        for(Rule rule : rules) {
            if (!rule.isValid(request)) {
                return false;
            }
        }

        return true;
    }
}
