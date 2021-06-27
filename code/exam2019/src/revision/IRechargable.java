package revision;

public interface IRechargable {
    int rechargingRate = 50;

    int calcRechargeTime(int rechargingRate, int batterySize);
}
