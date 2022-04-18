package com.example.demo;

import com.example.demo.factory.ShowResultStringFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() throws Exception {
		ResultStringClass delteClass= ShowResultStringFactory.getString("delete");
		delteClass.showResultSting("acccaabbbdye");
		System.out.println(delteClass);
		ResultStringClass replaceClass= ShowResultStringFactory.getString("replace");
		replaceClass.showResultSting("zdddyyyaaazzk");
		System.out.println(replaceClass);
		ResultStringClass errorClass= ShowResultStringFactory.getString("");
		replaceClass.showResultSting("1231231");
		System.out.println(errorClass);


	}



}
