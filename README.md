# Parrondo Paradox in Java
In 1999, the spanish physicist Juan Parrondo unveiled how two games with a high probability of losing a bid, if playing alternatively, first game A and then game B, could asure having benefits in the long term.

Imagine two gambling games with biased coins.

### Game A
Each time the coin flips, the probability is Probability of wining is equal to `0.5 - X`.  
``Pa= 0.5-x``  
If the player wins Game A, he will get a coin, otherwise, he will lose a coin.

### Game B
In the game B, we will see the earning of the previous round (game A). If the earning is not a multiple of 3, the probability of the new biased coin will be:
`Pb1=(3/4)-x`  
And if it's true, player will flip another unfair coin the probability of:
`Pb2=(1/10)-x.`  
Again, if the player wins the round, he will get a coin. If not, he will lose a coin.

If the player plays only game A, with x=0.005, the loss in future games is asured.
If the player alternates between game A and B. Even if the probability of wining each game is low, the winnings in a long term are assured.  
