package ArrayProgram;

public class GetArrayClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        long[] l = new long[5];
        short[] s = new short[5];
        byte[] b = new byte[5];
        double[] db = new double[5];
        String[] st = new String[5];
        float[] f = new float[5];
        System.out.println(arr.getClass());
        System.out.println(l.getClass());
        System.out.println(s.getClass());
        System.out.println(b.getClass());
        System.out.println(db.getClass().getSuperclass());
        System.out.println(st.getClass());
        System.out.println(f.getClass());

    }
}
