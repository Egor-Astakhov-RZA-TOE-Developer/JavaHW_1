package telegramTask;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double length(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
    public double scalarProduct(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }
    public Vector vectorProduct(Vector vector){
        return new Vector( y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x );
    }
    public double angleBetweenVectors(Vector vector){
        return this.scalarProduct(vector) / (this.length() * vector.length());
    }
    public Vector sum(Vector vector){
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }
    public Vector difference(Vector vector){
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    @Override
    public String toString() {
        return String.format("x: %d, y: %s, z: %d.", x, y, z);
    }
}
