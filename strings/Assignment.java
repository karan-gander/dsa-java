public class Assignment {

    public static int countVowels(String str){

        str = str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='a'){
                count++;
            }
            else if(str.charAt(i)=='e'){
                count++;

            }
            else if(str.charAt(i)=='i'){
                count++;
            }
            else if(str.charAt(i)=='o'){
                count++;
            }
            else if(str.charAt(i)=='u'){
                count++;
            }
        }


        return count;

    }

    public static void main(String args[]){
        String name = "Karan";
        System.out.print(countVowels(name));
    }
    
}
