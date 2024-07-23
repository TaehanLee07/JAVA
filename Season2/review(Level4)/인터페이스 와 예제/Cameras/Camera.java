package review.abs.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }
    public void recordViedo() {
        System.out.println("동영상을 녹화합니다.");
    }
    public abstract void showMainFeature(); // 추상 메서드 - 하위 클래스에서 구현해야 하는 메서드
}
