package com.tencent.mm.plugin.appbrand.launching;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ajv;
import java.lang.reflect.Constructor;

public abstract class AppBrandLaunchErrorAction
  implements Parcelable
{
  public static final a CREATOR;
  public final String appId;
  public final int iQS;
  
  static
  {
    GMTrace.i(17329656168448L, 129116);
    CREATOR = new a();
    GMTrace.o(17329656168448L, 129116);
  }
  
  AppBrandLaunchErrorAction(Parcel paramParcel)
  {
    GMTrace.i(17328985079808L, 129111);
    this.appId = paramParcel.readString();
    this.iQS = paramParcel.readInt();
    GMTrace.o(17328985079808L, 129111);
  }
  
  AppBrandLaunchErrorAction(String paramString, int paramInt)
  {
    GMTrace.i(17329119297536L, 129112);
    this.appId = paramString;
    this.iQS = paramInt;
    GMTrace.o(17329119297536L, 129112);
  }
  
  public abstract void bO(Context paramContext);
  
  public final int describeContents()
  {
    GMTrace.i(17329387732992L, 129114);
    GMTrace.o(17329387732992L, 129114);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17329253515264L, 129113);
    paramParcel.writeString(getClass().getName());
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.iQS);
    GMTrace.o(17329253515264L, 129113);
  }
  
  static final class a
    implements Parcelable.Creator<AppBrandLaunchErrorAction>
  {
    a()
    {
      GMTrace.i(17335695966208L, 129161);
      GMTrace.o(17335695966208L, 129161);
    }
    
    static AppBrandLaunchErrorAction a(String paramString, int paramInt, h paramh)
    {
      GMTrace.i(17335964401664L, 129163);
      if ((paramh == null) || (paramh.field_launchAction == null))
      {
        GMTrace.o(17335964401664L, 129163);
        return null;
      }
      switch (paramh.field_launchAction.tsx)
      {
      default: 
        GMTrace.o(17335964401664L, 129163);
        return null;
      case 3: 
        paramString = new AppBrandLaunchErrorActionAlert(paramString, paramInt, paramh.field_launchAction.tZT, paramh.field_launchAction.ueQ);
        GMTrace.o(17335964401664L, 129163);
        return paramString;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramh.field_launchAction.ueO);
      localIntent.putExtra("forceHideShare", true);
      paramString = new AppBrandLaunchErrorActionStartActivity(paramString, paramInt, "webview", ".ui.tools.WebViewUI", localIntent);
      GMTrace.o(17335964401664L, 129163);
      return paramString;
    }
    
    private static AppBrandLaunchErrorAction i(Parcel paramParcel)
    {
      GMTrace.i(17335830183936L, 129162);
      String str = paramParcel.readString();
      if (str == null)
      {
        GMTrace.o(17335830183936L, 129162);
        return null;
      }
      try
      {
        paramParcel = (AppBrandLaunchErrorAction)Class.forName(str).getDeclaredConstructor(new Class[] { Parcel.class }).newInstance(new Object[] { paramParcel });
        GMTrace.o(17335830183936L, 129162);
        return paramParcel;
      }
      catch (Exception paramParcel)
      {
        GMTrace.o(17335830183936L, 129162);
      }
      return null;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchErrorAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */