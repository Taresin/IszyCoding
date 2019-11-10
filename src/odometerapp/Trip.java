package odometerapp;

public class Trip {
    Long startTime;
    Long finishTime;
    String origin;
    String destination;
    Integer odoStart;
    Integer odoFinish;

    public Trip(Long startTime, String origin, String destination, Integer odoStart) {
        this.startTime = startTime;
        this.origin = origin;
        this.destination = destination;
        this.odoStart = odoStart;
    }

    public Trip(Long startTime, Long finishTime, String origin, String destination, Integer odoStart, Integer odoFinish) {
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.origin = origin;
        this.destination = destination;
        this.odoStart = odoStart;
        this.odoFinish = odoFinish;
    }

    public Integer getMileageDistance(){
        if (odoStart == null || odoFinish == null) {
            return null;
        }
        return odoFinish - odoStart;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "startTime=" + startTime +
                ",\nfinishTime=" + finishTime +
                ",\norigin='" + origin + '\'' +
                ",\ndestination='" + destination + '\'' +
                ",\nodoStart=" + odoStart +
                ",\nodoFinish=" + odoFinish +
                '}';
    }
}
