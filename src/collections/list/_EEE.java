package collections.list;

import java.util.*;

public class _EEE {
    public static void main(String[] args) {

    }

    class Area {
        private NavigableSet<Point> setX = new TreeSet<>(new Comparator<Point>() {
            @Override
            public int compare(Point p0, Point p1) {
                int delta = p0.x - p1.x;
                return delta != 0 ? delta : p0.y - p1.y;
            }
        });

        private NavigableSet<Point> setY = new TreeSet<>(new Comparator<Point>() {
            @Override
            public int compare(Point p0, Point p1) {
                int delta = p0.y - p1.y;
                return delta != 0 ? delta : p0.x - p1.x;
            }
        });

        void add(Point point) {
            setX.add(point);
            setY.add(point);
        }

//        Collections select(int x0, int x1, int y0, int y1) {
//            NavigableSet<Point> dx = setX.subSet((x0,MIN_VALUE), (x1, Integer.MAX_VALUE));
//            NavigableSet<Point> dy = setX.subSet((Integer.MIN_VALUE, y0), (Integer.MAX_VALUE, y1));
//            dx.retainAll(dy);
//            return (Collections) dx;
//        }
    }

    class Point {
        public final int x;
        public final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}

