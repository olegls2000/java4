package exception;

public class invalidTriangleException extends Exception{
    private String TriangleInfo;

  public invalidTriangleException(String triangleInfo){
      this.TriangleInfo = triangleInfo;
  }

    public String getTriangleInfo() {
        return TriangleInfo;
    }
}
