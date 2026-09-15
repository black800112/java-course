package com;

public class ProjectQuote {

    // ==================================================
    // field：封裝
    // ==================================================
    private int projectNo;
    private int budgetLimit;
    private int hourlyCost;
    private double discountRate;

    // 1=Web、2=AI、3=Data
    private int projectType;

    // 1=一般、2=VIP
    private int clientLevel;

    private boolean urgent;
    private boolean maintenance;

    // 不等長二維陣列 Jagged Array
    private int[][] workHours;

    private int totalHours;
    private double laborCost;
    private double quotedPrice;
    private double finalPrice;

    // ==================================================
    // static：公司統計
    // ==================================================
    private static int projectCount = 0;
    private static double companyFinalPriceTotal = 0;

    // ==================================================
    // constructor
    // ==================================================
    public ProjectQuote(
            int projectNo,
            int budgetLimit,
            int hourlyCost,
            double discountRate,
            int projectType,
            int clientLevel,
            boolean urgent,
            boolean maintenance,
            int[][] workHours) {

        setProjectNo(projectNo);
        setBudgetLimit(budgetLimit);
        setHourlyCost(hourlyCost);
        setDiscountRate(discountRate);
        setProjectType(projectType);
        setClientLevel(clientLevel);
        setUrgent(urgent);
        setMaintenance(maintenance);
        setWorkHours(workHours);

        projectCount++;
    }

    // ==================================================
    // setter / getter
    // ==================================================
    public void setProjectNo(int projectNo) {
        if (projectNo > 0) {
            this.projectNo = projectNo;
        }
    }

    public int getProjectNo() {
        return projectNo;
    }

    public void setBudgetLimit(int budgetLimit) {
        if (budgetLimit > 0) {
            this.budgetLimit = budgetLimit;
        }
    }

    public int getBudgetLimit() {
        return budgetLimit;
    }

    public void setHourlyCost(int hourlyCost) {
        if (hourlyCost > 0) {
            this.hourlyCost = hourlyCost;
        }
    }

    public int getHourlyCost() {
        return hourlyCost;
    }

    public void setDiscountRate(double discountRate) {
        if (discountRate >= 0 && discountRate <= 30) {
            this.discountRate = discountRate;
        }
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setProjectType(int projectType) {
        if (projectType >= 1 && projectType <= 3) {
            this.projectType = projectType;
        }
    }

    public int getProjectType() {
        return projectType;
    }

    public void setClientLevel(int clientLevel) {
        if (clientLevel == 1 || clientLevel == 2) {
            this.clientLevel = clientLevel;
        }
    }

    public int getClientLevel() {
        return clientLevel;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setMaintenance(boolean maintenance) {
        this.maintenance = maintenance;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public void setWorkHours(int[][] workHours) {

        this.workHours = workHours;

        // setter 負責資料規則：負數工時改為 0
        for (int i = 0; i < this.workHours.length; i++) {

            for (int j = 0; j < this.workHours[i].length; j++) {

                if (this.workHours[i][j] < 0) {
                    this.workHours[i][j] = 0;
                }
            }
        }
    }

    public int[][] getWorkHours() {
        return workHours;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public double getQuotedPrice() {
        return quotedPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    // ==================================================
    // methods
    // ==================================================
    public int calculateTotalHours() {

        totalHours = 0;

        for (int i = 0; i < workHours.length; i++) {

            // Jagged Array：內層一定使用 workHours[i].length
            for (int j = 0; j < workHours[i].length; j++) {
                totalHours += workHours[i][j];
            }
        }

        return totalHours;
    }

    public double calculateLaborCost() {

        laborCost = totalHours * hourlyCost;

        return laborCost;
    }

    public double getProjectMarkupRate() {

        if (projectType == 1) {
            return 0.15;
        } else if (projectType == 2) {
            return 0.25;
        } else {
            return 0.20;
        }
    }

    public String getProjectTypeName() {

        if (projectType == 1) {
            return "Web";
        } else if (projectType == 2) {
            return "AI";
        } else {
            return "Data";
        }
    }

    public String getClientLevelName() {

        if (clientLevel == 2) {
            return "VIP";
        }

        return "一般";
    }

    public void calculate() {

        calculateTotalHours();
        calculateLaborCost();

        // 1. 人工成本 + 專案類型加成
        double typeMarkup =
                laborCost * getProjectMarkupRate();

        double price =
                laborCost + typeMarkup;

        // 2. 急件：前述報價再加 12%
        if (urgent) {
            price = price + price * 0.12;
        }

        // 3. 維護服務：固定加 18,000
        if (maintenance) {
            price = price + 18000;
        }

        quotedPrice = price;

        // 4. 一般折扣
        finalPrice =
                quotedPrice
                * (1 - discountRate / 100.0);

        // 5. VIP 再折 3%
        if (clientLevel == 2) {
            finalPrice = finalPrice * 0.97;
        }

        companyFinalPriceTotal += finalPrice;
    }

    public String getStatus() {

        if (finalPrice <= budgetLimit) {
            return "可承接";
        } else if (finalPrice - budgetLimit
                <= budgetLimit * 0.10) {
            return "需協商";
        } else {
            return "超出預算";
        }
    }

    public String show() {

        String result = "";

        result += "===== 企業客戶專案報價 =====";
        result += "\n專案編號：" + projectNo;
        result += "\n專案類型：" + getProjectTypeName();
        result += "\n客戶等級：" + getClientLevelName();
        result += "\n預算上限：" + budgetLimit;
        result += "\n每小時成本：" + hourlyCost;
        result += "\n折扣率：" + discountRate + "%";
        result += "\n急件：" + (urgent ? "是" : "否");
        result += "\n維護服務：" + (maintenance ? "是" : "否");

        result += "\n\n===== Jagged Array 工時 =====";

        for (int i = 0; i < workHours.length; i++) {

            result += "\n工作群組 " + (i + 1) + "：";

            for (int j = 0; j < workHours[i].length; j++) {
                result += workHours[i][j];

                if (j < workHours[i].length - 1) {
                    result += ", ";
                }
            }
        }

        result += "\n\n總工時：" + totalHours;
        result += "\n人工成本：" + laborCost;
        result += "\n折扣前報價：" + quotedPrice;
        result += "\n最終報價：" + finalPrice;
        result += "\n案件狀態：" + getStatus();

        return result;
    }

    // ==================================================
    // static methods
    // ==================================================
    public static int getProjectCount() {
        return projectCount;
    }

    public static double getCompanyFinalPriceTotal() {
        return companyFinalPriceTotal;
    }

    public static String showCompanySummary() {

        return "===== static 公司報價統計 ====="
                + "\n已計算專案數：" + projectCount
                + "\n公司累積最終報價：" + companyFinalPriceTotal;
    }

    public static void resetCompanyData() {

        projectCount = 0;
        companyFinalPriceTotal = 0;
    }
}
