package Service;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class CustomJTable extends JTable {

    public CustomJTable() {
        super();
        customizeTableHeader();
    }

    public CustomJTable(TableModel model) {
        super(model);
        customizeTableHeader();
    }

    // Método para personalizar el renderizador del encabezado de la tabla
    private void customizeTableHeader() {
        JTableHeader header = getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (c instanceof JLabel) {
                    JLabel label = (JLabel) c;
                    label.setHorizontalAlignment(SwingConstants.LEFT);
                    label.setForeground(Color.WHITE);
                    Font font = label.getFont().deriveFont(Font.BOLD | Font.PLAIN);
                    label.setFont(font);
                    label.setOpaque(true);
                    label.setBackground(new Color(35, 57, 82));//5,106,217
                }
                return c;
            }
        });
    }

}
