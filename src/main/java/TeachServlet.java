import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TeachServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		// TEACHの入力情報を取得
		String question = req.getParameter("question");
		String teachAnswer = req.getParameter("answer");

		// モデル処理インスタンスを生成
		AnswerModelAbstract mod = new TeachModel();
		mod.session = req.getSession();
		mod.createAnswer(question, teachAnswer);
		String renaAns = mod.getAnswer();

		req.setAttribute("answer", renaAns);

		req.getRequestDispatcher("index.jsp").forward(req, res);

	}
}
