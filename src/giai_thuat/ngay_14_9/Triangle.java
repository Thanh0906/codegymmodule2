package giai_thuat.ngay_14_9;

public class Triangle {
    public static void main(String[] args) {
            int n=9;
            int m=5;
            String s = "";
            for(int i=0;i<m;i++){
                for(int j =0;j<n;j++){
                    if(i==0||i==j||j==m-1||j==n-i-1){
                        s+="*";
                    }
                    else{
                        s+=" ";
                    }
                }
                s+="\n";
            }
            System.out.println(s);
        }
    }

