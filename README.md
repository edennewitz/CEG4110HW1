# CEG-4110 HW1 (Simple Coloring App)
The point of this app was to create to allow users to enter text and then change the color of the text. The color of the text is changed by randomly generating a rbg color value each time the button is pressed and then setting the text color to generated value.

## Deployment instructions
This app is intended for and programmed for android devices. In order to deploy the app download the apk file,then move the apk file from the computer to the desired android device. After the file is on the device install the file and launch the app.


## Simple instruction
Below are three screenshots of what you can expect to see when the app is launched, as well it's functionality. The first screenshot show the default screen that will show when the app is launched. The second show that the user is able to change the the text in the top text box. Finally the last screenshots show that when the button is pressed, the text color will change to a random color. That current color of the text is displayed below the text with the corresponding rgb values and html color code. 

#### Default Start Screen 

![start_screen](https://user-images.githubusercontent.com/14102119/45726682-532cdf80-bb8e-11e8-9503-011f35d9ca6d.png)

#### User can change the text

![type_words](https://user-images.githubusercontent.com/14102119/45726737-8a02f580-bb8e-11e8-9124-5059b9d318c9.png)

#### Text color is changed and values displayed

![text_color_change](https://user-images.githubusercontent.com/14102119/45726735-88d1c880-bb8e-11e8-955a-c5f29384a0bd.png)

## Project Design
### UI
- The default text in the top text box is there to give a simple instruction to the user of what to do when they use the app. The user though is allowed to change the default text in the box so I added a label to the button as a reminder to the user what the button is used for.
- All the components are held in place by adding layout contraints lines that are connected to the borders of the screen. 
> The rationale for this is with out the constriants all of the components kept default to the top left corner of the screen.
- I added a second text box to the middle of the screen in order to have an output for the random color value that was being generated every time that the user presses the button.
- All of the components are given unique tags in order to be able to access the specific component when adding functionality or altering them in someway. I am aware that giving components ids is essential in any app but it was something I had to look up and learn so for this app in particular I am including it in the design.

### Class
- This app only utilises a MainActivity class. Within the class there are two override funtctions being used in order to run the app. 
- The first overridden function is the onCreate. Within this override all of the components are linked to corresponding variable by their unique id so that the components can be modified. 
- The second overriden function is the onClick function that is used change the color of the text whenever the button is "clicked". The color is determined by creating three int values for red, green, and blue, then calling a Random.nextInt function with a range of 0-255. The three random values are then fed into an int variable for color and a Color.rgb call is made to create the randomized color. Finally the text color is set to the random color as well as output to the user in html color value format. 
- This app is also able to change the background of the app to a random color it is currently commented out because I realised that I misread the instructions and it was the text that was supposed to be the compnent being changed. 
