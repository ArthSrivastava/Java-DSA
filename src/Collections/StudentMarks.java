package Collections;

public class StudentMarks {
    private int physics;
    private int maths;

    @Override
    public String toString() {
        return "StudentMarks{" +
                "physics=" + physics +
                ", maths=" + maths +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentMarks that = (StudentMarks) o;

        if (physics != that.physics) return false;
        return maths == that.maths;
    }

    @Override
    public int hashCode() {
        int result = physics;
        result = 31 * result + maths;
        return result;
    }

    public StudentMarks(int physics, int maths) {
        this.physics = physics;
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public int getMaths() {
        return maths;
    }
}
