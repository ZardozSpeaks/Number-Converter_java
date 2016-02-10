import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;
import java.util.ArrayList;

public class Numbers {
  public static void main(String[] args) {

}
    public String lessThanThousand(int number){
      String[] lowNum = {
        "",
       " one",
       " two",
       " three",
       " four",
       " five",
       " six",
       " seven",
       " eight",
       " nine",
       " ten",
       " eleven",
       " twelve",
       " thirteen",
       " fourteen",
       " fifteen",
       " sixteen",
       " seventeen",
       " eighteen",
       " nineteen"
     };

     String[] tenNum = {
       "",
       " ten",
       " twenty",
       " thirty",
       " fourty",
       " fifty",
       " sixty",
       " seventy",
       " eighty",
       " ninety"
   };
      String wordTotal = "";
      if(number > 999) {
        number.lessThanHundredThousand;
      else if(number % 100 < 20){
        wordTotal = lowNum[number % 100];
        number /= 100;
      } else {
        wordTotal = lowNum[number % 10];
        number /= 10;

        wordTotal = tenNum[number % 10] + wordTotal;
        number /= 10;
      } if (number == 0) {
        return wordTotal;
      }
        return (lowNum[number] + " hundred" + wordTotal).toString();

    }

  public String lessThanHundredThousand(int number){
    if((number % 100000 / 1000) < 20){
      wordTotal = lowNum[(number % 100000 /1000)];
      number /= 100000;
    } else {
      wordTotal = lowNum[(number % 10000 / 1000];
      number /= 10000;

      wordTotal = tenNum[(number % 10000 / 1000)] + wordTotal;
      number /= 1000;
    } if (number == 0) {
      return wordTotal;
    }
      return (lowNum[number] + " thousand" + wordTotal).toString();
  }

  }

}
