public abstract class AnswerModelAbstract {

	/*
	 * 出力する答えを保持するフィールド
	 */
	public String answer;

	/*
	 * sessionを保持するフィールド
	 */
	// TODO sessionを保持するフィールドを定義すること

	/**
	 * フィールドの答えを取得するメソッド
	 */
	public String getAnswer(){
		return this.answer;
	}

	/**
	 * 入力値からレナちゃんが答える返事を生成するメソッド
	 */
	public abstract void createAnswer(String... input);
}
