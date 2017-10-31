package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;

public final class i
  implements DialogInterface.OnClickListener
{
  private final Intent Jy;
  private final Fragment akY;
  private final int akZ;
  private final Activity mActivity;
  
  public i(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.mActivity = paramActivity;
    this.akY = null;
    this.Jy = paramIntent;
    this.akZ = 2;
  }
  
  public i(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    this.mActivity = null;
    this.akY = paramFragment;
    this.Jy = paramIntent;
    this.akZ = 2;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.Jy != null) && (this.akY != null)) {
        this.akY.startActivityForResult(this.Jy, this.akZ);
      }
      for (;;)
      {
        paramDialogInterface.dismiss();
        return;
        if (this.Jy != null) {
          this.mActivity.startActivityForResult(this.Jy, this.akZ);
        }
      }
      return;
    }
    catch (ActivityNotFoundException paramDialogInterface) {}
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */