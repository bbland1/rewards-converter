# :airplane: Credit Rewards Converter :airplane:
This is the project repo for the JPMC Software Engineering Lite Program created with [Forage](https://www.forage.com/).

## Initial task

When noticing that the converter class was not funcitoning and throwing errors the team figures out the RewardValue class is missing and I'm tasked in implementing the class so that the converter works. After which tests using JUnit needed to be added as a second task.

## My approach to the task

I reviewed what the converter was set up to do. At the core for the current CLI setup it asks a user for an input of the cash value they have and converts that to the miles, so knowing what it was suppose to do I set up the RewardValue class.

The class was suppose to have two contrusctors to handle if the input is the cash value that will be converted to miles or the miles value that will be converted to cash. So I started with understanding that the class needed to hold what the cash value was in general and it would be nice to have a constant that held the conversion rate so if it ever changed it only needs to be done in one place.

After that I built the two methods for getting the cash or miles value because I know they should be simple and basically just return the values we had already established. Because we need to be able to conver back and forth essentially between cash and miles I figured having two methods to do it would be best because we have one coversion rate so the math to covert should just the opposite operations of each other.

I ended create the class with googling what things like static, public, private, and other java specific syntax and ideas mean but I knew that not everything in the class was needed by every call of the class or maybe would be needed in various places. That is were a lot of commenting (note taking) came in to try to really gather what I was doing as my first java class.

The final step was to create 2 additional tests using JUnit to the test file that confirmed that the conversion logic that I wrote works as it should. This was pretty similar to writing unittest in python and TypeScript and I was able to use the previous tests as a template.

## Thoughts after completing virtual experience

I have wanted to do somthing that allows me to write java past very basic tutorials since it is not a language I started with or have used much, and this was a lite 😄 way to get some started experience and use the knowledge I have from using TypeScript, JavaScript, and Python to figure out how to get this code to work and using google to determine syntax or things I was unsure of. I enjoyed working with java and would do it again.
