package com.example.jinhui.notcopyedittext.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jinhui.notcopyedittext.R;

/**
 * Android edittext 禁止复制粘贴问题解决方案
 * https://blog.csdn.net/myislijingjing/article/details/73431614
 * <p>
 * https://blog.csdn.net/springflash/article/details/80678872
 * <p>
 * Android EditText屏蔽粘贴功能
 * https://blog.csdn.net/shiwuxuege/article/details/53391025
 *
 * stackoverflow给出的解释:
 * 禁止光标下方的指示弹出粘贴菜单
 * https://stackoverflow.com/questions/41673185/disable-edittext-context-menu
 *
 * EditText禁止复制粘贴、禁止光标下方的指示弹出粘贴菜单
 */
public class MainActivity1 extends AppCompatActivity {

    MenuHidingEditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        edittext = findViewById(R.id.et);

        edittext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() >= 10){
                    Toast.makeText(MainActivity1.this, "输入字数最大", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




    }
}
