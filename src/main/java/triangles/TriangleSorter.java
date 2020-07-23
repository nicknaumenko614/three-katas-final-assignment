package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        return "";
    }

    protected boolean canTriangleBeConstructed(int sideA, int sideB, int sideC) {
        return (sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA;
    }

    protected boolean isEquilateralTriangle(int sideA, int sideB, int sideC) {
        return sideA == sideB && sideB == sideC;
    }

    public boolean isIsoscelesTriangle(int sideA, int sideB, int sideC) {
        return (sideA == sideB && sideA != sideC)
                || (sideB == sideC && sideB != sideA)
                || (sideC == sideA && sideC != sideB);
    }
}
