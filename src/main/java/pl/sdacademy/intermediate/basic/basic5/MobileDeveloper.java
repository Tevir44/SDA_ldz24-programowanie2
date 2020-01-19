package pl.sdacademy.intermediate.basic.basic5;

public class MobileDeveloper extends Developer {
    private String mobileOs;

    public MobileDeveloper(String name, String company, double salary, String mobileOs) {
        super(name, company, salary);
        this.mobileOs = mobileOs;
    }

    @Override
    protected void makeCode() {
        System.out.printf("%s is coding for %s for %.1f in %s\n", name, company, salary, mobileOs);
    }

}
