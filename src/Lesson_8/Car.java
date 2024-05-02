package Lesson_8;

public class Car {

    String make;
    String model;

    int productionYear;


    Car(String coldenGelenMarka, String model, int productionYear) {
        this.make = coldenGelenMarka;
        this.model = model;
        this.productionYear = productionYear;
    }

    Car(String coldenGelenMarka, String model) {
        this.make = coldenGelenMarka;
        this.model = model;

    }

    Car(String coldenGelenMarka) {
        this.make = coldenGelenMarka;
    }


    boolean texnikiBaxishaEhtiyyacVarmi() {
        if (productionYear > 2019) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}

