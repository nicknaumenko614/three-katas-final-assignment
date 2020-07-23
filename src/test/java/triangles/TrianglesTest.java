package triangles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TrianglesTest {


    @Test
    public void canTriangleBeConstructedReturnsTrueWhenItCanBe() {
        TriangleSorter underTest = new TriangleSorter();
        boolean actualResult = underTest.canTriangleBeConstructed(3, 4, 5);
        assertThat(actualResult).isTrue();

        actualResult = underTest.canTriangleBeConstructed(5, 5, 3);
        assertThat(actualResult).isTrue();

        actualResult = underTest.canTriangleBeConstructed(3, 3, 3);
        assertThat(actualResult).isTrue();
    }

    @Test
    public void canTriangleBeConstructedReturnsFalseWhenItCanNotBe() {
        TriangleSorter underTest = new TriangleSorter();
        boolean actualResult = underTest.canTriangleBeConstructed(2, 3, 5);
        assertThat(actualResult).isFalse();

        actualResult = underTest.canTriangleBeConstructed(4, 7, 13);
        assertThat(actualResult).isFalse();
    }

    @Test
    public void isEquilateralTriangleReturnsTrueWhenItIs() {
        TriangleSorter underTest = new TriangleSorter();
        boolean actualResult = underTest.isEquilateralTriangle(3, 3, 3);
        assertThat(actualResult).isTrue();
    }

    @Test
    public void isEquilateralTriangleReturnsFalseWhenItIsNot() {
        TriangleSorter underTest = new TriangleSorter();
        boolean actualResult = underTest.isEquilateralTriangle(5, 5, 3);
        assertThat(actualResult).isFalse();
    }

    @Test
    public void isIsoscelesTriangleReturnsTrueWhenItIs() {
        TriangleSorter underTest = new TriangleSorter();
        boolean actualResult = underTest.isIsoscelesTriangle(5, 5, 3);
        assertThat(actualResult).isTrue();
    }

    @Test
    public void isIsoscelesTriangleReturnsFalseWhenItIsNot() {
        TriangleSorter underTest = new TriangleSorter();
        boolean actualResult = underTest.isIsoscelesTriangle(3, 4, 5);
        assertThat(actualResult).isFalse();
    }

    @Test
    public void isRightTriangleReturnsTrueWhenItIs() {
        TriangleSorter underTest = new TriangleSorter();
        boolean actualResult = underTest.isRightTriangle(3, 4, 5);
        assertThat(actualResult).isTrue();
    }

    @Test
    public void isRightTriangleReturnsFalseWhenItIsNot() {
        TriangleSorter underTest = new TriangleSorter();
        boolean actualResult = underTest.isRightTriangle(2, 3, 4);
        assertThat(actualResult).isFalse();
    }


    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType).isEqualTo("Equilateral");
    }

    @Test
    public void twoEqualSidesIsAnIsoscelesTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 5, 5);
        assertThat(triangleType).isEqualTo("Isosceles");
    }

    @Test
    public void threeSidesCanMakeRightTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(5, 4, 3);
        assertThat(triangleType).isEqualTo("Right");
    }

    @Test
    public void threeSidesCanMakeScaleneTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(2,4,3);
        assertThat(triangleType).isEqualTo("Scalene");
    }

    @Test
    public void threeSidesThatCannotMakeTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(5, 3, 2);
        assertThat(triangleType).isEqualTo("Triangle Can Not Be Made");
    }
}
