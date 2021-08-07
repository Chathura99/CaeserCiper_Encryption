import scala.io.StdIn.readInt
object caesarCiper {
    def main(arg: Array[String]){
      val alphebet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
      val encrypt=(c:Char,key:Int,a:String)=>
           a((a.indexOf(c.toUpper)+key)%a.size)
      val decrypt=(c:Char,key:Int,a:String)=>
           a((a.indexOf(c.toUpper)-key)%a.size)
      val ciper=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
      while(true){
        println("\nSelect Option : \n1.Encryption\n2.Decryption")
        val op = readInt()
        val n = readLine("Enter message to encrypt : ");
          op match{
            case 1=>println("encrypted msg is : "+ciper(encrypt,n,1,alphebet))
            case 2=>println("decrypted msg is : "+ciper(decrypt,n,1,alphebet))
          }
      }
    }  
}
