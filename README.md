# Simple-Grade-Calculator
Project: Simple Grade Calculator
Objective:
Create a simple grade calculator that processes a list of student scores and determines their grades based on predefined criteria. The program will calculate the average score, determine the highest and lowest scores, and assign a grade (A, B, C, D, or F) to each student based on their score.

Components:
Input Data:

An array or list of student scores (e.g., integers between 0 and 100).
Processing:

Use a for loop to iterate through the list of scores.
For each score:
Use if and else statements to determine the grade:
If the score is 90 or above, assign an 'A'.
If the score is 80-89, assign a 'B'.
If the score is 70-79, assign a 'C'.
If the score is 60-69, assign a 'D'.
If the score is below 60, assign an 'F'.
Track the highest and lowest scores using additional if statements within the loop.
Calculate the sum of all scores to determine the average.
Output Data:

Display each student's score along with the assigned grade.
Display the highest and lowest scores.
Display the average score of the class.
Example Flow:
Input:

A list of scores: [85, 92, 78, 64, 55]
Processing:

Iterate through the list and determine grades:
85 → B
92 → A
78 → C
64 → D
55 → F
Determine the highest score (92) and the lowest score (55).
Calculate the average score (74.8).
Output:

Display: "Student 1: 85, Grade: B"
Display: "Student 2: 92, Grade: A"
Display: "Student 3: 78, Grade: C"
Display: "Student 4: 64, Grade: D"
Display: "Student 5: 55, Grade: F"
Display the highest score: "Highest Score: 92"
Display the lowest score: "Lowest Score: 55"
Display the average score: "Class Average: 74.8"
Key Concepts:
For Loop: Iterates through the list of scores.
If-Else Statements: Used to determine grades and track the highest and lowest scores.
Basic Arithmetic Operations: To calculate the sum, average, highest, and lowest scores.
This project provides a straightforward way to practice using loops and conditional statements in Java while also reinforcing basic programming concepts like arrays, arithmetic operations, and user output.
