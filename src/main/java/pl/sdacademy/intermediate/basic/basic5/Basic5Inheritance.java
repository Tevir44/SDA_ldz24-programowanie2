package pl.sdacademy.intermediate.basic.basic5;

public class Basic5Inheritance {
    public static void main(String[] args) {
        Developer backendDeveloper = new BackendDeveloper("Piotr","Ericsson",0.5d,"Java");
        Developer frontendDeveloper = new FrontendDeveloper("Adam","SDA",999.99d,"Angular");
        Developer mobileDeveloper = new MobileDeveloper("Ania","Google", 100_000d,"Android");

        backendDeveloper.makeCode();
        frontendDeveloper.makeCode();
        mobileDeveloper.makeCode();

/*
        Sprawdź, czy możesz utworzyć obiekt poprzez new Developer().
        Można - trzeba nadpisać metodę makeCode przy tworzeniu obiektu.

        Sprawdź, czy możesz użyć referencji do klasy Developer.
        Można.
*/
    }
}

