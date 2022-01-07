public class AquariumJava001 {
    private int mTemperature;

    public AquariumJava001() { }

    public int getTemperature() {
        return mTemperature;
    }

    public void setTemperature(int mTemperature) {
        this.mTemperature = mTemperature;
    }

    @Override
    public String toString() {
        return "Aquarium{" +
                "mTemperature=" + mTemperature +
                '}';
    }
}
