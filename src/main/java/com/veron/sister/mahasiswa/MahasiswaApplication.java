package com.veron.sister.mahasiswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.veron.sister.mahasiswa.entity")
public class MahasiswaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MahasiswaApplication.class, args);
	}

}
