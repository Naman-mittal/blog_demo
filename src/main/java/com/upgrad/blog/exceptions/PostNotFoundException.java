package com.upgrad.blog.exceptions;

/**
 * TODO: 3.5. Convert this class to a custom Exception class.
 * TODO: 3.6. Provide a constructor which accepts a custom message as input
 * parameter and passes it to its base class.
 */
public class PostNotFoundException extends Exception{
    public PostNotFoundException (String getMessage){

        super(getMessage);
    }
	//*****************START*****************Solution 3.5 + 3.6*****************

    //*****************END*****************Solution 3.5 + 3.6*****************
    
    public static void main(String[] args) {
		try {
			throw new PostNotFoundException("Custom Message");
		} catch (PostNotFoundException e) {
			System.out.println(e.getMessage());
		}

		/**
		 * Your output should look like this.
		 * Custom Message
		 */
	}
}
