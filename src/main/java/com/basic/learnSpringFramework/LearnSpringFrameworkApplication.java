package com.basic.learnSpringFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.basic.learnSpringFramework.enterprise.web.MyWebController;
import com.basic.learnSpringFramework.game.GameRunner;

@SpringBootApplication
@ComponentScan("com.basic.learnSpringFramework")//By default it would scan this packages and its subpackages for components to create a singleton instance
//@ComponentScan({"com.package1","com.package2"})//This is for multiple packages , define it using an array
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(LearnSpringFrameworkApplication.class, args);//Returns application context
		/*
		 * GamingConsole game = new  PacmanGame();
		 * GameRunner runner= new
		 * GameRunner(game);//we want to run MarioGame in Gamerunner
		 */		
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		//for webcontroller
		MyWebController controller=context.getBean(MyWebController.class);
		System.out.println("         WEB\n"
				+ "         |\n"
				+ "         |\n"
				+ "         \\/\n"
				+ "      Business\n"
				+ "         |\n"
				+ "         |\n"
				+ "         \\/\n"
				+ "        Data\n"
				+ "         |\n"
				+ "         |\n"
				+ "         \\/\n"
				+ "         Database");
		System.out.println(controller.returnValueFromBusinessService());
		
	}

}
