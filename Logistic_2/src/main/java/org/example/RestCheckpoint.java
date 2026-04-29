package org.example;
    public class RestCheckpoint extends Checkpoint {

        private static final double PENALTY_FACTOR = 0.5;

        public RestCheckpoint(String checkpointId, String locationName,
                              double distanceFromLast, double expectedDuration, double actualDuration) {
            super(checkpointId, locationName, distanceFromLast, expectedDuration, actualDuration);
        }

        @Override
        public String getType() { return "RestCheckpoint"; }

        @Override
        public boolean isCritical() { return false; }

        @Override
        public double calculatePenalty() {
            double delay = delayMinutes();
            return delay > 0 ? delay * PENALTY_FACTOR : 0.0;
        }
    }
