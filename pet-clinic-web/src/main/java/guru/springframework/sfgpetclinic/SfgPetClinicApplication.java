package guru.springframework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        System.out.println(".....Loaded Vets");

        SpringApplication.run(SfgPetClinicApplication.class, args);
    }

}
