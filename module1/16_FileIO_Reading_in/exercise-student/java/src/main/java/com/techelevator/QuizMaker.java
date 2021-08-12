package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the fully qualified name of the file to read in for quiz questions");

		String fileName = scanner.nextLine();
		File quizFile = new File(fileName);
		quizList(quizFile);

	}

	public static void quizList(File quizFile){
		try(Scanner input = new Scanner(quizFile)){

			int score = 0;
			while(input.hasNextLine()){
				String line = input.nextLine();
				String[] quiz = line.split("\\|");

				int correctAnswer = 0;
				for(int i = 0; i < quiz.length; i++){

					if(i == 0){
						System.out.println(quiz[i]);
					}else{
						String answer = quiz[i];
						if(answer.contains("*")){
							answer = answer.substring(0, answer.length() - 1);
							correctAnswer = i;
						}
						System.out.println(i + ". " + answer);
					}
				}
				System.out.println();

				System.out.print("Your answer: ");
				int userAns = Integer.parseInt(scanner.nextLine());

				if(userAns == correctAnswer){
					System.out.println("RIGHT!");
					score++;
				}else{
					System.out.println("WRONG!");
				}
				System.out.println();
			}
			System.out.println("You got "+ score +" answer(s) correct out of the 2 questions asked.");
		}catch(FileNotFoundException ex){
			System.out.println(quizFile + " :Not Found");
		}
	}
}
