package tomo.config;

import tomo.app.user.service.UserService;

public class MainApp {

	private static UserService userService = ContextLoader.getContext().getBean(UserService.class);
	
	public static void main(String[] args) {
		System.out.println("[--------- main start! ----------]");
		userService.printUserName();
		System.out.println("[---------- main end! -----------]");
	}

}
