package org.example;
public class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String checkpointId, String locationName,
                              double distanceFromLast, double expectedDuration, double actualDuration) {
        super(checkpointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }

    @Override
    public String getType() { return "DeliveryCheckpoint"; }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public double calculatePenalty() {
        return isDelayed() ? delayMinutes() * 2.0 : 0.0;
    }
}
