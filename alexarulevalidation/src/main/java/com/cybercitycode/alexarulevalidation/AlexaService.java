//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cybercitycode.alexarulevalidation;

import java.util.ArrayList;
import java.util.List;

public class AlexaService {
    private List<Rule> rules = new ArrayList();
    private AlexaValidator validator = new AlexaValidator();

    public AlexaService() {
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }

    public boolean validateRequest(String input) {
        AlexaRequest request = new AlexaRequest(input);
        return this.validator.validate(request, this.rules);
    }
}
