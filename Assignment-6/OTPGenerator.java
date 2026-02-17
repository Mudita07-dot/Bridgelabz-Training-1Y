package Level3;

public class OTPGenerator {


    public static int generateOTP() {

        return (int)(Math.random() * 900000) + 100000;
    }


    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;  // Duplicate found
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {


        int[] otps = new int[10];

        System.out.println("Generated OTPs:");

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }


        boolean result = areOTPsUnique(otps);

        System.out.println("\nAre all generated OTPs unique? " + result);
    }
}

