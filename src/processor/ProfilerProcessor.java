package processor;

import annotation.Profiler;

import java.lang.reflect.Method;

public final class ProfilerProcessor {
    private ProfilerProcessor() {
    }

    private static ProfilerProcessor instance;

    public static final ProfilerProcessor getInstance(){
        if (instance == null) {
            instance = new ProfilerProcessor();
        }
        return instance;
    }

    public void process(Object objectProcess, Object ... args) throws Exception {
        final Class<?> clazz = objectProcess.getClass();
        Method[] superMethods = clazz.getDeclaredMethods();
        for (Method method : superMethods)
        {
            if (method.isAnnotationPresent(Profiler.class)) {
                method.setAccessible(true);
                long start = System.currentTimeMillis();
                method.invoke(objectProcess, args);
                long stop = System.currentTimeMillis();
                long durationTime = stop - start;
                System.out.println("Time = " + durationTime + " m/sec");
            }
        }
    }
}