package lessons;

import model.d3.*;

public class L8Main {
    public static void main(String[] args) {
        Volume[] shapesWithVolume = {new Cilinder(), new Paral(),
                new Sphere()};
        SurfaceArea[] shapesWithSurfaceArea = {new Cilinder(), new Paral(),
                new Sphere()};

        System.out.println();
    }

    public double getSmallestVolume(Volume[] array)
    {
        double minVolume = array[0].getVolume();
        for (Volume shape : array)
        {
            if (shape.getVolume() < minVolume)
            {
                minVolume = shape.getVolume();
            }
        }
        return minVolume;
    }

    public double getSmallestSurfaceArea(SurfaceArea[] array)
    {
        double minSurfaceArea = array[0].getSurfaceArea();
        for (SurfaceArea shape : array)
        {
            if (shape.getSurfaceArea() < minSurfaceArea)
            {
                minSurfaceArea = shape.getSurfaceArea();
            }
        }
        return minSurfaceArea;
    }
}