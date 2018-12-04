public class JCLHelloWorld {
    public static void printAll(){
        JCL_facade jcl = JCL_facadeImpl.getInstance();
        jcl.register(HelloWorld.class, "Hello").
        List<Future> tickets = jcl.executeAll("Hello", "print", null);
        List<JCL_result> = result = jcl.getAllResultBlocking(tickets);
    }
    
}