 public abstract class Checkpoint {
        protected String checkpointId;
        protected double distance;
        protected int expectedTime;
        protected int actualTime;

        public Checkpoint(String id, double distance, int expected, int actual) {
            this.checkpointId = id;
            this.distance = distance;
            this.expectedTime = expected;
            this.actualTime = actual;
        }

        public abstract double getPenalty();
    }

    class Delivery extends Checkpoint {
        public Delivery(String id, double d, int e, int a) { super(id, d, e, a); }
        @Override
        public double getPenalty() {
            return (actualTime > expectedTime) ? (actualTime - expectedTime) * 2 : 0;
        }
    }

    class Fuel extends Checkpoint {
        public Fuel(String id, double d, int e, int a) { super(id, d, e, a); }
        @Override
        public double getPenalty() {
            return (actualTime > expectedTime) ? 10 : 0;
        }
    }

    class Rest extends Checkpoint {
        public Rest(String id, double d, int e, int a) { super(id, d, e, a); }
        @Override
        public double getPenalty() {
            int delay = actualTime - expectedTime;
            return (delay > 30) ? delay * 0.5 : 0;
        }
    }

