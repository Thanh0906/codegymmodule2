package giai_thuat.ngay_7_9;

public class tim {
        public static String[] arrayString(String[] array){
            String[] array1 = new String[array.length];

            int temp = 0;

            for (int i = 0; i < array.length; i++) {
                int count = 1;

                if(array[i] != null){
                    for (int j = i + 1; j < array.length ; j++) {
                        if (array[i]==array[j]){
                            count++;
                            array[j] = null;
                        }
                    }
                    array1[temp] = (array[i] + ":" + count);
                    temp++;
                }
            }
            return array1;
        }

    public static void main(String[] args) {
        String[] array={"v","bb","bb","c","v"};
        String[] array2=arrayString(array);
        for (int i =0;i<array2.length;i++){
            if (array2[i]!=null){
System.out.println(array2[i]);
            }
        }
    }

}
