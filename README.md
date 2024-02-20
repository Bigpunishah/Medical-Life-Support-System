## Getting Started
By Vikel Cunningham

LifeSupportSystem.java - is the main file to launch for the application to run.


List of BUGS: 

#1 : In the model classes such as Patient.java & MedicalEmployee.java have a bug when it comes to using Scanner: sc.nextInt() around other print
statements that use ... = sc.nextLine(). Was able to fix when moving the `age = sc.nextInt()` to the bottom of the list of print statements. I moved back to the position of error because the flow I want the user to enter their age is around the first couple of questions.

#2 : First found in the MeidicalDevice.java where the use of pauses in the code. I am referring to `Thread.sleep(0)`  where originally I used `wait.(0)` but ran into an error. I then realized that that was the wrong function to get the code to pause. 

#3 : In Patient.java the findByName method is not properly working by taking the user input. `FIXED -` adding another sc.nextLine() method was able to create compatability. This could also be implemented in the newPatient method explained in BUG #1.



This is a life support system that allows you to keep a patient alive.
