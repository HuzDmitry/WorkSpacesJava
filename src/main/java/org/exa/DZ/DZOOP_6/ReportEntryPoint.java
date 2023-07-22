package org.exa.DZ.DZOOP_6;


import java.util.Map;

public class ReportEntryPoint {
   private ReportFactory reportFactory;

    public ReportEntryPoint(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;
    }

    public Report create(DocumentInterface document, String reportType) {
        Report report = reportFactory.createReport(reportType);
        report.formReport(document);
        return report;
    }
}
