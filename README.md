# CanditoTrainingHQ
An Android application for a specific powerlifter's program. 


This application is an exercise based app where the user will put in their 1 rep max (1RM) in the bench, deadlift, and squat.There are also accessory exercise in the routines which need to be taken into account. Most of the programs are around 6 weeks but some are variable which is why ArrayLists are being used because they are more mutable than arrays. I've contacted the maker of the programs, Jonnie Candito to give me his formulas to calculate the weights so that we don't have to work backwards. I'm still waiting on a response. The most time consuming aspect of this will be the GUI and producing a graphical display of progress made through cycles. We will be implementing 3 programs for now but 2 more will be released in the near future.

Class Hierarchy and explanation:
CreateProgram , FAQ , MyActivity, Program, and Progress are currently homepage buttons with the basic Android button.

Person: This holds the details of the person, name, age, etc as well as their max lifts and goals.
Routine: Superclass of LinearRoutine, SixWeekRoutine, and BenchRoutine, holds the ArrayList<ArrayList<exercises>>
LinearRoutine: This is the most basic program that Jonnie and we won't really have to worry about %s but it has 3 different types. It's a superclass to LinearControl, LinearHypertrophy, and LinearPower.
SixWeekRoutine: A six week program where the weights are calculated all using 1RM, many accessory lifts in this program which is going to be the harder part to program it so that it's mutable for the user.
Exercise: A single exercise to be performed that has minReps, reps, minWeight, weight, minSets, and sets. minReps, minWeight, and minSets are used for when the lifter has to use ranges. For example: The lifter needs to lift 4-8 reps at 5-10 sets. minReps would be 4 and reps would be 8. If you guys have a better idea of how to implement ranges, let me know. If there is no range, the min variables will be 0.
LinearControl, LinearHypertrophy, LinearPower are all programs with a similar scheme.

Hierarchy:
					                Routine
				    _______________|_________________
				    |    	         |                |
				SixWeekRoutine	LinearRoutine  BenchRoutine
			     ________________|_________________	
			     |		           |		             |
		  LinearControl   LinearPower     LinearHypertrophy


Download and mess around with the excel sheets on his website here: http://www.canditotraininghq.com/free-strength-programs/
The Linear program doesn't have an excel sheet so just read the pdf for an explanation.
