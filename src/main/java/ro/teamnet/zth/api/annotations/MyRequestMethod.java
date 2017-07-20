package ro.teamnet.zth.api.annotations;

import java.lang.annotation.*;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Alexandra.Mihalcea on 7/20/2017.
 */
@Target(ElementType.METHOD)
@Retention(RUNTIME)
@Documented
public @interface MyRequestMethod {
    String methodType();
    String urlPath();

}
