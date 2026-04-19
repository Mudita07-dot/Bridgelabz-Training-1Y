package com.gla.InterfacesAbstraction;

public class DataExportApp {

    interface Exporter {
        void exportToCSV();
        void exportToPDF();

        default void exportToJSON() {
            System.out.println("Exported data to JSON (default implementation).");
        }
    }

    static class ReportModule implements Exporter {
        @Override
        public void exportToCSV() {
            System.out.println("Data exported to CSV.");
        }

        @Override
        public void exportToPDF() {
            System.out.println("Data exported to PDF.");
        }
    }

    static class AnalyticsModule implements Exporter {
        @Override
        public void exportToCSV() {
            System.out.println("Analytics data exported to CSV.");
        }

        @Override
        public void exportToPDF() {
            System.out.println("Analytics data exported to PDF.");
        }

        @Override
        public void exportToJSON() {
            System.out.println("Analytics data exported to JSON (custom implementation).");
        }
    }

    public static void main(String[] args) {
        Exporter report = new ReportModule();
        Exporter analytics = new AnalyticsModule();

        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();   // Uses default implementation

        System.out.println();

        analytics.exportToCSV();
        analytics.exportToPDF();
        analytics.exportToJSON(); // Uses overridden method
    }
}