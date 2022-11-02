package com.base.other.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author guancy
 * @version 1.0
 * @project JavaBase
 * @description 反射类练习
 * @date 2022/11/1 19:39:33
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        method1();
        Class<?> clazz = Class.forName("com.base.other.reflection.Student");
        //method2(clazz);
        //method3(clazz);
       // method4(clazz);
       // method5(clazz);
        //method6(clazz);
        method7(clazz);

    }
    /***
     * @description 调用方法
     * @param clazz
     * @return void
     * @author guancy
     * @date  19:45:05
     */
    private static void method7(Class<?> clazz) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor<?> constructor = clazz.getConstructor();
        Student student = (Student) constructor.newInstance();
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        setName.invoke(student,"小明");
        System.out.println(student.getName());
    }

    /***
     * @description 获取成员方法
     * @param clazz
     * @return void
     * @author guancy
     * @date  19:42:24
     */
    private static void method6(Class<?> clazz) throws NoSuchMethodException {
        //返回所有公共成员方法对象的数组，包 括继承的
//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
        //返回所有成员方法对象的数组，不包括 继承的
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }
        //返回单个公共成员方法对象
//        Method equals = clazz.getMethod("equals", Object.class);
//        System.out.println(equals);
        //返回单个成员方法对象
        Method getName = clazz.getDeclaredMethod("getName");
        System.out.println(getName);
    }

    /***
     * @description 成员变量设置值
     * @param clazz
     * @return void
     * @author guancy
     * @date  19:38:19
     */
    private static void method5(Class<?> clazz) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Field name = clazz.getField("name");
        name.set(clazz.newInstance(),"小明");
    }

    /***
     * @description 获取成员变量
     * @param clazz
     * @return void
     * @author guancy
     * @date  19:35:57
     */
    private static void method4(Class<?> clazz) throws NoSuchFieldException {
        //返回所有公共成员变量对象的数组
//        Field[] fields = clazz.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        //返回所有成员变量对象的数组
//        Field[] declaredFields = clazz.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }
        //返回单个公共成员变量对象
//        Field name = clazz.getField("name");
//        System.out.println(name);
        //返回单个成员变量对象
        Field age = clazz.getDeclaredField("age");
        System.out.println(age);
    }

    /***
     * @description 反射构建构造方法创建对象
     * @param clazz
     * @return void
     * @author guancy
     * @date  19:30:33
     */
    private static void method3(Class<?> clazz) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        Student student = (Student) constructor.newInstance(123);
        System.out.println(student.getAge());
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
