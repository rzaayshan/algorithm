package hackerrank;

import java.util.stream.Stream;

public class DesignerPDF {
    static int designerPdfViewer(int[] h, String word) {
        return word.length()*word.chars().map(c->c-97).map(n->h[n]).max().getAsInt();
    }
}
