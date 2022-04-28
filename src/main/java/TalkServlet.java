import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TalkServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		// TALKの入力情報を取得
		String talk = req.getParameter("talk");

		// モデル処理インスタンスを生成
		AnswerModelAbstract mod = new TalkModel();
		// セッションをモデルに設定
		mod.session = req.getSession();
		mod.createAnswer(talk);
		String renaAns = mod.getAnswer();

		req.setAttribute("answer", renaAns);

		req.getRequestDispatcher("index.jsp").forward(req, res);

	}
}
