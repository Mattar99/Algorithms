import java.util.*;

public class CoveringSegments {

    private static int[] optimalPoints(Segment[] segments) {

        int[] points = new int[2 * segments.length];
        int point = segments[0].end;
        points[0] = point;

        int j = 1;
        for (int i = 1; i < segments.length; i++) {
            if (point < segments[i].start || point > segments[i].end) {
                point = segments[i].end;
                points[j] = point;
                j++;
            }
        }
        int[] pointsFinal = new int[j];
        for (int i = 0; i < j; i++) {
            pointsFinal[i] = points[i];
        }
        return pointsFinal;
    }

    private static class Segment implements Comparable<Segment>{
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Segment o) {
            return (this.end-o.end);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        Arrays.sort(segments);
        int[] points = optimalPoints(segments);

        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}

