
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.Serializable;
import java.util.Date;
//import javax.swing.*;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author bala
 */
public final class ReadingEntryPanel extends JPanel implements Serializable {

    private GridLinesType gridLinesType;
    private double desiredSmoothnessPercentage = 0.0;
    protected JTextField slNoField;
    private JTextField ipNoField;
    protected JTextField pumpTypeField;
    private JTextField ratingField;
    private JTextField headField;
    private JTextField dischField;
    private JTextField effField;
    private JTextField currField;
    private JTextField voltField;
    private JTextField phaseField;
    private JTextField freqField;
    private JTextField hRangeLwrField;
    private JTextField hRangeUprField;
    private JTextField delSizeField;
    private JTextField gaugDistField;
    private JTextField isRefField;
    private JTextField remarksField;
    // private JTextField dateStringField;
    public JTable table;
    protected JDateChooser dateChooser;
    private JTextField dischMaxForScaleField;
    private JTextField currMaxForScaleField;
    private JTextField headMaxForScaleField;
    private JTextField effMaxForScaleField;
    static final long serialVersionUID = -1881500357011727315L;
    private JTextField suctionSizeField;
    protected JPanel fieldsPanel;

    public ReadingEntryPanel() {
        this.setLayout(null);
        this.setBounds(0, 0, 1024, 768);
        this.setBackground(new Color(236, 233, 216));
        this.addFieldsPanel();
        this.setPreferredSize(new Dimension(1024, 640));
        this.addTable();
        this.addScalePanel();
        JLabel text = new JLabel("Max-axis   values  to  use ;    Leave as  0 for  auto-scale  : ");

        text.setBounds(20, 276, 984, 24);
        this.add(text);
    }

