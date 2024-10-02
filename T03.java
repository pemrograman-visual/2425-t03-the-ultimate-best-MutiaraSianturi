// 12S24003 - Michael Nasution
// 12S24045 - Mutiara Sianturi

  import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, jUDUL, pENULIS, pENERBIT, formatBuku, rate, result, finalResult;
        int tahunTerbit, stokBuku;
        double hargaPembelian, margin, rating;

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            jUDUL = input.nextLine();
            pENULIS = input.nextLine();
            tahunTerbit = Integer.parseInt(input.nextLine());
            pENERBIT = input.nextLine();
            formatBuku = input.nextLine();
            hargaPembelian = Double.parseDouble(input.nextLine());
            margin = Double.parseDouble(input.nextLine());
            result = "";
            if (margin / hargaPembelian < -0.4) {
                result = "Once in a lifetime";
            } else {
                if (margin / hargaPembelian < -0.2) {
                    result = "Never come twice";
                } else {
                    if (margin / hargaPembelian <= 0) {
                        result = "No regret";
                    }
                }
            }
            stokBuku = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7 && rating <= 5) {
                rate = "Best Pick";
            } else {
                if (rating >= 4.5) {
                    rate = "Must Read";
                } else {
                    if (rating >= 4.0) {
                        rate = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            rate = "Average";
                        } else {
                            if (rating < 3) {
                                rate = "Low";
                            } else {
                                rate = "";
                            }
                        }
                    }
                }
            }
            if (result.equals("Once in a lifetime") && rate.equals("Best Pick")) {
                finalResult = "The ultimate best";
            } else {
                finalResult = "---";
            }
            System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tahunTerbit + "|" + pENERBIT + "|" + formatBuku + "|" + toFixed(hargaPembelian,2) + "|" + toFixed(margin,2) + "|" + stokBuku + "|" + toFixed(rating,1) + "|" + rate + "|" + result + "|" + finalResult);
            iSBN = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
