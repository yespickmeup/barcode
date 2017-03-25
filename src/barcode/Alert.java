/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barcode;

import java.awt.Window;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.CloseDialog;

/**
 *
 * @author Maytopacka
 */
public class Alert {

    public static void main(String[] args) {
        Window p = (Window) new JFrame();
        Dlg_alert nd = Dlg_alert.create(p, true);
        nd.setTitle("");
        nd.do_pass(1, "");
        nd.setCallback(new Dlg_alert.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_alert.OutputData data) {
                closeDialog.ok();
            }
        });
//        nd.setLocationRelativeTo(this);
        Center.setCenter(nd);
        nd.setVisible(true);
    }

    public static void set(int stmt, String msg) {
        Window p = (Window) new JFrame();
        Dlg_alert nd = Dlg_alert.create(p, true);
        nd.setTitle("");
        nd.do_pass(stmt, msg);
        nd.setCallback(new Dlg_alert.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_alert.OutputData data) {
                closeDialog.ok();
            }
        });
//        nd.setLocationRelativeTo(this);
        Center.setCenter(nd);
        nd.setVisible(true);
    }
}
