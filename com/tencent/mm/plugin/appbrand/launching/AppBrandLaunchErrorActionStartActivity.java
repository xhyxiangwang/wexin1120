package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.support.a.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;

final class AppBrandLaunchErrorActionStartActivity
  extends AppBrandLaunchErrorAction
{
  final String jfO;
  final String jfP;
  final Intent jfQ;
  
  @a
  AppBrandLaunchErrorActionStartActivity(Parcel paramParcel)
  {
    super(paramParcel);
    GMTrace.i(17328179773440L, 129105);
    this.jfO = paramParcel.readString();
    this.jfP = paramParcel.readString();
    this.jfQ = ((Intent)paramParcel.readParcelable(Intent.class.getClassLoader()));
    GMTrace.o(17328179773440L, 129105);
  }
  
  AppBrandLaunchErrorActionStartActivity(String paramString1, int paramInt, String paramString2, String paramString3, Intent paramIntent)
  {
    super(paramString1, paramInt);
    GMTrace.i(17328045555712L, 129104);
    this.jfO = paramString2;
    this.jfP = paramString3;
    this.jfQ = paramIntent;
    GMTrace.o(17328045555712L, 129104);
  }
  
  final void bO(Context paramContext)
  {
    GMTrace.i(17328448208896L, 129107);
    Intent localIntent = this.jfQ;
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    for (;;)
    {
      d.b(paramContext, this.jfO, this.jfP, localIntent);
      GMTrace.o(17328448208896L, 129107);
      return;
      localIntent.setFlags(localIntent.getFlags() & 0xEFFFFFFF);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17328313991168L, 129106);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.jfO);
    paramParcel.writeString(this.jfP);
    paramParcel.writeParcelable(this.jfQ, 0);
    GMTrace.o(17328313991168L, 129106);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchErrorActionStartActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */