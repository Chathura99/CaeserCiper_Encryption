
object q3 extends App{
    def wholeSaleCost(x:Int):Double={
          if(x<50){
                    24.95*(60/100)+3
                        } else{
                                  24.95*(60/100)+3+(x-50)*0.75;
                                      }
                                        
                                        }
      println(wholeSaleCost(60));
}
