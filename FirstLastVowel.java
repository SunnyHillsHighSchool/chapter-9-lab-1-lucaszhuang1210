//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Lucas Zhuang
//Date - 1/5/2021


public class FirstLastVowel
{
   public static String go( String a )
 {
      String first = a.charAt(0);
      String last = a.charAt(a.length-1);
      if(first == "a"||first == "e"||first == "i"||first == "o"||first == "u"||first == "A"||first == "E"||first == "I"||first == "O"||first == "U")
      {
         return "yes";
      }else if(last == "a"||last == "e"||last == "i"||last == "o"||last == "u"||last == "A"||last == "E"||last == "I"||last == "O"||last == "U"){
         return "yes";
      }
      return no;
 }
}
