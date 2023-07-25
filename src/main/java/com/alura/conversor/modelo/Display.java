package com.alura.conversor.modelo;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.util.Map;
import java.util.HashMap;

public class Display {

    private static JLabel flagLabelStart;
    private static JLabel flagLabelEnd;

    private static final Map<String, String> CURRENCY_FLAG_MAP;
    static {
        CURRENCY_FLAG_MAP = new HashMap<>();
        CURRENCY_FLAG_MAP.put("EUR", "ES");
        CURRENCY_FLAG_MAP.put("GBP", "GB");
        CURRENCY_FLAG_MAP.put("CAD", "CA");
        CURRENCY_FLAG_MAP.put("PLN", "PL");
        CURRENCY_FLAG_MAP.put("PEN", "PE");
        CURRENCY_FLAG_MAP.put("USD", "US");
        CURRENCY_FLAG_MAP.put("AED", "AE");
        CURRENCY_FLAG_MAP.put("AFN", "AF");
        CURRENCY_FLAG_MAP.put("ALL", "AL");
        CURRENCY_FLAG_MAP.put("AMD", "AM");
        CURRENCY_FLAG_MAP.put("ANG", "AN");
        CURRENCY_FLAG_MAP.put("AOA", "AO");
        CURRENCY_FLAG_MAP.put("ARS", "AR");
        CURRENCY_FLAG_MAP.put("AUD", "AU");
        CURRENCY_FLAG_MAP.put("AWG", "AW");
        CURRENCY_FLAG_MAP.put("AZN", "AZ");
        CURRENCY_FLAG_MAP.put("BAM", "BA");
        CURRENCY_FLAG_MAP.put("BBD", "BB");
        CURRENCY_FLAG_MAP.put("BDT", "BD");
        CURRENCY_FLAG_MAP.put("BGN", "BG");
        CURRENCY_FLAG_MAP.put("BHD", "BH");
        CURRENCY_FLAG_MAP.put("BIF", "BI");
        CURRENCY_FLAG_MAP.put("BMD", "BM");
        CURRENCY_FLAG_MAP.put("BND", "BN");
        CURRENCY_FLAG_MAP.put("BOB", "BO");
        CURRENCY_FLAG_MAP.put("BRL", "BR");
        CURRENCY_FLAG_MAP.put("BSD", "BS");
        CURRENCY_FLAG_MAP.put("BTC", "BT");
        CURRENCY_FLAG_MAP.put("BTN", "BT");
        CURRENCY_FLAG_MAP.put("BWP", "BW");
        CURRENCY_FLAG_MAP.put("BYN", "BY");
        CURRENCY_FLAG_MAP.put("BYR", "BY");
        CURRENCY_FLAG_MAP.put("BZD", "BZ");
        CURRENCY_FLAG_MAP.put("CDF", "CD");
        CURRENCY_FLAG_MAP.put("CHF", "CH");
        CURRENCY_FLAG_MAP.put("CLF", "CL");
        CURRENCY_FLAG_MAP.put("CLP", "CL");
        CURRENCY_FLAG_MAP.put("CNY", "CN");
        CURRENCY_FLAG_MAP.put("COP", "CO");
        CURRENCY_FLAG_MAP.put("CRC", "CR");
        CURRENCY_FLAG_MAP.put("CUC", "CU");
        CURRENCY_FLAG_MAP.put("CUP", "CU");
        CURRENCY_FLAG_MAP.put("CVE", "CV");
        CURRENCY_FLAG_MAP.put("CZK", "CZ");
        CURRENCY_FLAG_MAP.put("DJF", "DJ");
        CURRENCY_FLAG_MAP.put("DKK", "DK");
        CURRENCY_FLAG_MAP.put("DOP", "DO");
        CURRENCY_FLAG_MAP.put("DZD", "DZ");
        CURRENCY_FLAG_MAP.put("EGP", "EG");
        CURRENCY_FLAG_MAP.put("ERN", "ER");
        CURRENCY_FLAG_MAP.put("ETB", "ET");
        CURRENCY_FLAG_MAP.put("FJD", "FJ");
        CURRENCY_FLAG_MAP.put("FKP", "FK");
        CURRENCY_FLAG_MAP.put("GEL", "GE");
        CURRENCY_FLAG_MAP.put("GGP", "GG");
        CURRENCY_FLAG_MAP.put("GHS", "GH");
        CURRENCY_FLAG_MAP.put("GIP", "GI");
        CURRENCY_FLAG_MAP.put("GMD", "GM");
        CURRENCY_FLAG_MAP.put("GNF", "GN");
        CURRENCY_FLAG_MAP.put("GTQ", "GT");
        CURRENCY_FLAG_MAP.put("GYD", "GY");
        CURRENCY_FLAG_MAP.put("HKD", "HK");
        CURRENCY_FLAG_MAP.put("HNL", "HN");
        CURRENCY_FLAG_MAP.put("HRK", "HR");
        CURRENCY_FLAG_MAP.put("HTG", "HT");
        CURRENCY_FLAG_MAP.put("HUF", "HU");
        CURRENCY_FLAG_MAP.put("IDR", "ID");
        CURRENCY_FLAG_MAP.put("ILS", "IL");
        CURRENCY_FLAG_MAP.put("IMP", "IM");
        CURRENCY_FLAG_MAP.put("INR", "IN");
        CURRENCY_FLAG_MAP.put("IQD", "IQ");
        CURRENCY_FLAG_MAP.put("IRR", "IR");
        CURRENCY_FLAG_MAP.put("ISK", "IS");
        CURRENCY_FLAG_MAP.put("JEP", "JE");
        CURRENCY_FLAG_MAP.put("JMD", "JM");
        CURRENCY_FLAG_MAP.put("JOD", "JO");
        CURRENCY_FLAG_MAP.put("JPY", "JP");
        CURRENCY_FLAG_MAP.put("KES", "KE");
        CURRENCY_FLAG_MAP.put("KGS", "KG");
        CURRENCY_FLAG_MAP.put("KHR", "KH");
        CURRENCY_FLAG_MAP.put("KMF", "KM");
        CURRENCY_FLAG_MAP.put("KPW", "KP");
        CURRENCY_FLAG_MAP.put("KRW", "KR");
        CURRENCY_FLAG_MAP.put("KWD", "KW");
        CURRENCY_FLAG_MAP.put("KYD", "KY");
        CURRENCY_FLAG_MAP.put("KZT", "KZ");
        CURRENCY_FLAG_MAP.put("LAK", "LA");
        CURRENCY_FLAG_MAP.put("LBP", "LB");
        CURRENCY_FLAG_MAP.put("LKR", "LK");
        CURRENCY_FLAG_MAP.put("LRD", "LR");
        CURRENCY_FLAG_MAP.put("LSL", "LS");
        CURRENCY_FLAG_MAP.put("LTL", "LT");
        CURRENCY_FLAG_MAP.put("LVL", "LV");
        CURRENCY_FLAG_MAP.put("LYD", "LY");
        CURRENCY_FLAG_MAP.put("MAD", "MA");
        CURRENCY_FLAG_MAP.put("MDL", "MD");
        CURRENCY_FLAG_MAP.put("MGA", "MG");
        CURRENCY_FLAG_MAP.put("MKD", "MK");
        CURRENCY_FLAG_MAP.put("MMK", "MM");
        CURRENCY_FLAG_MAP.put("MNT", "MN");
        CURRENCY_FLAG_MAP.put("MOP", "MO");
        CURRENCY_FLAG_MAP.put("MRO", "MR");
        CURRENCY_FLAG_MAP.put("MUR", "MU");
        CURRENCY_FLAG_MAP.put("MVR", "MV");
        CURRENCY_FLAG_MAP.put("MWK", "MW");
        CURRENCY_FLAG_MAP.put("MXN", "MX");
        CURRENCY_FLAG_MAP.put("MYR", "MY");
        CURRENCY_FLAG_MAP.put("MZN", "MZ");
        CURRENCY_FLAG_MAP.put("NAD", "NA");
        CURRENCY_FLAG_MAP.put("NGN", "NG");
        CURRENCY_FLAG_MAP.put("NIO", "NI");
        CURRENCY_FLAG_MAP.put("NOK", "NO");
        CURRENCY_FLAG_MAP.put("NPR", "NP");
        CURRENCY_FLAG_MAP.put("NZD", "NZ");
        CURRENCY_FLAG_MAP.put("OMR", "OM");
        CURRENCY_FLAG_MAP.put("PAB", "PA");
        CURRENCY_FLAG_MAP.put("PEN", "PE");
        CURRENCY_FLAG_MAP.put("PGK", "PG");
        CURRENCY_FLAG_MAP.put("PHP", "PH");
        CURRENCY_FLAG_MAP.put("PKR", "PK");
        CURRENCY_FLAG_MAP.put("PYG", "PY");
        CURRENCY_FLAG_MAP.put("QAR", "QA");
        CURRENCY_FLAG_MAP.put("RON", "RO");
        CURRENCY_FLAG_MAP.put("RSD", "RS");
        CURRENCY_FLAG_MAP.put("RUB", "RU");
        CURRENCY_FLAG_MAP.put("RWF", "RW");
        CURRENCY_FLAG_MAP.put("SAR", "SA");
        CURRENCY_FLAG_MAP.put("SBD", "SB");
        CURRENCY_FLAG_MAP.put("SCR", "SC");
        CURRENCY_FLAG_MAP.put("SDG", "SD");
        CURRENCY_FLAG_MAP.put("SEK", "SE");
        CURRENCY_FLAG_MAP.put("SGD", "SG");
        CURRENCY_FLAG_MAP.put("SHP", "SH");
        CURRENCY_FLAG_MAP.put("SLL", "SL");
        CURRENCY_FLAG_MAP.put("SOS", "SO");
        CURRENCY_FLAG_MAP.put("SRD", "SR");
        CURRENCY_FLAG_MAP.put("STD", "ST");
        CURRENCY_FLAG_MAP.put("SVC", "SV");
        CURRENCY_FLAG_MAP.put("SYP", "SY");
        CURRENCY_FLAG_MAP.put("SZL", "SZ");
        CURRENCY_FLAG_MAP.put("THB", "TH");
        CURRENCY_FLAG_MAP.put("TJS", "TJ");
        CURRENCY_FLAG_MAP.put("TMT", "TM");
        CURRENCY_FLAG_MAP.put("TND", "TN");
        CURRENCY_FLAG_MAP.put("TOP", "TO");
        CURRENCY_FLAG_MAP.put("TRY", "TR");
        CURRENCY_FLAG_MAP.put("TTD", "TT");
        CURRENCY_FLAG_MAP.put("TWD", "TW");
        CURRENCY_FLAG_MAP.put("TZS", "TZ");
        CURRENCY_FLAG_MAP.put("UAH", "UA");
        CURRENCY_FLAG_MAP.put("UGX", "UG");
        CURRENCY_FLAG_MAP.put("UYU", "UY");
        CURRENCY_FLAG_MAP.put("UZS", "UZ");
        CURRENCY_FLAG_MAP.put("VEF", "VE");
        CURRENCY_FLAG_MAP.put("VES", "VE");
        CURRENCY_FLAG_MAP.put("VND", "VN");
        CURRENCY_FLAG_MAP.put("VUV", "VU");
        CURRENCY_FLAG_MAP.put("WST", "WS");
        CURRENCY_FLAG_MAP.put("XAF", "CM");
        CURRENCY_FLAG_MAP.put("XAG", "CM");
        CURRENCY_FLAG_MAP.put("XAU", "CM");
        CURRENCY_FLAG_MAP.put("XCD", "DM");
        CURRENCY_FLAG_MAP.put("XDR", "CM");
        CURRENCY_FLAG_MAP.put("XOF", "CM");
        CURRENCY_FLAG_MAP.put("XPF", "CM");
        CURRENCY_FLAG_MAP.put("YER", "YE");
        CURRENCY_FLAG_MAP.put("ZAR", "ZA");
        CURRENCY_FLAG_MAP.put("ZMK", "ZM");
        CURRENCY_FLAG_MAP.put("ZMW", "ZM");
        CURRENCY_FLAG_MAP.put("ZWL", "ZW");
    }

    public static void main(String[] args) throws Exception {
        JFrame display = new JFrame();
        display.setSize(900, 440);
        display.setVisible(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setLayout(null);
        display.setResizable(false);

        JLabel header1 = new JLabel("Conversor de divisas");
        header1.setBounds(50, 30, 400, 54);
        header1.setFont(new java.awt.Font("Archivo Narrow", Font.BOLD, 36));
        display.add(header1);

        RoundedPanel contenedorCambio = new RoundedPanel(50);
        contenedorCambio.setBounds(50, 100, 800, 250);
        contenedorCambio.setLayout(null);
        display.add(contenedorCambio);

        String[] monedas = { "USD", "EUR", "GBP", "CAD", "PLN", "PEN", "AED", "AFN", "ALL", "AMD", "ANG",
                "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL",
                "BSD", "BTC", "BTN", "BWP", "BYN", "BYR", "BZD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC",
                "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "FJD", "FKP", "GEL", "GGP", "GHS",
                "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD",
                "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT",
                "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP",
                "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB",
                "PEN", "PGK", "PHP", "PKR", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK",
                "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY",
                "TTD", "TWD", "TZS", "UAH", "UGX", "UYU", "UZS", "VEF", "VES", "VND", "VUV", "WST", "XAF", "XAG", "XAU",
                "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMK", "ZMW", "ZWL" };

        Map<String, Double> conversiones = GenerateChanges(monedas);

        JPanel contenedorMonedaInicial = createCurrencyContainer(50, 40, 300, 70);
        flagLabelStart = createFlagLabel(200, 10, 64, 50);
        JComboBox<String> monedaInicial = createCurrencyComboBox(monedas, 10, 10, 150, 50);
        JTextField CurrencyValue = createTextFiendInput(71, 141, 259, 50);
        JLabel LineStart = createLine(50, 200, 300, 1);
        monedaInicial.addActionListener(createCurrencyActionListener(monedaInicial, flagLabelStart));
        contenedorMonedaInicial.add(flagLabelStart);
        contenedorMonedaInicial.add(monedaInicial);
        contenedorCambio.add(contenedorMonedaInicial);
        contenedorCambio.add(LineStart);

        JPanel contenedorMonedaFinal = createCurrencyContainer(450, 40, 300, 70);
        flagLabelEnd = createFlagLabel(200, 10, 64, 50);
        JComboBox<String> monedaFinal = createCurrencyComboBox(monedas, 10, 10, 150, 50);
        JLabel CurrencyResult = createLabelResult(471, 141, 300, 50);
        JLabel LineEnd = createLine(450, 200, 300, 1);
        monedaFinal.addActionListener(createCurrencyActionListener(monedaFinal, flagLabelEnd));
        contenedorMonedaFinal.add(flagLabelEnd);
        contenedorMonedaFinal.add(monedaFinal);
        contenedorCambio.add(contenedorMonedaFinal);
        contenedorCambio.add(CurrencyResult);
        contenedorCambio.add(LineEnd);
        contenedorCambio.add(CurrencyValue);

        CurrencyValue.addActionListener(createChangeMoneda(monedaInicial, monedaFinal, CurrencyValue, CurrencyResult,
                conversiones, CurrencyResult));

        monedaFinal.addActionListener(createChangeMoneda(monedaInicial, monedaFinal, CurrencyValue, CurrencyResult,
                conversiones, CurrencyResult));

        vistaCambio("USD", flagLabelStart);
        vistaCambio("USD", flagLabelEnd);

        display.revalidate();
        display.repaint();

    }

    private static JPanel createCurrencyContainer(int x, int y, int width, int height) {
        JPanel container = new JPanel();
        container.setBounds(x, y, width, height);
        container.setLayout(null);
        container.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        return container;
    }

    private static JLabel createFlagLabel(int x, int y, int width, int height) {
        JLabel flagLabel = new JLabel();
        flagLabel.setBounds(x, y, width, height);
        return flagLabel;
    }

    private static JComboBox<String> createCurrencyComboBox(String[] currencies, int x, int y, int width, int height) {
        JComboBox<String> comboBox = new JComboBox<>(currencies);
        comboBox.setBounds(x, y, width, height);
        comboBox.setFont(new java.awt.Font("Archivo Narrow", Font.BOLD, 24));
        comboBox.setAutoscrolls(true);
        return comboBox;
    }

    private static ActionListener createCurrencyActionListener(JComboBox<String> comboBox, JLabel flagLabel) {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String monedaSeleccionada = (String) comboBox.getSelectedItem();
                vistaCambio(monedaSeleccionada, flagLabel);
            }
        };
    }

    private static ActionListener createChangeMoneda(JComboBox<String> comboBoxStart, JComboBox<String> comboBoxEnd,
            JTextField startingAmount, JLabel resultAmount, Map<String, Double> conversiones, JLabel CurrencyResult) {

        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String monedaInicial = (String) comboBoxStart.getSelectedItem();
                String monedaFinal = (String) comboBoxEnd.getSelectedItem();
                double cantidadInicial = Double.parseDouble(startingAmount.getText());

                if (monedaInicial.equals(monedaFinal)) {
                    CurrencyResult.setText(String.valueOf(cantidadInicial));
                    return;
                }

                double ConversionFinal;
                if (monedaInicial.equals("USD")) {
                    ConversionFinal = conversiones.get("USD" + monedaFinal);
                } else if (monedaFinal.equals("USD")) {
                    ConversionFinal = 1 / conversiones.get("USD" + monedaInicial);
                } else {
                    ConversionFinal = conversiones.get("USD" + monedaFinal) / conversiones.get("USD" + monedaInicial);
                }

                CurrencyResult.setText(String.format("%.4f", ConversionFinal * cantidadInicial));
            }
        };
    }

    public static JLabel createLabelResult(int x, int y, int width, int height) {
        JLabel label = new JLabel();
        label.setBounds(x, y, width, height);
        label.setText("1.000");
        label.setFont(new java.awt.Font("Archivo Narrow", Font.BOLD, 36));
        return label;
    }

    public static JTextField createTextFiendInput(int x, int y, int width, int height) {
        JTextField text = new JTextField();
        text.setBounds(x, y, width, height);
        text.setText("1.000");
        text.setFont(new java.awt.Font("Archivo Narrow", Font.BOLD, 36));
        return text;
    }

    public static JLabel createLine(int x, int y, int width, int height) {
        JLabel line = new JLabel();
        line.setBounds(x, y, width, height);
        line.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        return line;
    }

    public static void vistaCambio(String monedaSeleccionada, JLabel flagLabel) {
        monedaSeleccionada = monedaToFlag(monedaSeleccionada);

        String imageUrl = "https://www.countryflagicons.com/FLAT/64/" + monedaSeleccionada + ".png";
        Image flagImage = null;
        try {
            flagImage = new DisplayFlag().Display(imageUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
        flagLabel.setIcon(new ImageIcon(flagImage));
    }

    public static String monedaToFlag(String moneda) {
        return CURRENCY_FLAG_MAP.getOrDefault(moneda, "US");
    }

    public static Map<String, Double> GenerateChanges(String[] monedas) throws Exception {
        CurrencyConverter converter = new CurrencyConverter();
        Map<String, Double> conversions = converter.convert(1, monedas);
        return conversions;
    }

    public static JButton createButtonDarkMode() {
        JButton button = new JButton();
        button.setBounds(775, 41, 75, 35);
        button.setLayout(null);
        button.setBorder(BorderFactory.createLineBorder(new java.awt.Color(192, 175, 39)));
        button.setBackground(new java.awt.Color(192, 175, 39));
        button.setText("Dark");
        button.setIcon(new ImageIcon("src\\modelo\\moon.png"));

        return button;
    }

}
