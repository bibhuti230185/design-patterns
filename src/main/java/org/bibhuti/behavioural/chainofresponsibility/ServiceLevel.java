package org.bibhuti.behavioural.chainofresponsibility;

public enum ServiceLevel {
    LEVEL_ONE, LEVEL_TWO, LEVEL_THREE;

    @Override
    public String toString() {
        switch (this) {
            case LEVEL_ONE:
                return "Level One";
            case LEVEL_TWO:
                return "Level Two";
            case LEVEL_THREE:
                return "Level Three";
            default:
                return "Unkown Level";
        }
    }
}
