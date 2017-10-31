package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;

public class RealnameGuideHelper
  implements Parcelable
{
  public static final Parcelable.Creator<RealnameGuideHelper> CREATOR;
  private int hys;
  private String nxh;
  private String nxi;
  private String nxj;
  private String nxk;
  private String nxl;
  private int rMi;
  private boolean rMj;
  
  static
  {
    GMTrace.i(6855170457600L, 51075);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6855170457600L, 51075);
  }
  
  public RealnameGuideHelper()
  {
    GMTrace.i(6854230933504L, 51068);
    this.nxj = "";
    this.nxk = "";
    this.nxl = "";
    this.rMj = false;
    GMTrace.o(6854230933504L, 51068);
  }
  
  public RealnameGuideHelper(Parcel paramParcel)
  {
    GMTrace.i(6854365151232L, 51069);
    this.nxj = "";
    this.nxk = "";
    this.nxl = "";
    this.rMj = false;
    this.nxh = paramParcel.readString();
    this.nxi = paramParcel.readString();
    this.nxj = paramParcel.readString();
    this.nxk = paramParcel.readString();
    this.nxl = paramParcel.readString();
    this.hys = paramParcel.readInt();
    this.rMi = paramParcel.readInt();
    GMTrace.o(6854365151232L, 51069);
  }
  
  public final void a(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2)
  {
    GMTrace.i(19315810107392L, 143914);
    this.rMi = paramInt1;
    this.nxh = paramString1;
    this.nxi = paramString2;
    this.nxj = paramString3;
    this.nxk = paramString4;
    this.nxl = paramString5;
    this.hys = paramInt2;
    GMTrace.o(19315810107392L, 143914);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    GMTrace.i(6854499368960L, 51070);
    a(paramString1, 0, paramString2, paramString3, paramString4, paramString5, paramInt);
    GMTrace.o(6854499368960L, 51070);
  }
  
  public final boolean a(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(19315944325120L, 143915);
    boolean bool = a(paramMMActivity, paramBundle, paramOnClickListener, false);
    GMTrace.o(19315944325120L, 143915);
    return bool;
  }
  
  public final boolean a(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    GMTrace.i(19316078542848L, 143916);
    w.d("MicroMsg.RealnameGuideHelper", "doIfNeedSetPwd sendPwdMsg %s mEntryScene %s guide_wording %s upload_credit_url %s left_button_wording %s right_button_wording %s hadShow %s guide_flag %s", new Object[] { Integer.valueOf(this.rMi), Integer.valueOf(this.hys), this.nxi, this.nxl, this.nxj, this.nxk, Boolean.valueOf(this.rMj), this.nxh });
    if (this.rMj)
    {
      GMTrace.o(19316078542848L, 143916);
      return false;
    }
    int i;
    String str2;
    Object localObject2;
    Object localObject1;
    if (this.rMi == 1)
    {
      i = this.hys;
      str2 = this.nxi;
      localObject2 = this.nxj;
      String str1 = this.nxk;
      com.tencent.mm.kernel.h.xA();
      int j = ((Integer)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdp, Integer.valueOf(0))).intValue();
      w.i("MicroMsg.RealnameVerifyUtil", "showSetPwdDialog count %s", new Object[] { Integer.valueOf(j) });
      if (j >= 3)
      {
        paramBoolean = false;
        if ((paramBoolean) && (!this.rMj)) {
          this.rMj = true;
        }
        GMTrace.o(19316078542848L, 143916);
        return paramBoolean;
      }
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xz().xi().a(w.a.vdp, Integer.valueOf(j + 1));
      localObject1 = localObject2;
      if (bg.mZ((String)localObject2)) {
        localObject1 = paramMMActivity.getString(R.l.duP);
      }
      localObject2 = str1;
      if (bg.mZ(str1)) {
        localObject2 = paramMMActivity.getString(R.l.dwr);
      }
      if (paramOnClickListener != null) {
        break label378;
      }
      paramOnClickListener = new a.3(paramBoolean, paramMMActivity);
    }
    label378:
    for (;;)
    {
      paramBundle = com.tencent.mm.ui.base.h.a(paramMMActivity, str2, "", (String)localObject2, (String)localObject1, new a.4(paramBundle, i, paramMMActivity, paramBoolean), paramOnClickListener, R.e.aQR);
      if (paramBundle != null)
      {
        paramBundle.setOnCancelListener(new a.5(paramBoolean, paramMMActivity));
        paramBundle.setOnDismissListener(new a.6(paramBoolean, paramMMActivity));
      }
      paramBoolean = true;
      break;
      GMTrace.o(19316078542848L, 143916);
      return false;
    }
  }
  
  public final boolean b(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(6854633586688L, 51071);
    boolean bool = b(paramMMActivity, paramBundle, paramOnClickListener, false);
    GMTrace.o(6854633586688L, 51071);
    return bool;
  }
  
  public final boolean b(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    GMTrace.i(6854767804416L, 51072);
    if (this.rMj)
    {
      GMTrace.o(6854767804416L, 51072);
      return false;
    }
    if ("1".equals(this.nxh))
    {
      if (!this.rMj) {
        this.rMj = true;
      }
      paramBoolean = a.a(paramMMActivity, paramBundle, this.hys);
      GMTrace.o(6854767804416L, 51072);
      return paramBoolean;
    }
    if (("2".equals(this.nxh)) && (!bg.mZ(this.nxl)))
    {
      if (!this.rMj) {
        this.rMj = true;
      }
      paramBoolean = a.a(paramMMActivity, this.nxi, this.nxl, this.nxj, this.nxk, paramBoolean, paramOnClickListener);
      GMTrace.o(6854767804416L, 51072);
      return paramBoolean;
    }
    GMTrace.o(6854767804416L, 51072);
    return false;
  }
  
  public int describeContents()
  {
    GMTrace.i(6854902022144L, 51073);
    GMTrace.o(6854902022144L, 51073);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6855036239872L, 51074);
    paramParcel.writeString(this.nxh);
    paramParcel.writeString(this.nxi);
    paramParcel.writeString(this.nxj);
    paramParcel.writeString(this.nxk);
    paramParcel.writeString(this.nxl);
    paramParcel.writeInt(this.hys);
    paramParcel.writeInt(this.rMi);
    GMTrace.o(6855036239872L, 51074);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/util/RealnameGuideHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */