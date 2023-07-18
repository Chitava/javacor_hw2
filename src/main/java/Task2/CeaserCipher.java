/**Написать метод «Шифр Цезаря», с булевым параметром зашифрования и расшифро- вания и числовым ключом;
**/
package Task2;

public class CeaserCipher {
        private static String mass = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ";

        public static StringBuilder cipher (String message, int offset){
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < message.length(); i++) {
                        for (int j = 0; j < mass.length(); j++) {
                                if (message.charAt(i) == mass.charAt(j)){
                                        result.append(mass.charAt(j+offset));
                                        break;
                                }
                        }

                }
                return result;
        }


        public static StringBuilder dicipher (String message, int offset){
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < message.length(); i++) {
                        for (int j = 0; j < mass.length(); j++) {
                                if (message.charAt(i) == mass.charAt(j)){
                                        result.append(mass.charAt(j-offset));
                                        break;
                                }
                        }

                }
                return result;
        }
}
