package info.questions.TrickList;

public class Trick004 extends Question {

	@Override
	public int getAnswerType() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void generateQuestion() {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*9000)+1000;
		int b = (int)(Math.random()*9000)+1000;
		String c = a + " + " + b;
		String d = (a+b)+""; 
		setQuestion(c);
		setAnswer(d);
	}

}
