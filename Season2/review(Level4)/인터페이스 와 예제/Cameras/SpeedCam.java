package review.abs.camera;

public class SpeedCam extends Camera implements Detectable, Reportable{
    Detectable detector;
    Reportable reporter;

    @Override
    public void showMainFeature() {
        System.out.println("속도를 측정하고 신고합니다.");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }

    public void setDetector(Detectable detector) {
        System.out.println("감지기 객체 설정");
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        System.out.println("리포터 객체 설정");
        this.reporter = reporter;
    }
}