    public void addFieldsPanel() {
        //JPanel upperPanel = new JPanel();
        //upperPanel.setLayout(null);
        InputVerifier iv = new NumericVerifier();
        fieldsPanel = new JPanel();
        fieldsPanel.setBackground(new Color(236, 233, 216));
        //fieldsPanel(setBounds)
        fieldsPanel.setLayout(new GridLayout(11, 4, 25, 5));

        JLabel slNoLabel = new JLabel("Sl. No : ");
        fieldsPanel.add(slNoLabel);
        slNoField = new JTextField("");
        fieldsPanel.add(slNoField);
        JLabel dateLabel = new JLabel("Date : ");
        fieldsPanel.add(dateLabel);
        dateChooser = new JDateChooser(new Date(), "dd-MM-yyyy");
        fieldsPanel.add(dateChooser);
        //    dateStringField = new JTextField("11.01.2011 ");
        //  fieldsPanel.add(dateStringField);
        JLabel ipNoLabel = new JLabel("Inpass No : ");
        fieldsPanel.add(ipNoLabel);
        ipNoField = new JTextField("");
        fieldsPanel.add(ipNoField);
        JLabel pumpTypeLabel = new JLabel("Pump Type : ");
        fieldsPanel.add(pumpTypeLabel);
        pumpTypeField = new JTextField("");
        fieldsPanel.add(pumpTypeField);
        JLabel ratingLabel = new JLabel("Motor Rating(kW/HP) :   ");
        fieldsPanel.add(ratingLabel);
        ratingField = new JTextField("");
        fieldsPanel.add(ratingField);
        JLabel headLabel = new JLabel("Head (m) : ");
        fieldsPanel.add(headLabel);
        headField = new JTextField("");
        headField.setInputVerifier(iv);
        fieldsPanel.add(headField);
        JLabel dischLabel = new JLabel("Discharge (lps) : ");
        fieldsPanel.add(dischLabel);
        dischField = new JTextField("");
        dischField.setInputVerifier(iv);
        fieldsPanel.add(dischField);
        JLabel effLabel = new JLabel("Overall Eff. (%) : ");
        fieldsPanel.add(effLabel);
        effField = new JTextField("");
        effField.setInputVerifier(iv);
        fieldsPanel.add(effField);
        JLabel currLabel = new JLabel("Max.current(A) : ");
        fieldsPanel.add(currLabel);
        currField = new JTextField("");
        currField.setInputVerifier(iv);
        fieldsPanel.add(currField);
        JLabel voltLabel = new JLabel("Voltage(V)  : ");
        fieldsPanel.add(voltLabel);
        voltField = new JTextField("240");
        voltField.setInputVerifier(iv);
        fieldsPanel.add(voltField);
        JLabel phaseLabel = new JLabel("Phase  : ");
        fieldsPanel.add(phaseLabel);
        phaseField = new JTextField(" 1 ");
        phaseField.setInputVerifier(iv);
        fieldsPanel.add(phaseField);
        JLabel freqLabel = new JLabel("Frequency(Hz)  : ");
        fieldsPanel.add(freqLabel);
        freqField = new JTextField("50.0");
        freqField.setInputVerifier(iv);
        fieldsPanel.add(freqField);



        JLabel hRangeLwrLabel = new JLabel("Head Range Lower(m) : ");
        fieldsPanel.add(hRangeLwrLabel);
        hRangeLwrField = new JTextField("");
        hRangeLwrField.setInputVerifier(iv);
        fieldsPanel.add(hRangeLwrField);
        JLabel hRangeUprLabel = new JLabel("Head Range Upper(m)  : ");
        fieldsPanel.add(hRangeUprLabel);
        hRangeUprField = new JTextField("");
        hRangeUprField.setInputVerifier(iv);
        fieldsPanel.add(hRangeUprField);
        JLabel suctionSizeLabel = new JLabel("Suction size(mm) : ");
        fieldsPanel.add(suctionSizeLabel);
        suctionSizeField = new JTextField("");
        suctionSizeField.setInputVerifier(iv);
        fieldsPanel.add(getSuctionSizeField());
        JLabel delSizeLabel = new JLabel("Delivery size(mm) : ");
        fieldsPanel.add(delSizeLabel);
        delSizeField = new JTextField("25");
        delSizeField.setInputVerifier(iv);
        fieldsPanel.add(delSizeField);
        JLabel gaugDistLabel = new JLabel("Gauge Distance(m)  : ");
        fieldsPanel.add(gaugDistLabel);
        gaugDistField = new JTextField("1.4");
        gaugDistField.setInputVerifier(iv);
        fieldsPanel.add(gaugDistField);
        JLabel isRefLabel = new JLabel("IS Ref  : ");
        fieldsPanel.add(isRefLabel);
        isRefField = new JTextField("");
        isRefField.setText("IS 9079");
        fieldsPanel.add(isRefField);

        JLabel remarksLabel = new JLabel("Remarks  : ");
        fieldsPanel.add(remarksLabel);
        remarksField = new JTextField("   ");
        fieldsPanel.add(remarksField);
        fieldsPanel.setBounds(20, 0, 984, 276);
        add(fieldsPanel);
        fieldsPanel.setVisible(true);
        setVisible(true);

    }

    class NumericVerifier extends InputVerifier {

        public boolean verify(JComponent input) {
            JTextField tf = (JTextField) input;
            try {
                double ok = Double.parseDouble(tf.getText());

                return true;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(ReadingEntryPanel.this, "Here , you can enter numbers only!");
            return false;
        }
    }

