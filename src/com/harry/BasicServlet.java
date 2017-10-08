package com.harry;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class BasicServlet
 */
@WebServlet(description = "서블릿 기본", urlPatterns = { "/BasicServlet" })
public class BasicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		System.out.println("success");
		
		//모바일에서 넘어온 값들을 호출하여 화면에 보여준다.
		System.out.println(request.getParameter("name"));

		//모바일로 어떤 값을 전달해해줄지 세팅
		//GSON을 이용하여 작업을 진행함.
		PrintWriter out = response.getWriter();
		Gson gson = new Gson();
		TestCreator intro = new TestCreator("홍길동", 30);
		String result = gson.toJson(intro);

		System.out.println(result);

		out.print(result.toString());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
