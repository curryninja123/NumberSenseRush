package info.questions.TrickList;

public abstract class Question 
{
	private String question;
	private String answer;
	public String toString()
	{
		return question;
	}
	public String getAnswer()
	{
		return answer;
	}
	public boolean correct(String a)
	{
		return a.equals(answer);
	}
	public abstract int getAnswerType();
	public abstract void generateQuestion();
	public Question ()
	{
		generateQuestion();
	}
	protected void setQuestion(String str)
	{
		question = str;
	}
	protected void setAnswer(String str)
	{
		answer = str;
	}
}