    public void addScalePanel() {
        JPanel scalePanel = new JPanel();
        InputVerifier iv = new NumericVerifier();
        scalePanel.setBackground(new Color(236, 233, 216));
        scalePanel.setLayout(new GridLayout(1, 8));
        /**
         * JLabel text1 = new JLabel("Max Axis"); JLabel text2 =new JLabel("
         * Values");
         *
         * JLabel text3 = new JLabel("for use"); JLabel text4 = new JLabel("in
         * scaling"); JLabel text5 = new JLabel( "Leave"); JLabel text6 = new
         * JLabel( " as 0 "); JLabel text7 =new JLabel("for auto"); JLabel text8
         * = new JLabel( "-scale"); scalePanel.add(text1);
         * scalePanel.add(text2); scalePanel.add(text3); scalePanel.add(text4);
         * scalePanel.add(text5); scalePanel.add(text6); scalePanel.add(text7);
        scalePanel.add(text8);*
         */
        JLabel dischMaxLabel = new JLabel("Max.Disch(lps) : ");
        scalePanel.add(dischMaxLabel);
        this.dischMaxForScaleField = new JTextField("0.0");
        dischMaxForScaleField.setInputVerifier(iv);
        scalePanel.add(dischMaxForScaleField);

        JLabel headMaxLabel = new JLabel("    Max.Head(m) : ");
        scalePanel.add(headMaxLabel);
        headMaxForScaleField = new JTextField("0.0");
        headMaxForScaleField.setInputVerifier(iv);
        scalePanel.add(headMaxForScaleField);

        JLabel EffMaxLabel = new JLabel("   Max.Eff(%) : ");
        scalePanel.add(EffMaxLabel);
        this.effMaxForScaleField = new JTextField("0.0");
        //setEffMaxForScaleField(new JTextField("0.0"));
        effMaxForScaleField.setInputVerifier(iv);
        scalePanel.add(effMaxForScaleField);

        JLabel currMaxLabel = new JLabel("          Max. Curr(A) : ");
        scalePanel.add(currMaxLabel);
        this.currMaxForScaleField = new JTextField("0.0");
        currMaxForScaleField.setInputVerifier(iv);
        scalePanel.add(currMaxForScaleField);

        scalePanel.setBounds(20, 300, 984, 25);
        add(scalePanel);
        scalePanel.setVisible(true);
        setVisible(true);

    }

    public void addTable() {

//DefaultTableModel model = new DefaultTableModel();
        NumericTableModel model = new NumericTableModel();
        table = new JTable(model);
        table.setBackground(new Color(236, 233, 216));

        model.addColumn("No.");

        model.addColumn("Frequency in Hz");
        model.addColumn("<HTML>Suction Gauge<BR> Reading in mmHg</HTML>");
        model.addColumn("<HTML>Delivery Gauge<BR>Reading in m</HTML>");

        model.addColumn("Discharge in lps");

        model.addColumn("Voltage in V");

        model.addColumn("Current in A");

        model.addColumn("Power in kW");
        table.getTableHeader().setPreferredSize(new Dimension(table.getColumnModel().getTotalColumnWidth(), 40));
        table.setRowHeight(24);
        table.setRowMargin(3);
        for (int k = 1; k < 9; k++) {
            Object[] rowData = {k, "", " ", " ", " ", " ", " ", " "};
            model.addRow(rowData);
        }
        /*
         * Object[] rowData0 = {"1 ", "50.00 ","450", "34.5 ", "0.00 ", "220 ",
         * "7.30 ", "1.60 "}; model.addRow(rowData0); Object[] rowData1 = {"1 ",
         * "50.20 ","450", "33.06 ", "0.55 ", "220 ", "7.60 ", "1.69 "};
         * model.addRow(rowData1); Object[] rowData2 = {"1 ", "50.20 ","450",
         * "28.20 ", "0.98", "220 ", "7.86 ", "1.76 "}; model.addRow(rowData2);
         * Object[] rowData3 = {"1 ", "50.10 ","450", "26.35 ", "1.28 ", "220 ",
         * "8.10 ", "1.81 "}; model.addRow(rowData3); Object[] rowData4 = {"1 ",
         * "50.20 ","450", "24.53", "1.59 ", "220 ", "8.40 ", "1.87 "};
         * model.addRow(rowData4); Object[] rowData5 = {"1 ", "50.10 ","450",
         * "22.68 ", "1.79 ", "220 ", "8.50 ", "1.91 "}; model.addRow(rowData5);
         * Object[] rowData6 = {"1 ", "50.20 ","450", "18.98 ", "2.15 ", "220 ",
         * "8.76 ", "1.95 "}; model.addRow(rowData6); Object[] rowData7 = {"1 ",
         * "50.00 ","450", "9.53 ", "2.69 ", "220 ", "8.98 ", "1.99 "};
        model.addRow(rowData7);
         */
//Object[] rowData8 =  {"","", " ", " ", " ", " ", " ", " "};
        //      model.addRow(rowData8);






        //0  for (int i = 0; i < 10; i++) {
        // model.addRow(rowData);
        //      table.setValueAt(i + 1, i, 0);
        // }
        Object[] rowData9 = {"Multiplication Factor", "1", "1 ", "1 ", "1 ", "1 ", "1 ", "0.001 "};
        model.addRow(rowData9);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new RPStatusColumnCellRenderer());
        }


