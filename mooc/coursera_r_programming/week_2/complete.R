complete <- function(directory, id = 1:332) {
  
  # because files are named : 001.csv, 002.csv,...,010.csv, 100.csv...
  prefix <- function(x) {
    if (x < 10) {
      return('00')
    }
    if (x >= 10 && x < 100) {
      return('0')
    }
  }
  result <- vector(mode = "integer")
  for(x in id) {
    data = read.csv(
      file = paste(directory, "/", prefix(x), x, ".csv", sep = ""),
      header = TRUE, sep = ",", dec = "."
    )
    count <- 0;
      for(y in 1:dim(data)[1]) {
        row <- data[y,]
        if((!is.na(row[2])) && (!is.na(row[3]))) {
          count = count +1;
        }
      }
    result <- c(result,count)
    
  }
  
  frame_result <- data.frame(id = id, nobs = result)
  return(frame_result)
  
}

#Tests
# complete("specdata", 1)
##   id nobs
## 1  1  117

#complete("specdata", c(2, 4, 8, 10, 12))
##   id nobs
## 1  2 1041
## 2  4  474
## 3  8  192
## 4 10  148
## 5 12   96
# complete("specdata", 30:25)
##   id nobs
## 1 30  932
## 2 29  711
## 3 28  475
## 4 27  338
## 5 26  586
## 6 25  463
# complete("specdata", 3)
##   id nobs
## 1  3  243
