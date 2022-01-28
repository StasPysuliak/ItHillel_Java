import home.work29.annotation.Start;
import org.reflections.Reflections;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Class<?>> names = new Reflections("home.work29.classes").getTypesAnnotatedWith(Start.class);

        names.stream()
                .sorted((a, b) -> Integer.signum(a.getAnnotation(Start.class).priority() - b.getAnnotation(Start.class).priority()))
                .forEach(clazz -> {
                    try {
                        clazz.getDeclaredMethod(clazz.getAnnotation(Start.class).method()).invoke(clazz.getConstructor().newInstance());
                    } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                        System.out.println(e.getMessage());
                    }
                });
    }
}