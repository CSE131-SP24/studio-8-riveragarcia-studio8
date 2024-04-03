package studio8;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = choices;
	}
	
	public void displayPrompt() {
		super.displayPrompt();
		for (int i = 0; i < this.choices.length; i++) {
			System.out.println((i+1) + ". " + choices[i]);
		}
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
		
		String[] choices2 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		Question multipleChoice2 = new MultipleChoiceQuestion("What day is it?", "Wednesday", 2, choices2);
		multipleChoice2.displayPrompt();
		System.out.println(multipleChoice2.checkAnswer("Monday"));//wrong
		System.out.println(multipleChoice2.checkAnswer("Friday"));//wrong
		System.out.println(multipleChoice2.checkAnswer("Wednesday"));//right
	}

}
