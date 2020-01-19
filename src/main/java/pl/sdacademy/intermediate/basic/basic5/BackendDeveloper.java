package pl.sdacademy.intermediate.basic.basic5;

public class BackendDeveloper extends Developer {
    private String backendLanguage;

    public BackendDeveloper(String name, String company, double salary, String backendLanguage) {
        super(name, company, salary);
        this.backendLanguage = backendLanguage;
    }


    @Override
    protected void makeCode() {
        System.out.printf("%s is coding for %s for %.1f PLN in %s\n", name, company, salary, backendLanguage);
    }
}
