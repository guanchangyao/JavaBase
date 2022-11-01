package com.base.other.reflection;

import java.lang.reflect.Constructor;

/**
 * @author guancy
 * @version 1.0
 * @project JavaBase
 * @description 反射类练习
 * @date 2022/11/1 19:39:33
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
//        method1();
        Class<?> clazz = Class.forName("com.base.other.reflection.Student");
        method2(clazz);

    }
    /***
     * @description 获取构造方法
     * @param clazz
     * @return void
     * @author guancy
     * @date  19:55:47
     */
    private static void method2(Class<?> clazz) throws NoSuchMethodException {
        //获取所有公有的构造方法
//        Constructor<?>[] constructors = clazz.getConstructors();
//        for (Constructor<?> constructor : constructors) {
//            System.out.println(constructor);
//        }
        //获取所有的构造方法
//        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
//        for (Constructor<?> constructor : declaredConstructors) {
//            System.out.println(constructor);
//        }
        //获取指定的公有构造方法
//        Constructor<?> constructor = clazz.getConstructor(String.class, String.class);
//        System.out.println(constructor);
        //获取单个构造方法
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor);
    }

    /***
     * @description 获取clazz的三种方式
     *
     * @return void
     * @author guancy
     * @date  19:44:53
     */
    private static void method1() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("src/com/base/other/reflection/Student.java");
        Class<Student> studentClass = Student.class;
        Student student=new Student();
        Class<? extends Student> aClass = student.getClass();
    }
}
