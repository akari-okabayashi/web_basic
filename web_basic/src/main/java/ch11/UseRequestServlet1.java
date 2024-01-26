package ch11;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseRequestServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		//リクエストスコープへの登録
		request.setAttribute("bookTitle", "JSP/サーブレットの本");
		request.getRequestDispatcher("/view/ch11/useRequest1.jsp").forward(request, response);
	}
}