package testdopracy;

public class mod {
    public static void main(String[] args) {
        String str = "-";
        switch("RED".toLowerCase()) {
            case "yellow":
                str += "y";
            case "red":
                str += "r";
                //break;
            case "green":
                str += "g";
        }
       System.out.println(str);
    }
}
