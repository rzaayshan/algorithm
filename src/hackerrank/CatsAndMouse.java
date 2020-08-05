package hackerrank;

public class CatsAndMouse {
    static String catAndMouse(int x, int y, int z) {
        int cA=Math.abs(z-x);
        int cB=Math.abs(z-y);
//        if(cA<cB) return "Cat A";
//        if(cA>cB) return "Cat B";
//        return "Mouse C";
        return cA<cB ? "Cat A" : cA>cB ? "Cat B" : "Mouse C";


    }
}
