package com.crud.mappings;

import com.crud.mappings.doa.AppDao;
import com.crud.mappings.entity.Course;
import com.crud.mappings.entity.Instructor;
import com.crud.mappings.entity.InstructorDetail;
import com.crud.mappings.entity.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudMappingsApplication {

    public static void main(String[] args) {

        SpringApplication.run(CrudMappingsApplication.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDao appDao) {
        return runner -> {



        };
    }

   

}
