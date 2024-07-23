package review.abs.camera;

public class Main {
    public static void main(String[] args) {
        Reportable normalReporter = new NormalReporter();
        Reportable videoReporter = new VideoReporter();

        normalReporter.report();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        Detectable advancedFireDetector = new AdvancedFireDetector();

        fireDetector.detect();
        advancedFireDetector.detect();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
