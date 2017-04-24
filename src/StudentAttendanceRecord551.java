/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/24 0024
 *      desc  : 统计连续的L和可不连续的A
 * </pre>
 */
public class StudentAttendanceRecord551 {
    public static void main(String[] args) {
        String s = "ALLAPPL";
        boolean b = checkRecord(s);
        System.out.println(b);
    }

    public static boolean checkRecord(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        int countA = 0;
        int maxCountL = 0;

        int hereCountL = 0;

        for(int i = 0; i < s.length(); i++) {
            countA = (s.charAt(i) == 'A' ? ++countA : countA);
            maxCountL = Math.max(maxCountL, hereCountL = (s.charAt(i) == 'L' ? ++hereCountL : 0));

        }
        if (countA > 1 || maxCountL > 2) {
            return false;
        }

        return true;
    }

    public static boolean checkRecord2(String s) {
        return !s.matches(".*LLL.*|.*A.*A.*");
    }
}
