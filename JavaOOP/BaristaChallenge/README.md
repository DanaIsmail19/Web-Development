Now that you have made the Order and Item classes, and the data is better organized and easier to manipulate, we're going to refactor your business logic even further to be able to perform the some of that simulated functionality inside of the Order class by adding methods, constructors, setters and getters. 

Since we'll be doing the same sorts of actions with every order, we can define methods within the Order class that will work on any order, with distinct customer names, items and totals. Each time a method gets called, it will manipulate only the data stored for that particular order.
