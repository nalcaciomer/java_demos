public class Main {
    public static void main(String[] args) {

        String message = "       Bugün hava çok güzel.      ";
        System.out.println(message);

        System.out.println("Eleman sayısı: " + message.length());
        System.out.println("5.eleman: " + message.charAt(4)); // charAt(index) -> indexteki elemanı döndürür.
        System.out.println(message.concat(" Yaşasın!")); // concat(string) -> message ile string i birleştirir. Message
                                                         // değişkeninin değeri değişmez.
        System.out.println(message.startsWith("B")); // startsWith(prefix) -> prefix ile başlıyorsa true başlamıyorsa
                                                     // false döndürür.
        System.out.println(message.endsWith("."));// endsWith(suffix) -> suffix ile bitiyorsa true bitmiyorsa false
                                                  // döndürür.
        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0); // getChars(srcBegin, srcEnd, dst, dstBegin) ->
        // message değerinden belirlenen karakter aralığını döndürür.
        // srcEnd dahil değil
        System.out.println(characters);
        System.out.println(message.indexOf('a')); // indexOf(char) or index(string) -> message içinde eşleşen ilk indexi
                                                  // döndürür. Bulamazsa -1 döndürür.
        System.out.println(message.lastIndexOf('a')); // lastIndexOf(ch) -> Aramaya sağdan başlar ve eşleşen ilk indexi
                                                      // döndürür.

        System.out.println(message.replace(' ', '-')); // replace(oldChar, newChar) -> oldChar karakterlerini newChar
                                                       // karakteri ile değiştirir ve yeni bir string döndürür.

        System.out.println(message.substring(2, 4));
        // substring(index) -> indexten itibaren bütün stringi döndürür.
        // substring(beginIndex, endIndex) -> beginIndex ile endIndex arasındaki stringi
        // döndürür.(endIndex dahil değil!)

        for (String word : message.split(" ")) {
            System.out.println(word);
        }
        // split(regex) -> stringi regex ifadesine göre ayırır ve bir döngü şeklinde
        // döndürür.

        System.out.println(message.toLowerCase()); // toLowerCase() -> stringin tüm harflerini küçük harfe çevirir.
        System.out.println(message.toUpperCase()); // toUpperCase() -> stringin tüm harflerini büyük harfe çevirir.

        System.out.println(message.trim()); // trim() -> stringin başındaki ve sonundaki boşlukları silerek yeni bir
                                            // string döndürür.
        // equalTest();

    }

    public static void equalTest() {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = str2;

        if (str1 == str2) {
            System.out.println("String1 == String2 is true");
        } else {
            System.out.println("String1 == String2 is false");
        }

        if (str2 == str3) {
            System.out.println("String2 == String3 is true");
        } else {
            System.out.println("String2 == String3 is false");
        }

        if (str1.equals(str2)) {
            System.out.println("String1 equals String2 is true");
        } else {
            System.out.println("String1 equals String2 is false");
        }
    }
}
