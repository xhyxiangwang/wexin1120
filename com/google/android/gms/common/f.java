package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.support.v4.app.h;
import android.support.v4.app.l;
import com.google.android.gms.common.internal.w;

public final class f
  extends h
{
  private DialogInterface.OnCancelListener agJ = null;
  private Dialog oe = null;
  
  public static f b(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    f localf = new f();
    paramDialog = (Dialog)w.h(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    localf.oe = paramDialog;
    if (paramOnCancelListener != null) {
      localf.agJ = paramOnCancelListener;
    }
    return localf;
  }
  
  public final void a(l paraml, String paramString)
  {
    super.a(paraml, paramString);
  }
  
  public final Dialog aF()
  {
    if (this.oe == null) {
      this.oc = false;
    }
    return this.oe;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.agJ != null) {
      this.agJ.onCancel(paramDialogInterface);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */