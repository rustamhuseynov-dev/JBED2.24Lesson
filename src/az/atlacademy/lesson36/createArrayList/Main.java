package az.atlacademy.lesson36.createArrayList;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

                double amount = 2100;
                DecimalFormat decimalFormat = new DecimalFormat("#,###.00"); // 2,100.00 formatında

                String formattedAmount = decimalFormat.format(amount);
                System.out.println("Formatted Amount: " + formattedAmount);
            }
        }

