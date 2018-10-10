package cap.test;

import cap.service.HelloWorld;
import cap.service.impl.HelloWorldImpl;

public class HelloWorldTest {
    @Test
    public void testSayHi() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.sayHi("liuyu"));
    }

    @Test
    public void testSayHi2() {
        HelloWorld helloWorld = new HelloWorldImpl();
        System.out.println(helloWorld.sayHi("liuyu2"));
    }

    private class ClassPathXmlApplicationContext {
        public ClassPathXmlApplicationContext(String s) {
        }
    }
}
