package HomeWork1.enums;

public enum EngineType {
    V4(0.05),
    V6(0.5),
    V8(0.07),
    V12(0.09);

    double capability;
    EngineType(double capability) {
        this.capability = capability;
    }

    public double getCapability() {
        return capability;
    }
}
