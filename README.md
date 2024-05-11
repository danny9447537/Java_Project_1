Danny Ken
Software Development 1
202430-CEN-3024C-31950

**A description of the project you uploaded and what does the project do?**
This program essentially plays around with getters, setters, constructors, and user input to provide given information
for each vehicle object created for the vehicle class. The access modifier for the vehicle class properties is set to private
so that the initial values can't be tampered with. This is one good example of encapsulation, one of the four principles
of object-oriented programming.

The first vehicle created will display the hard coded values for vehicle 1

The second vehicle object created will display values taken in from the scnr object and then set the values for the
constructor that was created for vehicle 2.

The third vehicle object created will display values taken in from the scnr object and then set the values for the
constructor that was created for vehicle 2.

**What important programming concepts or tools were employed with this assignment?**
This project experimented with inheritance and encapsulation. As you read through the code, you'll note that encapsulation is used using private access modifiers for vehicle class properties. The reason for this is to prevent tampering with the initial values when in use. I could have gone one step further and written a value checking for the setter method, but I kept it as is to demonstrate the concept.

Furthermore, with inheritance, you can see that every vehicle object inherits the base characteristics from the vehicle class, as demonstrated by year, miles, mpg, and make. 

**What are the expected inputs and outputs of the application?**
The desired input is to pass user data through the scnr object and set the values for vehicle objects 2 and 3, which will be displayed in the terminal. Vehicle object 1, which was constructed and automatically output to the screen, is just one sample of the data that will be displayed once user input is received. 
