package processor;

import annotation.Profiler;

import java.lang.reflect.Method;

public class ProfilerProcessor {
    public void process(Object objectProcess) throws Exception {
        final Class<?> clazz = objectProcess.getClass();
        Method[] superMethods = clazz.getDeclaredMethods();
        for (Method method : superMethods)
        {
            if (method.isAnnotationPresent(Profiler.class)) {
                method.setAccessible(true);
                long start = System.currentTimeMillis();
                method.invoke(objectProcess);
                long stop = System.currentTimeMillis();
                long durationTime = stop - start;
                System.out.println("Time = " + durationTime + " m/sec");
            }
        }
    }
}