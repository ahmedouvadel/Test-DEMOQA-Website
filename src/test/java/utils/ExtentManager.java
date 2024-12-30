package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance(String reportFilePath) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFilePath);

        // Configuration du rapport
        sparkReporter.config().setReportName("Rapport d'Automatisation");
        sparkReporter.config().setDocumentTitle("Rapport de Test");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Ajouter des informations système
        extent.setSystemInfo("Environnement", "Test");
        extent.setSystemInfo("Testeur", "Dady");

        return extent;
    }
}
