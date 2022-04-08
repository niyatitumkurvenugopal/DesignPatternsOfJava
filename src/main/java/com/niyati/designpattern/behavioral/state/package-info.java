package com.niyati.designpattern.behavioral.state;

/*
It is a behavioralDesign Pattern.

It allows the object for changing its behavior without changing its class.
For example , Delivery of a package.It will change its behavior for  every next state.
As we've been changing the state of our context i.e Package in this case, the behavior was changing but the class remains the same.
This uses 2 solid principles .
One is Single Responsibility Principle(SRP),this means every class should have single responsibility or a function.
Second is Open and close Principle.It means class should be open for extension and closed for modification.
In this it will be open for extension of behavior( in this example different states) but without modifying the source code.
*/