// converting time into minutes 
// see more on google ->https://www.inchcalculator.com/time-to-minutes-calculator/

public int getTime(String s){  // this fn convert  HH:MM:SS to total minutes.
         
        char[] time = s.toCharArray();
         
        int h = (time[0] - '0') * 10 + (time[1] - '0');  // hour ko ala kiye hai
        int m = (time[2] - '0') * 10 + (time[3] - '0');  //  minute ko ala kiye hai.
         
        return h*60 + m;
    }
