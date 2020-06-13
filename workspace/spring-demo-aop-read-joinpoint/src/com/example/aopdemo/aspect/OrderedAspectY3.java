package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * While the order is undefined for aspects with the same order value,
 * in practice spring AOP executes them in alphabetical order. To avoid
 * getting these in the right order we'll add X/Y/Z to the class names
 * arbitrarily.
 */

@Aspect
@Order(3)
@Component
public class OrderedAspectY3 {
  @Before("com.example.aopdemo.aspect.PointcutHelper.forDaoPackageNoGetterSetter()")
  public void beforeOrderedAspect3() {
    System.out.println(">>>> BEFORE Ordered Aspect 3 <<<<");
  }
}