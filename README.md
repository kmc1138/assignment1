Testing time complexity for three algorithms:

Merge Sort: Time complexity = O(n*logn); this algorithm works by dividing a set of numbers in two and sorting, then merging the two lists back together. This complexity applies to best average, and worst case scenarios as evidenced by four separate sorts of 50 random integers with time results of 1113588, 1120938, 1188065, and 1209719 nanoseconds.

Quick Sort: Time complexity = O(n*logn) or O(n^2); this algorithm also works by dividing in two, but if a poor pivot is chosen the algorithm changes from quasi linear time (O(n*logn) to quadratic time (On^2). I cannot demonstrate this because I cannot figure out how to get the unsorted list to print.

Selection Sort: Time complexity = O(n^2); this algorithm sorts in quadratic for best, average, and worst case scenarios as evidenced by running four trails, each with one array of five random integers and one array of 50 random integers. The tests were 446197/1164561, 476259/1133357, 438016/1173334, and 475590/1124683 nanoseconds.

I found a function that counted operations but I didn't fully understand it so I didn't want to include it in the assignment.