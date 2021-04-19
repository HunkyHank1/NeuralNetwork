# NeuralNetwork
This is a non-distinct neural network. You will enter your data into a file
and then design the neuron layers within the network class.

To run the file, use the driver. If it returns an error, it is because there is not
weigtings. The weightings will be made in the training class.

The training class has yet to be made, but here is how it will work.
A set of random number sets will be decided. For each random number set,
we will move the numbers within the set in each possible direction.
If the number set resutls in a product closer to the outcome of the training
data, then it will set that as the newest number set. That number set will
go over the same process until it reaches the best values. The reason that we
need multiple data sets is because sometimes we can have a false maximum
where we reach a peak, but it is not the best set of numbers possible.
