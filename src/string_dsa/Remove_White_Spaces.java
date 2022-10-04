package string_dsa;

public class Remove_White_Spaces {
    public static void main(String[] args) {
        String str = "this is a white space";
        String remove = str.replace(" ","");
        System.out.println("no white space: "+remove);
    }
}

//output-: no white space: thisisawhitespace