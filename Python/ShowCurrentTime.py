import time

currentTime = time.time() # Get current time

# Obtain the total seconds since midnight, Jan 1, 1970
totalSeconds = int(currentTime)

# Get the current second
currentSecond = totalSeconds % 60

# Obtain the total minutes
totalMinutes = totalSeconds // 60

# Compute the current minute in the huor
currentMinute = totalMinutes % 60

# Obtain the total huors
totalHours = totalMinutes // 60

#Compute the current huor
currentHour = totalHours % 24

# Disply results
print("Current time is", currentHour, ":", currentMinute, ":", currentSecond, "GMT")