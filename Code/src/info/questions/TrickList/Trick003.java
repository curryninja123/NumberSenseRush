package info.questions.TrickList;

public class Trick003 extends Question {

	@Override
	public int getAnswerType() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void generateQuestion() {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*14)+1;
		int b = (int)(Math.random()*4)+1;
		int c = a*10+b;
		int d = (a+1)*10-b;
		String e = c + " x " + d;
		String f = c*d+"";
		setQuestion(e);
		setAnswer(f);
	}

}
