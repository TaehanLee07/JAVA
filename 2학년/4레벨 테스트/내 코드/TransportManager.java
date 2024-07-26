public class TransportManager <T extends Movable> {
    public T transport ;

    public T getTransprot() {
        return transport;
    }

    public void setTransport(T transprot) {
        this.transport = transprot;
    }

    public void moveTransport(Double distance) {
        transport.move(distance);
    }
}
