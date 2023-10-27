class Point3D {
    private int x, y, z;
    
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(int x, int y) {
        this(x , y , 0);
    }

    public Point3D(int x) {
        this(x, 0, 0);
    }

    public Point3D() {
        this(0,0,0);
    }

    public Point3D(Point3D p) {
        this(p.x, p.y, p.z);
    }

    public void show() {
        System.out.println("<"+ x +", " + y + ", " + z + ">");
    }
}


class TestPoint3D {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(2,5);
        p1.show();

        Point3D p2 = new Point3D(2, 3, 5);
        p2.show();

        Point3D p3 = new Point3D(p2);
        p3.show();
    }
}