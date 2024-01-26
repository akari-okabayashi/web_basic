package ex01;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MathRequestServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		//Userオブジェクトの生成
		Math math = new Math();

		//リクエストスコープへのMathオブジェクトの登録
		request.setAttribute("RequestNum", math);
		request.getRequestDispatcher("/view/ex01/useMath1.jsp").forward(request, response);
	}
}