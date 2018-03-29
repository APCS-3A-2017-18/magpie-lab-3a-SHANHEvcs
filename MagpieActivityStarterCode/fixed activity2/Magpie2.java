public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		String statementTrim = statement.trim();
		
		if (statement.indexOf("no") >= 0){
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0 || statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0){
			response = "Tell me more about your family.";
		} else if (statement.indexOf("Germany") >= 0 || statement.indexOf("Germany") >= 0){
			response = "I used to live in Italy. We have pretty girls here";
		} else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0 || statement.indexOf("pet") >= 0 || statement.indexOf("snake") >= 0){
			response = "I also had some pets. But my Dog died 1 year ago.";
		} else if (statement.indexOf("Germany") >= 0 || statement.indexOf("Germany") >= 0){
			response = "I used to live in Italy. We have pretty girls here";
		} else if (statement.indexOf("Mr") >= 0 || statement.indexOf("Mr.") >= 0){
			response = "Oh Wait I also had him as my teacher!!";
		} else if (statement.indexOf("Mrs") >= 0 || statement.indexOf("Mrs.") >= 0) {
			response = "Wait!!!! I also had her as my teacher.";
		} else if ((statement.indexOf("I") >= 0 || statement.indexOf("i") >= 0 )&& statement.indexOf("think") >= 0){
			response = "Amen. LMAO";
		} else if (!(statementTrim.length() >= 1)){
			response = "You Serious Bro?";
		} else if (statement.indexOf("food") >= 0){
			response = "My favorite food is Korean BBQ!!!!!! LOVE THEM SO MUCH!!!!!!!!!!!!!!!!!!!!!<3<3";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0){
			response = "WOWOWOWOWWOW!!!!";
		} else if (whichResponse == 1){
			response = "You Smart Man";
		} else if (whichResponse == 2){
			response = "But Why....?";
		} else if (whichResponse == 3){
			response = "You don't say that to the Robots";
		} else if (whichResponse == 4){
			response = "Bra, Your Boned";
		} else if (whichResponse == 5){
			response = "LAMO you are a funny guy. :)))";
		}

		return response;
	}
}
