import java.util.Arrays;
public class waptosortnamesalphabateically {
    public static void main(String[] args){
        String[]names={"rahul","amit","suman","ankit","priya"};
        Arrays.sort(names);
        System.out.print("names in alphabatical order");
        for(String name:names){
            System.out.println(name);
        } 
    }
}
