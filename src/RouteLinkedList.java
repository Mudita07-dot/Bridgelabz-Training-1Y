public class RouteLinkedList<T extends Checkpoint> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) { head = newNode; return; }
        Node<T> temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public boolean removeCheckpoint(String id) {
        if (head == null) return false;
        if (head.data.checkpointId.equals(id)) { head = head.next; return true; }
        Node<T> curr = head;
        while (curr.next != null && !curr.next.data.checkpointId.equals(id)) curr = curr.next;
        if (curr.next != null) { curr.next = curr.next.next; return true; }
        return false;
    }

    public T findCheckpoint(String id) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.checkpointId.equals(id)) return temp.data;
            temp = temp.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        for (Node<T> t = head; t != null; t = t.next) total += t.data.distance;
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        for (Node<T> t = head; t != null; t = t.next) total += t.data.getPenalty();
        return total;
    }

    public boolean checkConsistency() {
        boolean hasDelivery = false, hasFuel = false;
        for (Node<T> t = head; t != null; t = t.next) {
            if (t.data instanceof Delivery) hasDelivery = true;
            if (t.data instanceof Fuel) hasFuel = true;
        }
        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        for (Node<T> t = head; t != null; t = t.next)
            System.out.print("[" + t.data.checkpointId + "] -> ");
        System.out.println("END");
    }
}
