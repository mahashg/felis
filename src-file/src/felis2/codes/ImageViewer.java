package felis2.codes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class ImageViewer {

    private String queryName;
    private ImageJTable ijtable;
    private String title = "Result of Query...";
    private static ImageViewer iv;
    private JFrame frame;

    public ImageViewer(String qname, String[] result, boolean showQueryFrame){
        this.queryName = qname;
        
        frame = new JFrame(title);

        this.ijtable = new ImageJTable(result, Setting.getColumnCount());

        ijtable.setVisible(true);
        JScrollPane pane = new JScrollPane(ijtable);
        
        if(showQueryFrame){
            frame.setLayout(new GridLayout(2, 1)); 
            JLabel query = new JLabel(new ImageIcon(ImageResize.resize(queryName, Setting.getQueryWidth(), Setting.getQueryWidth())));
            query.setVisible(true);
            frame.add(query);
        }else {
            frame.setLayout(new BorderLayout());
        }
        frame.add(pane);

        frame.setSize(Setting.getFrameWidth(), Setting.getFrameHeight());
        frame.setVisible(true);
        iv = this;
    }
    
    private JFrame getFrame() { return frame; }

    public static void disposeAllInstances(){
        iv.getFrame().setVisible(false);
        iv.getFrame().dispose();
    }
}

class ImageJTable extends JTable implements MouseListener{
    private String[] results;
    private int rowCount;
    private int columnCount;

    
    public ImageJTable(String[] result, int cCount){
        super((int)(Math.ceil(result.length / (double)cCount)), cCount);
        this.setTableHeader(null);
       // this.setBorder(new EmptyBorder(0, 0, 0, 0));
       this.setShowGrid(false);
        this.results = result;
        this.columnCount = cCount;
        this.rowCount = (int)(Math.ceil(result.length / (double)columnCount));

        addMouseListener(this);
        setSelectionMode();
        setRowHeight(Setting.getResultHeight());

        showImage();
    }

    private void showImage(){
        for(int i=0 ; i<this.columnCount ; ++i){
           TableColumn col = getColumnModel().getColumn(i);
           col.setPreferredWidth(Setting.getResultWidth());

           col.setCellRenderer(new ImageRenderer());
        }
    }
    
    private void setSelectionMode(){
        setCellSelectionEnabled(true);
        setRowSelectionAllowed(false);
        setColumnSelectionAllowed(false);
    }

    public void mouseClicked(MouseEvent e) {
        int col = getSelectedColumn();
        int row = getSelectedRow();
        
        int index = (columnCount-1)*row + col;
        Setting.setQueryString(results[index]);
        felis2.FELIS2View f = felis2.FELIS2View.getCurrentInStance();
        f.showPreview();
        ImageViewer.disposeAllInstances();
        //ImageVi
     //   System.out.println("Row is: "+row+" Column is: "+col);
    }

    public void mousePressed(MouseEvent e) {
       //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseReleased(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    class ImageRenderer extends DefaultTableCellRenderer {
        JLabel lbl = new JLabel();
        ImageIcon icon;

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

            int index = (columnCount-1)*row + column; 
            if(index >= results.length)
                return new JLabel();
            
            lbl.setIcon(new ImageIcon(ImageResize.resize(results[index], Setting.getResultWidth(), Setting.getResultHeight())));
            lbl.setToolTipText(results[index]);
            return lbl;
        }


    class MyTableModel extends AbstractTableModel {
        public Object getValueAt(int row, int column) {
            return "" + (row * column);
        }

        public int getColumnCount() {
            return columnCount;
        }

        public int getRowCount() {
            return rowCount;
        }
    }
    }
}