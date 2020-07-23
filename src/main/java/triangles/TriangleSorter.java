package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if (canTriangleBeConstructed(sideA, sideB, sideC)) {
            if (isEquilateralTriangle(sideA, sideB, sideC)) {
                return "Equilateral";
            } else if (isIsoscelesTriangle(sideA, sideB, sideC)) {
                return "Isosceles";
            } else {
                return "";
            }
        } else {
            return "Triangle Can Not Be Made";
        }
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

    public boolean isRightTriangle(int sideA, int sideB, int sideC) {
        return Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)
                || Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2)
                || Math.pow(sideC, 2) + Math.pow(sideA, 2) == Math.pow(sideB, 2);
    }
}
