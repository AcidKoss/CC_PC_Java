public class NumIsString {

        private String kudaKladem = "";

        public Double numIsStr (String value) {
            for (int i = 0; i < value.length(); i++) {

                if (value.charAt(i) == '0'
                        || value.charAt(i) == '1'
                        || value.charAt(i) == '2'
                        || value.charAt(i) == '3'
                        || value.charAt(i) == '4'
                        || value.charAt(i) == '5'
                        || value.charAt(i) == '6'
                        || value.charAt(i) == '7'
                        || value.charAt(i) == '8'
                        || value.charAt(i) == '9'
                        || value.charAt(i) == '.') {
                    kudaKladem = kudaKladem + String.valueOf(value.charAt(i));
                } else if (value.charAt(i) == ',') {
                    kudaKladem = kudaKladem + '.';
                } else {
                    continue;
                }
            }
            Double konechchislo = Double.parseDouble(kudaKladem);
            return konechchislo;
        }
    }

