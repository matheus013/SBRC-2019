public class MainClass {
    public static void main(String [] args) {
        JCL_facade jcl = JCL_FacadeImpl.getInstance;
        File[] complexApplJars = {new File("./JCLHelloworld.jar")}
        jcl.register(complexApplJars, "ComplexHello");
        List<Future> tickets = new ArrayList<Future>(10);
        
        for (int i = 0;i < 10;i++) {
            tickets.add(jcl.execute("ComplexHello","printAll", null));
        }
        
        for (Future t : tickets) {
            Object result = t.get();
        }
    }
}