package com.curley.revive.nick;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curley.revive.nick.model.Player;
import com.curley.revive.nick.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static final Logger logger = LoggerFactory.getLogger(Application.class);
	
    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
    
    public CommandLineRunner setup(PlayerRepository playerRepository) {
        return args -> { 
            playerRepository.save(new Player("Tom",
                    "Brady",
                    "New England Patriots",
                    "QB",
                    97, 99, 60, 66, 70, 64));
            playerRepository.save(new Player("Patrick",
                    "Mahomes",
                    "Kansas City Chiefs",
                    "QB",
                    98, 94, 81, 87, 88, 69));
            playerRepository.save(new Player("Ezekiel",
                    "Elliott",
                    "Dallas Cowboys",
                    "HB",
                    94, 98, 90, 91, 95, 81));
            playerRepository.save(new Player("Stephon",
                    "Gilmore",
                    "New England Patriots",
                    "CB",
                    94, 95, 91, 94, 94, 62));
            playerRepository.save(new Player("Tyreek",
                    "Hill",
                    "Kansas City Chiefs",
                    "WR",
                    94, 85, 99, 99, 98, 64));
        };
    }

}
