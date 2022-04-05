package com.niyati.designpattern.behavioral.cor;

/*
The Chain Of Responsibility design pattern is a behavioral design pattern .

It can be said that it uses a chain of handlers i.e every object will have a particular behavior and this handler will handle that.

For example,there are 4 objects in which each can handle only one behavior  i.e either addition ,subtraction,multiplication or deletion.
In this we will be sending a command and 2 numbers.
When request is received and in that command is multiplication ,then it will first go through first handler i.e addition ,this handler will decide whether to process the request or pass it to the next handler i.e subtraction and as it is multiplication command it will pass on till it goes to multiplication object.

*/