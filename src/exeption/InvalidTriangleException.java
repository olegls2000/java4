package exeption;

public class InvalidTriangleException
        extends Exception {
    private String triangleInfo;

    public InvalidTriangleException(String triangleInfo) {
        this.triangleInfo = triangleInfo;
    }

    public String getTriangleInfo() {
        return triangleInfo;
    }
}