        JScrollPane tScroller = new JScrollPane(table);
        tScroller.setBounds(20, 326, 984, 288);
        add(tScroller);
        setVisible(true);
    }

    public void useSavedValues(EntryValues values) {
        this.slNoField.setText(values.getSlNoFieldString());
        ipNoField.setText(values.getIpNoFieldString());
        pumpTypeField.setText(values.getPumpTypeFieldString());
        ratingField.setText(values.getRatingFieldString());
        headField.setText(values.getHeadFieldString());
        dischField.setText(values.getDischFieldString());
        effField.setText(values.getEffFieldString());
        currField.setText(values.getCurrFieldString());
        voltField.setText(values.getVoltFieldString());
        phaseField.setText(values.getPhaseFieldString());
        freqField.setText(values.getFreqFieldString());
        hRangeLwrField.setText(values.gethRangeLwrFieldString());
        hRangeUprField.setText(values.gethRangeUprFieldString());
        delSizeField.setText(values.getDelSizeFieldString());
        gaugDistField.setText(values.getGaugDistFieldString());
        isRefField.setText(values.getIsRefFieldString());
        remarksField.setText(values.getRemarksFieldString());
        this.suctionSizeField.setText(values.getSuctionSizeFieldString());
        getDateChooser().setDate(values.getDateFieldDate());
        int vRows = values.getTableValueStrings().length;
        int vCols = 0;//default
        if (vRows != 0) {
            vCols = values.getTableValueStrings()[0].length;
        }
        String[][] tableValues = values.getTableValueStrings();
        for (int i = 0; i < vRows; i++) {
            if (i >= table.getRowCount()) {
                break;
            }
            for (int j = 0; j < vCols; j++) {

                table.setValueAt(tableValues[i][j], i, j);
            }
        }



    }

    public void useSavedTypeValues(TypeValues values) {

        pumpTypeField.setText(values.getPumpTypeFieldString());
        ratingField.setText(values.getRatingFieldString());
        headField.setText(values.getHeadFieldString());
        dischField.setText(values.getDischFieldString());
        effField.setText(values.getEffFieldString());
        currField.setText(values.getCurrFieldString());
        voltField.setText(values.getVoltFieldString());
        phaseField.setText(values.getPhaseFieldString());
        freqField.setText(values.getFreqFieldString());
        hRangeLwrField.setText(values.gethRangeLwrFieldString());
        hRangeUprField.setText(values.gethRangeUprFieldString());
        delSizeField.setText(values.getDelSizeFieldString());
        suctionSizeField.setText(values.getSuctionSizeFieldString());
        isRefField.setText(values.getIsRefFieldString());

    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        ReadingEntryPanel rPanel = new ReadingEntryPanel();
        f.setSize(768, 100);
        f.setLocation(100, 100);
        f.getContentPane().add(rPanel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    /**
     * @return the slNoField
     */
    public JTextField getSlNoField() {
        return slNoField;
    }

    /**
     * @return the ipNoField
     */
    public JTextField getIpNoField() {
        return ipNoField;
    }

    /**
     * @return the pumpTypeField
     */
    public JTextField getPumpTypeField() {
        return pumpTypeField;
    }

    /**
     * @return the ratingField
     */
    public JTextField getRatingField() {
        return ratingField;
    }

    /**
     * @return the headField
     */
    public JTextField getHeadField() {
        return headField;
    }

    /**
     * @return the dischField
     */
    public JTextField getDischField() {
        return dischField;
    }

    /**
     * @return the effField
     */
    public JTextField getEffField() {
        return effField;
    }

    /**
     * @return the currField
     */
    public JTextField getCurrField() {
        return currField;
    }

    /**
     * @return the voltField
     */
    public JTextField getVoltField() {
        return voltField;
    }

    /**
     * @return the phaseField
     */
    public JTextField getPhaseField() {
        return phaseField;
    }

    /**
     * @return the freqField
     */
    public JTextField getFreqField() {
        return freqField;
    }

    /**
     * @return the hRangeLwrField
     */
    public JTextField gethRangeLwrField() {
        return hRangeLwrField;
    }

    /**
     * @return the hRangeUprField
     */
    public JTextField gethRangeUprField() {
        return hRangeUprField;
    }

    /**
     * @return the delSizeField
     */
    public JTextField getDelSizeField() {
        return delSizeField;
    }

    /**
     * @return the gaugDistField
     */
    public JTextField getGaugDistField() {
        return gaugDistField;
    }

    /**
     * @return the isRefField
     */
    public JTextField getIsRefField() {
        return isRefField;
    }

    /**
     * @return the remarksField
     */
    public JTextField getRemarksField() {
        return remarksField;
    }
//  public JTextField getDatestringField() {
    //    return dateStringField;
    //  }

    /**
     * @return the table
     */
    public JTable getTable() {
        return table;
    }

    /**
     * @return the suctionSizeField
     */
    public JTextField getSuctionSizeField() {
        return suctionSizeField;
    }

    /**
     * @return the dateChooser
     */
    public JDateChooser getDateChooser() {
        return dateChooser;
    }

    /**
     * @return the gridLinesType
     */
    public GridLinesType getGridLinesType() {
        return gridLinesType;
    }

    /**
     * @param gridLinesType the gridLinesType to set
     */
    public void setGridLinesType(GridLinesType gridLinesType) {
        this.gridLinesType = gridLinesType;
    }

    /**
     * @return the dischMaxForScaleField
     */
    public JTextField getDischMaxForScaleField() {
        return dischMaxForScaleField;
    }

    /**
     * @param dischMaxForScaleField the dischMaxForScaleField to set
     */
    public void setDischMaxForScaleField(JTextField dischMaxForScaleField) {
        this.dischMaxForScaleField = dischMaxForScaleField;
    }

    /**
     * @return the currMaxForScaleField
     */
    public JTextField getCurrMaxForScaleField() {
        return currMaxForScaleField;
    }

    /**
     * @param currMaxForScaleField the currMaxForScaleField to set
     */
    public void setCurrMaxForScaleField(JTextField currMaxForScaleField) {
        this.currMaxForScaleField = currMaxForScaleField;
    }

    /**
     * @return the headMaxForScaleField
     */
    public JTextField getHeadMaxForScaleField() {
        return headMaxForScaleField;
    }

    /**
     * @param headMaxForScaleField the headMaxForScaleField to set
     */
    public void setHeadMaxForScaleField(JTextField headMaxForScaleField) {
        this.headMaxForScaleField = headMaxForScaleField;
    }

    /**
     * @return the effMaxForScaleField
     */
    public JTextField getEffMaxForScaleField() {
        return effMaxForScaleField;
    }

    /**
     * @param effMaxForScaleField the effMaxForScaleField to set
     */
    public void setEffMaxForScaleField(JTextField effMaxForScaleField) {
        this.effMaxForScaleField = effMaxForScaleField;
    }

    /**
     * @return the DesiredSmoothnessPercentage
     */
    public double getDesiredSmoothnessPercentage() {
        return desiredSmoothnessPercentage;
    }

    /**
     * @param DesiredSmoothnessPercentage the DesiredSmoothnessPercentage to set
     */
    public void setDesiredSmoothnessPercentage(double desiredSmoothnessPercentage) {
        this.desiredSmoothnessPercentage = desiredSmoothnessPercentage;
    }

    /**
     * @return the dateChooser
     */
    //  public JDateChooser getDateChooser() {
    //     return dateChooser;
    //}
    private static class NumericTableModel extends DefaultTableModel {

        public NumericTableModel() {
        }

        @Override
        public Class getColumnClass(int col) {
            return Double.class;

        }
    }
}

class RPStatusColumnCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        //Cells are by default rendered as a JLabel.
        JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        //Get the status for the current row.
        //CustomTableModel tableModel = (CustomTableModel) table.getModel();
        // if (tableModel.getStatus(row) == CustomTableModel.APPROVED) {
        if (isSelected && hasFocus) {
            l.setBackground(Color.GREEN);

        } else {
            l.setBackground(Color.CYAN);
        }
        //} else {
        // l.setBackground(Color.RED);
        // }

        //Return the JLabel which renders the cell.
        return l;

    }
}