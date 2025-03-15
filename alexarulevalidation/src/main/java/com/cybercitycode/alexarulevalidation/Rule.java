package com.alexarulevalidation.alexarulevalidation;

public interface Rule {
    boolean isValid(AlexaRequest request);
}
