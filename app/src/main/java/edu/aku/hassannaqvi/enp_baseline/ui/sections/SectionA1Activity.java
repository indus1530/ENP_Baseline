package edu.aku.hassannaqvi.enp_baseline.ui.sections;

import static edu.aku.hassannaqvi.enp_baseline.core.MainApp.moda;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.util.Timer;
import java.util.TimerTask;

import edu.aku.hassannaqvi.enp_baseline.R;
import edu.aku.hassannaqvi.enp_baseline.core.MainApp;
import edu.aku.hassannaqvi.enp_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.enp_baseline.databinding.ActivitySectionA1Binding;
import edu.aku.hassannaqvi.enp_baseline.ui.EndingActivity;

public class SectionA1Activity extends AppCompatActivity {
    private static final String TAG = "SectionA1Activity";
    ActivitySectionA1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a1);
        bi.setModa(moda);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        setupSkips();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");


        bi.a109.setFilters(new InputFilter[]{
                (cs, start, end, spanned, dStart, dEnd) -> cs.toString().replaceAll("[^a-zA-Z ]*", "")
        });


    }


    private void setupSkips() {
    }


    private boolean updateDB() {
        /*if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SB42, mwra.sB42toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }


    public void btnContinue(View view) {
        bi.btnContinue.setEnabled(false);
        Timer buttonTimer = new Timer();
        buttonTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(() -> bi.btnContinue.setEnabled(true));
            }
        }, 10000);

        if (!formValidation()) return;
        saveDraft();
        /*if (updateDB()) {
            finish();
            startActivity(new Intent(this, moda.getA112().equals("2")
                    || moda.getA113().equals("2")
                    || moda.getA114().equals("2") ? EndingActivity.class : SectionA3AActivity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();*/
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
        /*if (Validator.emptyCheckingContainer(this, bi.GrpName)) {
            bi.btnContinue.setEnabled(false);
            return true;
        } else {
            bi.btnContinue.setEnabled(true);
            return false;
        }*/
    }
}