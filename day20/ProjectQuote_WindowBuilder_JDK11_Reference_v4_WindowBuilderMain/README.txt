企業客戶專案報價與成本管理系統
Eclipse + WindowBuilder + JDK 11 參考解答

package：
com

Java 檔只有 3 個：
1. ProjectQuote.java
   - private field
   - constructor
   - setter / getter
   - Jagged Array
   - nested loop
   - 商務報價 methods
   - static 專案統計

2. testMain.java
   - Console 測試
   - 啟動 JFrameUI

3. JFrameUI.java
   - JPanel
   - JLabel
   - JTextField
   - JTextArea
   - JComboBox
   - JRadioButton
   - JCheckBox
   - JTable
   - JButton

Mouse Event 寫法：
WindowBuilder Design
-> 右鍵 JButton
-> Add event handler
-> Mouse
-> mouseClicked

本參考解答的真正事件 methods：
btnCalculateMouseClicked(...)
btnAddMouseClicked(...)
btnStatisticsMouseClicked(...)
btnCompanyMouseClicked(...)
btnClearMouseClicked(...)
btnDeleteMouseClicked(...)
btnResetMouseClicked(...)

全部集中寫在 JFrameUI.java 最底下。

匯入 Eclipse：
File
-> Import
-> Existing Projects into Workspace
-> Select archive file
-> 選擇 ZIP

執行：
com.testMain
-> Run As
-> Java Application

WindowBuilder：
JFrameUI.java
-> Open With
-> WindowBuilder Editor
-> Design


【v3 JTable 修正版】
1. 「加入資料表」不再強制要求先按「計算報價」。
2. 如果 currentProject == null，會先自動執行 btnCalculateMouseClicked(e)。
3. 新增資料時直接使用：
   DefaultTableModel model =
       (DefaultTableModel) tableProject.getModel();
   model.addRow(row);
4. 刪除資料也直接從 tableProject.getModel() 取得目前 Model。
5. 成功加入 JTable 後 currentProject = null，下一筆資料會重新建立。


【v4 WindowBuilder main() 修正版】
JFrameUI.java 已加入 WindowBuilder 常見的標準啟動方式：

import java.awt.EventQueue;

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

因此可直接：
JFrameUI.java -> Run As -> Java Application

testMain.java 仍保留，作為物件與 Console 測試用。
