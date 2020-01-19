package pl.sdacademy.intermediate.basic.basic5;

public class FrontendDeveloper extends Developer {
    private String javaScriptFramework;

    public FrontendDeveloper(String name, String company, double salary, String javaScriptFramework) {
        super(name, company, salary);
        this.javaScriptFramework = javaScriptFramework;
    }

    @Override
    protected void makeCode() {
        System.out.printf("%s is coding for %s for %.2f in %s\n", name, company, salary, javaScriptFramework);
    }

}
