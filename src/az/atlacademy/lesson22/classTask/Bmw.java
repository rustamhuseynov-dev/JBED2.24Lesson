package az.atlacademy.lesson22.classTask;

import java.time.LocalDate;

public class Bmw implements Car{

    private LocalDate year;

    private String model;

    private Integer engine;

    public Bmw(LocalDate year, String model, Integer engine) {
        this.year = year;
        this.model = model;
        this.engine = engine;
    }
    public Bmw(){

    }

    public void carYear(LocalDate year) {
        if (year == null){
            throw new CustomException("Xeta");
        }
        System.out.println("masinin ili : " + year.getYear());
    }

    public void carYear(String model){
        if (model == null){
            throw new CustomException("Xeta");
        }
        System.out.println("masinin adi : " + model);
    }

    public void carEngine(Integer engine){
        if (engine == null){
            throw new CustomException("Xeta");
        }
        System.out.println("masinin matoru : " + engine);
    }


}
