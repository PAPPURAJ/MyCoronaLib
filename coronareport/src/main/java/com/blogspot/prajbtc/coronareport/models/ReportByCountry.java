package com.blogspot.prajbtc.coronareport.models;

public class ReportByCountry {
    String countryName;
    String totalCases;
    String newCases;
    String totalDeaths;
    String newDeaths;
    String totalRecovered;
    String activeCases;
    String seriousCritical;
    String totalTested;

    public ReportByCountry() {
    }

    public ReportByCountry(String countryName, String totalCases, String newCases, String totalDeaths, String newDeaths, String totalRecovered, String activeCases, String seriousCritical, String totalTested) {
        this.countryName = countryName;
        this.totalCases = totalCases;
        this.newCases = newCases;
        this.totalDeaths = totalDeaths;
        this.newDeaths = newDeaths;
        this.totalRecovered = totalRecovered;
        this.activeCases = activeCases;
        this.seriousCritical = seriousCritical;
        this.totalTested = totalTested;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(String totalCases) {
        this.totalCases = totalCases;
    }

    public String getNewCases() {
        return newCases;
    }

    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }

    public String getSeriousCritical() {
        return seriousCritical;
    }

    public void setSeriousCritical(String seriousCritical) {
        this.seriousCritical = seriousCritical;
    }

    public String getTotalTested() {
        return totalTested;
    }

    public void setTotalTested(String topCases) {
        this.totalTested = totalTested;
    }

    @Override
    public String toString() {
        return "ReportByCountry{" +
                "countryName='" + countryName + '\'' +
                ", totalCases='" + totalCases + '\'' +
                ", newCases='" + newCases + '\'' +
                ", totalDeaths='" + totalDeaths + '\'' +
                ", newDeaths='" + newDeaths + '\'' +
                ", totalRecovered='" + totalRecovered + '\'' +
                ", activeCases='" + activeCases + '\'' +
                ", seriousCritical='" + seriousCritical + '\'' +
                ", topCases='" + totalTested + '\'' +
                '}';
    }
}
