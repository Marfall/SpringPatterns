package config;

import entities.Cat;
import entities.Parrot;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("entities")
public class ApplicationConfig {

    @Bean("cat")
    public Cat getCat(@Qualifier("parrot-gosha") Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + " killer");
        return cat;
    }

    // В обычных условиях бин, возвращаюций Parrot может быть только один - иначе неопределенность
    // Решение - указание имени принимаемого параметра - аннотацией @Qualifier

    @Bean("parrot-kesha")
    public Parrot getParrot() {
        return new Parrot();
    }
    @Bean("parrot-gosha")
    public Parrot getParrotGosha() {
       Parrot parrot = new Parrot();
       parrot.setName("parrot-gosha");
       return parrot;
    }
}
