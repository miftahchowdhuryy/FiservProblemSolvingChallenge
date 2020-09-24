# FiservProblemSolvingChallenge

For this coding challenge, you will write and execute the following line of code in a java application:

MyObjectMapper.from(personalData).to(aggregateData);

This challenge will require you to write your own object mapper functionality to successfully execute the line of code above.

The object type of personalData and aggregateData are not the same, nor is one object a super class of the other. After this line of code has been executed, the data in the aggregateData object should be equal to the data in the personalData object for the parameters of the similar name.

Where `personalData` is a java object described by this json:
{
    "id": "12345",
    "name": "An old name",
    "address": "6 N Tejon St., Colorado Springs, CO, 80903"
 }

And ‘aggregateData’ is a java object described by this json:
{
    "id": "12345",
    "name": "An old name",
    "address 1": "6 N Tejon St.",
    "city": "Colorado Springs",
    "state": "CO",
    "zip": "80903"
  }

MyObjectMapper should not store either the personalData nor the aggregateData objects as either instance or static members.
Do not pre-populate the values for the AggregateData object instance.
You do not need to parse the example source json. The object’s values can be hard coded in your main method. Here’s an example of what your main method might look like:

PersonalData pd = new PersonalData(“12345”, “An Old Name”, "6 N Tejon St., Colorado Springs, CO, 80903”);
AggregateData agd = new AggregateData();
MyObjectMapper.from(pd).to(agd);
