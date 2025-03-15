package com.cybercitycode.alexarulevalidation;

public class RegexRule implements Rule {
    private String pattern;

    public RegexRule(String pattern) {
        this.pattern = pattern;
    }

    public boolean isValid(AlexaRequest alexaRequest) {
        return alexaRequest.getInput().matches(this.pattern);
    }
}