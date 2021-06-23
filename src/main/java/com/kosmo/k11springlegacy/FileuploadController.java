package com.kosmo.k11springlegacy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileuploadController {

	// 서버의 물리적 경로 알아보기
	@RequestMapping("/fileUpload/uploadPath.do")
	public void uploadPath(HttpServletRequest req,
			HttpServletResponse resp) throws IOException{
		
		// request 객체를 통해 upload폴더의 물리적 경로를 얻어온다.
		String path = req.getSession().getServletContext().getRealPath("/resources/upload");
		
		// response객체를 통해 MIME타입을 설정한다.
		resp.setContentType("text/html; charset=utf-8");
		
		// View를 호출하지 않고 컨트롤러에서 내용을 즉시 출력한다.
		PrintWriter pw = resp.getWriter();
		pw.print("/upload 디렉토리의 물리적 경로 : "+path);
	}
	
}
