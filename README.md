
# Student Performance Report System

## Overview

This Java application is a comprehensive student performance management system that collects student academic data, computes results, and generates a formatted performance report with detailed statistics.

## Features

### 1. School Details Input

- School Name
- Teacher Name
- Grade
- Year

### 2. Student Records Management

- Supports minimum of 12 students
- Collects data for 6 subjects per student:
  - English
  - Maths
  - History
  - Geography
  - Science
  - Programming

### 3. Automatic Calculations

- **Total Marks:** Sum of all 6 subjects (maximum 600 points)
- **Grade/Rank Assignment:** Based on predefined grading system
- **Class Statistics:**
  - Total marks for each subject
  - Average marks for each subject
  - Overall class performance

### 4. Grade Distribution Analysis

- Counts total number of students per grade category
- Displays distribution of A, B, C, D, and F grades

## Grading System

| Total Marks | Grade |
| ----------- | ----- |
| ≥ 540.0     | A     |
| ≥ 480.0     | B     |
| ≥ 420.0     | C     |
| ≥ 360.0     | D     |
| < 360.0     | F     |

## Usage Instructions

### 1. Enter School Information

- Input school name, teacher name, grade, and year when prompted

### 2. Specify Number of Students

- Enter the number of students (minimum 12)
- System will prompt again if less than 12

### 3. Input Student Data

For each student, enter:

- Student name
- Marks for all 6 subjects:
  - English
  - Maths
  - History
  - Geography
  - Science
  - Programming

### 4. View Generated Report

The system automatically calculates and displays:

- Individual student performance with total marks and grades
- Class statistics (totals and averages)
- Grade distribution summary

## Technical Details

### Data Structures Used

- **Arrays:** Store student names, subject marks, total marks, and grades
- **Scanner:** Handle user input
- **Loops:** Process multiple students and calculate statistics
- **Control Statements:** Assign grades based on conditions

### Key Methods

- Input validation (minimum 12 students)
- Grade calculation based on total marks
- Statistical analysis (totals and averages)
- Formatted output using tab spacing

## Assignment Requirements Met

- **Task 1:** Input School Details (Using Scanner)
- **Task 2:** Input Student Records (Arrays Required for minimum 12 students)
- **Task 3:** Compute Results (Loops + Control Statements for Total Marks and Rank/Grade)
- **Task 4:** Compute Class Statistics
- **Task 5:** Output Format (Matches Sample Provided)
- **Bonus:** Grade Distribution Analysis

## Author Notes

This program demonstrates:

- Proper use of arrays for data management
- Loop structures for iterative processing
- Conditional logic for grade assignment
- Formatted output for professional reporting
- Input validation and error handling
