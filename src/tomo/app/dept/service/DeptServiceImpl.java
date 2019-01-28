package tomo.app.dept.service;

import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
	
	public void printDeptName(String username) {
		System.out.println(username + "'s dept name is tomo1.");
	}
	
}
