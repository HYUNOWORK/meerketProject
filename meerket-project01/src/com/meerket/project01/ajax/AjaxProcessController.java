package com.meerket.project01.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meerket.project01.service.MemberService;

@Controller
public class AjaxProcessController {
	@Autowired

	private MemberService memberService;

//	
	
	@RequestMapping("/passCheck.ajax")
	@ResponseBody
	public Map<String, Boolean> memberPassCheck(String userId, String pass) {
		
		boolean result = memberService.memberPassCheck(userId, pass);
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("result", result);
		
		/*
		 \ MappingJackson2HttpMessageConverter�� ���ؼ� Map ��ü�� �Ʒ��� ���� json �������� ��ȯ�ȴ�. 
		 {"result": 0} �Ǵ� {"result": 2}*/
		
		
		return map;
	}
}