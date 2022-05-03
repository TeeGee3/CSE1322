public class BlueRayDisk {
    public String title;
    public String director;
    public int releaseYear;
    public double cost;

    public BlueRayDisk(String title, String director, int releaseYear, double cost) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "$" + cost + " " + releaseYear + " " + title + ", " + director;
    }
}