package tomo.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tomo.app.dept.service.DeptService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private DeptService deptService;
	
	public void printUserName() {
		String username = "Ruby";
		System.out.println( String.format("My name is %s.", username) );
		
		deptService.printDeptName(username);
	}

}
