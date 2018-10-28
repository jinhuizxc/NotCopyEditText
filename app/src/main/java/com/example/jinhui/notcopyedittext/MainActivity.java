package com.example.jinhui.notcopyedittext;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Android edittext 禁止复制粘贴问题解决方案
 * https://blog.csdn.net/myislijingjing/article/details/73431614
 * <p>
 * https://blog.csdn.net/springflash/article/details/80678872
 * <p>
 * Android EditText屏蔽粘贴功能
 * https://blog.csdn.net/shiwuxuege/article/details/53391025
 */
public class MainActivity extends AppCompatActivity {

    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.et);


        edittext.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                //to keep the text selection capability available ( selection cursor)
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                //to prevent the menu from appearing
                menu.clear();
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {

            }
        });

//        edittext.setEnabled(false);
//        edittext.setLongClickable(false);
//        edittext.setTextIsSelectable(false);
//        edittext.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
//            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
//                Log.i("ikms", "onCreateActionMode");
//                return false;
//            }
//
//            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
//                return false;
//            }
//
//            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
//                return false;
//            }
//
//            public void onDestroyActionMode(ActionMode actionMode) {
//            }
//        });

//        // 编辑框禁止触发长按事件
//        edittext.setLongClickable(false);
//        // 禁止编辑框横屏时弹出另外一个编辑界面
//        edittext.setImeOptions(EditorInfo.IME_FLAG_NO_EXTRACT_UI);
//        // 编辑框点击事件

//        edittext.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                InputMethodManager imm = (InputMethodManager) edittext.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
//                // 允许编辑框触摸获焦
//                edittext.setFocusableInTouchMode(true);
//                edittext.requestFocus();
//                // 编辑框强制弹出键盘
//                imm.showSoftInput(edittext, imm.SHOW_FORCED);
//                // 禁止编辑框触摸获焦
//                edittext.setFocusableInTouchMode(false);
//            }
//        });


//        edittext.setLongClickable(false);
//        edittext.setTextIsSelectable(false);
//
//        edittext.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
//            @Override
//            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
//                return false;
//            }
//
//            @Override
//            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
//                return false;
//            }
//
//            @Override
//            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
//                return false;
//            }
//
//            @Override
//            public void onDestroyActionMode(ActionMode mode) {
//
//            }
//        });

    }
}
