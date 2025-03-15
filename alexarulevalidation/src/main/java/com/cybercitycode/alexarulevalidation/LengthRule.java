package code.cybercitycode.alexarulevalidation;

public class LengthRule implements Rule {
    private int minLength;

    public LengthRule(int minLength) {
        this.minLength = minLength;
    }

    public boolean isValid(AlexaRequest request) {
        return request.getInput().length() >= this.minLength;
    }
}