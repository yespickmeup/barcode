/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcode;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Guinness
 */
public class Srpt_print_barcodes {

    public final List<Srpt_print_barcodes.field> fields;

    public Srpt_print_barcodes() {
        this.fields = new ArrayList();
    }

    public static class field {

        String barcode;
        String description;
        double price;
        boolean selected;
        int count;

        public field() {
        }

        public field(String barcode, String description, double price, boolean selected, int count) {
            this.barcode = barcode;
            this.description = description;
            this.price = price;
            this.selected = selected;
            this.count = count;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

        public String getBarcode() {
            return barcode;
        }

        public void setBarcode(String barcode) {
            this.barcode = barcode;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

    }

    public static void main(String[] args) {

        List<Srpt_print_barcodes.field> fields = new ArrayList();
        for (int i = 0; i < 300; i++) {
            String barcode = "0000000" + i;
            String description = "Description";
            double price = 100;
            Srpt_print_barcodes.field field = new field(barcode, description, price, true, 1);
            fields.add(field);
        }
        Srpt_print_barcodes rpt = new Srpt_print_barcodes();
        rpt.fields.addAll(fields);
        String jrxml = "rpt_print_barcodes.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_print_barcodes.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_print_barcodes to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

}
