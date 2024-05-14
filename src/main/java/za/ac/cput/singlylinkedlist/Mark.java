package za.ac.cput.singlylinkedlist;

public class Mark {
    private double T1;
    private double T2;
    private double T3;
    private double T4;

    public Mark() {
        T1 = 0;
        T2 = 0;
        T3 = 0;
        T4 = 0;
    }

    public Mark(double t1) {
        T1 = t1;
    }

    public Mark(double t1, double t2) {
        T1 = t1;
        T2 = t2;
    }

    public Mark(double t1, double t2, double t3) {
        T1 = t1;
        T2 = t2;
        T3 = t3;
    }

    public Mark(double t1, double t2, double t3, double t4) {
        T1 = t1;
        T2 = t2;
        T3 = t3;
        T4 = t4;
    }

    public double getT1() {
        return T1;
    }

    public void setT1(double t1) {
        T1 = t1;
    }

    public double getT2() {
        return T2;
    }

    public void setT2(double t2) {
        if (T1 == 0) {
            throw new IllegalStateException("T1 must be set before T2.");
        }
        T2 = t2;
    }

    public double getT3() {
        return T3;
    }

    public void setT3(double t3) {
        if (T2 == 0) {
            throw new IllegalStateException("T2 must be set before T3.");
        }
        T3 = t3;
    }

    public double getT4() {
        return T4;
    }

    public void setT4(double t4) {
        if (T3 == 0) {
            throw new IllegalStateException("T3 must be set before T4.");
        }
        T4 = t4;
    }

    public double calculateFinalMark() {
        if (T1 == 0 || T2 == 0 || T3 == 0 || T4 == 0) {
            throw new IllegalStateException("All term marks must be set before calculating the final mark.");
        }
        return (T1 + T2 + T3 + T4) / 4;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "T1=" + T1 +
                ", T2=" + T2 +
                ", T3=" + T3 +
                ", T4=" + T4 +
                ", Final Mark=" + (T1 != 0 && T2 != 0 && T3 != 0 && T4 != 0 ? calculateFinalMark() : "N/A") +
                '}';
    }
}
