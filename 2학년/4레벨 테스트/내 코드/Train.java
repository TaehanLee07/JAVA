public class Train implements Movable{

    @Override
    public void move(Double distance) {
        System.out.println("기차가 " + distance + " 거리를 " + TransportType.TRAIN.getSpeed() + " 속도로 이동했습니다.");
    }

    @Override
    public TransportType getTransportType() {
        return TransportType.TRAIN;
    }
}
