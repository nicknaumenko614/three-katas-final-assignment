package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        return "";
    }

    protected boolean canTriangleBeConstructed(int sideA, int sideB, int sideC) {
        return (sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA;
    }
}
