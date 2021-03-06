package com.alex.dialogdemo.dialog;

import android.content.Context;
import android.view.View;

import com.alex.dialogdemo.R;
import com.alex.dialogdemo.dialog.base.Top2BottomDialog;

import org.alex.dialog.annotation.ClickPosition;
/**
 * 作者：Alex
 * 时间：2016年09月10日    17:40
 * 简述：
 */

public class NoticeDialog extends Top2BottomDialog<NoticeDialog> {
    public NoticeDialog(Context context) {
        super(context);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.dialog_notice;
    }

    @Override
    public void onCreateData() {
        setOnCilckListener(R.id.tv_submit,R.id.tv_cancel);
    }

    @Override
    public void onClick(View v, int id) {
        if(R.id.tv_submit == id){
           onDialogClickListener(ClickPosition.SUBMIT);
        }else  if(R.id.tv_cancel == id){
            onDialogClickListener(ClickPosition.CANCEL);
        }
    }
}
