package com;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class JFrameUI extends JFrame {

    private static final long serialVersionUID = 1L;

    // ==================================================
    // UI fields
    // ==================================================
    private JPanel contentPane;

    private JTextField txtProjectNo;
    private JTextField txtBudget;
    private JTextField txtHourlyCost;
    private JTextField txtDiscount;

    private JComboBox<String> cboProjectType;

    private JRadioButton rdoNormal;
    private JRadioButton rdoVip;
    private ButtonGroup clientGroup;

    private JCheckBox chkUrgent;
    private JCheckBox chkMaintenance;

    private JTextArea txtWorkHours;
    private JTextArea txtResult;

    private JTable tableProject;
    private DefaultTableModel tableModel;

    private ProjectQuote currentProject;

    // ==================================================
    // WindowBuilder 標準 main()
    // ==================================================
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {

                    JFrameUI frame = new JFrameUI();
                    frame.setVisible(true);

                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
        });
    }

    // ==================================================
    // constructor
    // ==================================================
    public JFrameUI() {

        setTitle("企業客戶專案報價與成本管理系統");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1050, 720);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle =
                new JLabel("企業客戶專案報價與成本管理系統");

        lblTitle.setFont(
                new Font("Microsoft JhengHei",
                        Font.BOLD, 20));

        lblTitle.setBounds(330, 10, 380, 35);
        contentPane.add(lblTitle);

        // ==================================================
        // JPanel：基本資料
        // ==================================================
        JPanel pnlBasic = new JPanel();
        pnlBasic.setBorder(
                new TitledBorder("專案基本資料"));
        pnlBasic.setBounds(20, 55, 480, 250);
        pnlBasic.setLayout(null);
        contentPane.add(pnlBasic);

        JLabel lblProjectNo = new JLabel("專案編號：");
        lblProjectNo.setBounds(25, 35, 100, 25);
        pnlBasic.add(lblProjectNo);

        txtProjectNo = new JTextField("1001");
        txtProjectNo.setBounds(125, 35, 120, 25);
        pnlBasic.add(txtProjectNo);

        JLabel lblBudget = new JLabel("預算上限：");
        lblBudget.setBounds(25, 75, 100, 25);
        pnlBasic.add(lblBudget);

        txtBudget = new JTextField("180000");
        txtBudget.setBounds(125, 75, 120, 25);
        pnlBasic.add(txtBudget);

        JLabel lblHourlyCost = new JLabel("每小時成本：");
        lblHourlyCost.setBounds(25, 115, 100, 25);
        pnlBasic.add(lblHourlyCost);

        txtHourlyCost = new JTextField("850");
        txtHourlyCost.setBounds(125, 115, 120, 25);
        pnlBasic.add(txtHourlyCost);

        JLabel lblDiscount = new JLabel("折扣率 %：");
        lblDiscount.setBounds(25, 155, 100, 25);
        pnlBasic.add(lblDiscount);

        txtDiscount = new JTextField("5");
        txtDiscount.setBounds(125, 155, 120, 25);
        pnlBasic.add(txtDiscount);

        JLabel lblProjectType =
                new JLabel("專案類型：");
        lblProjectType.setBounds(275, 35, 90, 25);
        pnlBasic.add(lblProjectType);

        cboProjectType = new JComboBox<String>();
        cboProjectType.setModel(
                new DefaultComboBoxModel<String>(
                        new String[] {
                                "Web",
                                "AI",
                                "Data"
                        }));

        cboProjectType.setSelectedIndex(1);
        cboProjectType.setBounds(355, 35, 95, 25);
        pnlBasic.add(cboProjectType);

        JLabel lblClient = new JLabel("客戶等級：");
        lblClient.setBounds(275, 80, 90, 25);
        pnlBasic.add(lblClient);

        rdoNormal = new JRadioButton("一般");
        rdoNormal.setSelected(true);
        rdoNormal.setBounds(350, 78, 60, 25);
        pnlBasic.add(rdoNormal);

        rdoVip = new JRadioButton("VIP");
        rdoVip.setBounds(410, 78, 55, 25);
        pnlBasic.add(rdoVip);

        clientGroup = new ButtonGroup();
        clientGroup.add(rdoNormal);
        clientGroup.add(rdoVip);

        chkUrgent = new JCheckBox("急件 +12%");
        chkUrgent.setSelected(true);
        chkUrgent.setBounds(275, 125, 120, 25);
        pnlBasic.add(chkUrgent);

        chkMaintenance =
                new JCheckBox("維護服務 +18000");

        chkMaintenance.setSelected(true);
        chkMaintenance.setBounds(275, 165, 160, 25);
        pnlBasic.add(chkMaintenance);

        // ==================================================
        // JPanel：Jagged Array
        // ==================================================
        JPanel pnlWorkHours = new JPanel();

        pnlWorkHours.setBorder(
                new TitledBorder(
                        "工作群組工時（每列長度可不同）"));

        pnlWorkHours.setBounds(520, 55, 490, 250);
        pnlWorkHours.setLayout(null);
        contentPane.add(pnlWorkHours);

        JLabel lblHint =
                new JLabel(
                        "<html>每列一個工作群組，逗號分隔階段工時<br>"
                        + "例如：12,18</html>");

        lblHint.setBounds(20, 25, 440, 45);
        pnlWorkHours.add(lblHint);

        JScrollPane workScroll = new JScrollPane();
        workScroll.setBounds(20, 80, 445, 145);
        pnlWorkHours.add(workScroll);

        txtWorkHours = new JTextArea();
        txtWorkHours.setText(
                "12,18\n"
                + "20,25,16,14\n"
                + "10,12,8");

        workScroll.setViewportView(txtWorkHours);

        // ==================================================
        // JButton
        // WindowBuilder 可用：
        // 右鍵 -> Add event handler
        // -> Mouse -> mouseClicked
        // ==================================================

        JButton btnCalculate =
                new JButton("計算報價");

        btnCalculate.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(
                            MouseEvent e) {

                        btnCalculateMouseClicked(e);
                    }
                });

        btnCalculate.setBounds(30, 325, 115, 32);
        contentPane.add(btnCalculate);

        JButton btnAdd =
                new JButton("加入資料表");

        btnAdd.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(
                            MouseEvent e) {

                        btnAddMouseClicked(e);
                    }
                });

        btnAdd.setBounds(160, 325, 125, 32);
        contentPane.add(btnAdd);

        JButton btnStatistics =
                new JButton("JTable 統計");

        btnStatistics.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(
                            MouseEvent e) {

                        btnStatisticsMouseClicked(e);
                    }
                });

        btnStatistics.setBounds(300, 325, 120, 32);
        contentPane.add(btnStatistics);

        JButton btnCompany =
                new JButton("static 統計");

        btnCompany.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(
                            MouseEvent e) {

                        btnCompanyMouseClicked(e);
                    }
                });

        btnCompany.setBounds(435, 325, 115, 32);
        contentPane.add(btnCompany);

        JButton btnClear =
                new JButton("清除");

        btnClear.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(
                            MouseEvent e) {

                        btnClearMouseClicked(e);
                    }
                });

        btnClear.setBounds(565, 325, 100, 32);
        contentPane.add(btnClear);

        JButton btnDelete =
                new JButton("刪除選取列");

        btnDelete.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(
                            MouseEvent e) {

                        btnDeleteMouseClicked(e);
                    }
                });

        btnDelete.setBounds(680, 325, 125, 32);
        contentPane.add(btnDelete);

        JButton btnReset =
                new JButton("重設統計");

        btnReset.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(
                            MouseEvent e) {

                        btnResetMouseClicked(e);
                    }
                });

        btnReset.setBounds(820, 325, 110, 32);
        contentPane.add(btnReset);

        // ==================================================
        // JTable
        // ==================================================
        JScrollPane tableScroll = new JScrollPane();
        tableScroll.setBounds(20, 375, 990, 145);
        contentPane.add(tableScroll);

        tableModel =
                new DefaultTableModel(
                        new Object[][] {},
                        new String[] {
                                "專案編號",
                                "類型",
                                "客戶",
                                "總工時",
                                "人工成本",
                                "最終報價",
                                "狀態",
                                "急件"
                        }) {

                    private static final long serialVersionUID = 1L;

                    @Override
                    public boolean isCellEditable(
                            int row,
                            int column) {

                        return false;
                    }
                };

        tableProject = new JTable(tableModel);
        tableScroll.setViewportView(tableProject);

        // ==================================================
        // JTextArea：結果
        // ==================================================
        JScrollPane resultScroll = new JScrollPane();
        resultScroll.setBounds(20, 535, 990, 125);
        contentPane.add(resultScroll);

        txtResult = new JTextArea();
        txtResult.setEditable(false);
        resultScroll.setViewportView(txtResult);
    }

    // ==================================================
    // helper methods
    // ==================================================
    private int[][] parseWorkHours(
            String text) {

        String[] rows =
                text.trim().split("\\R");

        int[][] result =
                new int[rows.length][];

        for (int i = 0; i < rows.length; i++) {

            String[] values =
                    rows[i].split(",");

            result[i] =
                    new int[values.length];

            for (int j = 0;
                    j < values.length;
                    j++) {

                result[i][j] =
                        Integer.parseInt(
                                values[j].trim());
            }
        }

        return result;
    }

    private int getProjectTypeCode() {

        return cboProjectType.getSelectedIndex() + 1;
    }

    private int getClientLevelCode() {

        if (rdoVip.isSelected()) {
            return 2;
        }

        return 1;
    }

    private void clearInput() {

        txtProjectNo.setText("");
        txtBudget.setText("");
        txtHourlyCost.setText("");
        txtDiscount.setText("");

        cboProjectType.setSelectedIndex(0);

        rdoNormal.setSelected(true);

        chkUrgent.setSelected(false);
        chkMaintenance.setSelected(false);

        txtWorkHours.setText("");
        txtResult.setText("");

        currentProject = null;

        txtProjectNo.requestFocus();
    }

    // ==================================================
    // mouseClicked methods
    // 全部集中放在 JFrameUI.java 最底下
    // ==================================================

    private void btnCalculateMouseClicked(
            MouseEvent e) {

        try {

            int projectNo =
                    Integer.parseInt(
                            txtProjectNo
                            .getText().trim());

            int budget =
                    Integer.parseInt(
                            txtBudget
                            .getText().trim());

            int hourlyCost =
                    Integer.parseInt(
                            txtHourlyCost
                            .getText().trim());

            double discount =
                    Double.parseDouble(
                            txtDiscount
                            .getText().trim());

            if (projectNo <= 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "專案編號必須大於 0。");

                return;
            }

            if (budget <= 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "預算上限必須大於 0。");

                return;
            }

            if (hourlyCost <= 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "每小時成本必須大於 0。");

                return;
            }

            if (discount < 0
                    || discount > 30) {

                JOptionPane.showMessageDialog(
                        this,
                        "折扣率必須介於 0～30。");

                return;
            }

            if (txtWorkHours
                    .getText()
                    .trim()
                    .equals("")) {

                JOptionPane.showMessageDialog(
                        this,
                        "請輸入工作群組工時。");

                return;
            }

            int[][] workHours =
                    parseWorkHours(
                            txtWorkHours.getText());

            currentProject =
                    new ProjectQuote(
                            projectNo,
                            budget,
                            hourlyCost,
                            discount,
                            getProjectTypeCode(),
                            getClientLevelCode(),
                            chkUrgent.isSelected(),
                            chkMaintenance.isSelected(),
                            workHours
                    );

            currentProject.calculate();

            txtResult.setText(
                    currentProject.show());

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "專案編號、預算、成本、折扣與工時都必須是正確數值。",
                    "輸入錯誤",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnAddMouseClicked(
            MouseEvent e) {

        // 如果尚未按「計算報價」，
        // 先自動執行一次計算。
        if (currentProject == null) {

            btnCalculateMouseClicked(e);

            // 若輸入資料有錯誤，
            // calculate event 不會建立 currentProject。
            if (currentProject == null) {
                return;
            }
        }

        Object[] row = {
                currentProject.getProjectNo(),
                currentProject.getProjectTypeName(),
                currentProject.getClientLevelName(),
                currentProject.getTotalHours(),
                currentProject.getLaborCost(),
                currentProject.getFinalPrice(),
                currentProject.getStatus(),
                currentProject.isUrgent()
                        ? "是" : "否"
        };

        // 直接取得 JTable 目前真正使用的 Model。
        DefaultTableModel model =
                (DefaultTableModel)
                tableProject.getModel();

        model.addRow(row);

        txtResult.setText(
                "資料已成功加入 JTable。\n\n"
                + currentProject.show());

        // 下一筆資料重新建立 ProjectQuote。
        currentProject = null;
    }

    private void btnStatisticsMouseClicked(
            MouseEvent e) {

        int rowCount =
                tableProject.getRowCount();

        if (rowCount == 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "JTable 目前沒有資料。");

            return;
        }

        double totalPrice = 0;
        double maxPrice = 0;

        int acceptedCount = 0;
        int urgentCount = 0;

        for (int i = 0;
                i < rowCount;
                i++) {

            double price =
                    Double.parseDouble(
                            tableProject
                            .getValueAt(i, 5)
                            .toString());

            String status =
                    tableProject
                    .getValueAt(i, 6)
                    .toString();

            String urgent =
                    tableProject
                    .getValueAt(i, 7)
                    .toString();

            totalPrice += price;

            if (i == 0
                    || price > maxPrice) {

                maxPrice = price;
            }

            if (status.equals("可承接")) {
                acceptedCount++;
            }

            if (urgent.equals("是")) {
                urgentCount++;
            }
        }

        double average =
                totalPrice / rowCount;

        txtResult.setText(
                "===== JTable 專案統計 ====="
                + "\n專案筆數：" + rowCount
                + "\n報價總額：" + totalPrice
                + "\n平均報價：" + average
                + "\n可承接專案數：" + acceptedCount
                + "\n急件專案數：" + urgentCount
                + "\n最高最終報價：" + maxPrice);
    }

    private void btnCompanyMouseClicked(
            MouseEvent e) {

        txtResult.setText(
                ProjectQuote
                .showCompanySummary());
    }

    private void btnClearMouseClicked(
            MouseEvent e) {

        clearInput();
    }

    private void btnDeleteMouseClicked(
            MouseEvent e) {

        int row =
                tableProject.getSelectedRow();

        if (row == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "請先選取要刪除的 JTable 資料列。");

            return;
        }

        DefaultTableModel model =
                (DefaultTableModel)
                tableProject.getModel();

        model.removeRow(row);

        txtResult.setText(
                "已刪除選取的 JTable 資料列。");
    }

    private void btnResetMouseClicked(
            MouseEvent e) {

        ProjectQuote.resetCompanyData();

        txtResult.setText(
                ProjectQuote
                .showCompanySummary());
    }
}
