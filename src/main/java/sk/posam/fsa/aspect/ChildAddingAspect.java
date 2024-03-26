package sk.posam.fsa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ChildAddingAspect {

    @Around("@annotation(sk.posam.fsa.bean.ChildAdding)")
    public Object addChildToParent(ProceedingJoinPoint joinPoint) throws Throwable{
        // Get joinPoints arguments from the program
        Object[] args = joinPoint.getArgs();

        // Call real method
        return joinPoint.proceed(args);
    }
}
