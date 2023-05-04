# SaintAmbroseExperience
Projects and programs I have created while being a student at St. Ambrose University.
//
This is a generic heap I created using the heap interface my teacher provided. It takes in any type and puts the
items with the smallest priority first into the heap. With the next biggest going next, and so on. 
I created three comparators to use this heap.
The first is a string comparator, that puts the smallest strings first. If two strings are the same size it the
string that comes first in reverse alphabetical order has the higher priority.
The second is an integer comparator. It puts even integers as the highest priority and then, the smaller evens have
the higher priority in the heap.
The third is another integer comparator. This one puts odd integers as a higher priority, with the smaller numbers 
being given the higher priority as well. The evens come next, with the larger numbers having higher priority in this
comparator.
