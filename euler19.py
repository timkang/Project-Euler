#How many Sundays fell on the first of the month in the twentieth century

import datetime

startday = datetime.date(1901,1,6)
endday = datetime.date(2000,12,31)
week = datetime.timedelta(7)
counter = 0

while startday < endday:
  if startday.weekday() == 6 and startday.day == 1:
    counter += 1
  startday = startday + week

print counter
  

