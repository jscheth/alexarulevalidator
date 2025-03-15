
package com.cybercitycode.alexarulevalidation;

import java.util.Set;

public class KeywordRule implements Rule {
    private Set<String> requiredKeywords;

    public KeywordRule(Set<String> requiredKeywords) {
        this.requiredKeywords = requiredKeywords;
    }

    public boolean isValid(AlexaRequest request) {
        for(String keyword : this.requiredKeywords) {
            if (!request.getInput().contains(keyword)) {
                return false;
            }
        }

        return true;
    }
}