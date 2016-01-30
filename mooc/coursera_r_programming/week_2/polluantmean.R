pollutantmean <- function(directory, pollutant = "sulfate", id = 1:332) {

	# because files are named : 001.csv, 002.csv,...,010.csv, 100.csv...
  prefix <- function(x) {
    if (x < 10) {
      return('00')
    }
    if (x >= 10 && x < 100) {
      return('0')
    }
  }
  
  calculate_pollutant_column_id <- function(x) {
    if (pollutant == "sulfate") {
      return(2)
    }
    else
      return(3)
  }
  
  
  column_id <- calculate_pollutant_column_id(pollutant)
  y2 <- vector(mode = "numeric");
  for (x in id) {
    
    data = read.csv(
      file = paste(directory, "/", prefix(x), x, ".csv", sep = ""),
      header = TRUE, sep = ",", dec = "."
    )
    
    
    y2 <- c(y2, data[[column_id]][!is.na(data[[column_id]])])
    
  }
  print(round(mean(y2), digits = 3))
}
  #TESTS
 # pollutantmean("csv/specdata", "sulfate", 1:10)
  # 4.064
 # pollutantmean("csv/specdata", "nitrate", 70:72)
  # 1.706
  #pollutantmean("csv/specdata", "nitrate", 23)
  # [1] 1.281
  
  
