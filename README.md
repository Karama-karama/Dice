# Dice
Let's play dice! The traditional die is a cube. Each of its six faces shows a different number of dots from 1 to 6. Dice are used to produce results from 1 through 6. When a die is thrown (or rolled) and the die comes to rest, the face of the die that is uppermost provides the value of the throw. If an unbiased die is thrown, each value from 1 to 6 is equally likely.

Your programming task is related to the analysis of sequences produced by rolling a die.

Create a program named Dice to solve the following exercises. The input of the program is a so-called trial, i.e. a sequence of the rolled results. This input must be read from the standard input. The first line of the input contains a single integer N, indicating the number of throws \left(1\le N\:\le1000000\right). The second line of the input contains exactly N characters, each character is a digit from 1 to 6. For example, the input can be as follows:

8
32646135
The output of the program should be written to the standard output. There are 3 exercises you are expected to solve. The output should contain exactly 3 lines: the ith line in the output is the solution to exercise i.

--------------------------------------------------------------------------------
<hr>
<h3>Exercises</h3>
<h4>Exercise 1</h4>
How many times did it occur in the trial, that exactly two 6s were rolled after each other? For example, in sequence 56611166626634416 it occurred twice, that exactly two 6s were thrown after each other.

<h4>Exercise 2</h4>
Find the length of the longest subsequence of successive rolls, in which the value 6 does not occur. (This number can be zero, if only 6s were thrown.) For example, in the trial 66423612345654 the longest subsequence of successive rolls in which the value 6 does not occur is 12345. Its length is 5. 

<h4>Exercise 3</h4>
We shall call a sequence of successive rolls in the trial a lucky series, if the sequence contains only 5s and 6s. For example 6556665 is a lucky series, with a length of 7.
Find out, which is the most frequent length for lucky series. If there are more than one "most frequent" lucky series lengths, print the longest. If there are no lucky series in the trial, print zero.

Be aware. We are not interested in the most frequent lucky series. The four lucky series 656, 555, 556 and 666 are equivalent for us, all of them are lucky series of length three. We are looking for the most frequent length of lucky series.

For example, in trial 5533661656, the series 656 is the longest lucky series. But there is only one lucky series of lenght three in the trial. 55 and 66 are also lucky series. This is why the correct answer is 2. In trial 456116513656124566 both the lucky series with length of 2 and 3 occur twice, there is a tie between them. Now the length of the longest (that is 3) should be printed. Examples example1 and example2 are aimed to make this situation clear. 

--------------------------------------------------------------------------------
<hr>
<h3>Examples</h3>
<h4>We provide three simple examples to clarify the exercises. Test your solution with other, larger examples as well!</h4>

<ul> <h5>Example 1 </h5>
Sample input:

<li>9</li>
<li>616161666</li>
Sample output:

<li>0</li>
<li>1</li>
<li>1</li>
</ul>
<ul> <h5>Example 2 </h5>
Sample input:

<li>18</li>
<li>456116513656124566</li>
Sample output:

<li>1</li>
<li>4</li>
<li>3</li>
</ul>
<ul> <h5>Example 3 </h5>
Sample input:

<li>17</li>
<li>56611166626634416</li>
Sample output:

<li>2</li>
<li>4</li>
<li>3</li>
