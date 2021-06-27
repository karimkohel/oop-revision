package revision;

public class Scooter extends Vehicle implements IRechargable{
    private int batterySize;

    public Scooter(int batterySize) {
        this.batterySize = batterySize;
    }



    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public int calcRechargeTime(int rechargingRate, int batterySize) {
        return rechargingRate * batterySize;
    }
}
