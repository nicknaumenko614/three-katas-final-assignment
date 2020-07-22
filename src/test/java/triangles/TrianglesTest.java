package triangles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TrianglesTest {

    //we will start by testing if a triangle can be constructed with given sides:

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
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType).isEqualTo("Equilateral");
    }
}
